package SemesterProject.SemesterProject.controller;
import java.util.regex.*;

public class VerifyControlRecord {
	String controlRecordText;
	String[] fields = new String[9];
	boolean[] controlRecordCorrect = new boolean[9];
	public static String displayString = "";
	
	public VerifyControlRecord(String controlRecordText) {
		int j = 0;
		
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
			addCorrect(fields[1]);
		}
		
		if (Pattern.matches("\\d{6}", fields[2]))	{
			controlRecordCorrect[2] = true;
			addCorrect(fields[2]);
		}
		else	{
			controlRecordCorrect[2] = false;
			addCorrect(fields[2]);
		}
		
		if (Pattern.matches("\\d{6}", fields[3]))	{
			controlRecordCorrect[3] = true;
			addCorrect(fields[3]);
		}
		else	{
			controlRecordCorrect[3] = false;
			addCorrect(fields[3]);
		}
		
		if (Pattern.matches("\\d{8}", fields[4]))	{
			controlRecordCorrect[4] = true;
			addCorrect(fields[4]);
		}
		else	{
			controlRecordCorrect[4] = false;
			addCorrect(fields[4]);
		}
		
		if (Pattern.matches("\\d{10}", fields[5]))	{
			controlRecordCorrect[5] = true;
			addCorrect(fields[5]);
		}
		else	{
			controlRecordCorrect[5] = false;
			addCorrect(fields[5]);
		}
		
		if (Pattern.matches("\\d{12}", fields[6]))	{
			controlRecordCorrect[6] = true;
			addCorrect(fields[6]);
		}
		else	{
			controlRecordCorrect[6] = false;
			addCorrect(fields[6]);
		}
		
		if (Pattern.matches("\\d{12}", fields[7]))	{
			controlRecordCorrect[7] = true;
			addCorrect(fields[7]);
		}
		else	{
			controlRecordCorrect[7] = false;
			addCorrect(fields[7]);
		}
		
		if (Pattern.matches("\\s{39}", fields[8]))	{
			controlRecordCorrect[8] = true;
			addCorrect(fields[8]);
		}
		else	{
			controlRecordCorrect[8] = false;
			addCorrect(fields[8]);
		}
	}
	private static void addCorrect(String myAdd) {
		displayString += myAdd;	
	}
	private static void addIncorrect(String myAdd) {
		displayString += "<span class = 'incorrect'>"+myAdd+"</span>";	
	}
}
