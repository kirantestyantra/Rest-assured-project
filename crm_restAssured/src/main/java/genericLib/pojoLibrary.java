package genericLib;

public class pojoLibrary
{
String createdBy;
String projectName;
String status;
int timeSize;
public pojoLibrary(String createdBy, String projectName, String status, int timeSize) {
	
	this.createdBy = createdBy;
	this.projectName = projectName;
	this.status = status;
	this.timeSize = timeSize;
}
public String getCreatedBy() {
	return createdBy;
}
public void setCreatedBy(String createdBy){
	this.createdBy = createdBy;
}
public String getProjectName() {
	return projectName;
}
public void setProjectName(String projectName) {
	this.projectName = projectName;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public int getTimeSize() {
	return timeSize;
}
public void setTimeSize(int timeSize) {
	this.timeSize = timeSize;
}

	
	 
		
	

}
