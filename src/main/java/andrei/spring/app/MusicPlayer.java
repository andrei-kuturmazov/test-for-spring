package andrei.spring.app;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
public class MusicPlayer {
    private Music music;

    public void playMusic() {
        System.out.println("Playing " + music.getSong());
    }
}
