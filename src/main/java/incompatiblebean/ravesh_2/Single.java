package incompatiblebean.ravesh_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class Single {

    @Autowired
    private ApplicationContext applicationContext;

    public void gettime(){
        Prototype proto = applicationContext.getBean(Prototype.class);
        System.out.println(proto.getDate());
    }
}
