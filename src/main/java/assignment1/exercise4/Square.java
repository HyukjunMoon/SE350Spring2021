package assignment1.exercise4;

public class Square {
    public final int SIDES_NUMBER = 4;
    public int side;
    public Square(int l) {
        side = l;
    }
    public int perimeter() {
        int perimeter = side * SIDES_NUMBER;
        return perimeter;
    }
    public int area() {
        int area = side * side;
        return area;
    }
}