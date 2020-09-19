package com.udistrital.informatica.model;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 * The public Class RectangleFigure
 * @author angelicaquevedo
 * 12/09/2020
 */
public class RectangleFigure extends Figure {
   
    /**
     * The constructor
     */
    public RectangleFigure(Color color, String descripcion, Integer axisX, Integer axisY) {
            super(color, descripcion, axisX, axisY);
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle p = new Rectangle(this.axisX-50 , this.axisY-50, 100, 100);
        g2.setColor(this.color);
        g2.fill(p);
    }

    }
