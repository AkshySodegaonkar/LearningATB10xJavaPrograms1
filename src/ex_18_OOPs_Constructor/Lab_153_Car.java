package ex_18_OOPs_Constructor;

public class Lab_153_Car {
    public static void main(String[] args) {
        Car tesla = new Car();
        tesla.name = "Tesla Model 3";
        tesla.year = 2025;
        System.out.println(tesla.name);
        System.out.println(tesla.year);
        System.out.println(tesla.model);

        System.out.println(" --- ");

        Car nano = new Car();
        nano.name = "Tata Nano";
        System.out.println(nano.name);


    }
}
