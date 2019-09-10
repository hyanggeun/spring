package ems.member.assembler;

import ems.member.Services.*;
import ems.member.dao.StudentDao;

public class StudentAssembler {
    private StudentDao studentDao;
    private StudentDeleteService deleteService;
    private StudentModifyService modifyService;
    private StudentSelectService selectService;
    private StudentRegisterService registerService;
    private StudentAllSelectService allSelectService;

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public StudentDeleteService getDeleteService() {
        return deleteService;
    }

    public void setDeleteService(StudentDeleteService deleteService) {
        this.deleteService = deleteService;
    }

    public StudentModifyService getModifyService() {
        return modifyService;
    }

    public void setModifyService(StudentModifyService modifyService) {
        this.modifyService = modifyService;
    }

    public StudentSelectService getSelectService() {
        return selectService;
    }

    public void setSelectService(StudentSelectService selectService) {
        this.selectService = selectService;
    }

    public StudentRegisterService getRegisterService() {
        return registerService;
    }

    public void setRegisterService(StudentRegisterService registerService) {
        this.registerService = registerService;
    }

    public StudentAllSelectService getAllSelectService() {
        return allSelectService;
    }

    public void setAllSelectService(StudentAllSelectService allSelectService) {
        this.allSelectService = allSelectService;
    }
    /*
    자바를 이용한 DI(의존성 주입) 모든 객체에서  studentDao를 주입하고 있다.
     */
    public StudentAssembler(){
        studentDao = new StudentDao();
        registerService = new StudentRegisterService(studentDao);
        modifyService = new StudentModifyService(studentDao);
        deleteService = new StudentDeleteService(studentDao);
        selectService = new StudentSelectService(studentDao);
        allSelectService = new StudentAllSelectService(studentDao);
    }


}
