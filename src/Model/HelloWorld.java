/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ankitapatil
 */
public class HelloWorld {
    
   
    public static void main(String[] args)
    {
    int x  = 20;
    double y = 30.05;
    float w = 24.6f;
    String name = "Rai";
    boolean z = true ;
    char symbol= '@';
    
    int n= 5;
    int[] size= new int[n];
    System.out.println("Initialized array size of n " + ":");
    
    for(int i=0; i < n; i++){
        size[i] = i+1;
        
        System.out.println( "Number at index " + i + " :  " + size[i]);
        
    }
    
    System.out.println("##############################################");
    
    
    int[] arr= {1,2,3,4,5};    
     for (int i = 0; i < arr.length; i++){
            System.out.println("Print the array : " + size[i]);
    
     }
     
     
     System.out.println("##############################################");
    
    
   
    
    
    System.out.println("Hello World. " + "\n" + "My email id is " + symbol + w + name + y + z + x  );
    
     
    
    
    
            }   
}
