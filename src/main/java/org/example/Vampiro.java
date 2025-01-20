public class Vampiro implements Personaggio {
    private int forzaFisica;

    public Vampiro() {
        this.forzaFisica = 15;
    }

    @Override
    public void combatti() {
        forzaFisica -= 2;
    }

    @Override
    public int getForzaFisica() {
        return forzaFisica;
    }
}
