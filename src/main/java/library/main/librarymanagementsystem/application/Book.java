package library.main.librarymanagementsystem.application;

public class Book {
    private String authorid,titleid,caid,categoryid;

    public Book(String authorid, String titleid, String caid, String categoryid){
        this.authorid=authorid;
        this.titleid=titleid;
        this.caid=caid;
        this.categoryid=categoryid;
    }
    public String getauthorid() { return authorid;}

    public void setauthorid(String authorid)
    {
        this.authorid = authorid;
    }

    public String gettitleid()
    {
        return titleid;
    }

    public void setTitleid(String titleid)
    {
        this.titleid = titleid;
    }

    public String getCaid()
    {
        return caid;
    }

    public void setCaid(String caid)
    {
        this.caid = caid;
    }

    public String getCategoryid()
    {
        return categoryid;
    }

    public void setCategoryid(String categoryid)
    {
        this.categoryid = categoryid;
    }

}
