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
public class CatSuppliesFactory extends SuppliesAbstractFactory{
    
    @Override
    public CatSupplies getCatSupplies(String choice){
      
        if(choice.equalsIgnoreCase("Toys")){
            return new CatToys();
        }else if(choice.equalsIgnoreCase("Accessories")){
            return new CatAccessories();
        }else if(choice.equalsIgnoreCase("Medicine")){
            return new CatMedicine();
        }else if(choice.equalsIgnoreCase("Food")){
            return new CatFood();
        }
        return null;
        
    }
    
    @Override
    public DogSupplies getDogSupplies(String choice){
        return null;
    }
            
    
}
