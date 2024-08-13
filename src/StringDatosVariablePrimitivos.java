public class StringDatosVariablePrimitivos {

    public static void main(String[] args) {

    boolean cierto=true;
        String ciertoConvertido=Boolean.toString(cierto);
    int entero=56;
        String enteroConvertido=Integer.toString(entero);
    float flotante=2.56e2f;
        String flotanteConvertido=Float.toString(flotante);
    double decimal= 23.678;
    String decimalConvertido=Double.toString(decimal);

    String resultado=ciertoConvertido+"\n"+enteroConvertido+"\n"+flotanteConvertido+"\n"+decimalConvertido;
        System.out.println(resultado);



    }
}
