package entity;

/**
 * Created by ASUS on 2018/8/18.
 */
public class Working {
    private int id;
    private String title;
    private String content;
    private String createDate;
    private int type;

    public Working(int id, String title, String content, String createDate, int type) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createDate = createDate;
        this.type = type;
    }

    public Working() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
