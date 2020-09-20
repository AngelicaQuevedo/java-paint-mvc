/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.informatica.model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author Eddy
 */
public class StrokeFigure extends Figure{
    
    /**
     * The radius
     */
    private Integer radius;
    
    /**
     * The constructor
     */
    public StrokeFigure(Color color, String description, Integer axisX, Integer axisY, Integer r) {
        super(color, description, axisX, axisY);
        this.radius=r;
    }

    
    @Override
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle p = new Rectangle(this.axisX-(radius/2),this.axisY-(radius/2),radius,radius);
        g2.setColor(this.color);
        g2.fill(p);
    }
    
}
