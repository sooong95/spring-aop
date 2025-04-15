package hello.aop.pointcut;

import hello.aop.order.aop.member.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class ThisTargetTest {

    @Autowired
    MemberService memberService;

    @Test
    void success() {

    }
}
