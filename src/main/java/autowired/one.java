package autowired;

import anisa.Car;

public class one {

    private Car car;

    public one() {
        System.out.println("one created");
    }

    public one(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
