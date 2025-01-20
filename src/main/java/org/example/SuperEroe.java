public class SuperEroe implements Personaggio {
    private int forzaFisica;

    public SuperEroe() {
        this.forzaFisica = 10;
    }

    @Override
    public void combatti() {
        for (int i = 0; i < 3; i++) {
            forzaFisica -= 3;
        }
    }

    @Override
    public int getForzaFisica() {
        return forzaFisica;
    }
}
