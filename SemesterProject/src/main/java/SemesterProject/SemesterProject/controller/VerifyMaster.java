package SemesterProject.SemesterProject.controller;

import java.io.File;
import java.util.ArrayList;

public class VerifyMaster {
	public File baseFile;
	public ExtractParts parts;
	public static String displayString;
	public String[] displayBoxes = new String[15];
	public boolean[] displayBoxesCorrect = new boolean[15];
	public VerifyMaster(File file)
	{
		displayString = "";
		baseFile = file;
		parts = new ExtractParts(file);
		VerifyHeader verifyHeader = new VerifyHeader(parts.getHeader());
		VerifyBatch verifyBatch = new VerifyBatch(parts.getCompanyBatchHeader());
		VerifyEntries verifyEntries[] = new VerifyEntries[parts.getEntries().length];
		VerifyEntryDetailAddenda verifyEntryDetailAddenda = null;
		int totalDebit = 0;
		int totalCredit = 0;
		if(parts.getEntryDetailAddenda() != "") 
			verifyEntryDetailAddenda = new VerifyEntryDetailAddenda(parts.getEntryDetailAddenda());
		else
			verifyEntryDetailAddenda.displayString = "";
		int controlHash =0;
//		for(int i = 1; i< verifyHeader.fields[3].length();i++)	{
//			controlHash += (int)verifyHeader.fields[3].charAt(i);
//		}
		VerifyControlRecord verifyControlRecord;
		
		//initialize displayString
		displayString += verifyHeader.displayString;
		displayString += "<br>";
		displayString += verifyBatch.displayString;
		displayString += "<br>";
		String[] entries = parts.getEntries();
		for(int i =0; i < entries.length;i++)
		{
			verifyEntries[i] = new VerifyEntries(entries[i]);
			displayString += verifyEntries[i].displayString;
			//gather information for debit
			if(verifyEntries[i].fields[2].equals("27") || verifyEntries[i].fields[2].equals("28") ||
					verifyEntries[i].fields[2].equals("37") || verifyEntries[i].fields[2].equals("38"))
				totalDebit += Integer.parseInt(verifyEntries[i].fields[6]);
			//gather information for credit
			else if(verifyEntries[i].fields[2].equals("22") || verifyEntries[i].fields[2].equals("23") ||
					verifyEntries[i].fields[2].equals("32") || verifyEntries[i].fields[2].equals("33"))
				totalCredit += Integer.parseInt(verifyEntries[i].fields[6]);
			//gather information for control hash
			controlHash += Integer.parseInt(verifyEntries[i].fields[3]);
			displayString += "<br>";
		}
		controlHash = controlHash%1000000000;
		if(verifyEntryDetailAddenda.displayString != "")	{
			displayString += verifyEntryDetailAddenda.displayString;
			displayString += "<br>";
		}
		VerifyBatchControl verifyBatchControl = new VerifyBatchControl(parts.getCompanyBatchControl(),totalDebit, totalCredit);
		displayString += verifyBatchControl.displayString;
		displayString += "<br>";
		verifyControlRecord = new VerifyControlRecord(parts.getFileControl(), Integer.toString(controlHash),totalDebit, totalCredit);
		displayString += verifyControlRecord.displayString;
		
		System.out.println("Verification complete");
		//extract all neccessary information to display to screen
		displayBoxes[0] = verifyHeader.fields[3];
		displayBoxesCorrect[0] = verifyHeader.correctFields[3];
		displayBoxes[1] = verifyHeader.fields[4];	
		displayBoxesCorrect[1] = verifyHeader.correctFields[4];
		displayBoxes[2] = verifyHeader.fields[11];
		displayBoxesCorrect[2] = verifyHeader.correctFields[11];
		displayBoxes[3] = verifyBatch.fields[3];
		displayBoxesCorrect[3] = verifyBatch.batchCorrectFields[3];
		displayBoxes[4] = verifyBatch.fields[5];
		displayBoxesCorrect[4] = verifyBatch.batchCorrectFields[5];
		displayBoxes[5] = verifyBatch.fields[9];
		displayBoxesCorrect[5] = verifyBatch.batchCorrectFields[9];
		displayBoxes[6] = verifyBatchControl.fields[3];
		displayBoxesCorrect[6] = verifyBatchControl.batchControlCorrectFields[3];
		displayBoxes[7] = verifyBatchControl.fields[4];
		displayBoxesCorrect[7] = verifyBatchControl.batchControlCorrectFields[4];
		displayBoxes[8] = verifyBatchControl.fields[5];
		displayBoxesCorrect[8] = verifyBatchControl.batchControlCorrectFields[5];
		displayBoxes[9] = verifyBatchControl.fields[6];
		displayBoxesCorrect[9] = verifyBatchControl.batchControlCorrectFields[6];
		displayBoxes[10] = verifyBatchControl.fields[7];
		displayBoxesCorrect[10] = verifyBatchControl.batchControlCorrectFields[7];
		displayBoxes[11] = verifyControlRecord.fields[4];
		displayBoxesCorrect[11] = verifyControlRecord.controlRecordCorrect[4];
		displayBoxes[12] = verifyControlRecord.fields[5];
		displayBoxesCorrect[12] = verifyControlRecord.controlRecordCorrect[5];
		displayBoxes[13] = verifyControlRecord.fields[6];
		displayBoxesCorrect[13] = verifyControlRecord.controlRecordCorrect[6];
		displayBoxes[14] = verifyControlRecord.fields[7];
		displayBoxesCorrect[14] = verifyControlRecord.controlRecordCorrect[7];
	}

}
