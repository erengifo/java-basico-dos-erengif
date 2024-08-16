public class SumaWhile {
    public static void main(String[] args) {
        int primerNumero = 1;
        int segundoNumero = 1;
        System.out.println("Suma con WHILE");
        while(primerNumero <= 10)   {
            System.out.println(segundoNumero);
            primerNumero = primerNumero + 1;
            segundoNumero = segundoNumero + primerNumero;
        }
    }
}
