/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.informatica.controller;

import com.udistrital.informatica.model.InterfaceDragMouse;
import com.udistrital.informatica.view.MainWindow;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author dario.escobar
 */
public class PencilController implements MouseMotionListener{

/** Class in charge of doing something with the drag of the mouse */
    private InterfaceDragMouse accion;
    private MainWindow mainWindow;
    

    public PencilController(InterfaceDragMouse accion, MainWindow mainWindow ){
        this.accion = accion;
        this.mainWindow = mainWindow;
    }

   boolean dragging = false;
    int xOld;
    int yOld;

    public void mouseMoved(MouseEvent e){   
        if(!mainWindow.getjBtnPencil().isEnabled()){
            if (dragging == true){
                accion.endDrag(xOld, yOld);
                dragging = false;
            }  
            xOld = e.getX();
            yOld = e.getY();
        }  
    }

    /**
     * Update all coordinates.
     */
    public void mouseDragged(MouseEvent e){   
        if(!mainWindow.getjBtnPencil().isEnabled()){
            if (dragging == false){
                accion.startDrag(e.getX(), e.getY());
                dragging = true;
            }
            accion.drag(xOld, yOld, e.getX(), e.getY());
            xOld = e.getX();
            yOld = e.getY();
            //mainWindow.getCanvas().repaint();
        }
        
    }

    /**
     * Allows you to change the action to be performed when the mouse is dragged.
     * @param accion La nueva accion a realizar.
     */
    public void setAccion(InterfaceDragMouse accion){
        this.accion = accion;
    }    

   
}
