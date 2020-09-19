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
public class EraserFigure extends Figure{
    
    /**
     * The constructor
     */
    public EraserFigure(Color color, String description, Integer axisX, Integer axisY) {
        super(color, description, axisX, axisY);
    }

    
    @Override
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle p = new Rectangle(this.axisX-15 , this.axisY-15, 30, 30);
        g2.setColor(Color.white);
        g2.fill(p);
    }
    
}
