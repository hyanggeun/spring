package ems.member.Services;

import ems.member.Student;
import ems.member.dao.StudentDao;

public class StudentRegisterService {
    private StudentDao StudentDao;

    public StudentRegisterService(StudentDao studentDao) {
        this.StudentDao = studentDao;
    }

    public void register(Student student) {
        String sNum = student.getsNum();
        if(verify(student.getsNum())){
            StudentDao.insert(student);
        } else{
            System.out.println("already registered");
        }
    }
    public boolean verify(String sNum){
        Student student = StudentDao.select(sNum);
        return student == null ? true:false;
    }
}
