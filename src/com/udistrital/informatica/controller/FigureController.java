package com.udistrital.informatica.controller;

import com.udistrital.informatica.model.CircleFigure;
import com.udistrital.informatica.model.RectangleFigure;
import com.udistrital.informatica.model.Figure;
import com.udistrital.informatica.model.TriangleFigure;
import com.udistrital.informatica.view.MainWindow;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JButton;

/**
 * Class FigureController 
 * @author angelicaquevedo
 * 12/09/2020
 * v 1.1
 */
public class FigureController implements ActionListener, ComponentListener {
    
    /**
     * The Main Window
     */
    private final MainWindow mainWindow;
    /**
     * The suggested color choose message 
     */
    final static String MESSAGE = "You must choose a color";
    /**
     * The choice color message
     */
    final static String RESULT_MESSAGE = "Choice of color";
    /**
     * The invalid figure type message
     */
    final static String INVALID_TYPE = "Invalid type of shape";
    /**
     * The Figure selected message
     */
    final static String FIGURE_SELECTED = "Figure selection";

    /**
     * The Constructor
     * @param mainWindow
     */
    public FigureController(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() instanceof JButton) {
            JButton boton = (JButton) e.getSource();
            if (boton == mainWindow.getBtnGenerate()) {
                if (mainWindow.getjTextBackgroundColor().getBackground().equals(Color.white)) {
                    mainWindow.displayResult(MESSAGE, RESULT_MESSAGE);
                    return;
                }
                switch (mainWindow.getCboFigureType().getSelectedIndex()) {
                    case 1:
                        createNewTriangle();
                        break;
                    case 2:
                        createNewRectangle();
                        break;
                    case 3:
                        createNewCircle();
                        break;
                    default:
                        mainWindow.displayResult(INVALID_TYPE, FIGURE_SELECTED);
                        return;
                }

            }

            if (boton == mainWindow.getjBtnClearCanvas()) {
                mainWindow.getCanvas().getListaFiguras().clear();
            }
        }
    }
    
    /**
     * Method that creates a new triangle
     * return TriangleFigure Object
     */
    private TriangleFigure createNewTriangle() {
       int result[] =  calculatePoints();
        TriangleFigure tria = new TriangleFigure(mainWindow.getjTextBackgroundColor().getBackground(), "Adding a new rectangle", result[0], result[1]);
        mainWindow.getCanvas().getListaFiguras().add(tria);
        return tria;

    }
   
    /**
     * Method that creates a new triangle
     * return createNewRectangle Object
     */
    private Figure createNewRectangle() {
        int result[] =  calculatePoints();
        RectangleFigure squ = new RectangleFigure(mainWindow.getjTextBackgroundColor().getBackground(), "Adding a new rectangle",result[0], result[1]);
        mainWindow.getCanvas().getListaFiguras().add(squ);
        return squ;
    }
    
    /**
     * Method that creates a new circle
     * return Circle FigureObject
     */
    private Figure createNewCircle() {
        
        int result[] =  calculatePoints();
        CircleFigure cir = new CircleFigure(mainWindow.getjTextBackgroundColor().getBackground(), "Adding a new rectangle", result[0], result[1], 100);
        mainWindow.getCanvas().getListaFiguras().add(cir);
        System.out.println(mainWindow.getCanvas().getListaFiguras().size());
        return cir;
    }
    
    
    /**
     * Method that calculates randomly the points in the plane of the canvas
     * return Circle FigureObject
     */
    private static int [] calculatePoints(){
    
        Random rand = new Random();
        final List points = new ArrayList();
        int pointX = rand.nextInt(349);
        int pointY = rand.nextInt(331);
        return new int[] {pointX, pointY};
    }

    @Override
    public void componentResized(ComponentEvent e) {
    }

    @Override
    public void componentMoved(ComponentEvent e) {
    }

    @Override
    public void componentShown(ComponentEvent e) {
    }

    @Override
    public void componentHidden(ComponentEvent e) {
    }

}
