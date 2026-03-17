import java.io.*;
import java.util.Scanner;

public class WriteStudentData {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Weight: ");
            float weight = sc.nextFloat();

            System.out.print("Enter Height: ");
            float height = sc.nextFloat();
            sc.nextLine(); // clear buffer

            System.out.print("Enter City: ");
            String city = sc.nextLine();

            System.out.print("Enter Phone: ");
            String phone = sc.nextLine();

            DataOutputStream dos = new DataOutputStream(
                    new FileOutputStream("student.dat"));

            dos.writeUTF(name);
            dos.writeInt(age);
            dos.writeFloat(weight);
            dos.writeFloat(height);
            dos.writeUTF(city);
            dos.writeUTF(phone);

            dos.close();
            System.out.println("Data Written Successfully!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}