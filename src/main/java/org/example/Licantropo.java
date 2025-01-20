public class Licantropo implements Personaggio {
    private int forzaFisica;
    private boolean lunaPiena;

    public Licantropo(boolean lunaPiena) {
        this.forzaFisica = 15;
        this.lunaPiena = lunaPiena;
    }

    @Override
    public void combatti() {
        for (int i = 0; i < 2; i++) {
            if (lunaPiena) {
                forzaFisica -= 2;
            } else {
                forzaFisica -= 3;
            }
        }
    }

    @Override
    public int getForzaFisica() {
        return forzaFisica;
    }
}