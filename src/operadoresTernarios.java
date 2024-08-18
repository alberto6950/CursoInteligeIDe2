import java.util.Scanner;

public class operadoresTernarios {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        System.out.println("Ingresa tu calificiacion del parcial:");
        double u=entrada.nextDouble();

        if (u>6) {
            System.out.println("EStas Aprobado");
        }else{
            System.out.println("Estas Reprobado");
        }
    }
    }

