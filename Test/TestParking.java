package Test;

import Model.Car;
import Model.Parking;

public class TestParking {
    public static void main(String[] args) {
        Parking parking = new Parking("Victoria",4);
        System.out.println(parking); //null,null,null,null
        System.out.println(parking.isFull());//false
        System.out.println(parking.howManyCars());//0

        Car car1=new Car("5656XXX","Ford",2000);
        Car car2=new Car("8989CCD","Renault",2020);
        System.out.println(parking.parkCar(car1)); //0
        System.out.println(parking.parkCar(car2)); //1
        System.out.println(parking.parkCar(car1)); //-1 NO APARCO
        System.out.println(parking);  //ford,renault,null,null
        System.out.println(parking.isFull()); //false
        System.out.println(parking.howManyCars()); //3

        System.out.println(parking.searchCar("0123FFF")); //-1
        Car carx = parking.unParkCar("5656XXX");
        System.out.println(carx); //Ford
        System.out.println(parking); //null,renault,null,null


    }
}
