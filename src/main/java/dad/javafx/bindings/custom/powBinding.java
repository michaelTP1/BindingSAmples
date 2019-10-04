package dad.javafx.bindings.custom;

import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.DoubleExpression;

public class powBinding extends DoubleBinding{
	
	
	private DoubleExpression x, y;


	
	public powBinding (DoubleExpression x, DoubleExpression y) {
		super();
		this.x=x;
		this.y=y;
		this.bind(x,y);
		
		
	}
	

	@Override
	protected double computeValue() {
		return Math.pow(x.get(), y.get());
	}

}
