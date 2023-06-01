/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalcare;

/*
CONCRETE COMPONENT 
 */
public class DogBox implements Gift {

    @Override
    public String GiftType() {
        return "DOG SURPRISE BOX CONTAINS: \n- Two Dog Toys\n- One Bottle Of Dog Treats\n- Dog Brush";

    }

}
