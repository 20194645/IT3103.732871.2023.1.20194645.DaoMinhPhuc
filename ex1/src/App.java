public class App {
    public static square s; 
    public static circle c; 
    public static void main(String[] args) throws Exception {
        s = new square();
        c = new circle();
        s.get((float)4.5);
        c.get((float)3.5);
        System.out.println("Side of Square:"+ s.side+"; Radius of circle:"+c.rad);
    }
}
