public class ObjectOrinted {
 public static void main(String[] args) {
     pen p = new pen();
     p.setcolor("Blue");
     System.out.println(p.getcolor());
     p.setTip(10);
     System.out.println(p.getTip());

    // BankAcc myAcc = new BankAcc();
    // myAcc.username = "Mayank Rai";
    // // myAcc.password = "Varunk@12"; cant access because password is private class
    // myAcc.setPassword("Varunk@12");

 }   
}

class BankAcc{
    public String username;
    private String password;
    public void setPassword(String pass)
    {
        password = pass;
    }

}
class pen{
    private String color;
    private int tip;
    String getcolor(){
        return this.color;
    }
    int getTip()
    {
        return this.tip;

    }
    void setcolor(String newcolor)
    {
        this.color = newcolor;
    }
    void setTip (int newtip)
    {
        this.tip = newtip;
    }
}