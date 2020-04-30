package SemesterProject.SemesterProject.controller;
import java.util.regex.*;

public class VerifyEntryDetailAddenda {
	String entryDetailAddendaText;
	String[] fields = new String[6];
	boolean[] entryDetailAddendaCorrect = new boolean[6];
	public static String displayString;
	
	public VerifyEntryDetailAddenda(String entryDetailAddendaText) {
		this.entryDetailAddendaText = entryDetailAddendaText;
		displayString = "";
		
		int j = 1;
		
		fields[1] = entryDetailAddendaText.substring(j, j);
		j++;
		fields[2] = entryDetailAddendaText.substring(j, 3);
		j+=2;
		fields[3] = entryDetailAddendaText.substring(j, 83);
		j+=80;
		fields[4] = entryDetailAddendaText.substring(j, 87);
		j+=4;
		fields[5] = entryDetailAddendaText.substring(j, 94);
		EntryDetailAddendaCorrectFields();
	}
	
	private void EntryDetailAddendaCorrectFields() {
		//field 1
		if (fields[1].equals("7"))	{
			entryDetailAddendaCorrect[1] = true;
			addCorrect(fields[1]);
		}
		else	{
			entryDetailAddendaCorrect[1] = false;
			addIncorrect(fields[1]);
		}
		//field 2
		if (fields[2].equals("05"))	{
			entryDetailAddendaCorrect[2] = true;
			addCorrect(fields[2]);
		}
		else	{
			entryDetailAddendaCorrect[2] = false;
			addIncorrect(fields[2]);
		}
		//field 3
		if (Pattern.matches("[A-Z0-9\\*\\\\]{80}", fields[3]))	{
			entryDetailAddendaCorrect[3] = true;
			addCorrect(fields[3]);
		}
		else 	{
			entryDetailAddendaCorrect[3] = false;
			addIncorrect(fields[3]);
		}
		//field 4
		if (Pattern.matches("\\d{4}", fields[4]))	{
			entryDetailAddendaCorrect[4] = true;
			addCorrect(fields[4]);
		}
		else 	{
			entryDetailAddendaCorrect[4] = false;
			addIncorrect(fields[4]);
		}
		//field 5
		if (Pattern.matches("\\d{7}", fields[5]))	{
			entryDetailAddendaCorrect[5] = true;
			addCorrect(fields[5]);
		}
		else 	{
			entryDetailAddendaCorrect[5] = false;
			addIncorrect(fields[5]);
		}
	}
	private static void addCorrect(String myAdd) {
		displayString += myAdd;	
	}
	private static void addIncorrect(String myAdd) {
		displayString += "<span class = 'incorrect'>"+myAdd+"</span>";	
	}
}
