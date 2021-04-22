import java.util.Scanner;

/**
 *
 * @author 6210612617@cn103
 */
public class TestAnimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        String color;
        System.out.print("Enter for bird (age color): ");
        age = sc.nextInt();
        color = sc.next().trim();
        Bird bird = new Bird(age, color);

        System.out.print("Enter for bird (age color): ");
        age = sc.nextInt();
        color = sc.next().trim();
        Cat cat = new Cat(age, color);

        System.out.println();
        System.out.println("Bird: " + bird);
        System.out.println("  eat: " + bird.eat());
        System.out.println("  sound: " + bird.sound());
        System.out.println("  move: " + bird.howToMove());
        System.out.println("Cat: " + cat);
        System.out.println("  eat: " + cat.eat());
        System.out.println("  sound: " + cat.sound());
        System.out.println("  move: " + cat.howToMove());
        System.out.println();

        System.out.print("Change bird (age color): ");
        age = sc.nextInt();
        color = sc.next().trim();
        bird.setAge(age);
        bird.setColor(color);

        System.out.print("Change cat (age color): ");
        age = sc.nextInt();
        color = sc.next().trim();
        cat.setAge(age);
        cat.setColor(color);

        System.out.println();
        System.out.println("Bird: " + bird);
        System.out.println("Cat: " + cat);
    }
}