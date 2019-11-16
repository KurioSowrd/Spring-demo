package MyBlog.Service.GitOauth;

import MyBlog.DTO.AccessTokenDTO;
import MyBlog.DTO.GitHubUser;
import com.alibaba.fastjson.JSON;
import okhttp3.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class GithubProvider {
    @Value("${github.accesstoken}")
    private String url;
   public String getAccessToken( AccessTokenDTO accessTokenDTO){
      MediaType mediaTypeJSON = MediaType.get("application/json; charset=utf-8");
       OkHttpClient client = new OkHttpClient();
           RequestBody body = RequestBody.create(mediaTypeJSON,JSON.toJSONString(accessTokenDTO));
           Request request = new Request.Builder()
                   .url(url)
                   .post(body)
                   .build();
           try (Response response = client.newCall(request).execute()) {
               String redirect= response.body().string();
               return redirect;
           }catch (Exception e){e.printStackTrace();}
           return null;
   }
   public GitHubUser gitHubUser(String accesstoken) {
       OkHttpClient client=new OkHttpClient();
       Request request=new Request.Builder().url("https://api.github.com/user?access_token="+accesstoken).build();
       try {
           Response response=client.newCall(request).execute();
           String string=response.body().string();
           GitHubUser gitHubUser= JSON.parseObject(string,GitHubUser.class);
          return gitHubUser;
       } catch (IOException e) {
           e.printStackTrace();
       }
       return null;
   }
}
