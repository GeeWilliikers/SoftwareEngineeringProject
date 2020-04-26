import java.util.regex.*;

public class VerifyControlRecord {
	String controlRecordText;
	String[] fields = new String[9];
	boolean[] controlRecordCorrect = new boolean[9];
	
	public VerifyControlRecord(String controlRecordText) {
		int j = 1;
		
		fields[1] = controlRecordText.substring(j, j);
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
		if (fields[1].equals("9"))
			controlRecordCorrect[1] = true;
		else
			controlRecordCorrect[1] = false;
		
		if (Pattern.matches("\\d{6}", fields[2]))
			controlRecordCorrect[2] = true;
		else
			controlRecordCorrect[2] = false;
		
		if (Pattern.matches("\\d{6}", fields[3]))
			controlRecordCorrect[3] = true;
		else
			controlRecordCorrect[3] = false;
		
		if (Pattern.matches("\\d{8}", fields[4]))
			controlRecordCorrect[4] = true;
		else
			controlRecordCorrect[4] = false;
		
		if (Pattern.matches("\\d{10}", fields[5]))
			controlRecordCorrect[5] = true;
		else
			controlRecordCorrect[5] = false;
		
		if (Pattern.matches("\\d{12}", fields[6]))
			controlRecordCorrect[6] = true;
		else
			controlRecordCorrect[6] = false;
		
		if (Pattern.matches("\\d{12}", fields[7]))
			controlRecordCorrect[7] = true;
		else
			controlRecordCorrect[7] = false;
		
		if (Pattern.matches("\\s{39}", fields[8]))
			controlRecordCorrect[8] = true;
		else
			controlRecordCorrect[8] = false;
	}
}
