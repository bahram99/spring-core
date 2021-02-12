package annotationConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

public class one {
    private int id;

    /*@Autowired
    @Qualifier("t-2")
    private Two two;*/

    @Resource(name = "t-3")
    public Two two;

    public one(){
        System.out.println("one created!!");
    }

    public Two getTwo() {
        return two;
    }

    public void setTwo(Two two) {
        this.two = two;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
