public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println("A circle " + circle.toString() );
        System.out.println("The color is " + circle.getColor() );
        System.out.println("The radius is " + circle.getRadius() );
        System.out.println("The area is " + circle.getArea());
        System.out.println();

        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("A rectangle " + rectangle.toString() );
        System.out.println("The width is " + rectangle.getWidth() );
        System.out.println("The height is " + rectangle.getHeight() );
        System.out.println("The area is " + rectangle.getArea() );
    }
}

