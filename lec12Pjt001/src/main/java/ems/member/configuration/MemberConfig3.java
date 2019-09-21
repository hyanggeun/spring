package ems.member.configuration;
import ems.member.DataBaseConnectionInfo;
import ems.member.service.EMSInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class MemberConfig3 {

    @Autowired
    DataBaseConnectionInfo dataBaseConnectionInfoReal;

    @Autowired
    DataBaseConnectionInfo dataBaseConnectionInfoDev;

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

        Map<String, DataBaseConnectionInfo> dbInfos = new HashMap<>();
        dbInfos.put("Real",dataBaseConnectionInfoReal);
        dbInfos.put("Dev",dataBaseConnectionInfoDev);
        Ems.setDbInfos(dbInfos);
        return Ems;
    }
}
