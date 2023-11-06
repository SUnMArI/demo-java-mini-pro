package optional;

import java.util.List;
import java.util.Optional;

public interface StudentServiceInterface {
   List<Student> findStudentByFirstName(String s);
   Optional<Student> findStudentByID(int s);
}
