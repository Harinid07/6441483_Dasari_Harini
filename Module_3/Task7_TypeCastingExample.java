public class Task7_TypeCastingExample {
    public static void main(String[] args) {
        double doubleValue = 9.78;
        int intValue = (int) doubleValue; 

        int num = 42;
        double convertedDouble = num; 

        System.out.println("Original double value: " + doubleValue);
        System.out.println("After casting to int: " + intValue);
        System.out.println("Original int value: " + num);
        System.out.println("After casting to double: " + convertedDouble);
    }
}
