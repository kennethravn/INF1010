import java.util.ArrayList;

class Node {
    final int minne;
    final int maksimaltAntallProsessorer;
    ArrayList<Prosessor> prosessorListe = new ArrayList<Prosessor>();
    
    Node(int minne, int antallKjerner, double klokkeHastighet, int maksimaltAntallProsessorer) {
        this.minne = minne;
        this.maksimaltAntallProsessorer = maksimaltAntallProsessorer;

        for (int i=0; i < maksimaltAntallProsessorer; i++) {
            Prosessor prosessor = new Prosessor(antallKjerner, klokkeHastighet);
            prosessorListe.add(prosessor);
        }
    }
}


