public class Master {
    public static void printMessage() {
        System.out.println("Master's Area + perimeter is ..");
    }
    public double length=6;
    public double width=6;

    public double calculateArea(){
        return length*width;
    }

    public double calculatePerimeter(){
            return 2*length+2*width;
    }



}
