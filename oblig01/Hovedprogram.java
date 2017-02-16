import java.util.ArrayList;



public class Hovedprogram {
    public static void main(String[] args) {
        Regneklynge abel = new Regneklynge(12);

        for (int i = 0; i < 650; i++) {
            Node node = new Node(64, 8, 2.6e+9, 2);
            abel.settInnNode(node);
        }

        for (int i = 0; i < 16; i++) {
            Node node = new Node(1024, 8, 2.3e+9, 2);
            abel.settInnNode(node);
        }

        //printing av antall flops, noder med gitt minne, samt antall rack i bruk
        System.out.println("Samlet FLOPS: " + abel.flops());
        System.out.printf("Noder med minst 32 GB: %4d\n" , abel.noderMedNokMinne(32));
        System.out.printf("Noder med minst 64 GB: %4d\n" , abel.noderMedNokMinne(64));
        System.out.printf("Noder med minst 128 GB: %3d\n" , abel.noderMedNokMinne(128));
        System.out.printf("Antall rack: %14d\n" , abel.rackListe.size());

    }
}