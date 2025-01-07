public class ObjectOrinted {
 public static void main(String[] args) {
     pen p = new pen();
     p.setcolor("Blue");
     System.out.println(p.color);
     p.setTip(10);
     System.out.println(p.tip);
 }   
}
class pen{
    String color;
    int tip;
    
    void setcolor(String newcolor)
    {
        color = newcolor;
    }
    void setTip (int newtip)
    {
        tip = newtip;
    }
}