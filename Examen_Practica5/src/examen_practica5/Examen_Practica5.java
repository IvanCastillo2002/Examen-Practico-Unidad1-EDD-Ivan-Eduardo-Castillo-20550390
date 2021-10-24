/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_practica5;

/**
 *
 * @author ivned
 */
public class Examen_Practica5 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
     int[] iTamaño=new int[15];   
      iTamaño[0]=0;
      iTamaño[1]=2;
      iTamaño[2]=10;
      iTamaño[3]=11;
      iTamaño[4]=8;
      iTamaño[5]=10;
      iTamaño[6]=30;
      iTamaño[7]=7;
      iTamaño[8]=66;
      iTamaño[9]=20;
      iTamaño[10]=6;
      iTamaño[11]=14;
      iTamaño[12]=92;
      iTamaño[13]=2;
      iTamaño[14]=12;
       
       for (int i = 0; i < iTamaño.length; i++) {
         System.out.println("Valor Original:" +  iTamaño[i]);
      }
       int[] iCopia = new int[15];
      System.out.println( iCopia);
      for (int i = 0; i < iTamaño.length; i++) {
         iCopia[i]=iTamaño[i];
      }
       iCopia[0] = 0;
      for (int i = 0; i < iTamaño.length; i++) {
         System.out.println("Copia:" + iCopia[i]);
        
      }
   
      
      
      
      
      
      System.out.println("Arreglo: " + "0,10,8,30,66,,6,14,92,12");
  }
 
  
   }
    break;   


