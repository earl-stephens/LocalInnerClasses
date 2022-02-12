package application;

public class App {
	
	private String name;
	
	public App() {
		name = "Elizabeth";
	}

	public static void main(String[] args) {
		/* Can declare a class almost anywhere, even inside a
		 * method
		 */

		/* can't refer to instance variables in static methods
		 * Instance variables are associated with objects, and
		 * static methods are associated with classes.
		 */
		
		App app = new App();
		app.run();
		// Can replace these two lines with
		// new App().run();
	}
	
	private void run() {
		
		class Printer {
			public void print() {
				/* since this class is declared inside the App class,
				 * it can refer to the App class attributes like name,
				 * even if they're private, since it's within the scope
				 * of the App class
				 */
				
				System.out.println("my name is " + name);
				/* Here you can't use this.name, since this would refer
				 * to the name in the Printer class, which doesn't exist.
				 * Can use App.this.name to explicitly refer to the name
				 * in the App class.
				 */
			}
			

		}
		new Printer().print();
		System.out.println(name);
	}
	
	/* Here, the main method instantiates an App object, which
	 * calls it's constructor and sets name.  Then the main method 
	 * calls the run() method, which prints the name.
	 */

}
