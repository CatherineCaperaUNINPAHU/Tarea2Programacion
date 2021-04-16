/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author Cata
 */
public class Education {
    
    public int Id;
    public String  Range;
    
    //Constructor
    public Education( int id2, String range){
        this.Id=id2;
        this.Range=range;
        
    }
    
    public String ImprimirEducacion(){
        String s2 = "ID "+Id+" "+"Rango "+Range;
        
        return s2;
    }
    
    public String Get_Range(){
        return Range;
    }
    
}
