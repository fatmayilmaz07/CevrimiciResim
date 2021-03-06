/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cevrimiciresim.sekil;

import java.awt.Graphics;
import java.awt.Point;
import java.util.Vector;

public class CokluCizgi extends Sekil {

    Vector<Point> points = null;

    public CokluCizgi() {
        super(null, null);
        points = new Vector<>();

    }

    public void addPoint(Point p) {
        points.add(p);
    }

    @Override
    public void ciz(Graphics g) {
        //g.drawLine((int)start.getX(), (int)start.getY(), (int)end.getX(), (int)end.getY());

        if (!points.isEmpty()) {
            int[] xPoints = new int[points.size()];
            int[] yPoints = new int[points.size()];

            for (int i = 0; i < points.size(); i++) {
                xPoints[i] = (int) points.get(i).getX();
                yPoints[i] = (int) points.get(i).getY();
            }
            g.drawPolyline(xPoints, yPoints, points.size());
        }
    }

}
