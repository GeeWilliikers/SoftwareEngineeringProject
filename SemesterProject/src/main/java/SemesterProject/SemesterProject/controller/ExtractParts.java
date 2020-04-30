package SemesterProject.SemesterProject.controller;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
/*
 * ExtractParts is a class that takes a string or a file as an operator. It will instantiate all parts of a NACHA file including:
 * header
 * company/batch header
 * entries
 * company batch control
 * file control
 * entry detail addenda
 * 
 * all parts are instantiated at creation
 * class contains get methods for all the above sections but not set methods
 * 
 */
public class ExtractParts {
	private String wholeMessage;
	private String header;
	private String companyBatchHeader;
	private String companyBatchControl;
	private String[] entries; 
	private String[] lines;
	private String fileControl;
	private String entryDetailAddenda;
	
	public ExtractParts(String fileString)	{
		wholeMessage = fileString;
		lines = fileString.split(System.getProperty("line.separator"));
		header = pullHeader();
		companyBatchHeader = pullCompanyBatchHeader();
		fileControl = pullFileControl();
		entries = pullEntries();
		companyBatchControl = pullCompanyBatchControl();
		entryDetailAddenda = pullEntryDetailAddenda();
		
	}
	public ExtractParts(File myFile)
	{
		try	{
		wholeMessage = new String(Files.readAllBytes(Paths.get(myFile.getAbsolutePath())));
		}
		catch (Exception e)
		{
			System.out.print("error in ExtractParts file");
		}
		String fileString = wholeMessage;
		lines = fileString.split(System.getProperty("line.separator"));
		header = pullHeader();
		companyBatchHeader = pullCompanyBatchHeader();
		fileControl = pullFileControl();
		entries = pullEntries();
		companyBatchControl = pullCompanyBatchControl();
		entryDetailAddenda = pullEntryDetailAddenda();
	}
	private String pullHeader()	
	{
		//check to make sure that the first character is correct
		if(lines[0].charAt(0) == '1')
			return lines[0];
		return "Header not found";
	}
	private String pullCompanyBatchHeader()	
	{
		if(lines[1].charAt(0) == '5')
			return lines[1];
		return "Company/Batch header not found";
	}
	private String[] pullEntries()
	{
		List<String> tempList = new ArrayList<String>();
		for(int i = 2; true; i++)
		{
			//all entry lines will start with a 6. This code will append every line that is an entry to a list named tempList
			if (lines[i].charAt(0) == '6')
			{
				tempList.add(lines[i]);
			}
			else
				break;
		}
		//if no lines beginning with '6' are found, then return null
		if(tempList.isEmpty())
			return null;
		String[] returnArray = tempList.toArray(new String[tempList.size()]);
		return returnArray;
	}
	private String pullCompanyBatchControl()
	{
		for(int i = 2; i < lines.length; i++)
		{
			if(lines[i].charAt(0) == '8')
				return lines[i];
		}
		return "Company/Batch control not found";
	}
	private String pullFileControl()
	{
		for(int i =2; i < lines.length; i++)
		{
			if(lines[i].charAt(0) == '9')
				return lines[i];
		}
		return "file control not Found";
	}
	private String pullEntryDetailAddenda()
	{
		for(int i =2; i < lines.length;i++)
		{
			if(lines[i].charAt(0) == '7')
			{
				return lines[i];
			}
		}
		return "";
	}
	
	
	//beginning of get methods
	public String getWholeMessage()
	{
		return wholeMessage;
	}
	public String getHeader() {
		return header;
	}
	public String getCompanyBatchHeader()
	{
		return companyBatchHeader;
	}
	public String getCompanyBatchControl()
	{
		return companyBatchControl;
	}
	public String[] getEntries()
	{
		return entries;
	}
	public String[] getLines()
	{
		return lines;
	}
	public String getFileControl()
	{
		return fileControl;
	}
	public String getEntryDetailAddenda()
	{
		return entryDetailAddenda;
	}

}
