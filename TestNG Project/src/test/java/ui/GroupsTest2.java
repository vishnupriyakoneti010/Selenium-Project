package ui;

import org.testng.annotations.Test;

import common.CommonDataSetup;


public class GroupsTest2 extends CommonDataSetup{
	@Test(priority = 1, groups = "regression")
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
// We can select what type of testing we want to do for the testcases by selecting the group type. If we select regression, three testcases which has group as a regression will execute.
//Steps to select Groups: 1. Right click anywhere and click Run As and then click Run Configurations
//                        2. Click Groups and click Browse and then we can select what group we want to execute.
// By declaring global @Test we can execute all testcases which we have in that Group.
