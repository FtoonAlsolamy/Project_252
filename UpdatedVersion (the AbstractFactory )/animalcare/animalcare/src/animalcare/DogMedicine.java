/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalcare;

import java.util.Scanner;

/**
 *
 * @author Surface
 */
public class DogMedicine extends ItemsPrice implements DogSupplies{

    public DogMedicine() {
        super(0, "", "");
    }
     public ItemsPrice [] getDogMedicine(){
            ItemsPrice[] Items = new ItemsPrice[4];
            SortProducts sortt = new Discounted();
            Items[0] = new ItemsPrice(20, "Tramadol", "OnSale");
            Items[1] = new ItemsPrice(25, "Meloxicam", "NoSale");
            Items[2] = new ItemsPrice(45, "Famotidine", "OnSale");
            Items[3] = new ItemsPrice(60, "Nexgard", "NoSale");
            ItemsPrice[] discounted =sortt.Sort(Items);
             return discounted;
    }
    
    @Override
    public void displayDogSupplies(){
         System.out.println("--DOG MEDICINE--\n");
            ItemsPrice[] Items = getDogMedicine();
          for (ItemsPrice item : Items) {
        System.out.println(item);
    }
    }
    public void displaydogMedicine(){
        Scanner user = new Scanner(System.in);
        System.out.println("Do you want to sort the Items ? ");
        String userchoice = user.next();
        if (userchoice.equalsIgnoreCase("yes")) {

            System.out.println("Choose sort options: \n1. sort from high to low   \n2. sort low to high ");
            ItemsPrice[] Items = new ItemsPrice[4];
            Items[0] = new ItemsPrice(20, "Tramadol", "OnSale");
            Items[1] = new ItemsPrice(25, "Meloxicam", "NoSale");
            Items[2] = new ItemsPrice(45, "Famotidine", "OnSale");
            Items[3] = new ItemsPrice(60, "Nexgard", "NoSale");

            String usersort  = user.next();
            SortContext sc = new SortContext();
           
            if (usersort.equalsIgnoreCase("1")) {
                sc.SetSortProducts(new HighestPrice());
                sc.SortInt(Items);
            } else if (usersort.equalsIgnoreCase("2")) {
                sc.SetSortProducts(new LowestPrice());
                sc.SortInt(Items);
            } else {
                System.out.println("  ");
            }
    }
    
}
}
