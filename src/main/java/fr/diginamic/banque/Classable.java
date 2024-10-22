package fr.diginamic.banque;

public interface Classable {
    // public static final est implicite pour tous les attributs
    public static final int a = 10; // final est implicite donc a est une constante dans une interface

    // public abstract est implicite
    void doTask(String param);
}

