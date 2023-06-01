/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalcare;

/**
 * THE ABSTRACT CLASS OF DECORATING THE GIFT
 */
public abstract class GiftDecorator implements Gift {

    protected Gift gift;

    //constructor
    public GiftDecorator(Gift gift) {
        this.gift = gift;
    }

    public String GiftType() {
        return gift.GiftType();
    }
}
