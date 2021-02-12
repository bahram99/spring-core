package incompatiblebean.ravesh_3.Target_class;

import org.springframework.beans.factory.annotation.Autowired;

public class Single {

    @Autowired
    private Prototype proto;

    public void gettime(){
        System.out.println(proto.getDate());
    }
}
