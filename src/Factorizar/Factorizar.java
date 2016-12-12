/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorizar;

/**
 *
 * @author dfernandezrivas
 */
public class Factorizar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     

    int Numero;
    int Factor;

  
   Numero = 8;    
   

    
   int i;
   if (Numero == 0)
Factor = 1;
   else
   {
Factor = 1;
for (i = Numero; i >= 1; i--)
{
    Factor = Factor * i;
}
   }    
  
 

System.out.println(Factor); 


    }
    
}
    
    

