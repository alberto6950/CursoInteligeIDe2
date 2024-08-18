import java.util.Scanner;

public class programacionConOperadoresEjemplo {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int a=entrada.nextInt();
        System.out.println("Introduce el primer Segundo");
        int b=entrada.nextInt();
        System.out.println("Introduce el primer tecero");
        int c=entrada.nextInt();

        int max;
        max = (a>b)? a:b;
        max = (max>c)? max:c;
        System.out.println("El maximo de los tres es "+max);
    }
}
