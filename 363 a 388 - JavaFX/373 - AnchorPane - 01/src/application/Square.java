package application;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Square extends Rectangle {

private static int i = 0;
	
	private String[] colors = {
		"#c33c5e", "#39aac6", "#28d79a",
		"#fb750", "#6657a8", "#f9060e"
	};
	
	public Square() {
		this(100, 100);
	}
	
	public Square(int width, int height) {
		setWidth(width);
		setHeight(height);
		
		setFill(Color.web(colors[i++]));
		
		i++;
		if(i == 6) i = 0;
	}
	
}
