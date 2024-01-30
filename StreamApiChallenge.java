import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student {
    private int id;
    private String name;
    private String classOfStudent;
    private String grade;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassOfStudent() {
        return classOfStudent;
    }

    public String getGrade() {
        return grade;
    }

    public Student(int id, String name, String classOfStudent, String grade) {
        this.id = id;
        this.name = name;
        this.classOfStudent = classOfStudent;
        this.grade = grade;
    }
}

public class StreamApiChallenge {

    public static void printClassWithStudent(Map<String, List<Student>> mpp) {
        mpp.forEach((classOfStudent, studentsList) -> {
            System.out.print("Class:- " + classOfStudent + " - ");
            studentsList.forEach((student) -> System.out.print(student.getName() + ", "));
            System.out.println();
        });
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();

        Student s1 = new Student(1, "Sayak", "C1", "D");
        students.add(s1);
        Student s2 = new Student(2, "Soham", "C1", "B");
        students.add(s2);
        Student s3 = new Student(6, "Sanket", "C1", "C");
        students.add(s3);
        Student s4 = new Student(7, "Gaurav", "C1", "D");
        students.add(s4);
        Student s5 = new Student(12, "Sudip", "C1", "B");
        students.add(s5);

        Student s6 = new Student(10, "Suman", "C2", "A");
        students.add(s6);
        Student s7 = new Student(16, "Ritam", "C2", "A");
        students.add(s7);
        Student s8 = new Student(17, "Tuhin", "C2", "A");
        students.add(s8);
        Student s9 = new Student(20, "Sohan", "C2", "A");
        students.add(s9);
        Student s10 = new Student(15, "Ritik", "C2", "A");
        students.add(s10);

        Student s11 = new Student(19, "Laxmi", "C3", "D");
        students.add(s11);
        Student s12 = new Student(11, "Anish", "C3", "B");
        students.add(s12);
        Student s13 = new Student(13, "Puspa", "C3", "A");
        students.add(s13);
        Student s14 = new Student(14, "Rudra", "C3", "C");
        students.add(s14);
        Student s15 = new Student(5, "Sumon", "C3", "B");
        students.add(s15);

        Student s16 = new Student(3, "Rhitam", "C4", "C");
        students.add(s16);
        Student s17 = new Student(4, "Avijit", "C4", "A");
        students.add(s17);
        Student s18 = new Student(18, "Ananya", "C4", "A");
        students.add(s18);
        Student s19 = new Student(8, "Swarna", "C4", "A");
        students.add(s19);
        Student s20 = new Student(9, "Ujjwal", "C4", "A");
        students.add(s20);

        //  There are four classes: "C1," "C2," "C3," and "C4," each containing five students (randomly). 
        // Now, I want to retrieve a list of students with a grade of 'A' and group them by class.

        
        Stream<Student> stream = students.stream();
        
        List<Student> studentsWithGradeA = stream.filter(student -> student.getGrade() == "A").collect(Collectors.toList());

        // group them by class
        Map<String, List<Student>> studentsWithGradeAByClass = studentsWithGradeA.stream().collect(Collectors.groupingBy(Student::getClassOfStudent));
        System.out.println("List of students with Grade A by class:- ");
        printClassWithStudent(studentsWithGradeAByClass);


        stream = students.stream();


        // I want to retrieve a list of classes that have at least one student with a grade of 'A'
        List<String> classWithAtleastOneStudentWithGradeA = new ArrayList<>(studentsWithGradeAByClass.keySet());
        System.out.println("List of classes with at least one student with a grade of A:- ");
        classWithAtleastOneStudentWithGradeA.forEach(name -> System.out.println(name));


        // I want to find the classes where all students have a grade of 'A'
        List<String> classWithAllStudentsWithGradeA = new ArrayList<String>();
        studentsWithGradeAByClass.forEach((classOfStudent, studentsList) -> {
            if(studentsList.size() == 5) {
                classWithAllStudentsWithGradeA.add(classOfStudent);
            }
        });
        System.out.println("List of classes with at all students with a grade of A:- ");
        classWithAllStudentsWithGradeA.forEach(name -> System.out.println(name));

    }
}






