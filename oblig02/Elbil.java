

public class Elbil extends Bil {
    private double batteriKapasitet;

    public Elbil(String kjennemerke, double batteriKapasitet) {
        super(kjennemerke);
        this.batteriKapasitet = batteriKapasitet;
    }

    @Override
    public void getInfo() {
	super.getInfo();
	    System.out.printf("Motortype: Elektrisk motor\nElbilen har batterikapasitet: %f\n", batteriKapasitet);    
    }

}

