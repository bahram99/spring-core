import org.springframework.stereotype.Component;

@Component
public class family {
    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
