package com.company;

public class Dog {
    private String name;
    private int age;
    private String nickname;
    private int price;
    void method(){
        System.out.println("runs fast");

    }
     void method2(){
        System.out.println("guards the house");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;


        }
    }

