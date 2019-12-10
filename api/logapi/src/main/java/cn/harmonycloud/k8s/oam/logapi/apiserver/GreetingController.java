package cn.harmonycloud.k8s.oam.logapi.apiserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Huan Wei on 16-11-2 .
 */
@RestController
public class GreetingController {

    private static final String template = "Hello, %s! Request from ";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private Environment env;

    @RequestMapping("/api/log/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) throws UnknownHostException {
        return new Greeting(counter.incrementAndGet(),
                String.format(template + getIp(), name));
    }

    @RequestMapping("/api/log/profile")
    public String getProfile(){
        return env.getProperty("profile");
    }

    private String getIp() throws UnknownHostException {
        return InetAddress.getLocalHost().getHostAddress() + " hostname "+ InetAddress.getLocalHost().getHostName();
    }



}
