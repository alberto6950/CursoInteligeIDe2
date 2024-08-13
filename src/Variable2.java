import javax.swing.*;
import java.sql.SQLOutput;

public class Variable2 {

    public static void main(String[] args) {

        /////panel de escritura
        ///entrada
      String numero = JOptionPane.showInputDialog(null, "Ingresa numero entero: ");
        int numeroReal=Integer.parseInt(numero);
        System.out.println("Nuestro numero es:" + numeroReal);
        String numeroBinario = Integer.toBinaryString(numeroReal);
        System.out.println("Numero binario: " + numeroBinario);
        System.out.println("Numero Hexadecimal: "+Integer.toHexString(numeroReal));
        //0 prefijo en optal
        System.out.println("Numero de octal:"+Integer.toOctalString(numeroReal));
        String resultado="Muestra los resultado es : "+numeroReal+"\n Numero Binario es: "+Integer.toBinaryString(numeroReal)+"\nNumero binario es :"+Integer.toHexString(numeroReal)+" \nNumero de octal:"+Integer.toOctalString(numeroReal);
        ////salida
        JOptionPane.showInternalMessageDialog(null, resultado);
    }
}