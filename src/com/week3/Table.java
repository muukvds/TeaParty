package com.week3;

public class Table {
    Guest[] guests = new Guest[4];

    public void addGuest(Guest guest) {
        for(int i=0; i< guests.length;i++)
        {
            if(guests[i] == null)
            {
                guests[i]= guest;
                break;
            }
        }
    }
    public void printTeaParty()
    {
        for(Guest guest: guests)
        {
            guest.printInformation();
        }
    }
}
