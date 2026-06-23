import java.util.*;
public class StudentService {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(int id,String name,int age,String course,char grade) {
        Student s = new Student(id, name, age, course, grade);
        students.add(s);
    }

    public void viewStudents() {
        for(Student s1 : students) {
            System.out.println(s1);
        }
    }

    public Student searchStudent(int id) {
        for(Student s1 : students) {
            if(s1.getStudentId() == id)
                return s1;
        }
        return null;
    }

    public Boolean removeStudent(int id) {
        for(int i = 0; i < students.size(); i++) {
            if(students.get(i).getStudentId() == id) {
                students.remove(i);
                return true;
            }
        }
        return false;
    }
    public boolean updateStudent(int id,String name,int age,String course,char grade) {

        for(Student s : students) {

            if(s.getStudentId() == id) {

                s.setStudentName(name);
                s.setStudentAge(age);
                s.setStudentCourse(course);
                s.setStudentGrade(grade);

                return true;
            }
        }  

        return false;
    }

}
