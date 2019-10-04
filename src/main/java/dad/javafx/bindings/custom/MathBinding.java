package dad.javafx.bindings.custom;

import javafx.beans.binding.DoubleExpression;

public class MathBinding {
	
	
	public static powBinding pow(DoubleExpression x, DoubleExpression y) {
		return new powBinding(x, y);
		
	}
	

	public static SqrtBinding sqrt(DoubleExpression x) {
		return new SqrtBinding(x);
		
	}

}
