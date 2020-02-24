package andrei.spring.app;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@AllArgsConstructor
public class MusicPlayer {

    @Autowired
    private ClassicalMusic classicalMusic;

    public void playMusic() {
        System.out.println("Playing " + classicalMusic.getSong());
    }

}
