public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(3.0, 4.0, 5.0);
        System.out.println("Width"+box1.getWidth());
        System.out.println("Height"+box1.getHeight());
        System.out.println("Length"+box1.getLength());
        //surface area and volume
        System.out.println("Surface area "+box1.getArea());
        System.out.println("Volume"+box1.getVolum()); 

    }

}
