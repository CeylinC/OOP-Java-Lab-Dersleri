/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

import java.util.Date;

/**
 *
 * @author Pc
 */
public class GeometricObject {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;
    
    public GeometricObject(){
        dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricObject : \n" + "color=" + color + "\nfilled=" + filled + "\ndateCreated=" + dateCreated;
    }

    
    
}
