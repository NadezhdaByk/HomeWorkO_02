package re.gb.oseminar.data.Controller;

import re.gb.oseminar.data.Service.UserService;
import re.gb.oseminar.data.Service.studyGroupService;
import re.gb.oseminar.data.StudentView.StudentView;
import re.gb.oseminar.data.StudentView.groupView;
import re.gb.oseminar.data.data.Student;
import re.gb.oseminar.data.data.Teacher;
import re.gb.oseminar.data.data.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Controller {
    private final UserService userService = new UserService();
    private  final StudentView studentView = new StudentView();

    private final studyGroupService sgs = new studyGroupService();
    private final studyGroupService glst = new studyGroupService();
    private final groupView groupView = new groupView();


    public void createUser(String firstName, String lastName, String patronomyc){
        userService.creatUser(firstName, lastName, patronomyc);
        List<User> students =  userService.getAll();
        studentView.sendOnConsole(students);
    }


    public void creatGroup (Teacher teacher, List<User> listStudent){
        sgs.creatGroup(teacher, glst.getListStId(listStudent));
        Map<Long, List<Long>> group = sgs.getAll();
        groupView.sendOnConsole(group);
    }

}
