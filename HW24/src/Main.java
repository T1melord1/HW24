import java.util.*;

class Main{
    public static final Map<String, Set<String>> numbersBook = new HashMap<>();
    public static final Set<String> peopleNumber = new TreeSet<>();
    public static void main(String[] args) {
        while (true){
        addName();
        print();
        }

    }
public static String scanner(){
        return new Scanner(System.in).nextLine();
}
public static void addName(){
    System.out.println("Введите имя человека: ");
    String name = scanner();
    System.out.println("Введите номер для " + name);
    String number = scanner();
    peopleNumber.add(number);
    numbersBook.put(name,peopleNumber);

}
public static void print(){
    for (Map.Entry<String, Set<String>> entry : numbersBook.entrySet()) {
        System.out.print(entry.getKey());
        for (String s : entry.getValue()) {
            System.out.println(" " + s);
        }
    }
}
}