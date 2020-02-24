package andrei.spring.app;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> songList = new ArrayList<>();

    {
        songList.add("Sohne");
        songList.add("Du reicht so gut");
        songList.add("Amerika");
    }

    @Override
    public List<String> getSong() {
        return songList;
    }
}
