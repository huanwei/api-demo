package cn.harmonycloud.k8s.oam.logapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@Configuration
@SpringBootApplication
public class App 
{

    private static final Logger log = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
        ApplicationContext ctx = SpringApplication.run(App.class, args);
        /*String[] activeProfiles = ctx.getEnvironment().getActiveProfiles();
        for (String profile : activeProfiles) {
            log.info("the current profile is:{}" , profile);
        }*/
    }
}
