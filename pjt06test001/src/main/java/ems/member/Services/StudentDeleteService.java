package ems.member.Services;

import ems.member.Student;
import ems.member.dao.StudentDao;

public class StudentDeleteService {
    private StudentDao studentDao;
    public StudentDeleteService(StudentDao studentDao){
        this.studentDao = studentDao;
    }
    public void delete(Student student){
        if(verify(student.getsNum())){
            studentDao.delete(student.getsNum());
        } else{
            System.out.println("no delete person");
        }
    }

    public boolean verify(String sNum){
        return studentDao.select(sNum) !=null?true:false;
    }
}
