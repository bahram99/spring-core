package incompatiblebean.ravesh_1;

import java.time.LocalDateTime;

public class Prototype {

    private String date = LocalDateTime.now().toString();

    public String getDate() {
        return date;
    }
}
