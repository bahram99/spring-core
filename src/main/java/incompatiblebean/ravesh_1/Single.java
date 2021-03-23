package incompatiblebean.ravesh_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;

public class Single {

    public void gettime(){
        Prototype prototype = getPrototype();
        System.out.println(prototype.getDate());
    }

    @Lookup
    public Prototype getPrototype(){
        // spring writed body
        return null;
    }
}
