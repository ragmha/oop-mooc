
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       ArrayList<Student> list = new ArrayList<Student>();
       Scanner reader = new Scanner(System.in);

       String name;
       String studentNumber;
       String search;

        while (true) {

            System.out.print("name: ");
            name = reader.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("studentnumber: ");
            studentNumber = reader.nextLine();

            list.add(new Student(name, studentNumber));
        }

        System.out.println();

       for (Student student : list) {
           System.out.println(student);
       }

       System.out.println();

       System.out.print("Give search term: ");
       search = reader.nextLine();
       System.out.println("Result: ");

       for (Student student : list) {
           if (student.getName().contains(search)) {
               System.out.println(student);
           }
       }

    }

}
