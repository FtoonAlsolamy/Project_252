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
	
	public ShoppingCart(){
		this.items=new ArrayList<ItemsPrice>();
	}
	
	public void addItem(ItemsPrice item){
		this.items.add(item);
	}
        
        public void removeItem(ItemsPrice item){
		this.items.remove(item);
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
}
