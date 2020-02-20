package andrei.spring.app;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();

    public void playMusic() {
        musicList.stream()
                .map(p -> p.getSong())
                .forEach(System.out::println);
    }
}
