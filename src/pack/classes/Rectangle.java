package pack.classes;

/**
 * 3. Write a Java program to create a class called "Rectangle" with width and height attributes.
 * Calculate the area and perimeter of the rectangle.
 */

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calculateArea() {
        int area = 0;
        if(this.width <= 0 || this.height <= 0) {
            System.out.println("Cannot calculate area of this rectangle.");
            return 0;
        } else {
            area = this.width * this.height;
            return area;
        }
    }

    public int calculatePerimeter() {
        int perimeter = 0;
        if(this.width <=0 || this.height <= 0) {
            return -1;
        } else {
            perimeter = (this.width + this.height) * 2;
            return perimeter;
        }
    }
}
