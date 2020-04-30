package SemesterProject.SemesterProject.controller;
import java.util.regex.*;

public class VerifyBatch {
	String batchText = "5220STRAWBERRYFIELDS                    8675307521PPDPAYROLL   191004191004   1101000010000001";
	static String[] fields = new String[14];
	boolean[] batchCorrectFields = new boolean[14];
	public static String displayString;
	
	public static String getElement(int i) {
		return fields[i];
	}
	
	public VerifyBatch(String batchText) {
		this.batchText = batchText;
		displayString = "";
		
		//field
		int j = 0;
		
		fields[1] = batchText.substring(j, 1);
		j++;
		fields[2] = batchText.substring(j, 4);
		j+=3;
		fields[3] = batchText.substring(j, 20);
		j+=16;
		fields[4] = batchText.substring(j, 40);
		j+=20;
		fields[5] = batchText.substring(j, 50);
		j+=10;
		fields[6] = batchText.substring(j, 53);
		j+=3;
		fields[7] = batchText.substring(j, 63);
		j+=10;
		fields[8] = batchText.substring(j, 69);
		j+=6;
		fields[9] = batchText.substring(j, 75);
		j+=6;
		fields[10] = batchText.substring(j, 78);
		j+=3;
		fields[11] = batchText.substring(j, 79);
		j++;
		fields[12] = batchText.substring(j, 87);
		j+=8;
		fields[13] = batchText.substring(j, 94);
		batchCorrectFields();
	}
	
	private void batchCorrectFields() {
		//field 1
		if (fields[1].equals("5"))	{
			batchCorrectFields[1] = true;
			addCorrect(fields[1]);
		}
		else	{
			batchCorrectFields[1] = false;
			addIncorrect(fields[1]);
		}
		//field 2
		if (Pattern.matches("\\d{3}", fields[2]))	{
			batchCorrectFields[2] = true;
			addCorrect(fields[2]);
		}
		else	{
			batchCorrectFields[2] = false;
			addIncorrect(fields[2]);
		}
		//field 3
		if (Pattern.matches("[\\w_\\d_\\s]{16}", fields[3]))	{
			batchCorrectFields[3] = true;
			addCorrect(fields[3]);
		}
		else 	{
			batchCorrectFields[3] = false;
			addIncorrect(fields[3]);
		}
		//field 4
		if (Pattern.matches("\\w\\d\\s{20}", fields[4]))	{
			batchCorrectFields[4] = true;
			addCorrect(fields[4]);
		}
		else 	{
			batchCorrectFields[4] = false;
			addIncorrect(fields[4]);
		}
		//field 5
		if (Pattern.matches("\\d{10}", fields[5]))	{
			batchCorrectFields[5] = true;
			addCorrect(fields[5]);
		}
		else 	{
			batchCorrectFields[5] = false;
			addIncorrect(fields[5]);
		}
		//field 6
		if (Pattern.matches("[\\w_\\d]{3}", fields[6]))	{
			batchCorrectFields[6] = true;
			addCorrect(fields[6]);
		}
		else 	{
			batchCorrectFields[6] = false;
			addIncorrect(fields[6]);
		}
		//field 7
		if (Pattern.matches("[\\w_\\d_\\s]{10}", fields[7]))	{
			batchCorrectFields[7] = true;
			addCorrect(fields[7]);
		}
		else 	{
			batchCorrectFields[7] = false;
			addIncorrect(fields[7]);
		}
		//field 8
		if (Pattern.matches("[\\w_\\d_\\s]{6}", fields[8]))	{
			batchCorrectFields[8] = true;
			addCorrect(fields[8]);
		}
		else 	{
			batchCorrectFields[8] = false;
			addIncorrect(fields[8]);
		}
		//field 9
		if (Pattern.matches("\\d{6}", fields[9]))	{
			batchCorrectFields[9] = true;
			addCorrect(fields[9]);
		}
		else 	{
			batchCorrectFields[9] = false;
			addIncorrect(fields[9]);
		}
		//field 10
		if (Pattern.matches("\\s{3}", fields[10]))	{
			batchCorrectFields[10] = true;
			addCorrect(fields[10]);
		}
		else 	{
			batchCorrectFields[10] = false;
			addIncorrect(fields[10]);
		}
		//field 11
		if (fields[11].equals("1"))	{
			batchCorrectFields[11] = true;
			addCorrect(fields[11]);
		}
		else 	{
			batchCorrectFields[11] = false;
			addIncorrect(fields[11]);
		}
		//field 12
		if (Pattern.matches("\\s{8}", fields[12]))	{
			batchCorrectFields[12] = true;
			addCorrect(fields[12]);
		}
		else 	{
			batchCorrectFields[12] = false;
			addIncorrect(fields[12]);
		}
		//field 13
		if (Pattern.matches("\\d{7}", fields[13]))	{
			batchCorrectFields[13] = true;
			addCorrect(fields[13]);
		}
		else 	{
			batchCorrectFields[13] = false;	
			addIncorrect(fields[13]);
		}	
	}
	private static void addCorrect(String myAdd) {
		displayString += myAdd;	
	}
	private static void addIncorrect(String myAdd) {
		displayString += "<span class = 'incorrect'>"+myAdd+"</span>";	
	}
}
