<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset="utf-8">
		<title>Commerce Bank Validation Tool</title>
		
		<style media="screen">
		#openFile, #validate, #cancel, #messageBox {
			padding: 10px;
			color: white;
			background-color: #006400;
			border: 1px solid #000;
			border-radius: 5px;
			cursor: pointer;
		}
		
		#validate, #cancel {
			padding: 13px;
			color: white;
			background-color: #006400;
			border: 1px solid #000;
			border-radius: 5px;
			cursor: pointer;
			width: 200px;
		}
		
		#openFile: hover {
			background-color: #00b28f;
		}
		
		#openFile, #validate, #cancel {
		margin-left:1px;
		font-family: sans-serif;
		color: #aaa;
		}
		</style>
</head>
<body>

	<img src="commerce-bank-logo-2x.png" alt="Commerce logo">
	<h1>A Team Commerce Bank Project</h1>
        <p><b>NACHA Validation Tool</b></p>
	<input type="file" id="openFile" />
	<input type="button" id="validate" value="Validate File" />
	<input type="button" id="cancel" value="Cancel" />
	<br>
	
	<textarea id="FileContents" rows="35" cols="95"></textarea>
	
	<div id="messageBox1" align="center">Message Box</div>

	<p id="messageTextBox" align="center">This is where Error message will appear. </p>

	<div id="messageBox2" align="center">Company Specification/ File Details</div>	
	
	<!-- Chris code goes here -->
	
	<script type="text/javascript">
	<!-- This gets the element on the page, when the button is clicked, calls function to display onto screen -->
		document.getElementById("openFile").addEventListener('change', function(){
			var fr = new FileReader();
				fr.onload = function(){
				document.getElementById("FileContents").textContent = this.result;
				}
			fr.readAsText(this.files[0]);
	})
	
<!--Make Validate button work -->
	    document.getElementById("validate").addEventListener('change', function(){
	    	
	    	var validateText = "Validate button has been hit. Errors will appear here."
	   
		  document.getElementById("messageTextBox").textContent = validateText;
	 })
	  
	</script>
</body>
</html>