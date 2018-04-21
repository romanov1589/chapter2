package xml.soundsystem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CDPlayerMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationXmlContext.xml");
        SgtPeppers sgtPeppers = (SgtPeppers)context.getBean("compactDisc");
        CDPlayer cdPlayer = (CDPlayer)context.getBean("cdPlayer");
        cdPlayer.play();

    }
}