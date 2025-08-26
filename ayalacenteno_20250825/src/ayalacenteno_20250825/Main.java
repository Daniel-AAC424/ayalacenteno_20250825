/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ayalacenteno_20250825;

/**
 *
 * @author UFG
 */


import java.util.Scanner; //Paquete, subpaquete, clase
public class Main {

    /**
     * @param args the command line arguments
     */
    
        
    public static void main(String[] args) {
        // TODO code application logic here
        //INVOCAR VOID
        ingresar_datos();
        
        
    }
    
    
    public static void ingresar_datos(){ // void = escritura no devolvera datos, puede hacer print dentro del metodo 
        //inializacionclase scanner
       Scanner scanner = new Scanner(System.in); 
       //declaracion var a utilizar
       int[] edades = new int[10]; //  asigna memoria ram, valor por defecto en int es 0, double, decimal, float 0.0, string null {} para valores definidos
       int suma = 0;
       int total_pares = 0;
       int total_impares = 0;
       
       //mensaje al usuario
       System.out.println("Ingrese "+edades.length+ " edades");
       //se recorre arreglo
       for(int i = 0; i < edades.length; i++){ //para en 10 por que empieza desde 0
           System.out.println("Edad " +i+ ": ");//solicita   ingreso valor
           edades[i] = scanner.nextInt();//lee y asigna valor y var de posicion
           suma+= edades[i];//paracalcular la edad promediosumar las edades
           
           //establecer sies par o impar
           if((edades[i] % 2) == 0){
               //Es par
               total_pares++;
           }
           else{
               //Es impar
               total_impares++;
           }
       }
        // promedio de las edades
       double promedio = (double)suma/edades.length;
        
       
       //se imprime la salida
       System.out.println("Usted ha ingresado: "+edades.length+" edades");
       System.out.println("El promedio de las edades ingresadas es: "+promedio);
       System.out.println("Ingreso: "+total_pares+ " edades pares y " +total_impares+ " edades impares");
       
       //se cierrae el obj ya que no habra mas lecturas
       scanner.close();
        
    }
    
}
