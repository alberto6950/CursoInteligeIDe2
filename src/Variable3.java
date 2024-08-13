import java.util.Scanner;

        import java.sql.SQLOutput;

public class Variable3 {

    public static void main(String[] args) {
        /////panel de escritura
        ///entrada
        Scanner entrada = new Scanner(System.in);
            System.out.println("Introduce el numero Entero: ");
        int numeroReal =entrada.nextInt();///tipo de datos de entrada para correr el proceso de scanner
            System.out.println("Nuestro numero es:" + numeroReal);
            String numeroBinario = Integer.toBinaryString(numeroReal);
            System.out.println("Numero binario: " + numeroBinario);
            System.out.println("Numero Hexadecimal: "+Integer.toHexString(numeroReal));
            //0 prefijo en optal
            System.out.println("Numero de octal:"+Integer.toOctalString(numeroReal));
            String resultado="Muestra los resultado es : "+numeroReal+"\n Numero Binario es: "+Integer.toBinaryString(numeroReal)+"\nNumero binario es :"+Integer.toHexString(numeroReal)+" \nNumero de octal:"+Integer.toOctalString(numeroReal);
            ////salida
    }
}