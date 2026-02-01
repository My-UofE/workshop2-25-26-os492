public class RectangleComputation {
    public static void main(String[] args) {
        double height = Integer.parseInt(args[0]);
        double width = Integer.parseInt(args[0]);
        boolean isSquare = false;

        double rec_area = height * width;
        double perimeter = (height * 2) + (width * 2);

        if (height == width) {
            System.out.println("Shape: Square");
        }else{
            System.out.println("Shape: rectangle");
        }


        System.out.println("Area: " + rec_area);
        System.out.println("Perimeter: " + perimeter);
    }
}