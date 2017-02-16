import java.util.ArrayList;

class Rack {
    ArrayList<Node> nodeListe = new ArrayList<Node>(); //enda en global variabel, antar det er ok

    void leggTilNode(Node node) {
        nodeListe.add(node);
    }
}