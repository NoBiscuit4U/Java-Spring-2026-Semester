module TestJavafx {
	opens application to javafx.graphics, javafx.fxml;
	
	requires javafx.controls;
	requires java.desktop;
}
