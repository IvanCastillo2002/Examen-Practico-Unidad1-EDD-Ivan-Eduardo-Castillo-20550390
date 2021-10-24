/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_practica4;

import java.util.Scanner;

/**
 *
 * @author ivned
 */
public class Examen_Practica4 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
  int[]valores={1, 2, 10, 11, 8, 10, 10, 10, 9, 2, 6, 14, 5, 2, 12, 19, 18, 3, 5, 6};
   int[] iTamaño=new int[20];

      iTamaño[0]=1;
      iTamaño[1]=2;
      iTamaño[2]=10;
      iTamaño[3]=11;
      iTamaño[4]=8;
      iTamaño[5]=10;
      iTamaño[6]=10;
      iTamaño[7]=10;
      iTamaño[8]=9;
      iTamaño[9]=2;
      iTamaño[10]=6;
      iTamaño[11]=14;
      iTamaño[12]=5;
      iTamaño[13]=2;
      iTamaño[14]=12;
      iTamaño[15]=7;
      iTamaño[16]=19;
      iTamaño[17]=16;
      iTamaño[18]=11;
      iTamaño[19]=14;
       for (int i = 0; i < iTamaño.length; i++) {
         System.out.print(   "["+ iTamaño[i]  + "]"  + "" );
         
            
      } 
       System.out.println("\n");
       System.out.println("El numero que se triplica en esta serie es el 2, el 10 tambien se repite "
                                        + "3 veces solo que aparece despues");
 
   }
   
}
