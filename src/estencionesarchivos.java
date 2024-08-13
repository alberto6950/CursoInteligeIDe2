public class estencionesarchivos {
    public static void main(String[] args) {
        String archivo="Imagen-generica.png";
        int i=archivo.lastIndexOf('.');
        System.out.println(archivo.length());
        System.out.println(archivo.substring(i+1));
    }
}
