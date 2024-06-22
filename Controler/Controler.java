package Controler;

import Data.Student;
import Data.Teacher;
import Data.Type;
import Data.User;
import Model.StudyGroup;
import Service.DataService;
import Service.StudyGroupService;
import View.StudentView;
import View.StudyGroupView;

import java.util.List;

public class Controler {
    private final DataService dataService = new DataService();
    private final StudyGroupService studyGroupService = new StudyGroupService();
    private final StudentView studentView = new StudentView();
    private final StudyGroupView studyGroupView = new StudyGroupView();

    public void createStudent(String firstName, String secondName,
            String lastName, String dateB) {
        dataService.create(firstName, secondName, lastName, dateB, Type.STUDENT);
    }

    public void createTeacher(String firstName, String secondName, String lastName, String dateB, int teacherId) {
        dataService.create(firstName, secondName, lastName, dateB, Type.TEACHER, teacherId);
    }

    public void getAllStudent() {
        List<User> userList = dataService.getAllStudent();
        for (User user : userList) {
            studentView.printOnConsole((Student) user);
        }
    }

    public void createStudyGroup(int teacherId, List<Integer> studentIds) {
        Teacher teacher = (Teacher) dataService.getUserById(Type.TEACHER, teacherId);
        List<Student> students = dataService.getAllStudent().stream()
                .filter(user -> studentIds.contains(((Student) user).getStudentId()))
                .map(user -> (Student) user)
                .toList();

        StudyGroup studyGroup = studyGroupService.createStudyGroup(teacher, students);
        studyGroupView.printStudyGroup(studyGroup);
    }
}