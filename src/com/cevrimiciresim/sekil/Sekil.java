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
 * @author Lab
 */
public abstract class Sekil {

    public Point start, end;

    public Sekil(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public abstract void ciz(Graphics g);

}
