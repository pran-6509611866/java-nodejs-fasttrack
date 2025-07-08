import java.util.ArrayList;
import java.util.Scanner;

class FriendsCollector {

    ArrayList<String> friends;

    public FriendsCollector() {
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
class Day1Student {
    private String name;
    private int age;

    public Day1Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Day1 {
    public static void main(String[] args) {
        Day1Student student = new Day1Student("John Doe", 20);
        student.displayInfo();

        System.out.println("Enter 5 friend's names: ");
        FriendsCollector friend = new FriendsCollector();
        System.out.println("Friends: " + friend.friends);
        
    }
}