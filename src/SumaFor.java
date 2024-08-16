public class SumaFor {
    public static void main(String[] args) {
        int primerNumero = 1;
        int segundoNumero = 1;

        primerNumero = 1;
        segundoNumero = 1;
        System.out.println("\n Suma con FOR");
        for (int i = 1; i <= 10; i++) {
            System.out.println(segundoNumero);
            primerNumero = primerNumero + 1;
            segundoNumero = segundoNumero + primerNumero;
        }
    }
}
