package week07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        System.out.println("How many student you want to add?");

        Scanner scanner = new Scanner(System.in);
        String count = scanner.nextLine(); //"5"
        int studentNumber = Integer.parseInt(count);

        for (int i = 0; i < studentNumber; i++) {

            System.out.println("Enter student name: ");
            String name = scanner.nextLine();
            System.out.println("Enter student grade from 0 - 100: ");
            Integer grade = Integer.valueOf(scanner.nextLine());

            students.add(new Student(name, grade));

        }


        System.out.println(students);


        int max = findHighestGrade(students);

        System.out.println(max);
        int min = findLowestGrade(students);

        System.out.println(min);

        double avg = findAvg(students);

        System.out.println(avg);

        printTheStudents(students, 50);

    }

    private static void printTheStudents(List<Student> students, int lowestGrade) {
        for (Student each : students) {

            if (each.getGrade() < lowestGrade) {
                System.out.println(each);
            }

        }


    }

    private static double findAvg(List<Student> students) {
        double sum = 0;
        for (Student student : students) {

            sum += student.getGrade();
            //  sum =sum + student.getGrade();
        }
        return sum / students.size();


    }

    private static int findLowestGrade(List<Student> students) {
        int min = students.get(0).getGrade();

        for (Student current : students) {

         //   if (current.getGrade() < min)
                                    // 4            5
            if (Integer.compare(current.getGrade(), min) < 0)
                min = current.getGrade();
        }


        return min;

    }

    private static int findHighestGrade(List<Student> students) {

        int max = students.get(0).getGrade();

        for (Student current : students) {

            if (current.getGrade() > max)
                max = current.getGrade();
        }


        return max;

    }
}
