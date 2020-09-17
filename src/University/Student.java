package University;

import java.util.Scanner;

public class Student {
    String firstName, lastName;
    int group;
    double averageMark;
    int meritScholarship = 100;
    int basicScholarship = 80;

    public Student(String firstName, String lastName, int group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    int getScholarship(double averageMark, int meritScholarship, int basicScholarship) {
        if (averageMark == 5) {
            return meritScholarship;
        } else {
            return basicScholarship;
        }
    }

    int getScholarship(double averageMark) {
        if (averageMark == 5) {
            return meritScholarship;
        } else {
            return basicScholarship;
        }
    }
}
