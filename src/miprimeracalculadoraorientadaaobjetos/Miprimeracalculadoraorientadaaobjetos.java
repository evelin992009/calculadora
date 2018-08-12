/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeracalculadoraorientadaaobjetos;

/**
 *
 * @author Estudiantes
 */
public class Miprimeracalculadoraorientadaaobjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //definir objeto
        calculadoraAritmetica miCalculadora;
        // crear objeto
        miCalculadora=new calculadoraAritmetica();
        System.out.println("selecciones operacion:\n1.sumar\n2.restar\n3.multiplicar\n4.dividir");
        // to do cambiar la linea para pedirle datos al usuario 
        int opcion=1;
        
        if(opcion==1){
            miCalculadora.operando1=4;
            miCalculadora.operando2=8;
            // to do cambiar la linea para pedirle datos al usuario 
            System.out.println(miCalculadora.sumar());
            
                   }
        if(opcion==2){
        miCalculadora.operando1=4;
        miCalculadora.operando2=8;
        // to do cambiar la linea para pedirle datos al usuario 
        System.out.println(miCalculadora.restar());
            
                   }
         if(opcion==3){
         miCalculadora.operando1=4;
         miCalculadora.operando2=8;
         // to do cambiar la linea para pedirle datos al usuario 
         System.out.println(miCalculadora.multiplicar());
                
                      }
          if(opcion==1){
          miCalculadora.operando1=4;
          miCalculadora.operando2=8;
         // to do cambiar la linea para pedirle datos al usuario 
          System.out.println(miCalculadora.dividir());
                      }
        }
             
