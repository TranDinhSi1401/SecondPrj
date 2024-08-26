package iuh.fit.se;
/*
*@description: this class represents a rectangle
*@author: Tran Dinh Si
* @version: 1.0
* @created: 26/8/2024
* */
public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        if(length < 0 || width < 0)
            throw new IllegalArgumentException("Length and width must be greater than 0");
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        this(0, 0);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length < 0)
            throw new IllegalArgumentException("Length must be greater than 0");
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width < 0)
            throw new IllegalArgumentException("Width must be greater than 0");
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    public String toString() {
        return String.format("%10f %10f", length, width);
    }

}
