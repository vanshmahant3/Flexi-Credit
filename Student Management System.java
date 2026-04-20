// Base class
class Person {
    String name;
    int age;

    void setPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class
class Student extends Person {
    int rollNo;
    float marks;

    void setStudent(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

// Further derived class
class GraduateStudent extends Student {
    String specialization;

    void setGraduate(String specialization) {
        this.specialization = specialization;
    }

    void displayGraduate() {
        System.out.println("Specialization: " + specialization);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        GraduateStudent gs = new GraduateStudent();

        gs.setPerson("Adarsh", 21);
        gs.setStudent(101, 85.5f);
        gs.setGraduate("Computer Science");

        System.out.println("---- Student Details ----");
        gs.displayPerson();
        gs.displayStudent();
        gs.displayGraduate();
    }
}
