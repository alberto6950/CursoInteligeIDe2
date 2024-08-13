import java.sql.SQLOutput;

public class concatenarEnteros {
    public static void main(String[] args) {

        String saludo="ten un hermoso dia ";
        String nombre="abrahan";
        String nombre1="Abrahan";
        String saludoPersonalizado=saludo+nombre;
        String saludopersonalizado2=saludo.concat("bello ").concat(nombre);
        System.out.println(saludoPersonalizado);
        System.out.println(saludopersonalizado2);


        saludo=saludo.transform(s -> {
            return s+"papasito "+nombre;
        });
        System.out.println(saludo);

        nombre1=nombre1.replace("a" ,"A");
        System.out.println(nombre1);










    }
}
