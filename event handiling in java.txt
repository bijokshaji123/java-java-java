import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Graphics;
class MOUSEWINDOWEX extends JFrame implements MouseListener,WindowListener
{
MOUSEWINDOWEX()
{
//setTitle(" Mouse Listener Java Swing Example");
setBounds(100,200,500,500);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
addMouseListener(this);
addWindowListener(this);
}
public void mousePressed(MouseEvent e)
{
Graphics g= getGraphics();
g.setColor(Color.BLUE);
g.fillOval(e.getX(),e.getY(),50,50);
System.out.println("Mouse Pressed");
}
public void mouseReleased(MouseEvent e)
{
Graphics g= getGraphics();
g.setColor(Color.GREEN);
g.fillOval(e.getX(),e.getY(),50,50);
System.out.println("Mouse Released");
}
public void mouseClicked(MouseEvent e)
{
Graphics g= getGraphics();
g.setColor(Color.RED);
g.fillOval(e.getX(),e.getY(),50,50);
System.out.println("Mouse Clicked");
}
public void mouseEntered(MouseEvent e)
{
Graphics g= getGraphics();
g.setColor(Color.YELLOW);
g.fillOval(e.getX(),e.getY(),50,50);
System.out.println("Mouse Entered");
}
public void mouseExited(MouseEvent e)
{
Graphics g= getGraphics();
g.setColor(Color.BLACK);
g.fillOval(e.getX(),e.getY(),50,50);
System.out.println("Mouse Exited");
}
public void windowActivated (WindowEvent e) {
System.out.println("WINDOW activated");
}
public void windowClosed (WindowEvent e) {
System.out.println("WINDOW closed");
}
public void windowClosing (WindowEvent e) {
System.out.println("WINDOW closing");
dispose();
}
public void windowDeactivated (WindowEvent e) {
System.out.println("WINDOW deactivated");
}
public void windowDeiconified (WindowEvent e) {
System.out.println("WINDOW deiconified");
}
public void windowIconified(WindowEvent e) {
System.out.println("WINDOW iconified");
}
public void windowOpened(WindowEvent e) {
System.out.println("WINDOW opened");
}
}
class MOUSEWINDOW
{
public static void main(String[] args)
{
MOUSEWINDOWEX frame = new MOUSEWINDOWEX();
}
}