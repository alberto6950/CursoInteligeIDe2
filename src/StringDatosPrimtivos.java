public class StringDatosPrimtivos {

    public static void main(String[] args) {

        String booleano="false";
            boolean boolenanoConvertido=Boolean.parseBoolean(booleano);
            System.out.println(boolenanoConvertido);
        String decimales="2.56";
            double descimalesConvertidos=Double.parseDouble(decimales);
            System.out.println(descimalesConvertidos);
        String entero="395";
        int enteroConvertido =Integer.parseInt(entero);
        System.out.println(enteroConvertido);

        String flotante="2.56e2f";
        float flotanteConvertido=Float.parseFloat(flotante);
        System.out.println(flotanteConvertido);





    }
}
