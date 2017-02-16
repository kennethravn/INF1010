public class Bil {

    private String kjennemerke;

    public Bil(String kjennemerke) {
        this.kjennemerke = kjennemerke;
    }

    public void setjennemerke(String kjennemerke) {
        this.kjennemerke = kjennemerke;

    }

    public String getKjennemerke() {
        return kjennemerke;
    }

    public void getInfo() {
	System.out.printf("Kjennemerke: %s\n", kjennemerke);
    }

}
