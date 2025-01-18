public class Box {

    private double width;
    private double height;
    private double length;

    public Box(){
        this.width = width;
        this.height = height;
        this.length = length;
    }
    Box(double width, double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;

    }
    public double getLength(){
        return length;
    }

    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setLength(){
        this.length = length;
    }
    //surface area
    public double getArea(){
        return 2 *(width * height + height *length + length *width);
    }

    //volume
    public double getVolum(){
        return width* height*length;
    }
    
}