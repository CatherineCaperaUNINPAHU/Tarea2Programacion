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
public class Cities {
    
    public int Id;
    public String  NameCity;
    
    //Constructor
    public Cities( int id1, String city){
        this.Id=id1;
        this.NameCity=city;
        
    }
    
    public String ImprimirCiudad(){
        String s1 = "ID "+Id+" "+"Nombre Ciudad "+NameCity;
        
        return s1;
    }
    
    public String Get_City(){
        return NameCity;
    }
    
}
