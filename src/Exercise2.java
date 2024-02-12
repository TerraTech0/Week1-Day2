import java.util.Scanner;

public class Exercise2 {
    static Scanner data = new Scanner(System.in);

    public static void question1() {
        String role;
        System.out.print("Enter The Role: ");
        role = data.nextLine();
        if (role.equals("Admin")) {
            System.out.print("Welcome admin");
        } else if (role.equals("superuser")) {
            System.out.print("Welcome superuser");
        } else if (role.equals("user")) {
            System.out.print("Welcome user");
        } else {
            System.out.println("Please enter the right role Ex(Admin, superuser, user)");
        }
    }

    public static void qusetion2() {
        int num1;
        int num2;
        int num3;
        System.out.println("Enter the first number: ");
        num1 = data.nextInt();
        System.out.println("Enter the second number: ");
        num2 = data.nextInt();
        System.out.println("Enter the third number: ");
        num3 = data.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("The greatest number is: " + num1);
        } else if (num2 > num3 && num2 > num1) {
            System.out.println("The greatest number is: " + num2);
        } else {
            System.out.println("The greatest number is: " + num3);
        }

    }

    public static void question3() {
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");

        }
    }

    public static void question4() {
        System.out.print("Enter your numeric score: ");
        int grade = data.nextInt();
        System.out.println("Numeric Score: " + grade);
        if (grade >= 90 && grade <= 100) {
            System.out.println("Letter Grade: A");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("Letter Grade: B");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("Letter Grade: C");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("Letter Grade: D");
        } else if (grade >= 0 && grade <= 59) {
            System.out.println("Letter Grade: F");
        } else {
            System.out.println("Out Of Range");
        }
    }

    public static void question5(){
        int age;
        System.out.println("Enter your age: ");
        age = data.nextInt();

        if (age > 0 && age < 13){
            System.out.println("You are an Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("You are an Teenager");
        } else if (age >= 20) {
            System.out.println("You are an Adult");
        }else{
            System.out.println("Enter your age correctly");
        }
    }

    public static void main(String[] args) {
//        question1();
//        qusetion2();
//        question3();
//        question4();
//        question5();
    }

}
