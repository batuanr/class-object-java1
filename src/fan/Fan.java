package fan;

public class Fan {
    final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private  String color = "blue";
    public Fan (){
    }
    private int getSpeed () {
        return this.speed;
    }
    private boolean getOn () {
        return this.on;
    }
    private double getRadius () {
        return this.radius;
    }
    private String getColor () {
        return this.color;
    }
    public void setSpeed (int speed) {
        this.speed = speed;
    }
    public void setOn (boolean on) {
        this.on = on;
    }
    public void setRadius (double radius) {
        this.radius = radius;
    }
    public void setColor (String color) {
        this.color = color;
    }
    public String toString () {
        if (getOn()) {
            return "Fan is on Speed: " + getSpeed() + " Color: " + getColor() + " Radius: " + getRadius();
        }
        else {
            return "Fan is off Color: " + getColor() + " Radius: " + getRadius();
        }
    }
}
