import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String message = "the weather is very nice today.";
        System.out.println(message);

        System.out.println("Number of elements : "+message.length());
        System.out.println("5.elements : "+message.charAt(4));
        System.out.println(message.concat("We can have fun outside"));
        System.out.println(message.startsWith("t"));
        System.out.println(message.endsWith("."));
        char[ ] characters = new char[5];
        message.getChars(0,5,characters,0);
        System.out.println(characters);
        System.out.println(message.indexOf('a'));
        System.out.println(message.lastIndexOf('i'));

        System.out.println(message.replace('t','T'));
        System.out.println(message.substring(4));
        System.out.println(message.substring(4,11));

        for(String word: message.split(" ")){
            System.out.println(word);
        }

        System.out.println(message.toLowerCase(Locale.ROOT));
        System.out.println(message.toUpperCase(Locale.ROOT));

        System.out.println(message.trim());
    }
}
