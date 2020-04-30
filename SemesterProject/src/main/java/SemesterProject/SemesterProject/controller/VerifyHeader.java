package SemesterProject.SemesterProject.controller;
import java.util.regex.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class VerifyHeader {
	String headerText;
	//array fields will start at index one and correspond to field 1, field 2 = index 2, field 3 = index 3, etc
	public String fields[] = new String[14];
	public boolean correctFields[] = new boolean[14];
	public static String displayString;
	
	public VerifyHeader(String headerText)
	{
		displayString = "";
		this.headerText = headerText;
		
		//shows where we are in the string
		int j = 0;
		//j will walk through the entire headerText and isolate each field
		//field 1
		fields[1] = headerText.substring(j++,1);
		//field 2
		fields[2] = headerText.substring(j,3);
		j+=2;
		//field 3
		fields[3] = headerText.substring(j,13);
		j+=10;
		//field 4 waiting on professor to verify
		fields[4] = headerText.substring(j,23);
		j+=10;
		//field 5
		fields[5] = headerText.substring(j,29);
		j+=6;
		//field 6 optional so additional logic needed
		fields[6] = headerText.substring(j,33);
		j+=4;
		//field 7
		fields[7] = headerText.substring(j, 34);
		j++;
		//field 8
		fields[8] = headerText.substring(j, 37);
		j+=3;
		//field 9
		fields[9] = headerText.substring(j,39);
		j+=2;
		//field 10
		fields[10] = headerText.substring(j,40);
		j++;
		//field 11
		fields[11] = headerText.substring(j,63);
		j+=23;
		//field 12
		fields[12] = headerText.substring(j,86);
		j+=23;
		//field 13
		fields[13] = headerText.substring(j,94);
		initCorrectFields();
	}
	
	private void initCorrectFields()
	{
		//field 1
		if(fields[1].equals("1"))	{
			correctFields[1] = true;
			addCorrect(fields[1]);
		}
		else	{
			correctFields[1] = false;
			addIncorrect(fields[1]);
		}
		//field 2
		if(fields[2].equals("01"))	{
			correctFields[2] = true;
			addCorrect(fields[2]);
		}
		else	{
			correctFields[2] = false;
			addIncorrect(fields[2]);
		}
		//field 3
		if(fields[3].equals(" 101000019"))	{
			correctFields[3] = true;
			addCorrect(fields[3]);
		}
		else	{
			correctFields[3] = false;
			addIncorrect(fields[3]);
		}
		//field 4
		if(Pattern.matches("\\s[0-9]{9}", fields[4]))	{
			correctFields[4] = true;
			addCorrect(fields[4]);
		}
		else	{
			correctFields[4] = false;
			addIncorrect(fields[4]);
		}
		//field 5
		try {
            LocalDate.parse(fields[5], DateTimeFormatter.ofPattern("yyMMdd"));
            correctFields[5] = true;
            addCorrect(fields[5]);
        } catch (DateTimeParseException e) {
            correctFields[5] = false;
			addIncorrect(fields[5]);
        }
		//field 6
		if(Pattern.matches("\\s{4}", fields[6]))	{	//if field 6 is not listed
			correctFields[6] = true;
			addCorrect(fields[6]);
		}
		else if (Pattern.matches("([01]?[0-9]|2[0-3])[0-5][0-9]", fields[6]))	{
			correctFields[6] = true;
			addCorrect(fields[6]);
		}
		else	{
			correctFields[6] = false;
			addIncorrect(fields[6]);
		}
			
		
		//field 7
		if(Pattern.matches("[A-Z]", fields[7]) || Pattern.matches("\\d", fields[7]) )	{
			correctFields[7] = true;
			addCorrect(fields[7]);
		}
		else	{
			correctFields[7] = false;
			addIncorrect(fields[7]);
		}
		//field 8
		if(fields[8].equals("094"))	{
			correctFields[8] = true;
			addCorrect(fields[8]);
		}
		else	{
			correctFields[8] = false;
			addIncorrect(fields[8]);
		}
		//field 9
		if(fields[9].equals("10"))	{
			correctFields[9] = true;
			addCorrect(fields[9]);
		}
		else	{
			correctFields[9] = false;
			addIncorrect(fields[9]);
		}
		//field 10
		if(fields[10].contentEquals("1"))	{
			correctFields[10] = true;
			addCorrect(fields[10]);
		}
		else	{
			correctFields[10] = false;
			addIncorrect(fields[10]);
		}
		//fields 11
		if(fields[11].equals("Testing1 Bank          ") || Pattern.matches("\\s{23}", fields[11])) 	{
			correctFields[11]= true;
			addCorrect(fields[11]);
		}
		else	{
			correctFields[11] = false;
			addIncorrect(fields[11]);
		}
		//field 12
		correctFields[12] = true;	//company name, so it can be anything, no need to validate
		addCorrect(fields[12]);
		//field 13
		correctFields[13] = true;	//no stipulations given for field 13 so it can be anything
		addCorrect(fields[13]);
	}
	private static void addCorrect(String myAdd) {
		displayString += myAdd;	
	}
	private static void addIncorrect(String myAdd) {
		displayString += "<span class = 'incorrect'>"+myAdd+"</span>";	
	}

}
