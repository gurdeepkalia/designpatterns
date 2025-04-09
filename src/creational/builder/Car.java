package creational.builder;

/*
* Use the Builder pattern when you need to construct a complex object with many optional parts or configuration options,
*  but you want to avoid having a constructor with too many parameters
* */
public class Car {
    private String engine;
    private int wheels;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    public static class Builder {
        private String engine;
        private int wheels;

        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder wheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public Car build() {
            Car car = new Car();
            car.setEngine(this.engine);
            car.setWheels(this.wheels);
            return car;
        }
    }

    public static void main(String[] args) {
        Car car = new Builder().engine("v1").wheels(2).build();
        System.out.println(car);
    }
}

