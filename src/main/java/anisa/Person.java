package anisa;

public class Person {
    private int id;
    private Car car;

    public Person(){
        System.out.println("person create");
    }

    public Person(int id, Car car) {
        this.id = id;
        this.car = car;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
