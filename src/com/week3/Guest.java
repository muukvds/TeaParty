package com.week3;

public class Guest {
    String name;
    Cake cake;
    Tea tea;

    public void setName(String name) {
        this.name = name;
    }

    public void setCake(Cake cake) {
        this.cake = cake;
    }

    public void setTea(Tea tea) {
        this.tea = tea;
    }


    public void printInformation() {
        System.out.println("Hello, I am "+ this.name+".");
        System.out.println("I am having a cup of "+tea.getName()+" with a piece of "+cake.getName()+"." );
        tea.printTeaContent();


    }
}
