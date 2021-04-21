package assignment1.exercise2;

import assignment1.exercise1.Square;

public class SquareTest2 {
    public static void main(String args[]) {
        Square square = new Square();
        square.side = 5;
        System.out.println(square.perimeter());
        System.out.println(square.area());
    }
}