package SemesterProject.SemesterProject.controller;
import java.util.regex.*;

public class VerifyControlRecord {
	String controlRecordText;
	String[] fields = new String[9];
	boolean[] controlRecordCorrect = new boolean[9];
	String myHash;
	public static String displayString;
	int ttlDebit;
	int ttlCredit;
	
	public VerifyControlRecord(String controlRecordText, String hash, int ttlDebit, int ttlCredit) {
		int j = 0;
		displayString = "";
		myHash = hash;
		this.ttlCredit = ttlCredit;
		this.ttlDebit = ttlDebit;
		
		fields[1] = controlRecordText.substring(j, 1);
		j++;
		fields[2] = controlRecordText.substring(j, 7);
		j+=6;
		fields[3] = controlRecordText.substring(j, 13);
		j+=6;
		fields[4] = controlRecordText.substring(j, 21);
		j+=8;
		fields[5] = controlRecordText.substring(j, 31);
		j+=10;
		fields[6] = controlRecordText.substring(j, 43);
		j+=12;
		fields[7] = controlRecordText.substring(j, 55);
		j+=12;
		fields[8] = controlRecordText.substring(j, 94);
		controlRecordCorrectFields();
	}
	
	private void controlRecordCorrectFields() {
		if (fields[1].equals("9"))	{
			controlRecordCorrect[1] = true;
			addCorrect(fields[1]);
		}
		else	{
			controlRecordCorrect[1] = false;
			addIncorrect(fields[1]);
		}
		
		if (Pattern.matches("\\d{6}", fields[2]))	{
			controlRecordCorrect[2] = true;
			addCorrect(fields[2]);
		}
		else	{
			controlRecordCorrect[2] = false;
			addIncorrect(fields[2]);
		}
		
		if (Pattern.matches("\\d{6}", fields[3]))	{
			controlRecordCorrect[3] = true;
			addCorrect(fields[3]);
		}
		else	{
			controlRecordCorrect[3] = false;
			addIncorrect(fields[3]);
		}
		
		if (Pattern.matches("\\d{8}", fields[4]))	{
			controlRecordCorrect[4] = true;
			addCorrect(fields[4]);
		}
		else	{
			controlRecordCorrect[4] = false;
			addIncorrect(fields[4]);
		}
		if (Pattern.matches("\\d{10}", fields[5]) && Pattern.matches("0*"+myHash,fields[5]))	{
			controlRecordCorrect[5] = true;
			addCorrect(fields[5]);
		}
		else	{
			controlRecordCorrect[5] = false;
			addIncorrect(fields[5]);
		}
		
		if (Pattern.matches("\\d{12}", fields[6]) && Integer.parseInt(fields[6]) == ttlDebit)	{
			controlRecordCorrect[6] = true;
			addCorrect(fields[6]);
		}
		else	{
			controlRecordCorrect[6] = false;
			addIncorrect(fields[6]);
		}
		if (Pattern.matches("\\d{12}", fields[7]) && Integer.parseInt(fields[7]) == ttlCredit)	{
			controlRecordCorrect[7] = true;
			addCorrect(fields[7]);
		}
		else	{
			controlRecordCorrect[7] = false;
			addIncorrect(fields[7]);
		}
		
		if (Pattern.matches("\\s{39}", fields[8]))	{
			controlRecordCorrect[8] = true;
			addCorrect(fields[8]);
		}
		else	{
			controlRecordCorrect[8] = false;
			addIncorrect(fields[8]);
		}
	}
	private static void addCorrect(String myAdd) {
		displayString += myAdd;	
	}
	private static void addIncorrect(String myAdd) {
		displayString += "<span class = 'incorrect'>"+myAdd+"</span>";	
	}
}
