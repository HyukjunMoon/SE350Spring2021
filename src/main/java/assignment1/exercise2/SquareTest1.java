package assignment1.exercise2;

import assignment1.exercise1.Square;

public class SquareTest1 {
    public static void main(String args[]) {
        Square square = new Square();
        square.side = 5;
        int perimeter = square.perimeter();
        System.out.println(perimeter);
        int area = square.area();
        System.out.println(area);
    }
}