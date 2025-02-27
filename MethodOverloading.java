public class MethodOverloadingExample {

    public static void printValue(int value) {
        System.out.println("Integer value: " + value);
    }

    
    public static void printValue(double value) {
        System.out.println("Double value: " + value);
    }

    
    public static void printValue(String value) {
        System.out.println("String value: " + value);
    }

    public static void main(String[] args) {
        
        printValue(10);        
        printValue(3.14);     
        printValue("Hello!"); 
    }
}