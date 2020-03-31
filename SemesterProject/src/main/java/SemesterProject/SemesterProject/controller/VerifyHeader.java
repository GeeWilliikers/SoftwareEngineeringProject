package SemesterProject.SemesterProject.controller;

public class VerifyHeader {
	String headerText;
	//array fields will start at index one and correspond to field 1, field 2 = index 2, field 3 = index 3, etc
	String fields[] = new String[14];
	boolean correctFields[] = new boolean[14];
	
	public VerifyHeader(String headerText)
	{
		this.headerText = headerText;
		int headerLength = headerText.length(); 
		int containsf6[] = {63,40,48,86,94,71}; //an array containing all lengths of header that would have field 6
		int notContainsf6[] = {59,36,44,82,90,67};
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
		for(int i =0; i < containsf6.length;i++)
		{
			//if the length verifies that the header does contain f6
			if(headerLength == containsf6[i])
			{
				fields[6] = headerText.substring(j,33);
				j+=4;
				break;
			}
			//if the length verifies that the header does not contain f6
			else if(headerLength == notContainsf6[i])
			{
				fields[6] = "";
				break;
			}
			//length of header is invalid
			if(i == containsf6.length -1)
				fields[6] = "error in the length of the header";
		}
		//field 7
		fields[7] = headerText.substring(j, j+1);
		j++;
		//field 8
		fields[8] = headerText.substring(j, j+3);
		j+=3;
		//field 9
		fields[9] = headerText.substring(j,j+2);
		j+=2;
		//field 10
		fields[10] = headerText.substring(j,j+1);
		j++;
		//field 11
		if(headerText.length() > j && headerText.substring(j,j+23).equals("Commerce Bank           "))
			{
				fields[11] = headerText.substring(j,j+23);
				j+=23;
			}
		//field 12
		if(headerLength >j+9)	//use j+9 because if it was +8 it could be field 13 next not field 12
		{
			fields[12] = headerText.substring(j,j+23);
			j+=23;
		}
		//field 13
		if(headerLength >j)
		{
			fields[13] = headerText.substring(j,j+8);
			j+=8;
		}
	}

}
