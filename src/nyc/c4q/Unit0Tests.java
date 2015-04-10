package nyc.c4q;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Unit0Tests {

    /*
     * Name of the method implies what the method should do.
     * Some of these methods require that the method return signature change.
     * For example, `returnPrimitiveBooleanTrue()` should return `boolean`, not `Object`.
     */
    public static void main (String args[]) {

    }

    public static void printHelloWorld() {
      System.out.println("Hello World");
    }

    public static boolean returnPrimitiveBooleanTrue() {
      return true;
    }

    public static int returnPrimitiveInt1729() {
      return 1729;
    }

    public static double returnPrimitiveDoubleThreePointOneFour() {
      return 3.14;
    }

    public static char returnPrimitiveCharZ() {
        return 'Z';
    }

    public static void printSumOf1Upto10UsingForLoop() {
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void printSumOf1Upto10000UsingForLoop() {
        int sum = 0;
        for (int i = 0; i < 10000; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static boolean isOdd(int n) {
        return (n % 2 != 0);
    }

    public static boolean isMultipleOfThree(int n) {
        return (n % 3 == 0);
    }

    public static boolean isOddAndIsMultipleOfThree(int n) {
        return (isOdd(n) && isMultipleOfThree(n));
    }

    public static String repeatStringXTimes(String input, int times) {
        // Given string "input" and a positive integer "times",
        // return a string that is equal to the input string repeated X times.
        // If "times" is 0 negative, return a blank string.
        // For example, repeatStringXTimes("potato", 5) should return "potatopotatopotatopotatopotato".
        String result = "";
        if (times > 0) {
            for (int i = 0; i < times; i++) {
                result += input;
            }
        }
        return result;
    }

    public static String returnStringUntilQ(String input) {
        // Given string "input", return a string that stops at the first occurrence of the character 'q'.
        // For example, given the string "ubiquitous", return "ubi".
        // If the string does not contain a q, then return the empty string "".
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != 'q') {
                result += input.charAt(i);
            } else {
                break;
            }
        }
        if (result.equals(input)) {
            result = "";
        }
        return result;
    }

    public static Person declareAndReturnPersonNamedAda() {
        Person Ada = new Person("Ada");
        return Ada;
    }

    public static Person declareAndReturnPersonNamedAlanTuringFromLondon() {
        Person AlanTuring = new Person("Alan Turing");
        AlanTuring.setCity("London");
        return AlanTuring;
    }

    public static boolean isFromLondon(Person person) {
        if (person.getCity() != null) {
            return person.getCity().equals("London");
        }
        return false;
    }

    public static ArrayList<Place> declareAndReturnArrayListOfThreePlaces() {
        ArrayList<Place> myArrayList = new ArrayList<Place>();
        myArrayList.add(new Place("New York City"));
        myArrayList.add(new Place("Allentown"));
        myArrayList.add(new Place("Indianapolis"));
        return myArrayList;
    }

    public static HashMap<String, Person> declareAndReturnHashmapOfAlanTuringAndGraceHopper() {
      // The HashMap should have key-value pairs of:
      // - key: `Alan Turing`, value: instance of Person with name `Alan Turing`
      // - key: `Grace Hopper`, value: instance of Person with name `Grace Hopper`
        HashMap<String, Person> myHashMap = new HashMap<String, Person>();
        Person turing = new Person("Alan Turing");
        turing.setCity("London");
        Person hopper = new Person("Grace Hopper");
        hopper.setCity("Arlington");
        myHashMap.put(turing.getName(), turing);
        myHashMap.put(hopper.getName(), hopper);
        return myHashMap;
    }

    public static void changeTuringsCityToPrinceton(HashMap<String, Person> people) {
        Person turing = people.get("Alan Turing");
        turing.setCity("Princeton");
    }

    // Bonus Problems
    public static void bonusPrintOutSumOfFirstTenFibonacciNumbers() {
        int sum = 0;
        int fib1 = 0;
        int fib2 = 1;
        for (int i = 0; i < 11; i++) {
            if (i == 0) {
                sum += 0;
            } else if (i == 1) {
                sum += 1;
            } else {

                fib1 = fib2;
                fib2 = sum;
                sum = fib1 + fib2;
            }
        }
        System.out.println(sum);
    }

    public static void bonusPrintOutSumOfFirstFortyFibonacciNumbers() {
        int sum = 0;
        int fib1 = 0;
        int fib2 = 1;

        for (int i = 0; i < 41; i++) {
            if (i == 0) {
                sum += 0;
            } else if (i == 1) {
                sum += 1;
            } else {

                fib1 = fib2;
                fib2 = sum;
                sum = fib1 + fib2;
            }
        }
        System.out.println(sum);

    }
}
