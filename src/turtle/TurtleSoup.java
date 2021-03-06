/* Copyright (c) 2007-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package turtle;

import java.util.List;
import java.math.*;
import java.awt.Color;
import java.util.ArrayList;

public class TurtleSoup {

    /**
     * Draw a square.
     * 
     * @param turtle the turtle context
     * @param sideLength length of each side
     */
    public static void drawSquare(Turtle turtle, int sideLength) {
    	turtle.color(PenColor.RED);
       for(int i=0;i<4;i++) {
    	   turtle.forward(100);
    	   turtle.turn(90);
       }    
    }
    /**Draw A window at the current position
     * 
     */
    public static void drawWindow(Turtle turtlePersonel) {
    	turtlePersonel.forward(30);
        turtlePersonel.turn(-90);
        turtlePersonel.forward(30);
        turtlePersonel.turn(-90);
        turtlePersonel.forward(30);
        turtlePersonel.turn(-90);
        turtlePersonel.forward(30);
        turtlePersonel.turn(270);
        turtlePersonel.forward(15);
        turtlePersonel.turn(-90);
        turtlePersonel.forward(30);
        turtlePersonel.turn(-180);
        turtlePersonel.forward(15);
        turtlePersonel.turn(90);
        turtlePersonel.forward(15);
        turtlePersonel.turn(180);
        turtlePersonel.forward(30);
    }
    /**Draw A star inside the flag
     * 
     */
    public static void drawStar(DrawableTurtle turtlePersonel) {
    	turtlePersonel.turn(10);
        turtlePersonel.turn(-90);
        turtlePersonel.forward(6);
        turtlePersonel.turn(180);
        turtlePersonel.forward(3);
        turtlePersonel.turn(90);
        turtlePersonel.forward(3);
        turtlePersonel.turn(180);
        turtlePersonel.forward(6);
        turtlePersonel.turn(-180);
        turtlePersonel.forward(3);
        turtlePersonel.turn(45);
        turtlePersonel.forward(3);
        turtlePersonel.turn(-180);
        turtlePersonel.forward(6);
        turtlePersonel.turn(180);
        turtlePersonel.forward(3);
        turtlePersonel.turn(105);
        turtlePersonel.forward(3);
        turtlePersonel.turn(-180);
        turtlePersonel.forward(6);
    }

    /**
     * Determine inside angles of a regular polygon.
     * 
     * There is a simple formula for calculating the inside angles of a polygon;
     * you should derive it and use it here.
     * 
     * @param sides number of sides, where sides must be > 2
     * @return angle in degrees, where 0 <= angle < 360
     */
    public static double calculateRegularPolygonAngle(double sides) {
    	 
         
         // formula to find the interior angle 
          return (sides - 2) * 180 / sides;
         
    }

    /**
     * Determine number of sides given the size of interior angles of a regular polygon.
     * 
     * There is a simple formula for this; you should derive it and use it here.
     * Make sure you *properly round* the answer before you return it (see java.lang.Math).
     * HINT: it is easier if you think about the exterior angles.
     * 
     * @param angle size of interior angles in degrees, where 0 < angle < 180
     * @return the integer number of sides
     */
    public static long calculatePolygonSidesFromAngle(double angle) {
        return Math.round(360/(180-angle));
    }

    /**
     * Given the number of sides, draw a regular polygon.
     * 
     * (0,0) is the lower-left corner of the polygon; use only right-hand turns to draw.
     * 
     * @param turtle the turtle context
     * @param sides number of sides of the polygon to draw
     * @param sideLength length of each side
     */
    public static void drawRegularPolygon(double angle, int sides, int sideLength) {
    	DrawableTurtle turtlePersonel = new DrawableTurtle();
    	turtlePersonel.draw();
    	for (int i =0 ; i<sides;i++) {
    		turtlePersonel.forward(sideLength);
            turtlePersonel.turn(angle-90);
    		
    	}
    }

    /**
     * Given the current direction, current location, and a target location, calculate the heading
     * towards the target point.
     * 
     * The return value is the angle input to turn() that would point the turtle in the direction of
     * the target point (targetX,targetY), given that the turtle is already at the point
     * (currentX,currentY) and is facing at angle currentHeading. The angle must be expressed in
     * degrees, where 0 <= angle < 360. 
     *
     * HINT: look at http://en.wikipedia.org/wiki/Atan2 and Java's math libraries
     * 
     * @param currentHeading current direction as clockwise from north
     * @param currentX current location x-coordinate
     * @param currentY current location y-coordinate
     * @param targetX target point x-coordinate
     * @param targetY target point y-coordinate
     * @return adjustment to heading (right turn amount) to get to target point,
     *         must be 0 <= angle < 360
     */
    public static double calculateHeadingToPoint(double currentHeading,int currentX,int currentY,
                                                 int targetX,int targetY) {
    	
       double calculatedHeading = Math.atan2(targetY-currentY,targetX-currentX);
        return calculatedHeading;
    }

    /**
     * Given a sequence of points, calculate the heading adjustments needed to get from each point
     * to the next.
     * 
     * Assumes that the turtle starts at the first point given, facing up (i.e. 0 degrees).
     * For each subsequent point, assumes that the turtle is still facing in the direction it was
     * facing when it moved to the previous point.
     * You should use calculateHeadingToPoint() to implement this function.
     * 
     * @param xCoords list of x-coordinates (must be same length as yCoords)
     * @param yCoords list of y-coordinates (must be same length as xCoords)
     * @return list of heading adjustments between points, of size 0 if (# of points) == 0,
     *         otherwise of size (# of points) - 1
     */
    public static List<Double> calculateHeadings(List<Integer> xCoords, List<Integer> yCoords) {
        throw new RuntimeException("implement me!");
    }

    /**
     * Draw your personal, custom art.
     * 
     * Many interesting images can be drawn using the simple implementation of a turtle.  For this
     * function, draw something interesting; the complexity can be as little or as much as you want.
     * 
     * @param turtle the turtle context
     */
    public static void drawPersonalArt() {
    	  DrawableTurtle turtlePersonel = new DrawableTurtle();
          // draw the window
           turtlePersonel.draw();
           turtlePersonel.currentPosition = new Point(-150,150);
           turtlePersonel.turn(150);
           turtlePersonel.forward(100);
           turtlePersonel.turn(-60);
           turtlePersonel.forward(200); 
           turtlePersonel.turn(-90);
           turtlePersonel.forward(85);
           turtlePersonel.turn(-90);
           turtlePersonel.forward(250);
           turtlePersonel.turn(-60);
           turtlePersonel.forward(100);
           turtlePersonel.turn(-30);
           turtlePersonel.forward(150);
           turtlePersonel.turn(-90);
           turtlePersonel.forward(25);
           turtlePersonel.turn(270);
           turtlePersonel.forward(60);
           turtlePersonel.turn(90);
           turtlePersonel.forward(25);
           turtlePersonel.turn(-270);
           turtlePersonel.forward(60);
           turtlePersonel.turn(90);
           turtlePersonel.forward(25);
           turtlePersonel.turn(180);
           turtlePersonel.forward(275) ; 
           turtlePersonel.turn(-90);
           turtlePersonel.forward(151);
           turtlePersonel.turn(-90);
           turtlePersonel.forward(300);
           turtlePersonel.turn(180);
           turtlePersonel.forward(100);
           turtlePersonel.turn(90);
           turtlePersonel.forward(150);
           turtlePersonel.currentPosition = new Point(30,35);
           drawWindow(turtlePersonel);
           turtlePersonel.currentPosition = new Point(-65,35);
           drawWindow(turtlePersonel);
           //drawing the flag
           turtlePersonel.currentPosition = new Point (-150,150);
           turtlePersonel.turn(180);
           turtlePersonel.forward(60);
           turtlePersonel.turn(90);
           turtlePersonel.forward(50);
           turtlePersonel.turn(90);
           turtlePersonel.forward(30);
           turtlePersonel.turn(90);
           turtlePersonel.forward(50);
           turtlePersonel.turn(180);
           turtlePersonel.forward(20);
           turtlePersonel.turn(-90);
           turtlePersonel.forward(30);
           turtlePersonel.currentPosition = new Point (-115,200);
           turtlePersonel.turn(-90);
           for (int i=1;i<20;i++) {
        	   turtlePersonel.forward(1);
        	   turtlePersonel.turn(-10);
           }
           turtlePersonel.currentPosition = new Point (-115,192);
           drawStar(turtlePersonel);			//draw star in the flag  
           drawDoorLock(turtlePersonel);		//draw door lock   
    }
    /**Method to draw a door lock
     * 
     * @param turtlePersonel object to draw door lock
     */
    private static void drawDoorLock(DrawableTurtle turtlePersonel) {
    	turtlePersonel.color(PenColor.RED);
        turtlePersonel.turn(-45);
        for (int i=1;i<40;i++) {
     	   turtlePersonel.currentPosition = new Point(-158,-50);
     	   turtlePersonel.forward(3);
     	   turtlePersonel.turn(10);
        }
		
	}
	/**
     * Main method.
     * 
     * This is the method that runs when you run "java TurtleSoup".
     * 
     * @param args unused
     */
    public static void main(String args[]) {
    	//DRAW A SQUARE
        DrawableTurtle turtle = new DrawableTurtle();
        turtle.draw();
        drawSquare(turtle,0);
        
        //Draw Personal art
        drawPersonalArt();
        
        //Draw a Octagon
       double angle =  calculateRegularPolygonAngle(3);
       drawRegularPolygon(angle,8,100);  
       
       double n = calculateHeadingToPoint(0.0,0,0,0,1);
       System.out.print(n);
    }
}
