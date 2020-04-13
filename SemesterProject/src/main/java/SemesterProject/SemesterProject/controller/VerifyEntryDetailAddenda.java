import java.util.regex.*;

public class VerifyEntryDetailAddenda {
	String entryDetailAddendaText;
	String[] fields = new String[6];
	boolean[] entryDetailAddendaCorrect = new boolean[6];
	
	public VerifyEntryDetailAddenda(String entryDetailAddendaText) {
		this.entryDetailAddendaText = entryDetailAddendaText;
		
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
		if (fields[1].equals("7"))
			entryDetailAddendaCorrect[1] = true;
		else
			entryDetailAddendaCorrect[1] = false;
		//field 2
		if (fields[2].equals("05"))
			entryDetailAddendaCorrect[2] = true;
		else
			entryDetailAddendaCorrect[2] = false;
		//field 3
		if (Pattern.matches("[A-Z0-9\\*\\\\]", fields[3]))
			entryDetailAddendaCorrect[3] = true;
		else 
			entryDetailAddendaCorrect[3] = false;
		//field 4
		if (Pattern.matches("[0-9]", fields[4]))
			entryDetailAddendaCorrect[4] = true;
		else 
			entryDetailAddendaCorrect[4] = false;
		//field 5
		if (Pattern.matches("[0-9]", fields[5]))
			entryDetailAddendaCorrect[5] = true;
		else 
			entryDetailAddendaCorrect[5] = false;
	}
}
