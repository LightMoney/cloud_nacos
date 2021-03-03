package cn.fan.security1;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Slf4j
@SpringBootTest
public class Security1ApplicationTests {

    @Test
   public void contextLoads() {
        String encode = new BCryptPasswordEncoder().encode("123456");
        log.info(encode);
    }

}
