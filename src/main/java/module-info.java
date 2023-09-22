module task.choicequestion {
    requires javafx.controls;
    requires javafx.fxml;


    opens task.choicequestion to javafx.fxml;
    exports task.choicequestion;
}