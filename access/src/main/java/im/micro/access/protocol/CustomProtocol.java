package im.micro.access.protocol;

import java.io.Serializable;

public class CustomProtocol implements Serializable {

    private static final long serialVersionUID = 4671171056588401542L;
    private long id ;
    private String content ;

    public CustomProtocol(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public CustomProtocol() {
    }

    @Override
    public String toString() {
        return "CustomProtocol{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
//省略 getter/setter
}
