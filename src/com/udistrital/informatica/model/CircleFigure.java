package com.udistrital.informatica.model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;


/**
 * The public Class CircleFigure
 * @author angelicaquevedo
 * 12/09/2020
 */
public class CircleFigure extends Figure {
    
    /**
     * The radius
     */
    private Integer radius;
    
    /**
     * The CircleFigure constructor
     */
    public CircleFigure(Color color, String descripcion, Integer axisX, Integer axisY, Integer r) {
            super(color, descripcion, axisX, axisY);
            this.radius=r;
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g; 
        Shape circle = new Ellipse2D.Double(axisX, axisY,radius, radius);

        g2.setColor(this.color);
        g2.fill(circle);
    }    
}
    

   
