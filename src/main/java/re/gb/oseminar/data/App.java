package re.gb.oseminar.data;

import re.gb.oseminar.data.Controller.Controller;
import re.gb.oseminar.data.data.Student;
import re.gb.oseminar.data.data.Teacher;
import re.gb.oseminar.data.data.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main (String [] args){

        Controller controller = new Controller();
        controller.createUser("Ivan",
                "Ivanov",
                "Olegovich");
        controller.createUser("Ivan",
                "Ivanov",
                "Mihaylovich");
        Teacher teacher = new Teacher("Olga", "Gavrilova", "Ivanova", 101L);
        List<User> students = new ArrayList<User>(Arrays.asList(
                new Student("Ivan",
                        "Ivanov",
                        "Mihaylovich", 1L),
                new Student("Oleg", "Sidorov", "Ivanov", 2L)));

        controller.creatGroup(teacher, students);
    }
}
