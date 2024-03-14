import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class Main {
    private static final Set<String> peopleName = new TreeSet<>();
    private static final Set<String> peopleNumber = new TreeSet<>();
    private static final Map<Set<String>, Set<String>> nameNumber = new HashMap<>();
    private static final String CORRECT_NUMBER_REGEX = "\\d+";
    private static final String CORRECT_NAME_REGEX = "[А-я]+";
    public static void main(String[] args) {
        boolean run = true;
        nameNumber.put(peopleName,peopleNumber);
        while (run){
            if (start().equalsIgnoreCase("LEAVE"))
                run = false;
        }
    }
    public static void nameOrNumber(String input){
        if(input.matches(CORRECT_NUMBER_REGEX)){
            firstNumber(input);
        }else if(input.matches(CORRECT_NAME_REGEX)){
            firstName(input);

        }else {
            System.out.println(input + " не является именем или номером телефона");
        }
    }
    public static String scanner(){
        return new Scanner(System.in).nextLine();
    }
    public static void firstNumber(String input){
        if(!(peopleNumber.contains(input))){
            System.out.println("Такого номера в телефонной книге нет и был добавлен");
            System.out.println("Введите имя человека для абонента: " + input);
            String inputSecond = scanner();
            if(!(peopleName.contains(inputSecond) )){
                secondInputName(inputSecond, input);
            }  else {
                System.out.println("Имя: " + input + " уже есть в телефонной книжке");
            }
        }
        else {
            System.out.println("Телефон: " + input + " уже есть в телефонной книжке");
        }
    }

    public static void firstName(String input){
        if(!(peopleName.contains(input))){
            System.out.println("Такого имени в телефонной книге нет и было добавлено");
            System.out.println("Введите номер человека для абонента: " + input);
            String inputSecond = scanner();
            if(!(peopleNumber.contains(inputSecond))){
                secondInputNumber(inputSecond, input);
            }
             else {
                System.out.println("Телефон: " + input + " уже есть в телефонной книжке");
            }
        }
        else {
            System.out.println("Имя: " + input + " уже есть в телефонной книжке");
        }
    }

        public static void secondInputName(String secondInput, String input){
            if (!(secondInput.matches(CORRECT_NAME_REGEX))) {
                System.out.println("Не является именем человека");
            }else {
                peopleName.add(secondInput);
                peopleName.add(input);
                System.out.println("Контакт сохранён!");
            }
        }    public static void secondInputNumber(String secondInput, String input){
        if (!(secondInput.matches(CORRECT_NUMBER_REGEX))) {
            System.out.println("Не является номером человека");
        }else {
            peopleNumber.add(secondInput);
            peopleName.add(input);
            System.out.println("Контакт сохранён!");
        }
        }

    public static void print(){
        System.out.println("Список телефонных номеров: \n_______________");
        for (Map.Entry<Set<String>, Set<String>> entry : nameNumber.entrySet()) {
            System.out.println(entry.getKey() + "" + entry.getValue());
//
        }

    }
    public static String start(){
        System.out.println("""
                    Choose what you want:
                     1. Добавить человека в записную книжку
                     LIST. If you want to print number book
                     LEAVE. If you want to leave from program""");
        String b = scanner();
        if (b.equals("1")){
            System.out.println("Введите номер или имя человека");
            String input = scanner();
            nameOrNumber(input);
        } else if (b.equalsIgnoreCase("LIST")) {
            print();
        }
        else {
            System.out.println("________________________________");
            System.out.println("Введено не 1 или LIST");
            System.out.println("________________________________");
        }
    return b;
    }


}
