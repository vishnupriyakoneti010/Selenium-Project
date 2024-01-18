package ui;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;


public class BeforeAndAfterGroup {
	
	@BeforeGroups(value = "regression")
	public void beforeGroup() {
		System.out.println("Runs before the class");
	}
	
	@AfterGroups(value = "bvt")
	public void afterGroup() {
		System.out.println("Runs after the class");
	}
	
	public void aTest1() {
		System.out.println("test1");
	}

	@Test(priority = 2, groups = "regression" )
	public void bTest2() {
		System.out.println("test2");
	}
	@Test(groups = {"regression", "bvt"} )
	public void bTest3() {
		System.out.println("test3");
	}
	@Test(groups = "bvt")
	public void bTest4() {
		System.out.println("test4");
	}


}
