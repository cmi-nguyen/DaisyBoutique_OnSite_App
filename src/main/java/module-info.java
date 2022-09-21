module app.daisyboutique_onsite {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens app.daisyboutique_onsite to javafx.fxml;
    exports app.daisyboutique_onsite;
}