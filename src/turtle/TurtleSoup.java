/* Copyright (c) 2007-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package turtle;

import java.util.List;
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

    /**
     * Determine inside angles of a regular polygon.
     * 
     * There is a simple formula for calculating the inside angles of a polygon;
     * you should derive it and use it here.
     * 
     * @param sides number of sides, where sides must be > 2
     * @return angle in degrees, where 0 <= angle < 360
     */
    public static double calculateRegularPolygonAngle(int sides) {
        throw new RuntimeException("implement me!");
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
    public static int calculatePolygonSidesFromAngle(double angle) {
        throw new RuntimeException("implement me!");
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
    public static void drawRegularPolygon(Turtle turtle, int sides, int sideLength) {
        throw new RuntimeException("implement me!");
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
    public static double calculateHeadingToPoint(double currentHeading, int currentX, int currentY,
                                                 int targetX, int targetY) {
        throw new RuntimeException("implement me!");
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
    public static void drawPersonalArt(Turtle turtle,int side_length) {
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
          
         /** door lock
           turtlePersonel.currentPosition = new Point(-165,-70);
           turtlePersonel.color(PenColor.RED);
           turtlePersonel.turn(-45);
           for (int i=1;i<40;i++) {
        	   turtlePersonel.forward(1);
        	   turtlePersonel.turn(10);
           }
           */
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
    }

    /**
     * Main method.
     * 
     * This is the method that runs when you run "java TurtleSoup".
     * 
     * @param args unused
     */
    public static void main(String args[]) {
    	
        DrawableTurtle turtle = new DrawableTurtle();
       // draw the window
        turtle.draw();
        drawSquare(turtle,0);
        
        drawPersonalArt(turtle,0);
        
        
    }

}
