public class Personbil extends Fossilbil {

    private int antallDorer;

    public Personbil(String kjennemerke, double co2Utslipp, int antallDorer) {
        super(kjennemerke, co2Utslipp);
        this.antallDorer = antallDorer;
    }

    @Override
    public void getInfo() {
	super.getInfo();
	System.out.printf("Biltype: Personbil \n Antall seter: %d", antallDorer);
    }
}
