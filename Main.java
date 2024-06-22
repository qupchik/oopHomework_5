import Controler.Controler;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controler controler = new Controler();

        // Создание преподавателя
        controler.createTeacher("1", "2", "3", "4-4-4", 1);

        // Создание студентов
        controler.createStudent("asdf", "casd", "asdfv", "1234f");
        controler.createStudent("asdc", "asdc", "qwcer", "12341");
        controler.createStudent("ascwe", "arw", "asdfg", "423-432-324");

        // Получение всех студентов
        controler.getAllStudent();

        // Создание учебной группы
        int teacherId = 1; // Идентификатор преподавателя
        List<Integer> studentIds = List.of(1, 2, 3); // Идентификаторы студентов
        controler.createStudyGroup(teacherId, studentIds);
    }
}