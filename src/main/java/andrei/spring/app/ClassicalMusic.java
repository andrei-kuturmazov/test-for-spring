package andrei.spring.app;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> songList = new ArrayList<>();
    {
        songList.add("Valkyrie fly");
        songList.add("Bach's fuga");
        songList.add("Some random song");
    }

    @Override
    public List<String> getSong() {
        return songList;
    }
}
