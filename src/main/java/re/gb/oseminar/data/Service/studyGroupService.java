package re.gb.oseminar.data.Service;

import re.gb.oseminar.data.data.Student;
import re.gb.oseminar.data.data.Teacher;
import re.gb.oseminar.data.data.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class studyGroupService {

    private final Map<Long, List<Long>> resulGroup = new HashMap<>();
    private final List<Long> listStudentId = new ArrayList<>();


    public List<Long> getListStId (List <User> students) {
        Long id = 0L;
        for (User item: students){
            id = ((Student)item).getStudentID();
            listStudentId.add(id);
        }
        return this.listStudentId;
    }

    public void creatGroup(Teacher teacher, List<Long> listStudentId){
        this.resulGroup.put(teacher.getTeacherID(),listStudentId);
    }

    public Map<Long, List<Long>> getAll() {
        return this.resulGroup;
    }


}
