package gooey;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;
public class GooeyGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Frame win = new Frame();
win.setSize(200,200);
win.setVisible(true);
TextField T1 = new TextField(10);
Button B1 = new Button("Click to Add");
FlowLayout fl=new FlowLayout();
win.setLayout(fl);
win.add(new Label("No1"));
win.add(T1);
win.add(new Label("+"));
TextField T2 = new TextField(10);
win.add(new Label("No2"));
win.add(T2);
win.add(B1);
TextField T3 = new TextField(10);
win.add(T3);
Event2 E=new Event2(T1,T2,T3);
B1.addActionListener(E);



	}

}
