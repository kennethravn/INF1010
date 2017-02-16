public class Personbil extends Fossilbil {

    private int antallDorer;

    public Personbil(String kjennemerke, double co2Utslipp, int antallDorer) {
        super(kjennemerke, co2Utslipp);
        this.antallDorer = antallDorer;
    }

    public void setAntallDorer(int antallDorer) {
        this.antallDorer = antallDorer;
    }

    public int getAntallDorer() {
        return antallDorer;
    }
    @Override
    public void getInfo() {
	super.getInfo();
	System.out.printf("Biltype: Personbil \n Antall seter: %d", antallDorer);
    }
}
