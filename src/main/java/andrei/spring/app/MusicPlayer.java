package andrei.spring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MusicPlayer {

    @Autowired
    private ClassicalMusic classicalMusic;
    @Autowired
    private RockMusic rockMusic;

    public void playMusic() {
        System.out.println(String.format("Playing %s and %s", classicalMusic.getSong(), rockMusic.getSong() ));
    }

}
