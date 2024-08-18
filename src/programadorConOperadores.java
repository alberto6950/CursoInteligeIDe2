public class programadorConOperadores {
    public static void main(String[] args) {
        //Operador aripmetico de incremento y decremento
        int a=10;

        ////Incrementa en uno y luego devuelve el numero
        int b=++a;
        System.out.println(b);
        //Devuelve el numero y luego increneta uno
        int c=a++;
        System.out.println(c);
        ///Decrementa en uno y luego devuelve el numero
        a=10;
        int d=--a;
        System.out.println(d);
        System.out.println(a);
        ///Devuelve el numero y luego decrementa en uno

        a=10;
        int e=a--;
        System.out.println(e);
        System.out.println(a);
    }
}
