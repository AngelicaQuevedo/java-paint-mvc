package com.udistrital.informatica.model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


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
        axisX = axisX-(radius/2);
        axisY = axisY-(radius/2);

        g2.setColor(this.color);
        g2.fillArc(axisX,axisY,radius,radius, 0, 360);
    }    
}
    

   
