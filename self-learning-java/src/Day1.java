import java.util.ArrayList;
import java.util.Scanner;
class Student {

    //properties
    String name;
    int age;

    //constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Friend {

    ArrayList<String> friends;

    public Friend() {
        friends = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter friend's name " + (i + 1) + ": ");
            String name = scanner.nextLine();
            friends.add(name);
        }
        scanner.close();
    }
}
class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 20);
        student.displayInfo();

        System.out.println("Enter 5 friend's names: ");
        Friend friend = new Friend();
        System.out.println("Friends: " + friend.friends);
        
    }
}