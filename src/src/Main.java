package src;


public class Main {


    public static void main(String[] args) {
        
       System.out.println("El resultado de la multiplicación es " + pitomultiplicacion(3,3));
       System.out.println("El resultado de la división es " + pitodivision(10,5));
       System.out.println("El resultado de la suma es " + pitosuma(7.5, 5));
       System.out.println("El resultado de la resta es " + pitoresta(7.5, 5));
       
    }
    public static double pitomultiplicacion(double multi1,double multi2){
        
        return (multi1*multi2);
        
    }
    public static double pitosuma(double valor1, double valor2){
        
        return(valor1 + valor2);
        
    }
    public static double pitodivision(double dividendo,double divisor){
        
        return (dividendo/divisor);  
        
       }
    public static double pitoresta(double valor1, double valor2){
        
        return(valor1 - valor2);
        
    }
}  
