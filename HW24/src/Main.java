import java.util.*;

public class Main {
    private static final Set<String> peopleName = new TreeSet<>();
    private static final Set<String> peopleNumber = new TreeSet<>();
    private static final Map<Set<String>, Set<String>> nameNumber = new HashMap<>();
    private static final String correctNumber = "\\d+";
    private static final String correctName = "[А-я]+";
    public static void main(String[] args) {
        boolean run = true;
        while (run){
            start();
            nameNumber.put(peopleName,peopleNumber);

        }
    }
    public static void nameOrNumber(String input){
        if(input.matches(correctNumber)){
            firstNumber(input);
        }else if(input.matches(correctName)){
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
            peopleNumber.add(input);
            System.out.println("Введите имя человека для абонента: " + input);
            String inputSecond = scanner();
            secondInputName(inputSecond);
        }
        else {
            System.out.println("Телефон: " + input + " уже есть в телефонной книжке");
        }
    }

    public static void firstName(String input){
        if(!(peopleName.contains(input))){
            System.out.println("Такого имени в телефонной книге нет и было добавлено");
            peopleName.add(input);
            System.out.println("Введите номер человека для абонента: " + input);
            String inputSecond = scanner();
            secondInputNumber(inputSecond);
        }
        else {
            System.out.println("Имя: " + input + " уже есть в телефонной книжке");
        }
    }

        public static void secondInputName(String secondInput){
            peopleName.add(secondInput);
            System.out.println("Контакт сохранён!");

        }    public static void secondInputNumber(String secondInput){
            peopleNumber.add(secondInput);
            System.out.println("Контакт сохранён!");
        }

    public static void print(){
        System.out.println("Список телефонных номеров: \n_______________");
        for (Map.Entry<Set<String>, Set<String>> entry : nameNumber.entrySet()) {

        }

    }
    public static void start(){
        System.out.println("""
                    Choose what you want:
                     1. Добавить человека в записную книжку
                     LIST. If you want to print number book""");
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
    }
}
