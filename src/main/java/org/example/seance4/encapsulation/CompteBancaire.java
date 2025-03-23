package org.example.seance4.encapsulation;

public class CompteBancaire {
    private double solde;

    public CompteBancaire(double solde) {
        this.solde = solde;
    }

    public double getSolde() {
        return solde;
    }

    public void deposer(double montant) {
        solde = solde + montant;
    }

    public void retirer(double debit) {
        solde = solde - debit;
    }
}
