package lec04pjt001;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        /*
        이 방식은 DI의 세가지 방식중에 xml 기반 설정 방식이다.
        applicationContext.xml이란 파일에 bean들을 저장해놓는다.
        그러면 추후에 ApplicationContext 라는 객체를 통해서 DI 컨테이너에 저장되있는 Bean들을 불러와서 사용할 수 있게 된다.
        불러오는 명령어는 getBean으로 사용할 수 있다.
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TransportationWalk twk = context.getBean("tWalk", TransportationWalk.class);
        twk.walk();

    }
}
