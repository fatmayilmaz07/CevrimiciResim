/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cevrimiciresim.sekil;


import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author skardas
 */
public class Yildiz extends Sekil{

    private double x;
    private double y;
    private double radius;

    private final static double FACTOR = 2.63;
    private final static double ALFA = 18*Math.PI/180;
    private final static double BETA = 54*Math.PI/180;

    private final static double[] X = {0,Math.cos(BETA)/FACTOR, Math.cos(ALFA ),
                                            Math.cos(ALFA )/FACTOR, Math.cos(BETA),0,
                                            -Math.cos(BETA),-Math.cos(ALFA)/FACTOR,
                                            -Math.cos(ALFA ),-Math.cos(BETA)/FACTOR,0};

    private final static double[] Y = {-1,-Math.sin(BETA)/FACTOR, -Math.sin(ALFA ),
                                            Math.sin(ALFA )/FACTOR, Math.sin(BETA),1/FACTOR,
                                            Math.sin(BETA),Math.sin(ALFA )/FACTOR,
                                            -Math.sin(ALFA ),-Math.sin(BETA)/FACTOR,-1};

    private int[] xCoordOfStar; // x coordinates of the vertices of the star as pixel
    private int[] yCoordOfStar; // x coordinates of the vertices of the star as pixel           

    public Yildiz(Point start, Point end) {
        super(start, end);
        xCoordOfStar = new int[X.length];
        yCoordOfStar = new int[X.length];

    }

    @Override
    public void ciz(Graphics g) 
    {
        x = start.getX();
        y = start.getY();
        radius = Math.sqrt(Math.pow(end.getX()-start.getX(),2)+Math.pow(end.getY()-start.getY(),2));
        int i; 
        for (i=0; i<X.length; i++){
            xCoordOfStar[i] = (int)(radius*X[i]+x);
            yCoordOfStar[i] = (int)(radius*Y[i]+y);
        }  
        
        g.drawPolygon(xCoordOfStar, yCoordOfStar, X.length);
    } } 


    


