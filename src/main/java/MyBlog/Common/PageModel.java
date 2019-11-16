package MyBlog.Common;

import MyBlog.Common.Page.Index.Index;
import MyBlog.Common.Page.myspace.myspace;
import MyBlog.Common.Page.nav.Nav;
import lombok.Data;

@Data
public class PageModel {
    private Nav nav;
    private Index index;
    private myspace myspace;
}
