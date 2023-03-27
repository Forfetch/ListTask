import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Task {
    public static void main(String[] args) {
        System.out.println("Создайте класс Animal, где поле name, - название животного." +
                " Добавьте 10 животных в LinkedList," +
                " удалите те объекты, name которых начинается с гласной буквы.");

        LinkedList<String> ll = new LinkedList();
        Animal cat = new Animal("Cat");
        Animal parrot = new Animal("Parrot");
        Animal elephant = new Animal("Elephant");
        Animal owl = new Animal("Owl");
        Animal beetle = new Animal("Beetle");
        Animal turtle = new Animal("Turtle");
        Animal dog = new Animal("Dog");
        Animal peg = new Animal("Peg");
        Animal camel = new Animal("Camel");

        ll.add(cat.getName());
        ll.add(parrot.getName());
        ll.add(elephant.getName());
        ll.add(owl.getName());
        ll.add(beetle.getName());
        ll.add(turtle.getName());
        ll.add(dog.getName());
        ll.add(peg.getName());
        ll.add(camel.getName());
        System.out.println();

        System.out.println("Список без изменения " + ll);
        ll.removeIf(a -> a.substring(0, 1).matches("(?i)[AEIOU]"));
        System.out.println("Список после изменения " + ll);


    }
}
