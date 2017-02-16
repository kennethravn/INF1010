
import java.util.*;
import java.io.*;

/**
 *
 * @author kennethravn
 */

public class Mainmain {
    public static void main(String[] args) throws Exception {
		String infile;
		//try-catch block to prevent program from crashing due to lacking user input
		try {
			infile = new String(args[0]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Give the name of data file: ");
			Scanner in = new Scanner(System.in); 
			infile = new String(in.nextLine());
		}	
		ArrayList<Bil> liste = readFile(infile);
		try { 
		    if (args[1].equals("EL")||args[1].equals("el")||args[1].equals("El")) {
			elUtskrift(liste);
		    }
		    else if (args[1].equals("FOSSIL")||args[1].equals("Fossil")||args[1].equals("fossil")) {
			fossilUtskrift(liste);
		    }
		}
		catch(Exception e){
		    elUtskrift(liste);
		    fossilUtskrift(liste);
		    }		

		/*if (args[1].equals("EL")) {
		    elUtskrift(liste);
		}
		else if (args.length == 1) {
		    elUtskrift(liste);
		    fossilUtskrift(liste);
		    }*/
		
	}
	
	public static ArrayList<Bil> readFile(String infile) throws Exception{
		ArrayList<Bil> bilListe = new ArrayList<>();
	        File hello = new File(infile);
	       	Scanner in = new Scanner(hello);
		//	in = infile;
		double co2;

		while (in.hasNextLine()) {
			String[] garasje = in.nextLine().split(" ");
		       	String bilType = garasje[0];
			String skilt = garasje[1];
			//System.out.println(Arrays.toString(garasje));
			//System.out.println(garasje.length);
			//	System.out.println(garasje[1]);
			//System.exit();
				switch (bilType) {

				case "EL":
					double batteriKapasitet = Double.parseDouble(garasje[2]);
					Elbil elbil = new Elbil(skilt, batteriKapasitet);
					bilListe.add(elbil);
					break;

				case "PERSONBIL":
					co2 = Double.parseDouble(garasje[2]);
					int doors = Integer.parseInt(garasje[3]);
					Personbil personbil = new Personbil(skilt, co2, doors);	
					bilListe.add(personbil);
					break;

				case "LASTEBIL":
					co2 = Double.parseDouble(garasje[2]);
					double nytte = Double.parseDouble(garasje[3]);
					Lastebil lastebil = new Lastebil(skilt, co2, nytte);
					bilListe.add(lastebil);
					break;	
				}
		}
		//System.out.prinln(bilListe);
		return bilListe;
	}

	public static void elUtskrift(ArrayList<Bil> bilListe) {
            bilListe.stream().filter((bil) -> (bil instanceof Elbil)).map((bil) -> (Elbil) bil).map((elbil) -> {
                elbil.getInfo();
            return elbil;
        }).forEachOrdered((_item) -> {
		System.out.printf("\n");	
        });
	}

	public static void fossilUtskrift(ArrayList<Bil> bilListe) {
            bilListe.forEach((Bil bil) -> {
                if (bil instanceof Personbil) {
                    Personbil personbil;
                    personbil = (Personbil) bil;
                    personbil.getInfo();
		    System.out.printf("\n");
                }
                else if (bil instanceof Lastebil) {
                    Lastebil lastebil = (Lastebil) bil;
                    lastebil.getInfo();
		    System.out.printf("\n");
                }
            });
	}
}
/*
import java.util.*;
import java.io.*;


public class Mainmain {


	public static void main(String[] args) throws Exception {
		File infile;
		//try-catch block to prevent program from crashing due to lacking user input
		try {
			infile = new File(args[0]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Give the name of data file: ");
			Scanner in = new Scanner(System.in); 
			infile = new File(in.nextLine());
		}	
		ArrayList<Bil> liste = readFile(infile);
		try { ;
		    if (args[1].equals("EL")||args[1].equals("el")||args[1].equals("El")) {
			elUtskrift(liste);
		    }
		    else if (args[1].equals("FOSSIL")||args[1].equals("Fossil")||args[1].equals("fossil")) {
			fossilUtskrift(liste);
		    }
		}
		catch(Exception e){
		    elUtskrift(liste);
		    fossilUtskrift(liste);
		    }		

		/*if (args[1].equals("EL")) {
		    elUtskrift(liste);
		}
		else if (args.length == 1) {
		    elUtskrift(liste);
		    fossilUtskrift(liste);
		    }*/
/*		
	}
	
	public static ArrayList<Bil> readFile(File inFile) throws Exception {
		ArrayList<Bil> bilListe = new ArrayList<Bil>();
		Scanner in = new Scanner(inFile);
		double co2;

		while (in.hasNextLine()) {
			String[] garasje = in.nextLine().split(" ");
			String bilType = garasje[0];
			String skilt = garasje[1];
			switch (bilType) {

				case "EL":
					double batteriKapasitet = Double.parseDouble(garasje[2]);
					Elbil elbil = new Elbil(skilt, batteriKapasitet);
					bilListe.add(elbil);
					break;

				case "PERSONBIL":
					co2 = Double.parseDouble(garasje[2]);
					int doors = Integer.parseInt(garasje[3]);
					Personbil personbil = new Personbil(skilt, co2, doors);	
					bilListe.add(personbil);
					break;

				case "LASTEBIL":
					co2 = Double.parseDouble(garasje[2]);
					double nytte = Double.parseDouble(garasje[3]);
					Lastebil lastebil = new Lastebil(skilt, co2, nytte);
					bilListe.add(lastebil);
					break;	
			}
		}
		//System.out.prinln(bilListe);
		return bilListe;
	}

	public static void elUtskrift(ArrayList<Bil> bilListe) {
		for (Bil bil : bilListe) {
			if (bil instanceof Elbil) {
				Elbil elbil = (Elbil) bil;
				elbil.getInfo();
				System.out.println(" ");
			}
		}
	}

	public static void fossilUtskrift(ArrayList<Bil> bilListe) {
		for (Bil bil : bilListe) {
			if (bil instanceof Personbil) {
				Personbil personbil = (Personbil) bil;
				personbil.getInfo();
				System.out.println(" ");
			}
			else if (bil instanceof Lastebil) {
				Lastebil lastebil = (Lastebil) bil;
				lastebil.getInfo();
				System.out.println(" ");
			}
		}
	}
}*/
