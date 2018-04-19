package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "soundsystem")
public class CDPlayerConfig {

    @Bean(name = "lonelyHeartsClubBand")
    public CompactDisk sgtPeppers(){
        return new SgtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer(CompactDisk compactDisk){
        return new CDPlayer(compactDisk);
    }

//    @Bean
//    public CDPlayer anotherCDPlayer(){
//        return new CDPlayer(sgtPeppers());
//    }
}
