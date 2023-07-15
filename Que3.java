package PrePlacementTraning.JavapptaAssign_4;
//3.Write a program  to show the use of functional interface in java?

// Functional interface with a single abstract method
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class Que3 {
    public static void main(String[] args) {
        // Using lambda expressions to implement the functional interface
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;

        // Using the functional interface methods
        int result1 = addition.calculate(5, 3);
        int result2 = subtraction.calculate(10, 4);

        System.out.println("Result of addition: " + result1);
        System.out.println("Result of subtraction: " + result2);
    }
}

