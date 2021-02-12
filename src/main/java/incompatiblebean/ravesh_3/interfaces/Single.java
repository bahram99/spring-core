package incompatiblebean.ravesh_3.interfaces;

import org.springframework.beans.factory.annotation.Autowired;

public class Single {

    @Autowired
    private protointerfaces proto;

    public void gettime(){
        System.out.println(proto.gettime());
    }
}
