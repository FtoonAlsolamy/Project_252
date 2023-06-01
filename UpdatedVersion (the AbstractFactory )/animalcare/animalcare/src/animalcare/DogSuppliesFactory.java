/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalcare;

/**
 *
 * @author Surface
 */
public class DogSuppliesFactory extends SuppliesAbstractFactory {

    @Override
    public DogSupplies getDogSupplies(String choice) {

        if (choice.equalsIgnoreCase("Toys")) {
            return new DogToys();
        } else if (choice.equalsIgnoreCase("Accessories")) {
            return new DogAccessories();
        } else if (choice.equalsIgnoreCase("Medicine")) {
            return new DogMedicine();
        } else if (choice.equalsIgnoreCase("Food")) {
            return new DogFood();
        }
        return null;

    }

    @Override
    public CatSupplies getCatSupplies(String choice) {
        return null;
    }

}
