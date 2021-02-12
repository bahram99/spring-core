package anisa;

public class Car {
    private String name;

    public Car(){
        System.out.println("car created");
    }

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
