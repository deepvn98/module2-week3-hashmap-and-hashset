import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student sv1 = new Student("lực",21,"Hà tây");
        Student sv2 = new Student("Hà",20,"Sóc sơn");
        Student sv3 = new Student("Híu",19,"Bắc Ninh");
        Student sv4 = new Student("Hoàng",25,"Đan phương");
        Map<Integer,Student> studentMap = new HashMap<>();
        studentMap.put(0,sv1);
        studentMap.put(1,sv2);
        studentMap.put(2,sv3);
        studentMap.put(3,sv4);
        for(Map.Entry<Integer, Student> student : studentMap.entrySet()){
            System.out.println(student.toString());

        }
        System.out.println("_____________________");
        Set<Student> students = new HashSet<Student>();
        students.add(sv1);
        students.add(sv2);
        students.add(sv3);
        students.add(sv1);
        for(Student student : students) {
            System.out.println(student.toString());
        }
    }
}
