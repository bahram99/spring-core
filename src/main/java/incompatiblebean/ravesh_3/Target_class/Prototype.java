package incompatiblebean.ravesh_3.Target_class;

import java.time.LocalDateTime;

public class Prototype {

    private String date = LocalDateTime.now().toString();

    public String getDate() {
        return date;
    }
}
