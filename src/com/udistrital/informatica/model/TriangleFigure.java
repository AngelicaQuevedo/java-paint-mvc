package com.udistrital.informatica.model;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 * The public Class TriangleFigure
 * @author angelicaquevedo
 * 12/09/2020
 */
public class TriangleFigure extends Figure {

    /**
     * The constructor
     */
    public TriangleFigure(Color color, String descripcion, Integer axisX, Integer axisY) {
        super(color, descripcion, axisX, axisY);

    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Polygon p = new Polygon();
        for (int i = 0; i < 3; i++) {
            p.addPoint(
                    (int) (this.axisX + 50 * Math.cos(i * 2 * Math.PI / 3)),
                    (int) (this.axisY + 50 * Math.sin(i * 2 * Math.PI / 3))
            );
        }

        g2.setColor(this.color);
        g2.fill(p);
    }

}
