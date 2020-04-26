import java.util.regex.*;

public class VerifyBatchControl {
	String batchControlText;
	String[] fields = new String[12];
	boolean[] batchControlCorrectFields = new boolean[12];
	
	public VerifyBatchControl(String batchControlText) {
		this.batchControlText = batchControlText;
		
		//field
		int j = 1;
		
		fields[1] = batchControlText.substring(j, j);
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
		if (fields[1].equals("8"))
			batchControlCorrectFields[1] = true;
		else
			batchControlCorrectFields[1] = false;
		//field 2
		if (Pattern.matches("\\d{3}", fields[2]))
			batchControlCorrectFields[2] = true;
		else
			batchControlCorrectFields[2] = false;
		//field 3
		if (Pattern.matches("\\d{6}", fields[3]))
			batchControlCorrectFields[3] = true;
		else 
			batchControlCorrectFields[3] = false;
		//field 4
		if (Pattern.matches("\\d{10}", fields[4]))
			batchControlCorrectFields[4] = true;
		else 
			batchControlCorrectFields[4] = false;
		//field 5
		if (Pattern.matches("\\d{12}", fields[5]))
			batchControlCorrectFields[5] = true;
		else 
			batchControlCorrectFields[5] = false;
		//field 6
		if (Pattern.matches("\\d{12}", fields[6]))
			batchControlCorrectFields[6] = true;
		else 
			batchControlCorrectFields[6] = false;
		//field 7
		if (fields[7].equals(VerifyBatch.getElement(5)))
			batchControlCorrectFields[7] = true;
		else 
			batchControlCorrectFields[7] = false;
		//field 8
		if (Pattern.matches("[\\w\\d\\s]{19}", fields[8]))
			batchControlCorrectFields[8] = true;
		else 
			batchControlCorrectFields[8] = false;
		//field 9
		if (Pattern.matches("\\s{6}", fields[9]))
			batchControlCorrectFields[9] = true;
		else 
			batchControlCorrectFields[9] = false;
		//field 10
		if (Pattern.matches("\\s{3}", fields[10]))
			batchControlCorrectFields[10] = true;
		else 
			batchControlCorrectFields[10] = false;
		//field 11
		if (Pattern.matches("\\d{7}", fields[11]))
			batchControlCorrectFields[11] = true;
		else 
			batchControlCorrectFields[11] = false;	
	}
}
