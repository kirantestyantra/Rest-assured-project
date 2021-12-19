package gerenericUtility;

import java.sql.SQLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class ApiBaseClass {
public DataBaseUtilities dbLib = new DataBaseUtilities();
	
	@BeforeSuite
	public void configBeforeSuite() {
		String baseURI = "http://localhost:8084";
		dbLib.connectDB();
	}

	
	@AfterSuite
	public void configAfterSuite() throws SQLException {
		dbLib.closeDB();
}}
