//public class DataModel {
    // storing, updating appending data methods
// ONLY METHODS getdata, setdata, appenddata
//}
public class DataModel {
    private String data;
    public DataModel(String initialData) {
        this.data = initialData;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void appendData(String moreData) {
        this.data = this.data + " | " + moreData;
    }
}
