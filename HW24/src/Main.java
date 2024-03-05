import java.util.*;

public class Main {
    private static final Set<String> peopleName = new TreeSet<>();
    private static final Set<String> peopleNumber = new TreeSet<>();
    private static final Map<Set<String>, Set<String>> nameNumber = new HashMap<>();
    private static final String correctNumber = "\\D";
    public static void main(String[] args) {
        boolean run = true;
        while (run){
//        System.out.println("Имя добавленного человека: " + addName());
//        System.out.println("Номер добавленного человека: " + addNumber());
        nameNumber.put(peopleName,peopleNumber);
        firstName();

            for (Map.Entry<Set<String>, Set<String>> entry : nameNumber.entrySet()) {
                System.out.println(entry.getKey() + "" + entry.getValue());
    }
        }
    }
    public static void nameOrNumber(){
        System.out.println("Введите номер или имя человека");
        String input = new Scanner(System.in).nextLine();
        if(input.matches(correctNumber)){
//            Метод для номера
        }else{
            firstName();
        }
    }
    public static String addName(){
        System.out.println("Введите имя человека: ");
        String name = new Scanner(System.in).nextLine();
        return name;
    }

    public static String addNumber(){
        System.out.println("Введите номер человека: ");
        String number = new Scanner(System.in).nextLine();
        return number;
    }
    public static void firstName(){
        String name = addName();
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
    }
