
import java.util.Scanner;

public class ejemploConOperadores {
    public static void main(String[] args) {
        String usuario= "abrahan";
        String contraseña="1234";
        Scanner entrada =new Scanner(System.in);
        System.out.println("Ingresa tu numero de usuario:");
        String u=entrada.nextLine();
        System.out.println("Ingresa tu contraseña:");
        String p=entrada.nextLine();

        if (usuario.equals(u)&&contraseña.equals(p)) {
            System.out.println("Datos autenticos bienvenido");
        }
            else{
                System.out.println("Datos incorrectos");
            }
        }



    }

