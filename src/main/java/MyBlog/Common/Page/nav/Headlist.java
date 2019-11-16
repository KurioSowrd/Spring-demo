package MyBlog.Common.Page.nav;

import MyBlog.Common.Page.Link;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Headlist {
    private Link MySpace;
    private Link Message;
    private Link LogOut;
    public List<Link> list(){
        List<Link> list=new ArrayList<Link>();
        list.add(MySpace);
        list.add(Message);
        list.add(LogOut);
        return list;
    }
    public List<String> namelist(){
        List<String> list=new ArrayList<>();
        list.add(MySpace.getName());
        list.add(Message.getName());
        list.add(LogOut.getName());
        return list;
    }
    public List<String> linklist(){
        List<String> list=new ArrayList<>();
        list.add(MySpace.getLink());
        list.add(Message.getLink());
        list.add(LogOut.getLink());
        return list;
    }
}
