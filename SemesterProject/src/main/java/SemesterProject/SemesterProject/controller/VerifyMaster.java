package SemesterProject.SemesterProject.controller;

import java.io.File;
import java.util.ArrayList;

public class VerifyMaster {
	public File baseFile;
	public ExtractParts parts;
	public String displayString;
	public String[] displayInfo = new String[15];
	public VerifyMaster(File file)
	{
		displayString = "";
		baseFile = file;
		parts = new ExtractParts(file);
		VerifyHeader verifyHeader = new VerifyHeader(parts.getHeader());
		VerifyBatch verifyBatch = new VerifyBatch(parts.getCompanyBatchHeader());
		VerifyBatchControl verifyBatchControl = new VerifyBatchControl(parts.getCompanyBatchControl());
		VerifyEntryDetailAddenda verifyEntryDetailAddenda = null;
		if(parts.getEntryDetailAddenda() != "") 
			verifyEntryDetailAddenda = new VerifyEntryDetailAddenda(parts.getEntryDetailAddenda());
		else
			verifyEntryDetailAddenda.displayString = "";

		//update once we have VerifyEntries and VerifyFileControl done
		//VerifyEntries verifyEntries = new VerifyEntries(parts.getEntries());
		//VerifyFileControl verifyFileControl = new VerifyFileControl(parts.getFileControl());
		
		//initialize displayString
		displayString += verifyHeader.displayString;
		displayString += "<br>";
		displayString += verifyBatch.displayString;
		displayString += "<br>";
		for(int i =0; i < parts.getEntries().length;i++)
		{
			//waiting for verifyEntries to be done to finish
		}
		displayString += "<br>";
		if(verifyEntryDetailAddenda.displayString != "")	{
			displayString += verifyEntryDetailAddenda.displayString;
			displayString += "<br>";
		}
		displayString += verifyBatchControl.displayString;
		displayString += "<br>";
		//displayString += verifyFileControl.displayString;
		
		//extract all neccessary information to display to screen
		displayInfo[0] = verifyHeader.fields[3];
		displayInfo[1] = verifyHeader.fields[4];	
		displayInfo[2] = verifyHeader.fields[11];
		displayInfo[3] = verifyBatch.fields[3];
		displayInfo[4] = verifyBatch.fields[5];
		displayInfo[5] = verifyBatch.fields[9];
		displayInfo[6] = verifyBatchControl.fields[3];
		displayInfo[7] = verifyBatchControl.fields[4];
		displayInfo[8] = verifyBatchControl.fields[5];
		displayInfo[9] = verifyBatchControl.fields[6];
		displayInfo[10] = verifyBatchControl.fields[7];
		//displayInfo[11] = verifyFileControl.fields[4];
		//displayInfo[12] = verifyFileControl.fields[5];
		//displayInfo[13] = verifyFileControl.fields[6];
		//displayInfo[14] = verifyFileControl.fields[7];
	}

}
