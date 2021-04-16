/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Read_List;
import My_List.*;
import Objects.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Cata
 */
public class Read_Table {
    public static void main(String[] args) {
        
        ArrayList<Employee> Consultaempleados = new ArrayList<>();
        
        //LISTA DE EMPLEADOS 
        
        Consultaempleados.add(new Employee(1001, "ARDILA GOMEZ", "DIEGO", 2904854, 4, 2));
        Consultaempleados.add(new Employee(1002, "ARGUELLO TIQUE", "JIMMY ANDRES", 4380110, 2, 4));
        Consultaempleados.add(new Employee(1003, "BERMUDEZ PENA", "SOLANGI PAOLA", 2955944, 6, 2));
        Consultaempleados.add(new Employee(1004, "BOLIVAR CUCHIGAY", "EDISSON ARLEY", 3732732, 6, 4));
        Consultaempleados.add(new Employee(1005, "ESPINOSA GARZON", "DANIEL", 3460562, 5, 1));
        Consultaempleados.add(new Employee(1006, "GAMBOA IBARRA", "DANIELA", 1577222, 3, 5));
        Consultaempleados.add(new Employee(1007, "HERRERA CAICEDO", "JORGE ALEXANDER", 3014490, 3, 5));
        Consultaempleados.add(new Employee(1008, "MARTINEZ GOMEZ", "JENNY PAOLA", 3137294, 3, 5));
        Consultaempleados.add(new Employee(1009, "MEDINA ACUNA", "MANUELA JULIETH", 4407138, 5, 3));
        
        
        //LISTA DE CIUDADES
        
        ArrayList<Cities> ConsultaCiudad = new ArrayList<>();
        
        ConsultaCiudad.add(new Cities (1, "BOGOTA"));
        ConsultaCiudad.add(new Cities (2, "MEDELLIN"));
        ConsultaCiudad.add(new Cities (3, "CALI"));
        ConsultaCiudad.add(new Cities (4, "CARTAGENA"));
        ConsultaCiudad.add(new Cities (5, "PASTO"));
        
        //LISTA DE EDUCACION
        
        ArrayList<Education>ConsultaEducacion = new ArrayList<>();
        
        ConsultaEducacion.add(new Education (1,"TECNICO"));
        ConsultaEducacion.add(new Education (2,"TECNOLOGO"));
        ConsultaEducacion.add(new Education (3,"PROFESIONAL"));
        ConsultaEducacion.add(new Education (4,"ESPECIALISTA"));
        ConsultaEducacion.add(new Education (5,"MAGISTER"));
        ConsultaEducacion.add(new Education (6,"DOCTOR"));
        
        System.out.println("PROGRAM developed by : JEFERSON CAÑON AND CATHERINE CAPERA " );
        System.out.println(" ");
        System.out.println("WHICH OPTION DO YOU WANT TO CONSULT?");
        System.out.println(" ");
        System.out.println("1. CITY");
        System.out.println(" ");
        System.out.println("2. EDUCATION");
        System.out.println(" ");
        System.out.println("3. SALARY");
        
        Scanner CondicionesSeleccionada = new Scanner(System.in);
        int condicion1 = CondicionesSeleccionada.nextInt();
        
        System.out.println(" ");
        System.out.println("ENTER THE CITY CODE: ");
        Scanner ciudad = new Scanner(System.in);
        int codigociudad = ciudad.nextInt();
        
        for(Cities C:ConsultaCiudad){
            IF(){
        }
    }
}
