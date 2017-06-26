package gooey;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.tree.DefaultTreeCellEditor.EditorContainer;

public class Event2 implements ActionListener{
	TextField x,y,z;
public Event2(TextField x,TextField y, TextField z){
	this.x=x;
	this.y=y;
	this.z=z;
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(x.getText());
		int b = Integer.parseInt(y.getText());
		int c = a+b;
		z.setText(Integer.toString(c)); 
		System.out.println("Mike");
		x.setText("Arrgh");
		//System.out.println(e.);
	}

}
