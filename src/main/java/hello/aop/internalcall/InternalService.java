package hello.aop.internalcall;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class InternalService {

    public void Internal() {
        log.info("call internal");
    }
}
