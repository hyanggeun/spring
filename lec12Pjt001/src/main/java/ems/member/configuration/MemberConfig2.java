package ems.member.configuration;

import ems.member.DataBaseConnectionInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MemberConfig2 {

    @Bean
    public DataBaseConnectionInfo dataBaseConnectionInfoDev(){
        DataBaseConnectionInfo DevInfo = new DataBaseConnectionInfo();
        DevInfo.setJdbcUrl("jdbc:oracle:thin:@192.168.0.1:1521:xe");
        DevInfo.setUserId("DevId");
        DevInfo.setUserPw("DevPw");
        return DevInfo;
    }

    @Bean
    public DataBaseConnectionInfo dataBaseConnectionInfoReal(){
        DataBaseConnectionInfo RealInfo = new DataBaseConnectionInfo();
        RealInfo.setJdbcUrl("jdbc:oracle:thin:@192.168.0.1:1521:xe");
        RealInfo.setUserId("ReadId");
        RealInfo.setUserPw("RealPw");
        return RealInfo;
    }
}
