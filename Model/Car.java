package Model;

import java.util.Objects;

public class Car {
    private String lisence;
    private String model;
    private int age;

    public Car(String lisence,String model,int age){
        this.lisence = lisence;
        this.model = model;
        this.age = age;
    }

    public String getLisence() {
        return lisence;
    }

    public void setLisence(String lisence) {
        this.lisence = lisence;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(lisence, car.lisence);
    }

    @Override
    public String toString() {
        return "Car{" +
                "lisence='" + lisence + '\'' +
                ", model='" + model + '\'' +
                ", age=" + age +
                '}';
    }
}
