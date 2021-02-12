import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

public class person implements Serializable {
    private int id;
    private String name;

    @Autowired
    private family family;

    public person(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public family getFamily() {
        return family;
    }

    public void setFamily(family family) {
        this.family = family;
    }
}
