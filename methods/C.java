package methods;

import javax.swing.*;
class C {
	
	int id;
	String name;
	int[] marks = new int[3];
	int sum = 0;
	
	void get() {
	
		id = Integer.parseInt(JOptionPane.showInputDialog("Enter ID: "));
		name = JOptionPane.showInputDialog("Enter name: ");
		
		for(int i=0; i<marks.length; i++) {
			marks[i] = Integer.parseInt(JOptionPane.showInputDialog
					("Marks for subject ["+i+"]"));
			sum+=marks[i];
	
		}
	}
	
	void total() {
		for(int i=0; i<3; i++)
			sum+=marks[i];
	}
	
	void show() {
		System.out.println("ID..."+id);
		System.out.println("Name..."+name);
		System.out.println("Obtained marks in 3 subjects..."+sum);
		System.out.println("\n");

	}
	
	

}
