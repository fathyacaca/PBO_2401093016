/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan150425;

/**
 *
 * @author WINDOWS
 */
public class Circle extends Shape{
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    

    @Override
    public double getArea() {
        return 3.14*radius;
       
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
