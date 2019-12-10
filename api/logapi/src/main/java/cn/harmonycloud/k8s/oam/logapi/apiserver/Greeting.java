package cn.harmonycloud.k8s.oam.logapi.apiserver;

/**
 * Created by Huan Wei on 16-11-2 .
 */
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
