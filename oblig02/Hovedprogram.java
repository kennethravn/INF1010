import java.util.Scanner;
import java.io.File;


public class Hovedprogram {

    public static void main(String[] args) {
        //inputfil
        //String filNavn;
	//Personbil x = new Personbil("abc123", 15, 2);
	//System.out.println(x.getKjennemerke());
	//x.getInfo();
	Elbil y = new Elbil("EL123", 22);
	y.getInfo();
	Lastebil q = new Lastebil("Last123", 123, 20000);
	q.getInfo();
	// try/catch block which ensures that the program does not crash due to lacking user input
        try {
            File filNavn = new File(args[0]);
        }

        catch (Exception e) {
            System.out.println("Please enter filename: ");

            Scanner in = new Scanner(System.in);
            File filNavn = new File(in.nextLine());
        }

	
    }
}
