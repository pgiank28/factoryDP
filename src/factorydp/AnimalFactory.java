/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorydp;


public class AnimalFactory {
    
    public Animal getAnimal(String an){
        if(an.equalsIgnoreCase("Person")){
            return new Person();
        }
        if(an.equalsIgnoreCase("Ant")){
            return new Ant();
        }
        if(an.equalsIgnoreCase("Cow")){
            return new Cow();
        }
        return null;
    }
}
