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
public class CatToys extends ItemsPrice implements CatSupplies {

    public CatToys() {
        super(0, "", "");
    }
    
        public ItemsPrice [] getCatToys(){
            ItemsPrice[] Items = new ItemsPrice[4];
            Items[0] = new ItemsPrice(10, "Feathers", "OnSale");
            Items[1] = new ItemsPrice(65,"pink Scratcher", "NoSale");
            Items[2] = new ItemsPrice(10, "Colorful Balls", "OnSale");
            Items[3] = new ItemsPrice(12, "plush toys", "NoSale");
             return Items;
    } 

    @Override
    public void displayCatSupplies() {
        System.out.println("--CAT TOYS--\n");
        for (ItemsPrice item : getCatToys()) {
            System.out.println(item);
        }
        System.out.println("--ITEM ON SALE--\n");
        ItemsPrice[] items = getCatToys();
        Discounted discounted = new Discounted();
        ItemsPrice[] onSaleItems = discounted.Sort(items);
        
        for (ItemsPrice item : onSaleItems) {
            System.out.println(item);
        }
 
    }
    public void displayCatToys(){
        Scanner user = new Scanner(System.in);
        System.out.println("Do you want to sort the Items ? ");
        String userchoice = user.next();
        if (userchoice.equalsIgnoreCase("yes")) {

            System.out.println("Choose sort options: \n1. sort from high to low   \n2. sort low to high ");
            ItemsPrice[] Items = new ItemsPrice[4];
            Items[0] = new ItemsPrice(10, "Feathers", "OnSale");
            Items[1] = new ItemsPrice(65,"pink Scratcher", "NoSale");
            Items[2] = new ItemsPrice(10, "Colorful Balls", "OnSale");
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
