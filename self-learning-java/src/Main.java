import java.util.ArrayList;
import java.util.Scanner;

class Student {
    // Properties
    ArrayList<String> name;
    int[] score;
    Scanner scanner = new Scanner(System.in);

    // Constructor
    public Student() {
        this.name = new ArrayList<>();
        this.score = new int[5];
    }

    // Method แสดงข้อมูลนักเรียน
    public void displayInfo() {
        System.out.println("Student Information:");
        for (int i = 0; i < name.size(); i++) {
            System.out.println("Name: " + name.get(i) + " | Score: " + score[i]);
        }
        System.out.println("Total Score: " + getTotalScore());
        System.out.println("Average Score: " + (getTotalScore() / (double) score.length));
    }   

    // Method คำนวณคะแนนรวม
    public int getTotalScore() {
        int total = 0;
        for (int s : score) {
            total += s;
        }
        return total;
    }

    // Method รับชื่อเพื่อน 5 คน
    public void addFriends() {
        System.out.println("Enter 5 friend's names:");
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter friend's name " + (i + 1) + ": ");
            String friendName = scanner.nextLine();
            name.add(friendName);
        } 
    }

    // Method รับคะแนน 5 วิชา
    public void addScore() {
        System.out.println("Enter 5 subject scores:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter score for subject " + (i + 1) + ": ");
            int score = scanner.nextInt();
            this.score[i] = score;
        }
        scanner.close();
    }
    
}

class Product {
    
}

class Main {
    public static void main(String[] args) {
        Student student = new Student();
        
        student.addFriends();
        student.addScore();
        student.displayInfo();
    }
}