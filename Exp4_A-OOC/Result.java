import java.util.Scanner;
class Student {
    int rollNo;
    void setRollNo(int r) {
        rollNo = r;
    }
    void getRollNo() {
        System.out.println("Roll No: " + rollNo);
    }
}
class Test extends Student {
    int sub1, sub2;
    void setMarks(int m1, int m2) {
        sub1 = m1;
        sub2 = m2;
    }
    void getMarks() {
        System.out.println("Subject 1 Marks: " + sub1);
        System.out.println("Subject 2 Marks: " + sub2);
    }
}
interface Sports {
    int sMarks = 20;
    void set();
}
public class Result extends Test implements Sports {
    public void set() {
        System.out.println("Sports Marks: " + sMarks);
    }
    void display() {
        int total = sub1 + sub2 + sMarks;
        getRollNo();
        getMarks();
        set();
        System.out.println("Total Marks: " + total);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Result r = new Result();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        System.out.print("Enter Subject 1 Marks: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Subject 2 Marks: ");
        int m2 = sc.nextInt();

        r.setRollNo(roll);
        r.setMarks(m1, m2);
        r.display();

        sc.close();
    }
}
