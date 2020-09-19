package com.udistrital.informatica.model;

import java.awt.Color;
import java.awt.Graphics;

/**
 * The abstract Class Figure
 * @author angelicaquevedo
 * 12/09/2020
 */
public abstract class Figure {
   
   /**
    * The color
    */
   protected Color color;
   /**
    * The description 
    */
   private String description;
   /**
    * The x axis
    */
   protected Integer axisX;
   /**
    * The y axis
    */
   protected Integer axisY;

   /**
    * The constructor
    */
    public Figure(Color color, String description,Integer axisX, Integer axisY) {
        this.color = color;
        this.description = description;
        this.axisX=axisX;
        this.axisY=axisY;
    }
 
    public abstract void draw(Graphics g);
    
    

}

