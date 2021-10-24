/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_practica7;

/**
 *
 * @author ivned
 */
public class Examen_Practica7 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
       int[] iArreglo=new int[15]; //12 bytes -- 3 enteros por 4 bytes
      System.out.println("Direccion de iArreglo= " + iArreglo);
  iArreglo[0]= 1; 
  iArreglo[1]= 2; 
  iArreglo[2]= 10; 
  iArreglo[3]= 1000; 
  iArreglo[4]= 2000; 
  iArreglo[5]= 3000; 
  iArreglo[6]= 1000; 
  iArreglo[7]= 2000; 
  iArreglo[8]= 3000; 
  iArreglo[9]= 1000; 
  iArreglo[10]= 2000; 
  iArreglo[11]= 3000; 
  iArreglo[12]= 1000; 
  iArreglo[13]= 2000; 
  iArreglo[14]= 3000; 
  
 // iArreglo[3]= 3;// error: ArrayTrudex out ofbound --  Nos pasamos del limite del arreglo
      for (int i = 0; i < iArreglo.length; i++) {
         System.out.println("CUENTA " +  i  + " = $" + iArreglo[i]);
      }
   //CREAMOS UNA NUEVA VARIABLE DE TIPO ARREGLO
   int[]iCopia=iArreglo;
      System.out.println("Direccion de iCopia = " + iCopia);
  for (int i = 0; i < iCopia.length; i++) {
         System.out.println("CUENTA (iCopia) " +  i  + " = $" + iCopia[i]);
      }
   iArreglo= new int[2];
      System.out.println("Direccion de iArreglo= " + iArreglo);
       for (int i = 0; i < iArreglo.length; i++) {
         System.out.println("CUENTA MODIFICADA " +  i  +  " = $" + iArreglo[i]);
      
       }
       System.out.println("Direccion de iCopia = " + iCopia);
       for (int i = 0; i < iCopia.length; i++) {
          System.out.println("CUENTA (iCopia) " + i + "= $" + iCopia[i]);
      }
       
   }
   }
   

