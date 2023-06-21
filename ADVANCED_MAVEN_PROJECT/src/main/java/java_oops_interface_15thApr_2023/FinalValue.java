package java_oops_interface_15thApr_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class FinalValue extends Demo implements Execute, Execute_New {

	//a Class can extend another Class
	//a Class can implement an interface
	//a Class can implement multiple interfaces
	//a Class can extend another class and implement multiple interfaces
	
	public static void main(String[] args) {
		
		//Here FinalValue is known as the implementing class
		//it is the responsibility of the implementing Class to invoke the unimplemented methods
		//of the abstract Class it extends and interfaces it implements
	
		
		//Can I create the object of an interface?
		//Answer is No
		
		WebDriver driver = new ChromeDriver();
		
		//ChromeDriver is the implementing class
		
		//Can an abstract class implement an interface ??
		// Yes it can 

	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void world() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sky() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chase() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

}
