package dad.javafx.bindings.custom;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Main {
	
	public static void main(String[] args) {
		
		DoubleProperty a= new SimpleDoubleProperty(3);
		DoubleProperty b= new SimpleDoubleProperty(2);
		
		DoubleProperty c= new SimpleDoubleProperty();
		
		
		c.bind(MathBinding.pow(a, b));
		System.out.println(c.get());
		
	}
}
