package View;

import Data.Student;
import Model.StudyGroup;

public class StudyGroupView {
    public void printStudyGroup(StudyGroup studyGroup) {
        System.out.println("Study Group Information:");
        System.out.println("Teacher:\n" + studyGroup.getTeacher());
        System.out.println("Students:");
        for (Student student : studyGroup.getStudents()) {
            System.out.println(student);
        }
    }
}
