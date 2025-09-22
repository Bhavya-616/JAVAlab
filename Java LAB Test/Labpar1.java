import java.util.Scanner;

class College {
    String collegename;
    String collegelocation;
    int noofstudents;

public void getDetails() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter College Name, Location and Number of Students:");
    collegename = sc.nextLine();
    collegelocation = sc.nextLine();
    noofstudents = sc.nextInt();
}
public void displayDetails() {
    System.out.println("College Name: " + collegename);
    System.out.println("College Location: " + collegelocation);
    System.out.println("Number of Students: " + noofstudents);
}
}

public class Labpar1 {
    public static void main(String[] args) {
        College c1 = new College();
        c1.getDetails();
        c1.displayDetails();
    }
}