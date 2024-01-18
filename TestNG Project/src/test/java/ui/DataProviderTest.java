package ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	
	/*@Test(dataProvider = "dataSet")
	public void test(String username, String password) {
		System.out.println(username+ "====="+password);
		}

	@DataProvider
	public Object[][] dataSet() {
		Object[][] dataset = new Object[4][2];

		// first row data
		dataset[0][0] = "user1";
		dataset[0][1] = "Pass1";

		// Second row data
		dataset[1][0] = "user2";
		dataset[1][1] = "Pass2";

		// Third row data
		dataset[2][0] = "user3";
		dataset[2][1] = "Pass3";

		// fourth row data
		dataset[3][0] = "user4";
		dataset[3][1] = "Pass4";
		
		return dataset;*/
	
	//Another way to write is:
	
	@Test(dataProvider = "dataSet")
	public void test(String username, String password, String test) {
		System.out.println(username+"==="+password+ "==="+test);
	}
	
	@DataProvider
	public Object[][] dataSet(){
		return new Object[][] {
			{"username", "password", "test"},
			{"username1", "password1", "test1"}, 
			{"username2", "password2", "test2"}
		};

	}

}
