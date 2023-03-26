import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Task {
    public static void main(String[] args) {
        System.out.println("Необходимо создать ArrayList из целых чисел. Затем следует перебрать коллекцию, " +
                "если число чётное, добавить его в список с чётными числами, если нечетное - " +
                "в список с нечётными числами соответственно. Вывести оба списка на экран, " +
                "использовать метод для нахождения числа элементов в списке и сравнить, " +
                "какой список больше.");

        List<Integer> integerList = new ArrayList<>();
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        for (int i = 1; i < 21; i++) {
            integerList.add((int) (Math.random()*20)+1);
        }
        System.out.println();

        System.out.println("Начальный список: " + integerList);
        Collections.sort(integerList);
        System.out.println("Сортировка завершена " + integerList);
        for (int n :
             integerList) {
            if (n %2 == 0) {
                positive.add(n);
            } else
                negative.add(n);
        }
        System.out.println("Список четных чисел: " + positive);
        System.out.println("Список нечетных чисел: " + negative);

        String answer = (positive.size()>negative.size()) ? "Четных чисел больше " : "Нечетных чисел больше";
        System.out.println(answer);
    }
}
