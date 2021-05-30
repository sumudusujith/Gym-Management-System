package sample2019582;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



public class Gui extends Application {


    @Override
    public void start(Stage mystage2019582){
        AnchorPane myanchorPane = new AnchorPane();

        TableView<DefaultMember> mytable = new TableView<>();

        TableColumn<DefaultMember, String> myIDColumn = new TableColumn<>("MemberID");
        myIDColumn.setCellValueFactory(new PropertyValueFactory<>("membershipID2019582"));

        TableColumn<DefaultMember, String> myNameColumn = new TableColumn<>("MemberName");
        myNameColumn.setCellValueFactory(new PropertyValueFactory<>("membername2019582"));

        mytable.getColumns().addAll(myIDColumn, myNameColumn);

        mytable.getItems().setAll(getmembers9());

        myanchorPane.getChildren().add(mytable);
        Scene scene1 = new Scene(myanchorPane);
        mystage2019582.setScene( scene1 );
        mystage2019582.show();
    }

    public ObservableList<DefaultMember> getmembers9(){//this is  list that enables listeners to track changes when they occur
        ObservableList<DefaultMember> defaultMemberObservableList = FXCollections.observableArrayList();//this is  Utility class that consists of static methods that are 1:1 copies of java.util.Collections methods.
        for (DefaultMember defaultMember: MyGymManager.memberlist2019582){
            defaultMemberObservableList.add(defaultMember);
            if (defaultMember instanceof StudentMember){
                defaultMemberObservableList.add(defaultMember);
            }
            else if (defaultMember instanceof Over60Member){
                defaultMemberObservableList.add(defaultMember);
            }
            System.out.println(defaultMember);
        }
        return defaultMemberObservableList;
    }
}