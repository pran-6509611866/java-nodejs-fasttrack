class Student {
    // static variable: ใช้นับจำนวนอ็อบเจกต์ที่ถูกสร้าง
    private static int count = 0;

    // instance variable: เก็บชื่อของแต่ละอ็อบเจกต์
    private String name;

    // Constructor
    public Student(String name) {
        this.name = name;
        count++; // ทุกครั้งที่สร้าง Student ใหม่ count จะเพิ่มขึ้น
    }

    // static method: แสดงจำนวนอ็อบเจกต์ทั้งหมด
    public static void printTotalStudents() {
        System.out.println("Total Students: " + count);
    }

    // instance method: แสดงชื่อของอ็อบเจกต์นี้
    public void printName() {
        System.out.println("Student name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Charlie");

        s1.printName(); // Student name: Alice
        s2.printName(); // Student name: Bob
        s3.printName(); // Student name: Charlie

        Student.printTotalStudents(); // Total Students: 3
    }
}