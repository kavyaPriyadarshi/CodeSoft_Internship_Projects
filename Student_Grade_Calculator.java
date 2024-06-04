import java.util.Scanner;

class Student {
    Scanner sc = new Scanner(System.in);
    int[] marks = new int[5];

    public void User_Marks() {
        // int[] marks = new int[5];
        System.out.println("Please enter the marks of following Subjects out of 100..");
        System.out.print("English::");
        marks[0] = sc.nextInt();
        System.out.print("Hindi::");
        marks[1] = sc.nextInt();
        System.out.print("Computer Programming::");
        marks[2] = sc.nextInt();
        System.out.print("Maths::");
        marks[3] = sc.nextInt();
        System.out.print("Science::");
        marks[4] = sc.nextInt();
    }

    int Calculate_marks() {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        return sum;
    }

    float Calculate_percentage() {
        int sum = Calculate_marks();
        float percentage = ((float) sum / 500) * 100;
        return percentage;
    }

    char Grade_Calculation() {
        float p = Calculate_percentage();
        char grade = '0';

        if (p > 90 && p < 100) {
            grade = 'O';
        } else if (p > 80 && p <= 90) {
            grade = 'E';
        } else if (p > 70 && p <= 80) {
            grade = 'A';
        } else if (p <= 70 && p > 50) {
            grade = 'B';
        } else {
            grade = 'F';
        }
        return grade;

    }
}

class Student_Grade_Calculator {
    public static void main(String[] args) {
        Student st = new Student();
        st.User_Marks();
        System.out.println("Total marks = " + "" + st.Calculate_marks());
        System.out.println("Total Percentage = " + st.Calculate_percentage());
        System.out.println("Grade of student is = " + st.Grade_Calculation());

    }
}
