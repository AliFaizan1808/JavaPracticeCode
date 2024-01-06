package patterns;

public class AbstractDesignPattern {


	public static void main(String[] args) {
		Application app = configureApplication();
		app.paint();
	}
	
	
	private static Application configureApplication() {
		Application app;   
		GUIFactory factory; 
		String osName = System.getProperty("os.name").toLowerCase();
		if (osName.contains("mac")) {
			factory = new MacOSFactory();
		} else {
			factory = new WindowsFactory();
		}
		app = new Application(factory);
		return app;
	}


}




class Application {
	private Button button;

	public Application(GUIFactory factory) {
		button = factory.createButton();
	}

	public void paint() {
		button.paint();
	}
}

class WindowsFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

}

class MacOSFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new MacOSButton();
	}

}


interface GUIFactory {
	Button createButton();
}


interface Button {
	void paint();
}

class MacOSButton implements Button {

	@Override
	public void paint() {
		System.out.println("You have created MacOSButton.");
	}
}


class WindowsButton implements Button {

	@Override
	public void paint() {
		System.out.println("You have created WindowsButton.");
	}
}
