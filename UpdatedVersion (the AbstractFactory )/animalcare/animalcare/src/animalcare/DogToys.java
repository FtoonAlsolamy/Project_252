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
public class DogToys  extends ItemsPrice implements DogSupplies{

    public DogToys() {
        super(0, "", "");
        }
    
    public ItemsPrice [] getDogToys(){
            ItemsPrice[] Items = new ItemsPrice[4];
          
            Items[0] = new ItemsPrice(10, "Colorful Balls", "OnSale");
            Items[1] = new ItemsPrice(9, "Bones", "NoSale");
            Items[2] = new ItemsPrice(15, "squeaky toys", "OnSale");
            Items[3] = new ItemsPrice(12, "plush toys", "NoSale");
   
             return Items;
    }
    
    @Override
    public void displayDogSupplies(){
        System.out.println("--DOG TOYS--\n");
        for (ItemsPrice item : getDogToys()) {
            System.out.println(item);
        }
        System.out.println("--ITEM ON SALE--\n");
        ItemsPrice[] items = getDogToys();
        Discounted discounted = new Discounted();
        ItemsPrice[] onSaleItems = discounted.Sort(items);
        
        for (ItemsPrice item : onSaleItems) {
            System.out.println(item);
        }
    }
    
    public void displayDogToys(){
        Scanner user = new Scanner(System.in);
        System.out.println("Do you want to sort the Items ? (yes/no)");
        String userchoice = user.next();
        if (userchoice.equalsIgnoreCase("yes")) {

            System.out.println("Choose sort options: \n1. sort from high to low   \n2. sort low to high ");
            ItemsPrice[] Items = new ItemsPrice[4];
            Items[0] = new ItemsPrice(10, "Colorful Balls", "OnSale");
            Items[1] = new ItemsPrice(9, "Bones", "NoSale");
            Items[2] = new ItemsPrice(15, "squeaky toys", "OnSale");
            Items[3] = new ItemsPrice(12, "plush toys", "NoSale");

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
