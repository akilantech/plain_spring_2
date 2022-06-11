package learning.ch_01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextSampleRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        TransferService transferService = context.getBean(TransferService.class);

    }
}
