import Klasy.Samochod;
import Klasy.SamochodOsobowy;

public class Main {
    public static void main(String[] args) {
        SamochodOsobowy mojSamochod1 = new SamochodOsobowy();
        Samochod nowySamochod1 = new Samochod();
        Samochod nowySamochod2 = new Samochod();

        mojSamochod1.wyswietlSamochod();
        nowySamochod1.wyswietlSamochod();
        nowySamochod2.wyswietlSamochod();

    }


}