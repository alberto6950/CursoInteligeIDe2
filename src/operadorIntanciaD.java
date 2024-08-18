public class operadorIntanciaD {
    public static void main(String[] args) {

        String texto= "Hola que tal";
       Integer numero=6;
       Number numero2=9;

       boolean b= texto instanceof String;
        System.out.println(b);
        b= texto instanceof Object;
        System.out.println(b);
        b= numero instanceof Integer;
        System.out.println(b);
        b= numero instanceof Object;
        System.out.println(b);
        ////Segundo proceso
        b= numero2 instanceof Long;
        System.out.println(b);
        b= numero2 instanceof Double;
        System.out.println(b);
        b= numero2 instanceof Float;
        System.out.println(b);
        Number numero3 =3.56f;
        boolean a= numero3 instanceof Double;
        System.out.println(a);












    }
}
