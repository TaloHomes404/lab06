package Klasy;

import java.util.Scanner;

public class Samochod {
    String marka, model, kolor, nadwozie;
    int rokProdukcji, przebieg;
    Scanner wprowadz = new Scanner(System.in);

    public Samochod() {

        System.out.println("Wprowadz markę pojazdu: ");
        marka = wprowadz.nextLine();
        this.marka = marka;
        System.out.println("Wprowadz model pojazdu: ");
        model = wprowadz.nextLine();
        this.model = model;
        System.out.println("Wprowadz kolor pojazdu: ");
        kolor = wprowadz.nextLine();
        this.kolor = kolor;
        System.out.println("Wprowadz typ nadwozia: ");
        nadwozie = wprowadz.nextLine();
        this.nadwozie = nadwozie;
        System.out.println("Wprowadz rok produkcji:  ");
        rokProdukcji = wprowadz.nextInt();
        this.rokProdukcji = rokProdukcji;
        System.out.println("Wprowadz przebieg: ");
        przebieg = wprowadz.nextInt();
        this.przebieg = przebieg;

    }

    public Samochod(String marka, String model, String kolor, String nadwozie, int rokProdukcji, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
        this.nadwozie = nadwozie;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
    }

    public void wyswietlSamochod(){
        System.out.println("Marka i model samochodu: "+marka+" "+model);
        System.out.println("Kolor samochodu: "+kolor);
        System.out.println("Typ nadwozia" +nadwozie);
        System.out.println("Rok produkcji: " +rokProdukcji);
        System.out.println("Przebieg: "+przebieg);
    }

}


