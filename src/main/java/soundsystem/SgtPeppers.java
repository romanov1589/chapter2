package soundsystem;

import org.springframework.stereotype.Component;

@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisk{
    private String title = "Sgt. Pepper's Lonely Hearts Band";
    private String artist = "Beatles";

    public void play() {
        System.out.println("Odtwarzam utwór " + title + " artysty " + artist);
    }
}
