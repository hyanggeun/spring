/*
package ems.member.configuration;

import ems.member.DataBaseConnectionInfo;
import ems.member.dao.StudentDao;
import ems.member.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class MemberConfig {
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
    @Bean
    public EMSInformationService informationService(){
        EMSInformationService Ems = new EMSInformationService();
        Ems.setInfo("Education");
        Ems.setCopyRight("COPYRIGHT By HG");
        Ems.setVer("1.0");
        Ems.setsYear(2015);
        Ems.setsMonth(1);
        Ems.setsDay(1);
        Ems.seteYear(2015);
        Ems.seteMonth(2);
        Ems.seteDay(28);

        ArrayList<String> developers = new ArrayList<>();
        developers.add("Cheney");
        developers.add("Elloy");
        developers.add("Jasper");
        developers.add("Dillon");
        developers.add("Kain");
        Ems.setDevelopers(developers);

        Map<String,String> administrators = new HashMap<String,String>();
        administrators.put("Cheney","cheney@springPjt.org");
        administrators.put("Elloy","elloy@springPjt.org");
        administrators.put("Jasper","Jasper@springPjt.org");
        administrators.put("Dillon","Dillon@springPjt.org");
        administrators.put("Kain","Kain@springPjt.org");
        Ems.setAdministrators(administrators);

        Map<String,DataBaseConnectionInfo> dbInfos = new HashMap<>();
        dbInfos.put("Real",dataBaseConnectionInfoDev());
        dbInfos.put("Dev",dataBaseConnectionInfoDev());
        Ems.setDbInfos(dbInfos);
        return Ems;
    }
}
*/