/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numprimos;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Numprimos {
    
    //Devuelve truesi es primo, false en caso contrario
     public static boolean comprobarprimo(int num1){
       
        boolean primo=false;

        for (int i=2; i<num1;i++){
             if (num1%i==0){
                 primo=true;
                 i=num1+1;
             }

         }
        return primo; 
    }
     
     public static int siguienteprimo(int num1){
        int primo=0; 
        boolean bandera=true;
        for (int i=(num1+1);bandera==true; i++){
            if (comprobarprimo(i)){
                bandera=false;
                primo=i;
            }
            
        }
        
        return primo;
     }
             
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        boolean bandera =true;
        int numero=0;

        
        while (bandera){
            System.out.println("Escribe un número");
            numero = leer.nextInt();
            if (comprobarprimo(numero)){
                System.out.println("El número "+ numero+ " es primo");
                System.out.println("El siguiente primo es "+ siguienteprimo(numero));
            } else{
                System.out.println("El número "+ numero+ " no es primo");
                System.out.println("El siguiente primo es "+ siguienteprimo(numero));
                
            }
        }
      
    }
    
}
