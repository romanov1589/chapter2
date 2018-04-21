package xml.soundsystem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CDPlayerMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationXmlContext.xml");
        BlankDisc blankDisc = (BlankDisc) context.getBean("compactDisk");
        CDPlayer cdPlayer = (CDPlayer)context.getBean("cdPlayer");
        cdPlayer.play();

    }
}
