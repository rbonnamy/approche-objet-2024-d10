package fr.diginamic.maison.generiques;

import java.util.ArrayList;
import java.util.List;

public class Maison {
    private List<Piece> pieces = new ArrayList<>();

    public void ajouterPiece(Piece piece) {
        if (piece != null && piece.superficie > 0 && piece.etage >= 0) {
            pieces.add(piece);
        } else {
            System.out.println("Erreur : Pièce invalide.");
        }
    }

    public double superficieTotale() {
        double superficieTotale = 0;
        for (Piece piece : pieces) {
            superficieTotale += piece.getSuperficie();
        }
        return superficieTotale;
    }

    public double superficieEtage(int etage) {
        double superficieEtage = 0;
        for (Piece piece : pieces) {
            if (piece.getEtage() == etage) {
                superficieEtage += piece.getSuperficie();
            }
        }
        return superficieEtage;
    }

    public double superficieType(String type) {
        double superficieType = 0;
        for (Piece piece : pieces) {
            if (piece.getType().equals(type)) {
                superficieType += piece.getSuperficie();
            }
        }
        return superficieType;
    }

    public int nombrePiecesType(String type) {
        int nombrePieces = 0;
        for (Piece piece : pieces) {
            if (piece.getType().equals(type)) {
                nombrePieces++;
            }
        }
        return nombrePieces;
    }
}
