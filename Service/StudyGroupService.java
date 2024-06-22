package Service;

import Data.Student;
import Data.Teacher;
import Model.StudyGroup;

import java.util.List;

public class StudyGroupService {
    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students);
    }
}
