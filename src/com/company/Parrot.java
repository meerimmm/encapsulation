package com.company;

public class Parrot {
    private String name;
    private int age;
    private String nickname;
    private int price;

     void method(){
        System.out.println("sings");

    }
    void method2(){
        System.out.println("repeats every word");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
