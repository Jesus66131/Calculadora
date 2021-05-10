package calculadora;

import java.util.Scanner;

public class Run {

    public static Calculadora calculadora = new Calculadora();
    public static Scanner ent = new Scanner(System.in);
    public static int num;
    public static int resp, respAnt, seleccion;
    public static void main(String[] args) {
        
        int i = 0;
        
        calculadora.setResult(0);
        System.out.println("Ingrese un numero de inicio para tus operaciones");
        num = ent.nextInt();
        calculadora.setResult(num);
        clearConsole();
        
        
        do{
            System.out.println("Ingrese una operacion \n1 = Suma(+) \n2 = Resta (-) \n3 = Multiplicación (*) \n4 = División (/)");
            resp= ent.nextInt();
            clearConsole();
            
            if(resp != 5){
                System.out.println("Ingrese el siguiente numero de la operación");
                num = ent.nextInt();
                clearConsole();
                selec(resp);
                
                System.out.println("¿Desea hacer otra operación? \n1°- Si \n0°-No");
                i=ent.nextInt();
                clearConsole();
                
                if(i==1){
                    System.out.println("Con: \n1°-El resultado actual\n2°-El resultado anterior\n3°-Nuevos numeros");
                    seleccion=ent.nextInt();
                    clearConsole();
                    selecNum(seleccion);
                }
            }
            
        }while(i==1);
        System.out.println("GRACIAS POR USAR LA CALCULADDORA BASICA :D QUE TENGA BUEN DIA");
    }
    
    public static void selec(int resp){
        
        switch(resp){
            case 1:
                System.out.println("La suma es: "+calculadora.suma(num));
                respAnt = resp;
                break;
            case 2:
                System.out.println("La resta es: "+ calculadora.resta(num));
                respAnt = resp;
                break;
            case 3:
                System.out.println("La multiplicación es: "+ calculadora.mult(num));
                respAnt = resp;
                break;
            case 4:
                System.out.println("La división es: "+calculadora.div(num));
                respAnt = resp;
                break;
            case 5:
                System.out.println("El valor de la operación anterior es: " + calculadora.anterior( num, respAnt));
                
                break;
            default:
                System.out.println("ERROR! La selección de operación no coincide");
            
        }
    }
    
    public static void clearConsole(){
        for(int i = 0; i <= 28; ++i){
            System.out.println("");
        }
    }
    public static void selecNum(int seleccion){
        
        switch(seleccion){
            case 1:
                break;
            case 2:
                resp = 5;
                selec(resp);
                break;
            case 3:
                System.out.println("Ingrese el primer numero de tu nueva operación");
                num=ent.nextInt();
                clearConsole();
                calculadora.setResult(num);
                break;
                  
        }
    }
    
}
