package andrei.spring.app;


import org.springframework.stereotype.Component;

@Component
public class PunkMusic implements Music {
    @Override
    public String getSong() {
        return "Любая песня КиШ-а";
    }
}
