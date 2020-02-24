package andrei.spring.app;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private static List<String> songList = new ArrayList<>();

    static {
        songList.add("Sohne");
        songList.add("Du reicht so gut");
        songList.add("Amerika");
    }

    @Override
    public void getSong() {
        songList.stream()
                .forEach(System.out::println);
    }
}
