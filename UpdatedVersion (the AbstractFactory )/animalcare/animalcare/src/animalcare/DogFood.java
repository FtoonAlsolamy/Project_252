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
public class DogFood extends ItemsPrice implements DogSupplies{

    public DogFood() {
        super(0, "", "");
    }
         public ItemsPrice [] getDogFood(){
            ItemsPrice[] Items = new ItemsPrice[4];
         
            Items[0] = new ItemsPrice(20, "GimDog (chicken and lamb dry food)", "OnSale");
            Items[1] = new ItemsPrice(25, "Nutram for puppies (dry food)", "NoSale");
            Items[2] = new ItemsPrice(45, "Burgess (chicken dry food)", "OnSale");
            Items[3] = new ItemsPrice(60, "Scheser (Tuna wet food)", "NoSale");
   
             return Items;
    } 
    
    @Override
    public void displayDogSupplies(){
        System.out.println("--DOG FOOD--\n");
        for (ItemsPrice item : getDogFood()) {
            System.out.println(item);
        }

        System.out.println("--ITEM ON SALE--\n");
        ItemsPrice[] items = getDogFood();
        Discounted discounted = new Discounted();
        ItemsPrice[] onSaleItems = discounted.Sort(items);

        for (ItemsPrice item : onSaleItems) {
            System.out.println(item);
        }
 
    }
    
    public void displayDogFood(){
        Scanner user = new Scanner(System.in);
        System.out.println("\"Do you want to sort the Items ? (yes/no)");
        String userchoice = user.next();
        if (userchoice.equalsIgnoreCase("yes")) {

            System.out.println("Choose sort options: \n1. sort from high to low   \n2. sort low to high ");
            ItemsPrice[] Items = getDogFood();

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
