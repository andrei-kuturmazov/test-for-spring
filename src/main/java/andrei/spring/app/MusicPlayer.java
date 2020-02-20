package andrei.spring.app;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();

    public void playMusic() {
        for (Music music : musicList) {
            System.out.println(music.getSong());
        }

        /*musicList.stream()
                .map(p -> p.getSong())
                .forEach(System.out::println);*/
    }
}
