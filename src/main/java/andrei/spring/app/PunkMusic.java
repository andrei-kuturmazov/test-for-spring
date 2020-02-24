package andrei.spring.app;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PunkMusic implements Music {
    private static List<String> songList = new ArrayList<>();

    static {
        songList.add("Lord on the boards");
        songList.add("Кукла колдуна");
        songList.add("No leaf clover");
    }

    @Override
    public void getSong() {
        songList.stream()
                .forEach(System.out::println);
    }
}
