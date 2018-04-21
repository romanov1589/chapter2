package xml.soundsystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CDPlayerMain {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SoundSystemConfig.class);
        CDPlayer cdPlayer = (CDPlayer) ctx.getBean("cdPlayer");
        cdPlayer.play();

//        CDPlayer cdPlayer = (CDPlayer)context.getBean("cdPlayer");
//        cdPlayer.play();

    }
}
