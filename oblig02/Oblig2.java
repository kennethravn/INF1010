import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class Oblig2 {
    public static void main(String[] args) throws Exception {
        File bilFil = new File(args[0]);
        ArrayList<Bil> bilList = lesFil(bilFil);

        if (args[1].equals("EL")) {
            printEl(bilList);
        }
        else if (args[1].equals("FOSSIL")) {
            printFossil(bilList);
        }
        else {
            System.out.println("hhhh");
        }
        
        /*try {
            if (args[1].equals("EL")) {
                printEl(bilList);
            } else if (args[1].equals("FOSSIL")) {
                printFossil(bilList);
            }
        } catch(ArrayIndexOutOfBoundsException e){
            printEl(bilList);
            printFossil(bilList);
        }*/
    }

    public static ArrayList<Bil> lesFil(File fil) throws Exception{
        //leser fil med info om biler og returnerer ArrayList<Bil>
        ArrayList<Bil> bilList = new ArrayList<Bil>();
        Scanner sc = new Scanner(fil);
        double co2Utslipp;

        while (sc.hasNextLine()) {
            String[] bilInfo = sc.nextLine().split(" ");
            String bilType = bilInfo[0];
            String skilt = bilInfo[1];
            switch (bilType) {
                
                case "EL":
                    double batteri = Double.parseDouble(bilInfo[2]);
                    Elbil elbil = new Elbil(skilt, batteri);
                    bilList.add(elbil);
                    break;

                case "PERSONBIL":
                    co2Utslipp = Double.parseDouble(bilInfo[2]);
                    int antallSeter = Integer.parseInt(bilInfo[3]);
                    Personbil personbil = new Personbil(skilt, co2Utslipp, antallSeter);
                    bilList.add(personbil);
                    break;

                case "LASTEBIL":
                    co2Utslipp = Double.parseDouble(bilInfo[2]);
                    double nyttevekt = Double.parseDouble(bilInfo[3]);
                    Lastebil lastebil = new Lastebil(skilt, co2Utslipp, nyttevekt);
                    bilList.add(lastebil);
                    break;
            }
        }
        return bilList;
    }
      
    public static void printFossil(ArrayList<Bil> bilList) {
        for (Bil bil : bilList) {
            if (bil instanceof Personbil) {
                Personbil pbil = (Personbil)bil;
                pbil.getInfo();
                System.out.println("");
            } else if (bil instanceof Lastebil) {
                Lastebil lbil = (Lastebil)bil;
                lbil.getInfo();
                System.out.println("");
            }
        }
    }

    public static void printEl(ArrayList<Bil> bilList) {
         for (Bil bil : bilList) {
            if (bil instanceof Elbil) {
                Elbil ebil = (Elbil)bil;
                ebil.getInfo();
                System.out.println("");
            }
        }
    }
}

/* kjoreeksempel:

>java Oblig2 sample1.txt
Type: Elbil
Skilt: EK43536
Batterikapasitet: 31.5 kWh

Type: Elbil
Skilt: EL14545
Batterikapasitet: 60.0 kWh

Type: Lastebil
Skilt: SR87875
Co2-utslipp: 452.5 g/km
Nyttevekt: 2550.4 kg

Type: Personbil
Skilt: AR34345
Co2-utslipp: 119.5 g/km
Antall seter: 8

Type: Personbil
Skilt: DK65437
Co2-utslipp: 135.7 g/km
Antall seter: 4

>java Oblig2 sample1.txt EL
Type: Elbil
Skilt: EK43536
Batterikapasitet: 31.5 kWh

Type: Elbil
Skilt: EL14545
Batterikapasitet: 60.0 kWh

>java Oblig2 sample1.txt FOSSIL
Type: Lastebil
Skilt: SR87875
Co2-utslipp: 452.5 g/km
Nyttevekt: 2550.4 kg

Type: Personbil
Skilt: AR34345
Co2-utslipp: 119.5 g/km
Antall seter: 8

Type: Personbil
Skilt: DK65437
Co2-utslipp: 135.7 g/km
Antall seter: 4

*/
