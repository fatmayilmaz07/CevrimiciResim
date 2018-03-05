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
 * @author HP
 */
public class Oval extends Sekil {

    public Oval(Point start, Point end) {
        super(start, end);

    }

    @Override
    public void ciz(Graphics g) {

        if (end.getX() > start.getX() && end.getY() > start.getY()) {
            g.drawOval((int) start.getX(), (int) start.getY(), (int) Math.abs(start.getX() - end.getX()), (int) Math.abs(start.getY() - end.getY()));
        } else if (start.getX() > end.getX() && start.getY() > end.getY()) {
            g.drawOval((int) end.getX(), (int) end.getY(), (int) Math.abs(start.getX() - end.getX()), (int) Math.abs(start.getY() - end.getY()));
        } else if (end.getX() < start.getX() && end.getY() > start.getY()) {
            g.drawOval((int) end.getX(), (int) start.getY(), (int) Math.abs(start.getX() - end.getX()), (int) Math.abs(start.getY() - end.getY()));
        } else {
            g.drawOval((int) start.getX(), (int) end.getY(), (int) Math.abs(start.getX() - end.getX()), (int) Math.abs(start.getY() - end.getY()));
        }
    }

}
