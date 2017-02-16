abstract class Fossilbil extends Bil {

    private double co2Utslipp;


    public Fossilbil(String kjennemerke, double co2Utslipp) {
        super(kjennemerke);
        this.co2Utslipp = co2Utslipp;
    }

    @Override
    public void getInfo() {
	super.getInfo();
	System.out.printf("\nMotortype: Forbrenningsmotor \nBilen har Co2-utslipp: %f g/km\n", co2Utslipp);
    }
}
