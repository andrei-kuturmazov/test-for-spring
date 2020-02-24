package andrei.spring.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String... args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();*/
        Music classicalMusic = context.getBean("classicalBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
        context.close();
    }
}
