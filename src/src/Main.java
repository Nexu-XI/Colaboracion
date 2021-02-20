package src;


public class Main {


    public static void main(String[] args) {
       System.out.println("El resultado de la suma es " + pitosuma(7.5, 5));
       System.out.println("El resultado de la resta es " + pitoresta(7.5, 5));
    }
    
    public static double pitosuma(double valor1, double valor2){
        return(valor1 + valor2);
    }
    
    public static double pitoresta(double valor1, double valor2){
        return(valor1 - valor2);
    }
}
