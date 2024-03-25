package pack.main;

import pack.classes.Rectangle;

public class MainRectangle {
    public static void main(String[] args) {
        Rectangle A = new Rectangle(3, 0);
        Rectangle B = new Rectangle(2, 3);

        System.out.println(A.calculatePerimeter());
        System.out.println(B.calculateArea());
    }
}
