public class Main{
    public static void main(String[] args) {
       Master mymaster = new Master();
       mymaster.length=10;
       mymaster.width=20;
       System.out.println(mymaster.calculateArea());
       System.out.println(mymaster.calculatePerimeter());

       Master.printMessage();
    }
}