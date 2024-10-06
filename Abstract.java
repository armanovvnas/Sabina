interface Button {
    void render();
}
interface Window {
    void render();
}
class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Render Windows Button.");
    }
}
class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Render Mac Button.");
    }
}
class WindowsWindow implements Window {
    @Override
    public void render() {
        System.out.println("Render Windows Window.");
    }
}
class MacWindow implements Window {
    @Override
    public void render() {
        System.out.println("Render Mac Window.");
    }
}
interface GUIFactory {
    Button createButton();
    Window createWindow();
}
class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }
}
class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Window createWindow() {
        return new MacWindow();
    }
}

public class Abstract {
    public static void main(String[] args) {
        GUIFactory factory = new WindowsFactory();
        Button button = factory.createButton();
        Window window = factory.createWindow();

        button.render();
        window.render();
    }
}
