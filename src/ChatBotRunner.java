import java.util.Scanner;
public class ChatBotRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ChatBot bot1 = new ChatBot("Bob",35);

        System.out.print("Hello! What is your name? ");
        String name = scan.nextLine();
        bot1.greeting(name);
        scan.nextLine();
        System.out.println("I hope you will have a great rest of your day");

        System.out.print("What is the weather like today? ");
        scan.nextLine();
        bot1.weather();

        System.out.println("What is your favorite number?");
        int num = scan.nextInt();
        bot1.favoriteNumber(num);

        System.out.println("Check out what else I can do! I can convert feet to meters! Give it a shot!");
        int feet = scan.nextInt();
        scan.nextLine();
        System.out.println("That is " + bot1.convertFeetToMeters(feet) + " meters");

        System.out.println(bot1.goodbye());
    }
}
