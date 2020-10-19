package com.HoffmannMichael;

public class Point
{

    private int x;
    private int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public Point()
    {
        this.x = 0;
        this.y = 0;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public double distance ()
    {
        double distance = Math.sqrt((0 - x) * (0 - x) + (0 - y) * (0 - y));
        return distance;
    }

    public double distance (int xB, int yB)
    {
        double distance = Math.sqrt((xB - x) * (xB - x) + (yB - y) * (yB - y));
        return distance;
    }

    public double distance (Point anotherPoint)
    {
        double distance = Math.sqrt((anotherPoint.getX() - x) * (anotherPoint.getX() - x) + (anotherPoint.getY() - y) * (anotherPoint.getY() - y));
        return distance;
    }

}
