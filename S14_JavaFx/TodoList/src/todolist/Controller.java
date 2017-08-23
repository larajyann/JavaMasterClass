package todolist;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import todolist.datamodel.TodoItem;

public class Controller {

  private List<TodoItem> todoItems;

  @FXML
  private ListView todoListView;

  public void initialize() {
    TodoItem item1 = new TodoItem("项目1",
        "Buy a 22th birthday card for Mizu",
        LocalDate.of(2017, Month.AUGUST, 29));
    TodoItem item2 = new TodoItem("项目2",
        "See Dr.Smith at 234 Main Street. Bring Paperwork",
        LocalDate.of(2017, Month.SEPTEMBER, 22));
    TodoItem item3 = new TodoItem("项目3",
        "I promised Mike I'd email him",
        LocalDate.of(2017, Month.NOVEMBER, 12));
    TodoItem item4 = new TodoItem("项目4",
        "Doug is arriving on March 24",
        LocalDate.of(2017, Month.MARCH, 24));
    TodoItem item5 = new TodoItem("项目5",
        "The clothes should be ready by Wednesday",
        LocalDate.of(2017, Month.SEPTEMBER, 1));

    todoItems = new ArrayList<TodoItem>();
    todoItems.add(item1);
    todoItems.add(item2);
    todoItems.add(item3);
    todoItems.add(item4);
    todoItems.add(item5);

    todoListView.getItems().setAll(todoItems);
    todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
  }
}
