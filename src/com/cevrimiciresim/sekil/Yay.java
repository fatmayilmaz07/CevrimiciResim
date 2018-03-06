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
public class Yay extends Sekil {

    public Yay(Point start, Point end) {

        super(start, end);
    }

    @Override
    public void ciz(Graphics g) {

        g.drawArc((int) start.getX(), (int) start.getY(), (int) Math.abs(end.getX() - start.getX()),
                (int) Math.abs(end.getY() - start.getY()), 30, 78);

    }

}
