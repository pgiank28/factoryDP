/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorydp;


public class FactoryDP {

    
    public static void main(String[] args) {
        AnimalFactory af=new AnimalFactory();
        
        Animal anim1=af.getAnimal("PERSON");
        anim1.legs();
        anim1.height();
        
        Animal anim2=af.getAnimal("COW");
        anim2.legs();
        anim2.height();
        
        Animal anim3=af.getAnimal("ant");
        anim3.legs();
        anim3.height();
        
    }
    
}
