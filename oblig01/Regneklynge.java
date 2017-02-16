import java.util.ArrayList;

class Regneklynge {
    ArrayList<Rack> rackListe = new ArrayList<Rack>(); //global variabel ok iflg gruppeunderviser
    private final int antallNoderPerRack;
    private final int flyttallOperasjonerPerKlokkesyklus = 8;



    Regneklynge(int antallNoderPerRack) {
        this.antallNoderPerRack = antallNoderPerRack;
    }

    void settInnNode(Node node) {
        boolean nodeSattInnIRack = false;

        for (Rack rack : rackListe) {
            if (rack.nodeListe.size() < antallNoderPerRack) {
                rack.leggTilNode(node);
                nodeSattInnIRack = true;
            }
        }

        if (!nodeSattInnIRack) {
            Rack rack = new Rack();
            rackListe.add(rack);
            rack.leggTilNode(node);
        }
    }
    //oppgave 4 / finn maksimal teoretisk ytelse - FLOPS
    double flops() {
        double sumFlops = 0;

        for (Rack rack : rackListe) {
            for (Node node : rack.nodeListe) {
                double nodeFlops = node.prosessorListe.get(0).antallKjerner*
                node.maksimaltAntallProsessorer*node.prosessorListe.get(0).klokkeHastighet
                *flyttallOperasjonerPerKlokkesyklus;
                
                sumFlops += nodeFlops;
            }
        }
        return sumFlops;
    }
    // oppgave 5 - finn antall noder med et gitt GB med minne
    int noderMedNokMinne(int paakrevdMinne) {
        int antallNoderMedNokMinne = 0;

        for (Rack rack : rackListe) {
            for (Node node : rack.nodeListe) {
                if (node.minne >= paakrevdMinne) {
                    antallNoderMedNokMinne ++;
                }
            }
        }
        return antallNoderMedNokMinne;
    }
}