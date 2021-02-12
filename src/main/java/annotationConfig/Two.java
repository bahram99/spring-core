package annotationConfig;

public class Two {
    private int name;

    public Two() {
        System.out.println("two created");
    }

    public Two(int name) {
        this.name = name;
    }

    public int getName() {
        return name;
    }
}
