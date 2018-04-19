package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisk cd;

    public CDPlayer(CompactDisk cd) {
        this.cd = cd;
    }


    public void play() {
        cd.play();
    }
}
