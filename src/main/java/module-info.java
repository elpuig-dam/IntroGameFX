module dam.mp3.uf5.introgamesfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens dam.mp3.uf5.introgamesfx to javafx.fxml;
    exports dam.mp3.uf5.introgamesfx;
    opens dam.mp3.uf5.introgamesfx.control to javafx.fxml;
    exports dam.mp3.uf5.introgamesfx.control;
}