import java.util.*;

public class Main {
    private static final Set<String> peopleName = new TreeSet<>();
    private static final Set<String> peopleNumber = new TreeSet<>();
    private static final Map<Set<String>, Set<String>> nameNumber = new HashMap<>();
    public static void main(String[] args) {
        boolean run = true;
        while (run){
//        System.out.println("Имя добавленного человека: " + addName());
//        System.out.println("Номер добавленного человека: " + addNumber());
        nameNumber.put(peopleName,peopleNumber);
        newName();

            for (Map.Entry<Set<String>, Set<String>> entry : nameNumber.entrySet()) {
                String name = "";
                String number = "";
                for (String s : entry.getKey()) {
                    name = s;
                }
                for (String s : entry.getValue()) {
                    number = s;
                }
                System.out.println(name + "" + number);
            }

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
    public static void newName(){
        String name = addName();
        if(!(peopleNumber.contains(name))){
            System.out.println("Такого имени в телефонной книге нет");
            peopleNumber.add(name);
            String number = addNumber();
            peopleNumber.add(number);
            System.out.println("Контакт сохранён!");
        }else {
            System.out.println("Такое имя уже есть в базе!");
        }
    }
}