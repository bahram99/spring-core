package incompatiblebean.ravesh_3.interfaces;

import java.time.LocalDateTime;

public class protoimpl implements protointerfaces{

    private String date = LocalDateTime.now().toString();

    @Override
    public String gettime() {
        return date;
    }
}
