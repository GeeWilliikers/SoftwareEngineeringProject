package SemesterProject.SemesterProject.controller;
import java.util.regex.*;

public class VerifyEntries {
	String Entries = "622101000019111111           00000000010200           JONES DESMOND           0101000010000001";
	String[] fields = new String[12];
	boolean[] CorrectEntryFields = new boolean[12];
	public static String displayString;
	
	public  VerifyEntries(String Entries) {
		displayString = "";
		this.Entries = "";
		this.Entries = Entries;
		
		int i = 0;
		

		fields[1] = this.Entries.substring(i, 1);
		i++;
		fields[2] = this.Entries.substring(i, 3);
		i+=2;
		fields[3] = this.Entries.substring(i, 11);
		i+=8;
		fields[4] = this.Entries.substring(i, 12);
		i++;
		fields[5] = this.Entries.substring(i, 29);
		i+=17;
		fields[6] = this.Entries.substring(i, 39);
		i+=10;
		fields[7] = this.Entries.substring(i, 54);
		i+=15;
		fields[8] = this.Entries.substring(i, 76);
		i+=22;
		fields[9] = this.Entries.substring(i, 78);
		i+=2;
		fields[10] = this.Entries.substring(i, 79);
		i++;
		fields[11] = this.Entries.substring(i, 94);
		CorrectEntryFields();
		
		
	}


		private void CorrectEntryFields(){
				//field 1
				if (fields[1].equals("6")) {
					CorrectEntryFields[1] = true;
					addCorrect(fields[1]);
				}
				else	{
					CorrectEntryFields[1] = false;
					addIncorrect(fields[1]);
				}
				if (Pattern.matches("\\d{2}", fields[2]))	{
					CorrectEntryFields[2] = true;
					addCorrect(fields[2]);
				}
				else	{
					CorrectEntryFields[2] = false;
					addIncorrect(fields[2]);
				}
				//field 3
				if (Pattern.matches("\\d{8}", fields[3]))	{
					addCorrect(fields[3]);
					CorrectEntryFields[3] = true;
				}
				else 	{
					CorrectEntryFields[3] = false;
					addIncorrect(fields[3]);
				}
				//field 4
				if (Pattern.matches("\\d", fields[4]))	{
					addCorrect(fields[4]);
					CorrectEntryFields[4] = true;
				}
				else 	{
					CorrectEntryFields[4] = false;
					addIncorrect(fields[4]);
				}
				//field 5
				if (Pattern.matches("\\w+\\s*", fields[5]))	{
					addCorrect(fields[5]);
					CorrectEntryFields[5] = true;
				}
				else 	{
					CorrectEntryFields[5] = false;
					addIncorrect(fields[5]);
				}
				//field 6      
				if (Pattern.matches("\\d{10}", fields[6]))	{
					addCorrect(fields[6]);
					CorrectEntryFields[6] = true;
				}
				else 	{
					CorrectEntryFields[6] = false;
					addIncorrect(fields[6]);
				}
				//field 7
				if (Pattern.matches("\\w+\\s*", fields[7]) || Pattern.matches("\\s{15}", fields[7]))	{
					addCorrect(fields[7]);
					CorrectEntryFields[7] = true;
				}
				else 	{
					CorrectEntryFields[7] = false;
					addIncorrect(fields[7]);
				}
				//field 8
				if (Pattern.matches("[\\w_\\s*]+", fields[8]))	{
					addCorrect(fields[8]);
					CorrectEntryFields[8] = true;
				}
				else 	{
					CorrectEntryFields[8] = false;
					addIncorrect(fields[8]);
				}
				//field 9
				if (Pattern.matches("  ", fields[9]) || Pattern.matches("\\s{2}", fields[9]))	{
					addCorrect(fields[9]);
					CorrectEntryFields[9] = true;
				}
				else 	{
					CorrectEntryFields[9] = false;
					addIncorrect(fields[9]);
				}
				//field 10
				if (Pattern.matches("\\d", fields[10]))	{
					addCorrect(fields[10]);
					CorrectEntryFields[10] = true;
				}
				else 	{
					CorrectEntryFields[10] = false;
					addIncorrect(fields[10]);
				}
				//field 11
				if (Pattern.matches("\\d{15}", fields[11]))	{
					addCorrect(fields[11]);
					CorrectEntryFields[11] = true;
				}
				else 	{
					CorrectEntryFields[11] = false;
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