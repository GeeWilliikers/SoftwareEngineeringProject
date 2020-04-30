package SemesterProject.SemesterProject.controller;

public class GetUploadDirectory {
	String uploadDirectory = System.getProperty("user.dir").substring(0, System.getProperty("user.dir").length()-8)+"\\Project\\SemesterProject\\src\\main\\webapp\\resources\\uploads\\";
	public GetUploadDirectory()	{
		
	}
}
