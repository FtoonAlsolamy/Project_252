/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalcare;

public class ItemsPrice {

    public int price;
    public String desc;
    public String sale;

    public ItemsPrice(int price, String desc, String sale) {

        this.price = price;
        this.desc = desc;
        this.sale = sale;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return desc +" "+ price + "SR " +" "+ sale + "\n";
    }

}
