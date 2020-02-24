package andrei.spring.app;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private static List<String> songList = new ArrayList<>();
    static {
        songList.add("Valkyrie fly");
        songList.add("Bach's fuga");
        songList.add("Some random song");
    }

    @Override
    public void getSong() {
        songList.stream()
                .forEach(System.out::println);
    }
}
