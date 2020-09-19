package com.udistrital.informatica.model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;

/**
 *
 * @author Eddy
 */
public class Eraser {
      
    
    Path2D.Float stroke = new Path2D.Float();
    
    /**
     * The Eraser constructor
     */
    public Eraser() {
    }
    
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.black);
        g2.setStroke(new BasicStroke(10)); //size of pincel
        g2.draw(stroke);
    }
    
    public void dragged(Integer axisX, Integer axisY){
        stroke.lineTo(axisX, axisY);
    }
    
    public void pressed(Integer axisX, Integer axisY){
        stroke.moveTo(axisX, axisY);
    }
}

 
