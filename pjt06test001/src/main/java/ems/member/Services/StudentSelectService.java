package ems.member.Services;

import ems.member.Student;
import ems.member.dao.StudentDao;

public class StudentSelectService {
    public StudentDao studentDao;
    public StudentSelectService(StudentDao studentDao){
        this.studentDao = studentDao;
    }

    public Student select(String sNum){
        if(verify(sNum)){
            return studentDao.select(sNum);
        } else {
            System.out.println("student no available");
        }
        return null;
    }
    public boolean verify(String sNum){
        return studentDao.select(sNum) !=null ? true : false;
    }
}
