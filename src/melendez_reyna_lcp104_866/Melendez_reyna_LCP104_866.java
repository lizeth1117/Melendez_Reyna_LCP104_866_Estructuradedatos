/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package melendez_reyna_lcp104_866;


import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author lizet
 */
public class Melendez_reyna_LCP104_866 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        Random ran=new Random();
        
        String opcion ;
        String [] palabras={"honduras","cacahuate","guacamaya"};
        int numletras=0, letrasacertadas=0 ;
        String palabrarandom = null ;
        char letra;
        boolean acierto=false ;
       
        
             
         
        System.out.println("Menu\nA. Jugar\n B. Cambiar palabras");
        opcion = entrada.next().toLowerCase();
        if (opcion.equals("a")){
             int nuevojuego=1, oportunidad=5 ;
            while(nuevojuego==1){
            oportunidad=5    ;
         palabrarandom= palabras[ran.nextInt(palabras.length)];
         numletras= palabrarandom.length();
         char [] palabraoculta= new char[numletras];
         
         // arreglos de palabra oculta
         for (int i = 0; i < palabraoculta.length-1; i++) {
             palabraoculta[i]='_' ;
         } // fin de for 
            for (int i = 0; i < numletras; i++) {
                System.out.print(palabraoculta[i]+" "); // imprimir los guiones
            }
            
           do{
               acierto=false ;
             System.out.println("\ningresa una letra"); 
             letra= entrada.next().charAt(0);
               for (int i = 0; i < palabraoculta.length; i++) {
          
               if (letra==palabrarandom.charAt(i)){
                   palabraoculta[i]=letra ;
                   acierto=true;
                   letrasacertadas++;
               }
               }
               if (acierto)
                    System.out.println("Le pegaste a una letra!\n Oportunidad= "+oportunidad);
                 
               if(!acierto){
                   oportunidad=(oportunidad-1);
                   System.out.println("la palabra no contiene ese caracter\nOportunidad= "+oportunidad);                  
               }          
              for (int i = 0; i < numletras; i++) { // muestra los guiones de palabra oculta
                System.out.print(palabraoculta[i]+" ");
                 }    
               }
                while(oportunidad>=1 && letrasacertadas < numletras );
           
            // Condición para determinar si ganó o perdió
            if (letrasacertadas == numletras) {
                System.out.println("Felicidades! Has ganado.");
            } else {
                System.out.println("Has perdido. La palabra era: " + palabrarandom);
                          }
            System.out.println("deseas jugar de nuevo?\n1. si\n2. no");
            nuevojuego=entrada.nextInt();
            
              }
        if(opcion.equals("b")){
            String[] cadenas = new String[10]; 

        // ingresar 10 cadenas
        System.out.println("Ingresa 10 cadenas:");
        for (int i = 0; i < cadenas.length; i++) {
            System.out.println("Cadena "+(i+1)+" :");
            cadenas[i] = entrada.next();
        }

        // Mostrar el lista de cadenas
        System.out.println("Lista de cadenas ingresadas:");
            for (int i = 0; i < 10; i++)
            System.out.println((i+1)+". "+cadenas[i]) ;
        }
    }}}
       
            

        
          
          
            
        
        
   
    


