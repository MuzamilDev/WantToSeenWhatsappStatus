import javax.swing.*;

class AM
{
   String st;
   int time;
   void getTime()
   {
       st=JOptionPane.showInputDialog("Time is: Please Put in 24 hour format after AM ");
       time=Integer.parseInt(st);
   }
    void Breakfast()
    {
        if(time==6 || time==7 )

        JOptionPane.showMessageDialog(null,"Breakfast");
    }
    void driving ()
    {
        if(time==8)
        JOptionPane.showMessageDialog(null,"Driving");
    }
    void school()
    {
        if(time==9 || time==10 || time==11 || time==12 || time==13 )
        JOptionPane.showMessageDialog(null,"At School");
    }
    void launch()
    {
        if(time==14)
        JOptionPane.showMessageDialog(null,"At Launch time");
    }

}
class PM extends AM
{
    void meeting ()
    {
        if(time==15)
        JOptionPane.showMessageDialog(null,"In meeting");
    }
    void Driving()
    {
        if(time==16)
        JOptionPane.showMessageDialog(null,"Driving a Car");
    }
    void dinner ()
    {
        if(time==19)
        JOptionPane.showMessageDialog(null,"Doing Dinner");
    }
    void sleeping()
    {
        if(time==20)
        JOptionPane.showMessageDialog(null,"Don't Disturb Sleeping");
    }
    void available() {
        if (time == 21 || time == 22 || time == 23 || time == 24)
            JOptionPane.showMessageDialog(null, "Not Available");
        }

}
public class autoreplayMessage {
    public static void main(String[] args) {
        PM n = new PM();
        n.getTime();
        n.Breakfast();
        n.driving();
        n.school();
        n.launch();
        n.meeting();
        n.Driving();
        n.dinner();
        n.sleeping();
        n.available();
        System.exit(0);
    }
}
