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
        nameNumber.put(peopleName,peopleNumber);

        start();

        }
    }
    public static void nameOrNumber(){
        System.out.println("Введите номер или имя человека");
        String input = scanner();
        if(input.matches(correctNumber)){
            firstNumber(input);
            System.out.println("Введите имя человека: ");
            String inputSecond = scanner();
            secondInputName(inputSecond);
        }else if(input.matches(correctName)){
            firstName(input);
            System.out.println("Введите номер человека: ");
            String inputSecond = scanner();
            secondInputNumber(inputSecond);
        }else {
            print();
        }
    }
    public static String scanner(){
        return new Scanner(System.in).nextLine();
    }
    public static void firstNumber(String input){
        if(!(peopleNumber.contains(input))){
            System.out.println("Такого номера в телефонной книге нет и был добавлен");
            peopleNumber.add(input);
        }
        else
        {
            System.out.println("Такой номер есть в справочнике");
            start();
        }
    }

    public static void firstName(String input){
        if(!(peopleName.contains(input))){
            System.out.println("Такого имени в телефонной книге нет и было добавлено");
            peopleName.add(input);

        }
        else
        {
            System.out.println("Такое имя есть в справочнике");
            start();
        }
        }

        public static void secondInputName(String secondInput){
            System.out.println("Введите имя человека: ");
            peopleName.add(secondInput);
            System.out.println("Контакт сохранён!");

        }    public static void secondInputNumber(String secondInput){
            System.out.println("Введите номер человека: ");
            peopleNumber.add(secondInput);
            System.out.println("Контакт сохранён!");
        }

    public static void print(){
        System.out.println("Список телефонных номеров: \n_______________");
        for (Map.Entry<Set<String>, Set<String>> entry : nameNumber.entrySet()) {
            System.out.println(entry.getKey() + "" + entry.getValue());
        }
    }
    public static void start(){
        System.out.println("""
                    Choose what you want:
                     1. Добавить человека в записную книжку
                     LIST. If you want to print number book""");
        String b = scanner();
        if (b.equals("1")){
            nameOrNumber();
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
