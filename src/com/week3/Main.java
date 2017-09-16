package com.week3;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Table table = new Table();

        Tea tea = new Tea();
        tea.setName("Rosehip Tea");
        tea.setSugar(false);
        tea.setMilk(true);
        Cake cake = new Cake();
        cake.setName("Chocolate Sponge");
        Guest guest = new Guest();
        guest.setName("Alice");
        guest.tea = tea;
        guest.cake = cake;
        table.addGuest(guest);

        Tea tea2 = new Tea();
        tea2.setName("Lapsang Souchong");
        tea2.setSugar(true);
        tea2.setMilk(true);
        Cake cake2 = new Cake();
        cake2.setName("Lemon Tart");
        Guest guest2 = new Guest();
        guest2.setName("Mad Hatter");
        guest2.tea = tea;
        guest2.cake = cake;
        table.addGuest(guest2);

        Tea tea3 = new Tea();
        tea3.setName("Darjeeling");
        tea3.setSugar(false);
        tea3.setMilk(false);
        Cake cake3 = new Cake();
        cake3.setName("Carrot Cake");
        Guest guest3 = new Guest();
        guest3.setName("March Hare");
        guest3.tea = tea;
        guest3.cake = cake;
        table.addGuest(guest3);

        Tea tea4 = new Tea();
        tea4.setName("Ceylon Blend");
        tea4.setSugar(true);
        tea4.setMilk(false);
        Cake cake4 = new Cake();
        cake4.setName("Fruit Cake");
        Guest guest4 = new Guest();
        guest4.setName("Dormouse");
        guest4.tea = tea;
        guest4.cake = cake;
        table.addGuest(guest4);

        table.printTeaParty();

    }
}
