/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalcare;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
      List<ItemsPrice> items;
      List<String> itemsDes;
	
	public ShoppingCart(){
		this.items=new ArrayList<ItemsPrice>();
                this.itemsDes=new ArrayList<String>();
	}
	
	public void addItem(ItemsPrice item,String itemsDes){
		this.items.add(item);
                this.itemsDes.add(itemsDes);
                System.out.println("item has been added to your cart succssfully ");
	}
        
        public void removeItem(ItemsPrice item,String itemsDes){
		this.items.remove(item);
                this.itemsDes.remove(itemsDes);
                 System.out.println("item has been removed from your cart succssfully ");
	}
	
	public int calculateTotal(){
		int sum = 0;
		for(ItemsPrice item : items){
			sum += item.getPrice();
		}
		return sum;
	}
	
	public void pay(PaymentType paymentMethod){
		int amount = calculateTotal();
}
        public void displayInvoice(){
            System.out.println("---RECIPT---");
            if(!this.itemsDes.isEmpty()){
            for(int i=0;i<this.itemsDes.size();i++){
                System.out.println("\n"+this.itemsDes.get(i)+"\n");
            }
            }else
                System.out.println("nothing is in the cart ");
            System.out.println("Total Amount is: "+calculateTotal());
        }
}
