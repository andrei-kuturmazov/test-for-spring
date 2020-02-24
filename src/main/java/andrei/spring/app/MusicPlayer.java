package andrei.spring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class MusicPlayer {

    private Music classicalMusic;
    private Music rockMusic;

    @Autowired
    public MusicPlayer(Music classicalMusic, Music rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic() {
        System.out.println("Playing " + classicalMusic.getSong());
        System.out.println("Playing " + rockMusic.getSong());
    }

}
