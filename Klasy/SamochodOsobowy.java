package Klasy;

public class SamochodOsobowy extends Samochod {
    int ladownoscOsob;
    Double pojemnoscSilnika, waga;


    public SamochodOsobowy(String marka, String model, String kolor, String nadwozie, int rokProdukcji, int przebieg, int ladownoscOsob, Double pojemnoscSilnika, Double waga) {
        super(marka, model, kolor, nadwozie, rokProdukcji, przebieg);
        this.ladownoscOsob = ladownoscOsob;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.waga = waga;
    }

    public SamochodOsobowy() {

        System.out.println("Wprowadz wage(zakres 2-4.5T): ");

        waga = wprowadz.nextDouble();
        if (waga >= 2 && waga <= 4.5) {
            this.waga = waga;
        } else {
            System.out.println("Wprowadzono złą wagę!");
        }
        System.out.println("Wprowadz pojemnosc silnika(zakres 0.8-3.0): ");
        pojemnoscSilnika = wprowadz.nextDouble();

        if (pojemnoscSilnika >= 0.8 && pojemnoscSilnika <= 3.0) {
            this.pojemnoscSilnika = pojemnoscSilnika;
        } else {
            System.out.println("Wprowadzono złą pojemnosc silnika!");
        }
        System.out.println("Wprowadz ladownosc osób: ");
        ladownoscOsob = wprowadz.nextInt();
        this.ladownoscOsob = ladownoscOsob;
    }

    public void wyswietlSamochod() {
        System.out.println("Marka i model samochodu: " + marka + " " + model);
        System.out.println("Kolor samochodu: " + kolor);
        System.out.println("Typ nadwozia" + nadwozie);
        System.out.println("Rok produkcji: " + rokProdukcji);
        System.out.println("Przebieg: " + przebieg);
        System.out.println("Waga pojazdu i pojemność osób: " + waga + " " + ladownoscOsob);
        System.out.println("Ladownosc pojazdu to: " + ladownoscOsob);

    }
}