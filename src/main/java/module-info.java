module prj311.thuchanh.helloworldfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens sample to javafx.fxml;
    exports sample;
}