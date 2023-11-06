package optional;
import java.util.List;
import java.util.Optional;

public class StudentService implements StudentServiceInterface{
    private  List<Student> studentList;
    @Override
    public List<Student> findStudentByFirstName(String s) {
        return studentList.stream().filter(student -> student.getStuName().startsWith(s)).toList();
    }
    @Override
    public Optional<Student> findStudentByID(int id) {
        return studentList.stream().filter(student -> student.getStuID()==id).findFirst();
    }
}
