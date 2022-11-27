package re.gb.oseminar.data.data;

import java.util.List;

public class StudyGroup {
    private Teacher theacher;
    private List<Student> studentList;

    public StudyGroup(Teacher theacher, List<Student> studentList) {
        this.theacher = theacher;
        this.studentList = studentList;
    }

    public Teacher getTheacher() {
        return theacher;
    }

    public void setTheacher(Teacher theacher) {
        this.theacher = theacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
