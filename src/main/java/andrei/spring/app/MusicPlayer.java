package andrei.spring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;


@Component
public class MusicPlayer {

    private Music classicalMusic;
    private Music rockMusic;
    private Music punkMusic;

    @Autowired
    public MusicPlayer(Music classicalMusic, Music rockMusic, Music punkMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.punkMusic = punkMusic;
    }

    public void playMusic(MusicGenre musicGenre) {
        int randomSong = new Random().nextInt(3);

        if (musicGenre == MusicGenre.CLASSICAL) {
            System.out.println(classicalMusic.getSong().get(randomSong));
        }
        else if (musicGenre == MusicGenre.PUNK) {
            System.out.println(punkMusic.getSong().get(randomSong));
        }
        else System.out.println(rockMusic.getSong().get(randomSong));
    }

}
