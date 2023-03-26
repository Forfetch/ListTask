import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1.\nИспользуя консольный ввод, создайте " +
                "несколько строк, с помощью метода parseInt() приведите их к целочисленному типу данных. " +
                "Если строка не может быть приведена к целому числу, выведите на экран “Not valid”. ");

        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }
        scanner.close();
        System.out.println(Arrays.toString(strings));
        for (String s:
             strings) {
            try {
                int x = Integer.parseInt(s);
                System.out.println(x);
            }catch (NumberFormatException e){
                System.out.println("Not valid");
            }
        }

        System.out.println("Task 2.\n Создайте по одному экземпляру примитивных типов данных. " +
                "Затем, используя метод valueOf(), из этих экземпляров получите обёртки.");
         int number = 1;
         float floatNumber = 4.8f;
         boolean bool = true;
         double doubleNumber= 1.2;
         byte bt = 1;
         long l1 = 1000000000;
         short sh = 1233;
         char cr = 'C';

         Integer int1 = Integer.valueOf(number);
         Float float1 = Float.valueOf(floatNumber);
         Boolean boolean1 = Boolean.valueOf(bool);
         Double double1 = Double.valueOf(doubleNumber);
         Byte byte1 = Byte.valueOf(bt);
         Long lg = Long.valueOf(l1);
         Short short1 = Short.valueOf(sh);
         Character char1 =  Character.valueOf(cr);
        System.out.println(int1 + " " + floatNumber + " " + bool + " " + doubleNumber + " " + char1);

    }
}