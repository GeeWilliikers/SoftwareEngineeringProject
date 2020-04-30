package SemesterProject.SemesterProject.controller;
import java.util.regex.*;

public class VerifyBatchControl {
	String batchControlText;
	String[] fields = new String[12];
	boolean[] batchControlCorrectFields = new boolean[12];
	public static String displayString;
	int ttlDebit, ttlCredit;
	
	public VerifyBatchControl(String batchControlText, int ttlDebit, int ttlCredit) {
		this.batchControlText = batchControlText;
		displayString = "";
		this.ttlDebit = ttlDebit;
		this.ttlCredit = ttlCredit;
		
		//field
		int j = 0;
		
		fields[1] = batchControlText.substring(j, 1);
		j++;
		fields[2] = batchControlText.substring(j, 4);
		j+=3;
		fields[3] = batchControlText.substring(j, 10);
		j+=6;
		fields[4] = batchControlText.substring(j, 20);
		j+=10;
		fields[5] = batchControlText.substring(j, 32);
		j+=12;
		fields[6] = batchControlText.substring(j, 44);
		j+=12;
		fields[7] = batchControlText.substring(j, 54);
		j+=10;
		fields[8] = batchControlText.substring(j, 73);
		j+=19;
		fields[9] = batchControlText.substring(j, 79);
		j+=6;
		fields[10] = batchControlText.substring(j, 87);
		j+=8;
		fields[11] = batchControlText.substring(j, 94);
		batchControlCorrectFields();
	}
	
	private void batchControlCorrectFields() {
		//field 1
		if (fields[1].equals("8"))	{
			batchControlCorrectFields[1] = true;
			addCorrect(fields[1]);
		}
		else	{
			batchControlCorrectFields[1] = false;
			addIncorrect(fields[1]);
		}
		//field 2
		if (Pattern.matches("\\d{3}", fields[2]))	{
			batchControlCorrectFields[2] = true;
			addCorrect(fields[2]);
		}
		else	{
			batchControlCorrectFields[2] = false;
			addIncorrect(fields[2]);
		}
		//field 3
		if (Pattern.matches("\\d{6}", fields[3]))	{
			batchControlCorrectFields[3] = true;
			addCorrect(fields[3]);
		}
		else 	{
			batchControlCorrectFields[3] = false;
			addIncorrect(fields[3]);
		}
		//field 4
		if (Pattern.matches("\\d{10}", fields[4]))	{
			batchControlCorrectFields[4] = true;
			addCorrect(fields[4]);
		}
		else 	{
			batchControlCorrectFields[4] = false;
			addIncorrect(fields[4]);
		}
		//field 5
		if (Pattern.matches("\\d{12}", fields[5]) && Integer.parseInt(fields[5]) == ttlDebit)	{
			batchControlCorrectFields[5] = true;
			addCorrect(fields[5]);
		}
		else 	{
			batchControlCorrectFields[5] = false;
			addIncorrect(fields[5]);
		}
		//field 6
		if (Pattern.matches("\\d{12}", fields[6]) && Integer.parseInt(fields[6]) == ttlCredit)	{
			batchControlCorrectFields[6] = true;
			addCorrect(fields[6]);
		}
		else 	{
			batchControlCorrectFields[6] = false;
			addIncorrect(fields[6]);
		}
		//field 7
		if (fields[7].equals(VerifyBatch.getElement(5)))	{
			batchControlCorrectFields[7] = true;
			addCorrect(fields[7]);
		}
		else 	{
			batchControlCorrectFields[7] = false;
			addIncorrect(fields[7]);
		}
		//field 8
		if (Pattern.matches("[\\w\\d\\s]{19}", fields[8]))	{
			batchControlCorrectFields[8] = true;
			addCorrect(fields[8]);
		}
		else 	{
			batchControlCorrectFields[8] = false;
			addIncorrect(fields[8]);
		}
		//field 9
		if (Pattern.matches("\\s{6}", fields[9]))	{
			batchControlCorrectFields[9] = true;
			addCorrect(fields[9]);
		}
		else 	{
			batchControlCorrectFields[9] = false;
			addIncorrect(fields[9]);
		}
		//field 10
		if (Pattern.matches("\\s{3}", fields[10]))	{
			batchControlCorrectFields[10] = true;
			addCorrect(fields[10]);
		}
		else 	{
			batchControlCorrectFields[10] = false;
			addIncorrect(fields[10]);
		}
		//field 11
		if (Pattern.matches("\\d{7}", fields[11]))	{
			batchControlCorrectFields[11] = true;
			addCorrect(fields[11]);
		}
		else 	{
			batchControlCorrectFields[11] = false;	
			addIncorrect(fields[11]);
		}
	}
	private static void addCorrect(String myAdd) {
		displayString += myAdd;	
	}
	private static void addIncorrect(String myAdd) {
		displayString += "<span class = 'incorrect'>"+myAdd+"</span>";	
	}
}
