/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_practica3;

/**
 *
 * @author ivned
 */
public class Examen_Practica3 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
       int[] iTamaño=new int[15];
      int[] jTamaño=new int[15];   
      iTamaño[0]=1;
      iTamaño[1]=2;
      iTamaño[2]=10;
      iTamaño[3]=11;
      iTamaño[4]=8;
      iTamaño[5]=10;
      iTamaño[6]=5;
      iTamaño[7]=7;
      iTamaño[8]=9;
      iTamaño[9]=20;
      iTamaño[10]=6;
      iTamaño[11]=14;
      iTamaño[12]=5;
      iTamaño[13]=3;
      iTamaño[14]=12;
   
      jTamaño[0]=12;
      jTamaño[1]=5;
      jTamaño[2]=9;
      jTamaño[3]=20;
      jTamaño[4]=5;
      jTamaño[5]=10;
      jTamaño[6]=8;
      jTamaño[7]=14;
      jTamaño[8]=10;
      jTamaño[9]=11;
      jTamaño[10]=7;
      jTamaño[11]=6;
      jTamaño[12]=2;
      jTamaño[13]=3;
      jTamaño[14]=1;
    for (int i = 0; i < iTamaño.length; i++) {
         System.out.print(   "["+ iTamaño[i]  + "]"  + "" );
            
      }  
      System.out.println("\n");
      System.out.println("Valores 2: ");
    for (int j = 0; j < jTamaño.length; j++) {
            System.out.print("["+ jTamaño[j]  + "]"  + "");
      }   
    
        if (iTamaño != jTamaño) {
      
       
      } 
        System.out.println("\n");
        System.out.println("En este Programa los arreglos son iguales solo que en el arreglo 2 los valores estan" +
                "" + "" +  " en otras posiciones");
      
      
      
      
  }
   
   }
   

