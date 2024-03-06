import java.util.*;

public class Main {
    private static final Set<String> peopleName = new TreeSet<>();
    private static final Set<String> peopleNumber = new TreeSet<>();
    private static final Map<Set<String>, Set<String>> nameNumber = new HashMap<>();
    private static final String correctNumber = "\\d";
    public static void main(String[] args) {
        boolean run = true;
        while (run){
//        System.out.println("Имя добавленного человека: " + addName());
//        System.out.println("Номер добавленного человека: " + addNumber());
        nameNumber.put(peopleName,peopleNumber);
        nameOrNumber();

            for (Map.Entry<Set<String>, Set<String>> entry : nameNumber.entrySet()) {
                System.out.println(entry.getKey() + "" + entry.getValue());
    }
        }
    }
    public static void nameOrNumber(){
        System.out.println("Введите номер или имя человека");
        String input = scanner();
        if(input.matches(correctNumber)){
        firstNumber();
        firstName();
        }else{
            firstName();
            firstNumber();
        }
    }
    public static String addName(){
        return new Scanner(System.in).nextLine();
    }
    public static String addNumber(){
        return new Scanner(System.in).nextLine();
    }

    public static String scanner(){
        return new Scanner(System.in).nextLine();
    }
    public static void firstName(){
        if(!(peopleName.contains(name))){
            System.out.println("Такого имени в телефонной книге нет и было добавлено");
            peopleName.add(name);
            String number = addNumber();
            peopleNumber.add(number);
            System.out.println("Контакт сохранён!");
        }else {
            System.out.println("Такое имя уже есть в базе!");
        }
        }

        public static void firstNumber(){
        if(!(peopleNumber.contains(number))){
            System.out.println("Такого номера в телефонной книге нет и был добавлен");
            peopleNumber.add(number);
            String name = addName();
            peopleName.add(name);
            System.out.println("Контакт сохранён!");
        }
        else {
            System.out.println("Такой номер уже есть в базе!");
        }
        }
}
