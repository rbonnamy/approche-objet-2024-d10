package fr.diginamic.graphes;

import java.util.*;

class Graph {
    private List<Ville> villes;
    private LinkedList<Node>[] tableauDeListeVoisins;

    // Constructeur
    Graph() {
        villes = new ArrayList<>();
        tableauDeListeVoisins = new LinkedList[0];
    }

    // Ajout d'une arête
    void ajoutRoute(Ville src, Ville dest, double distance) {

        int indexSrc = ajoutVille(src);
        int indexDest = ajoutVille(dest);

        tableauDeListeVoisins[indexSrc].add(new Node(indexDest, distance));
        tableauDeListeVoisins[indexDest].add(new Node(indexSrc, distance)); // Graphe non-orienté
    }

    private int ajoutVille(Ville ville) {
        if (!villes.contains(ville)) {
            villes.add(ville);
            tableauDeListeVoisins = Arrays.copyOf(tableauDeListeVoisins, tableauDeListeVoisins.length + 1);
            tableauDeListeVoisins[tableauDeListeVoisins.length - 1] = new LinkedList<Node>();
        }
        return villes.indexOf(ville);
    }

    // Algorithme de Dijkstra
    void dijkstra(Ville src, Ville dest) {

        int indexSrc = villes.indexOf(src);
        int indexDest = villes.indexOf(dest);

        PriorityQueue<Node> pq = new PriorityQueue<>(villes.size(), new Node());
        double[] distances = new double[villes.size()];  // Distance minimale des nœuds
        int[] chemin = new int[villes.size()];   // Pour garder la trace du chemin
        Arrays.fill(distances, Double.MAX_VALUE);
        Arrays.fill(chemin, -1);            // Valeur par défaut pour 'pas de précédent'

        pq.add(new Node(indexSrc, 0.0));
        distances[indexSrc] = 0;

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            int current = node.index;

            // Si on atteint la destination, on arrête
            if (current == indexDest) {
                break;
            }

            // Parcourir les voisins du nœud actuel
            for (Node neighbor : tableauDeListeVoisins[current]) {
                double newDist = distances[current] + neighbor.cost;

                if (newDist < distances[neighbor.index]) {
                    distances[neighbor.index] = newDist;
                    chemin[neighbor.index] = current;  // Mettre à jour le chemin
                    pq.add(new Node(neighbor.index, newDist));
                }
            }
        }

        // Afficher le chemin et la distance totale
        affichageCheminPlusCourt(chemin, distances, indexSrc, indexDest);
    }

    // Affichage des résultats
    void affichageCheminPlusCourt(int[] previous, double[] distances, int startNode, int endNode) {
        if (distances[endNode] == Double.MAX_VALUE) {
            System.out.println("Il n'y a pas de chemin entre " + villes.get(startNode) + " et " + villes.get(endNode));
            return;
        }

        // Reconstruire le chemin en suivant le tableau des précédents
        LinkedList<Integer> path = new LinkedList<>();
        for (int i = endNode; i != -1; i = previous[i]) {
            path.addFirst(i);
        }

        System.out.println("Le plus court chemin entre " + villes.get(startNode) + " et " + villes.get(endNode) + " est : ");
        for (int i=0; i<path.size()-1; i++) {
            int node = path.get(i);
            System.out.print(villes.get(node) + " -> ");
        }
        System.out.print(villes.get(path.get(path.size()-1)));

        System.out.println("\nDistance totale : " + distances[endNode]);
    }

    public static void main(String[] args) {
        Graph g = new Graph();

        Ville v1 = new Ville("Nantes");
        Ville v2 = new Ville("Angers");
        Ville v3 = new Ville("Cholet");
        Ville v4 = new Ville("Pontchateau");
        Ville v5 = new Ville("Saint-Joachim");
        Ville v6 = new Ville("Saint-Nazaire");

        // Ajout des chemins avec les distances (pondérations)
        g.ajoutRoute(v1, v2, 8.7);
        g.ajoutRoute(v1, v3, 12.0);
        g.ajoutRoute(v2, v3, 5.0);
        g.ajoutRoute(v1, v4, 18.6);
        g.ajoutRoute(v3, v4, 11.7);
        g.ajoutRoute(v3, v5, 7.9);
        g.ajoutRoute(v4, v5, 11.4);
        g.ajoutRoute(v5, v6, 16.4);
        g.ajoutRoute(v4, v6, 25.4);
        g.ajoutRoute(v2, v6, 27.3);

        // Recherche du plus court chemin depuis la ville 0
        g.dijkstra(v1, v6);
    }
}