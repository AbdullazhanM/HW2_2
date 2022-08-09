package com.com;

public class Main {
    public static void main(String[] args) {
        createObject("Car").print();
        System.out.println("---------------------");
        createObject("Computer").print();
        System.out.println("---------------------");
        createObject("Phone").print();

    }
    public static Technics createObject(String className){
        switch (className) {
            case "Car":
                return new Car(2004, "MercedesBenz", " W211", 5, "Sedan");
            case "Computer":
                return new Computer(2022, "Lenovo", " ideapadGaming", "intel core i5 11300", "RTX 3050", 16);
            case "Phone":
                return new Phone(2021, "XiaoMi", " RedMi Note8 Pro", "Android 11", 128);
            default:
                return null;

        }
    }
}