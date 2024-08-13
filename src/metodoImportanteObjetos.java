import java.util.Locale;

public class metodoImportanteObjetos {
    public static void main(String[] args) {
        String nombre="Abrahan";
        System.out.println(nombre.toUpperCase(Locale.ROOT));
        System.out.println(nombre.toLowerCase(Locale.ROOT));
        System.out.println(nombre.equals("abrahan"));
        System.out.println(nombre.equalsIgnoreCase("abrahan"));
        System.out.println(nombre.compareTo("Andres"));
        System.out.println(nombre.charAt(0));////primer caracter
        System.out.println(nombre.charAt(nombre.length()-1));////ultimo caracter
        System.out.println(nombre.compareToIgnoreCase("Andres"));
        System.out.println(nombre.replace("A","."));////para replanzar
        System.out.println(nombre.lastIndexOf('a'));///contar
        System.out.println(nombre.indexOf("m"));///numero de caracter
        System.out.println(nombre.startsWith("han"));///si comienza false
        System.out.println(nombre.startsWith("ab"));///si comienza true
        System.out.println(nombre.endsWith("bran"));
        System.out.println(nombre.contains("x"));////contiene o no contiene
        ///////////quitar cosas
        System.out.println(nombre.trim());///recortar cosas de la izquierda

    }
}
