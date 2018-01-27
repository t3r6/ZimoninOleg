package lesson10.instruments;

public class MusicalInstrumentsDemo {
    public static void main(String[] args) {
        Guitar acousticGuitar = new Guitar(6);
        Guitar electricGuitar = new Guitar();
        Drum bigDrum = new Drum(22.5);
        Drum smallDrum =new Drum();
        Trumpet longTrumplet = new Trumpet(17.5);
        Trumpet shortTrumplet = new Trumpet();
        MusicInstrument[] instruments = {acousticGuitar, bigDrum, longTrumplet, electricGuitar, smallDrum, shortTrumplet};
        for (MusicInstrument instrument : instruments) {
            instrument.play();
        }
    }
}
