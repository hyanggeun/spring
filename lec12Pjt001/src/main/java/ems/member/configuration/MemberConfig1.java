package ems.member.configuration;
import ems.member.dao.StudentDao;
import ems.member.service.StudentAllSelectService;
import ems.member.service.StudentModifyService;
import ems.member.service.StudentRegisterService;
import ems.member.service.StudentSelectService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({MemberConfig2.class,MemberConfig3.class})
public class MemberConfig1 {
    @Bean
    public StudentDao studentDao(){
        return new StudentDao();
    }
    @Bean
    public StudentRegisterService registerService(){
        return new StudentRegisterService(studentDao());
    }

    @Bean
    public StudentModifyService modifyService(){
        return new StudentModifyService(studentDao());
    }

    @Bean
    public StudentSelectService selectService(){
        return new StudentSelectService(studentDao());
    }

    @Bean
    public StudentAllSelectService allSelectService(){
        return new StudentAllSelectService(studentDao());
    }

}
