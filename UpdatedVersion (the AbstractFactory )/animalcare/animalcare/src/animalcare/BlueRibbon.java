/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalcare;

/**
 *
 * THE EXTENDED FEATURE WE WANT IN OUR GIFT
 */
public class BlueRibbon extends GiftDecorator {

    public BlueRibbon(Gift gift) {
        super(gift);
    }

    //will print whether the gift is a treat or a cat nip
    @Override
    public String GiftType() {
       return gift.GiftType()+"\n"+SetBlueRibbon(gift);

    }

    private String SetBlueRibbon(Gift gift) {
        return "----------------------------------------\n"+"Your gift box will be wrapped in blue ribbon <3\n"
                +"----------------------------------------\n";
    }
}
