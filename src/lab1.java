import javax.swing.JOptionPane;

public class lab1 {

	public static void main(String[] args) {
		float f, c; 
		//declare variables for farenheit && centigrade
		f = (float) 0;
		c = (float) 0;
		String userInput = JOptionPane.showInputDialog("Enter farenheit value for increments of centigrade by 5 degrees");
		
		float userData = Float.parseFloat(userInput); // [1]
		
		for(float i = 0; i<=5; i++) // [2]
		{
			c = (userData-32)*5/9; // [3]
			JOptionPane.showMessageDialog(null, c); //[4]
			userData+=5;
		}
		// [1] Parsed userData from String to Float type 
		// [2] Assigned loop counter with 5 loops for 5 temperature readings
		// [3] Inside 1st loop conversion from farenheit to centigrade
		// [4] JOptionPane func displays conversion && userdata incremented by 5
		// [0] Loop runs again displaying increments of 5 degrees
	}
	
}
