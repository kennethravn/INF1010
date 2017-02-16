class Lastebil extends Fossilbil {

    private double nyttevekt;

    public Lastebil(String kjennemerke, double co2Utslipp, double nyttevekt) {
        super(kjennemerke, co2Utslipp);
        this.nyttevekt = nyttevekt;
    }

    public void setNyttevekt(double nyttevekt) {
        this.nyttevekt = nyttevekt;
    }

    public double getNyttevekt() {
        return nyttevekt;
    }
    @Override
    public void getInfo() {
	super.getInfo();
	System.out.printf("Biltype: Lastebil\nLastebilen har nyttevekt %f kg\n", nyttevekt);
    }


}
