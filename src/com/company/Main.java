package com.company;
public class Main {
    public static void main(String[] args) {
           Dog dog=new Dog();
       dog.setAge(25);
       dog.setName("Dog");
       dog.setNickname("Darci");
       dog.setPrice(100000);
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.getNickname());
        System.out.println(dog.getPrice());
        dog.method();
        dog.method2();
        System.out.println("========================");
        Cat cat = new Cat();
        cat.setName("Cat");
        cat.setAge(6);
        cat.setNickname("Rai");
        cat.setPrice(25000);
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.getNickname());
        System.out.println(cat.getPrice());
        cat.method();
        cat.method2();
        System.out.println("===========================");
        Fish fisch=new Fish();
        fisch.setName("Fish");
        fisch.setAge(45);
        fisch.setNickname("balyk");
        fisch.setPrice(10000000);
        System.out.println(fisch.getName());
        System.out.println(fisch.getAge());
        System.out.println(fisch.getNickname());
        System.out.println(fisch.getPrice());
        fisch.method();
        fisch.method2();
        System.out.println("=====================");
        Parrot parrot=new Parrot();
        parrot.setName("Parrot");
        parrot.setAge(17);
        parrot.setNickname("Meri");
        parrot.setPrice(150000);
        System.out.println(parrot.getName());
        System.out.println(parrot.getAge());
        System.out.println(parrot.getNickname());
        System.out.println(parrot.getPrice());
        parrot.method();
        parrot.method2();


    }
    }

