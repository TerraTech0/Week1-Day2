import java.util.Scanner;

public class Exercise1 {
    static Scanner data = new Scanner(System.in);
    public static void question1(){

        double weight;
        double height;
        System.out.print("Please enter the Weight in kg: ");
        weight = data.nextDouble();
        System.out.print("Please enter the Height in m: ");
        height = data.nextDouble();
        double res = height*height;
        System.out.println("The BMI is: " + weight/res);
    }
    public static void question2(){
        double obtained;
        double total;
        System.out.print("Obtaiend Marks is: ");
        obtained = data.nextInt();
        System.out.print("Total Marks is: ");
        total = data.nextInt();

        System.out.println((obtained * 100 )/total + "%");
    }
    public static void question3(){
        double amount;
        double exchange;
        System.out.print("Enter the amount in USD: ");
        amount = data.nextDouble();
        System.out.print("Enter the Exchange Rate: ");
        exchange = data.nextDouble();
        double res = amount * exchange;
        System.out.println("Amount in EUR: " + res);
    }
    public static void question4(){
        String input;
        System.out.println("Input: ");
        input = data.nextLine();
        System.out.println(input.length());
        StringBuilder res = new StringBuilder(input);
        System.out.println(res.reverse());
    }
    public static void  question5(){
        String sentence;
        int start;
        int end;
        System.out.print("Enter the sentence: ");
        sentence = data.nextLine();
        System.out.print("Start index: ");
        start = data.nextInt();
        System.out.print("End index: ");
        end = data.nextInt();
        System.out.println(sentence.substring(start, end));
    }

    public static void question6(){
        String sentence;
        String keyword;
        System.out.print("Enter the sentence: ");
        sentence = data.nextLine();
        System.out.print("Enter the keyword: ");
        keyword = data.nextLine();

//        if (sentence.contains(keyword)){
//            System.out.println("keyword "+keyword+" is present in the sentence");
//        }else {
//            System.out.println("The keyword not exist");
//        }
        //Ternary Operator
        String s = (sentence.contains(keyword)) ? "keyword " + keyword + " is present in the sentence" : "The keyword not exist";
        System.out.println(s);
    }
    public static void question7(){
        String sentence;
        String replace_word;
        String replacement_word;
        System.out.print("Enter the sentence: ");
        sentence = data.nextLine();
        System.out.print("Enter the word you want to replace: ");
        replace_word = data.nextLine();
        System.out.print("Enter the replacement word: ");
        replacement_word = data.nextLine();
        System.out.print(sentence.replace(replace_word, replacement_word));
    }
    public static void question8(){
        String firstWord;
        String secondWord;
        System.out.print("Enter the first word: ");
        firstWord = data.nextLine();
        System.out.print("Enter the second word: ");
        secondWord = data.nextLine();

        if (firstWord.equalsIgnoreCase(secondWord) ){
            System.out.println("They are equals");
        }else{
            System.out.println("They are not equals");
        }

    }
    public static void main(String[] args) {

//        question1();
//        question2();
//        question3();
//        question4();
//        question5();
//        question6();
//        question7();
//        question8();


    }
}
