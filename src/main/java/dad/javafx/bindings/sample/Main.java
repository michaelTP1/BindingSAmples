package dad.javafx.bindings.sample;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Main {
	
	public static void main(String[] args) {
		
		DoubleProperty a= new SimpleDoubleProperty(2);
		DoubleProperty b= new SimpleDoubleProperty(4);
		
		DoubleProperty c= new SimpleDoubleProperty();
		
		// o= observable, ov= old value, nv=new value
		c.addListener((o, ov, nv)->{
			System.out.println("C antes valía "+ov+" y ahora vale "+nv);
		});

		
		c.bind(a.multiply(b.add(100)));
		
		a.set(5);
		
		
	}

}
