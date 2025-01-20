public class Main {
    public static void main(String[] args) {
        SuperEroe chriku = new SuperEroe();
        Vampiro terenas = new Vampiro();
        Licantropo licantropoLunaPiena = new Licantropo(true);
        Licantropo licantropoNonLunaPiena = new Licantropo(false);

        chriku.combatti();

        terenas.combatti();

        licantropoLunaPiena.combatti();
        licantropoNonLunaPiena.combatti();

        System.out.println("La forza fisica del Super Eroe è: " + chriku.getForzaFisica());
        System.out.println("La forza fisica del terenas è: " + terenas.getForzaFisica());
        System.out.println("La forza fisica del Licantropo in luna piena è: " + licantropoLunaPiena.getForzaFisica());
        System.out.println("La forza fisica del Licantropo non in luna piena è: " + licantropoNonLunaPiena.getForzaFisica());
    }
}
