package andrei.spring.app;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    public void playMusic() {
        System.out.println("Playing " + music.getSong());
    }
}
