package xml.soundsystem;

public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Band";
    private String artist = "Beatles";

    public void play() {
        System.out.println("Odtwarzam utwór " + title + " artysty " + artist);
    }
}
