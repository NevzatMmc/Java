package java03;

import java.awt.Rectangle;
import java.util.Iterator;
import java.util.function.BiConsumer;

import javax.swing.RowFilter;

public class application {

	public static void main(String[] args) {
		application r = new application();
		r.rectangle(10, 5);
		r.rectangle1(10, 5);		
	}
	
	public void rectangle(int row , int column) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				System.out.print("*");
				if(j == column -1)
					System.out.println();
			}
		}
	}
	
	public void rectangle1(int row , int column) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				if(i == 0 | i == row-1) {
					System.out.print("*");
					if(j == column-1)
						System.out.println();
				}
				else {
					if(j == 0)
						System.out.print("*");
					else if(j == column-1)
						System.out.println("*");
					else
						System.out.print(" ");
				}
			}
		}
	}
}
	


