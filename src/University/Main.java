package University;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество студентов:");
        int n = in.nextInt();
        Student[] students = new Student[n];
        int studentType;
        String firstName, lastName;
        int group;
        double averageMark;
        String scientificPaper;
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            System.out.println("Введите:\n - 1, чтобы записать аспиранта\n - 2, чтобы записать студента");
            flag = true;
            while (flag) {
                studentType = in.nextInt();
                if (studentType != 1 & studentType != 2) {
                    System.out.println("Неправильно введен код.\nВведите:\n - 1, чтобы записать аспиранта\n - 2, чтобы записать студента");
                } else {
                    flag = false;
                    System.out.println("Введите имя, фамилию, группу и средний балл обучающегося:");
                    firstName = in.next();
                    lastName = in.next();
                    group = in.nextInt();
                    averageMark = in.nextDouble();
                    if (studentType == 1) {
                        System.out.println("Введите тему научной работы");
                        scientificPaper = in.next();
                        students[i] = new Aspirant(firstName, lastName, group, averageMark, scientificPaper);
                    } else {
                        students[i] = new Student(firstName, lastName, group, averageMark);
                    }
                    System.out.println("Стипедия студента: " + students[i].getScholarship(averageMark));
                }
            }
        }
    }
}
