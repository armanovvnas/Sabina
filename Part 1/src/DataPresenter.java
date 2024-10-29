//public class DataPresenter {
     //showing the data
// taking Input and passing to model
// append more data to update it
// INPUT OPERATIONS
//}
public class DataPresenter {
    private DataModel model;
    private ConsoleView view;
    public DataPresenter(DataModel model, ConsoleView view) {
        this.model = model;
        this.view = view;
    }
    public void updateData() {
        // Display current data
        view.displayData(model.getData());
        // Get new data from user and update model
        String newData = view.getInput("Enter new data: ");
        model.setData(newData);
        view.displayData("Data updated to: " + model.getData());
        // Perform more operations
        String moreData = view.getInput("Enter another piece of data: ");
        model.appendData(moreData);
        view.showFinalData(model.getData());
    }
}
