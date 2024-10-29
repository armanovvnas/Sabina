import java.util.ArrayList;
import java.util.List;
public class UserViewModel {
    private UserModel userModel;
    private List<String> users;
    public UserViewModel() {
        this.userModel = new UserModel();
        this.users = new ArrayList<>();
    }
    public void addUser(String name) {
        if (name != null && !name.isEmpty()) {
            users.add(name);
        }
    }
    public List<String> getUsers() {
        return new ArrayList<>(users);
    }
    public void updateUser(int index, String newName) {
        if (index >= 0 && index < users.size() && newName != null && !newName.isEmpty()) {
            users.set(index, newName);
        }
    }
    public void removeUser(int index) {
        if (index >= 0 && index < users.size()) {
            users.remove(index);
        }
    }
}
