public class Main{
    public static void main(String[] args) {
       Master master = new Master();
       master.length=10;
       master.width=20;
       System.out.println(master.calculateArea());
       System.out.println(master.calculatePerimeter());

       Master.printMessage();
    }
}