package CommonClasses;

import java.io.Serializable;

public class PlainVar implements Serializable {
    String path;
    String nickName;
    String value;

    public PlainVar(String path, String nickName, String value) {
        this.path = path;
        this.nickName = nickName;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getPath() {
        return path;
    }

    public String getNickName() {
        return nickName;
    }
}