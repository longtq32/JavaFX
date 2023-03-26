module prj311.thuchanh.helloworldfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens prj311.thuchanh.helloworldfx to javafx.fxml;
    exports prj311.thuchanh.helloworldfx;
}