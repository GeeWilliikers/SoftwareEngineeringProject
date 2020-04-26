<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset="utf-8">
		<title>Commerce Bank Validation Tool</title>
		
		<style media="screen">
		#openFile, #validate, #cancel {
			padding: 10px;
			color: white;
			background-color: #006400;
			border: 1px solid #000;
			border-radius: 5px;
			cursor: pointer;
		}
		
		#cancel: hover {
			background-color: white;
			color: #006400;
			
		
		}
		
		#messageBox {
			text-align: center;
			width: 760px;
			padding: 10px;
			color: white;
			background-color: #006400;
			border: 1px solid #000;
			border-radius: 5px;
		
		}
		
		#messageBox1 {
			text-align: center;
			width: 760px;
			padding: 10px;
			color: white;
			background-color: #006400;
			border: 1px solid #000;
			border-radius: 5px;
		
		}
		
		#validate, #cancel {
			padding: 13px;
			color: white;
			background-color: #006400;
			border: 1px solid #000;
			border-radius: 5px;
			cursor: pointer;
		}
		
		#openFile: hover {
			background-color: #00b28f;
		}
		
		#openFile, #validate, #cancel {
		margin-left:1px;
		font-family: sans-serif;
		color: #aaa;
		}
		
		#clear {
		stroke-width: "1";
		stroke: "black";
		}
		</style>
</head>
<body>

	<img src="commerce-bank-logo-2x.png" alt="Commerce logo">
	<h1>A Team Commerce Bank Project</h1>
        <p><b>NACHA Validation Tool</b></p>
	<input type="file" id="openFile" />
	<input type="button" id="validate" onclick = "myFunction()" value="Validate File" />
	
	<input type="button" id="cancel" onclick = "window.location.reload()" value="Cancel" />
	<br>
	
	
	
	<textarea id="FileContents" rows="35" cols="95"></textarea>
	
	<div id="messageBox">					Message Box</div>

	<p id="messageTextBox">   THIS IS WHERE THE MESSAGES WILL GO.  </p>


	<div id="messageBox1">					Company Specification/File Details</div>	
	
	<!-- Chris code goes here -->
<svg width=230" height="20">
	<rect width="230" height="20" fill="white" stroke-width="2" stroke="black"/>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="15" y="15">FILE HEADER RECORD</text>
</svg>
<br/>
<svg width="90" height="40">
	<rect width="90" height="40" fill="white" stroke-width="2" stroke="black"/>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="24" y="15">Immediate</text>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="19" y="30">Destination</text>
</svg>
<svg width="130" height="40">
	<rect id="id1" width="120" height="40" fill="white" stroke-width="1" stroke="black"/>
	<!-- TODO: get text from file and turn red if error -->
	<text fill="000000" font-size="15" font-family="Times New Roman" x="48" y="23">101000019</text>
</svg>
<svg width="90" height="40">
	<rect width="90" height="40" fill="white" stroke-width="2" stroke="black"/>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="24" y="15">Immediate</text>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="49" y="30">Origin</text>
</svg>
<svg width="130" height="40">
	<rect width="120" height="40" fill="white" stroke-width="1" stroke="black"/>
	<!-- TODO: get text from file and turn red if error -->
	<text fill="000000" font-size="15" font-family="Times New Roman" x="48" y="23">741258964</text>
</svg>
<svg width="90" height="40">
	<rect width="90" height="40" fill="white" stroke-width="2" stroke="black"/>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="24" y="15">Immediate</text>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="9" y="30">Origin Name</text>
</svg>
<svg width="230" height="40">
	<rect width="230" height="40" fill="white" stroke-width="1" stroke="black"/>
	<!-- TODO: get text from file and turn red if error -->
	<text fill="000000" font-size="15" font-family="Times New Roman" x="8" y="23">THE FAB FOUR CORP</text>
</svg>
<br/>
<br/>
<svg width="230" height="20">
	<rect width="230" height="20" fill="white" stroke-width="2" stroke="black"/>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="15" y="15">BATCH HEADER RECORD</text>
</svg>
<br/>
<svg width="80" height="40">
	<rect width="80" height="40" fill="white" stroke-width="2" stroke="black"/>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="19" y="15">Company</text>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="40" y="30">Name</text>
</svg>
<svg width="240" height="40">
	<rect width="240" height="40" fill="white" stroke-width="1" stroke="black"/>
	<!-- TODO: get text from file and turn red if error -->
	<text fill="000000" font-size="15" font-family="Times New Roman" x="10" y="23">STRAWBERRYFIELDS</text>
</svg>
<svg width="90" height="40">
	<rect width="90" height="40" fill="white" stroke-width="2" stroke="black"/>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="29" y="15">Company</text>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="70" y="30">ID</text>
</svg>
<svg width="130" height="40">
	<rect width="130" height="40" fill="white" stroke-width="1" stroke="black"/>
	<!-- TODO: get text from file and turn red if error -->
	<text fill="000000" font-size="15" font-family="Times New Roman" x="60" y="23">741258964</text>
</svg>
<svg width="90" height="40">
	<rect width="90" height="40" fill="white" stroke-width="2" stroke="black"/>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="33" y="15">Effective</text>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="59" y="30">Date</text>
</svg>
<svg width="130" height="40">
	<rect width="130" height="40" fill="white" stroke-width="1" stroke="black"/>
	<!-- TODO: get text from file and turn red if error -->
	<text fill="000000" font-size="15" font-family="Times New Roman" x="60" y="23">10/31/2019</text>
</svg>
<br/>
<br/>
<svg width=230" height="20">
	<rect width="230" height="20" fill="white" stroke-width="2" stroke="black"/>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="15" y="15">BATCH CONTROL RECORD</text>
</svg>
<br/>
<svg width="110" height="40">
	<rect width="110" height="40" fill="white" stroke-width="2" stroke="black"/>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="16" y="15">Entry/Addenda</text>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="70" y="30">Count</text>
</svg>
<svg width="143" height="40">
	<rect width="143" height="40" fill="white" stroke-width="1" stroke="black"/>
	<!-- TODO: get text from file and turn red if error -->
	<text fill="000000" font-size="15" font-family="Times New Roman" x="100" y="23">18</text>
</svg>
<svg width="110" height="40">
	<rect width="110" height="40" fill="white" stroke-width="2" stroke="black"/>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="20" y="23">Entry Hash</text>
</svg>
<svg width="143" height="40">
	<rect width="143" height="40" fill="white" stroke-width="1" stroke="black"/>
	<!-- TODO: get text from file and turn red if error -->
	<text fill="000000" font-size="15" font-family="Times New Roman" x="42" y="23">0181800018</text>
</svg>
<br/>
<svg width="110" height="40">
	<rect width="110" height="40" fill="white" stroke-width="2" stroke="black"/>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="5" y="15">TTL Debit Entry</text>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="45" y="30">$-Amount</text>
</svg>
<svg width="143" height="40">
	<rect width="143" height="40" fill="white" stroke-width="1" stroke="black"/>
	<!-- TODO: get text from file and turn red if error -->
	<text fill="000000" font-size="15" font-family="Times New Roman" x="85" y="23">$0.00</text>
</svg>
<svg width="110" height="40">
	<rect width="110" height="40" fill="white" stroke-width="2" stroke="black"/>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="5" y="15">TTL Credit</text>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="5" y="30">Entry $-Amount</text>
</svg>
<svg width="143" height="40">
	<rect width="143" height="40" fill="white" stroke-width="1" stroke="black"/>
	<!-- TODO: get text from file and turn red if error -->
	<text fill="000000" font-size="15" font-family="Times New Roman" x="85" y="23">$0.83</text>
</svg>
<svg width="110" height="40">
	<rect width="110" height="40" fill="white" stroke-width="2" stroke="black"/>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="48" y="15">Company</text>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="90" y="30">ID</text>
</svg>
<svg width="143" height="40">
	<rect width="143" height="40" fill="white" stroke-width="1" stroke="black"/>
	<!-- TODO: get text from file and turn red if error -->
	<text fill="000000" font-size="15" font-family="Times New Roman" x="50" y="23">741258964</text>
</svg>
<br/>
<br/>
<svg width=230" height="20">
	<rect width="230" height="20" fill="white" stroke-width="2" stroke="black"/>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="15" y="15">FILE CONTROL RECORD</text>
</svg>
<br/>
<svg width="110" height="40">
	<rect width="110" height="40" fill="white" stroke-width="2" stroke="black"/>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="16" y="15">Entry/Addenda</text>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="70" y="30">Count</text>
</svg>
<svg width="143" height="40">
	<rect width="143" height="40" fill="white" stroke-width="1" stroke="black"/>
	<!-- TODO: get text from file and turn red if error -->
	<text fill="000000" font-size="15" font-family="Times New Roman" x="100" y="23">18</text>
</svg>
<svg width="110" height="40">
	<rect width="110" height="40" fill="white" stroke-width="2" stroke="black"/>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="20" y="23">Entry Hash</text>
</svg>
<svg width="143" height="40">
	<rect width="143" height="40" fill="white" stroke-width="1" stroke="black"/>
	<!-- TODO: get text from file and turn red if error -->
	<text fill="000000" font-size="15" font-family="Times New Roman" x="42" y="23">0181800018</text>
</svg>
<br/>
<svg width="110" height="40">
	<rect width="110" height="40" fill="white" stroke-width="2" stroke="black"/>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="5" y="15">TTL Debit Entry</text>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="45" y="30">$-Amount</text>
</svg>
<svg width="143" height="40">
	<rect width="143" height="40" fill="white" stroke-width="1" stroke="black"/>
	<!-- TODO: get text from file and turn red if error -->
	<text fill="000000" font-size="15" font-family="Times New Roman" x="85" y="23">$0.00</text>
</svg>
<svg width="110" height="40">
	<rect width="110" height="40" fill="white" stroke-width="2" stroke="black"/>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="5" y="15">TTL Credit</text>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="5" y="30">Entry $-Amount</text>
</svg>
<svg width="143" height="40">
	<rect width="143" height="40" fill="white" stroke-width="1" stroke="black"/>
	<!-- TODO: get text from file and turn red if error -->
	<text fill="000000" font-size="15" font-family="Times New Roman" x="85" y="23">$0.83</text>
</svg>
	
	<script type="text/javascript">
	<!-- This gets the element on the page, when the button is clicked, calls function to display onto screen -->'
	document.getElementById("openFile").addEventListener('change', function(){
		var fr = new FileReader();
			fr.onload = function(){
			document.getElementById("FileContents").textContent = this.result;
			}
		fr.readAsText(this.files[0]);
})
	
//		<!-- put script to make Validate button "work" -->
		function myFunction() {
			document.getElementById("messageTextBox").innerHTML = "File Validation in Process...";
			document.getElementById("id1").stroke = "red";
			window.scrollTo(0, 500);
		}
//	    document.getElementById("validate").addEventListener('change', function(){
//	    	
//	    	var validateText = "Validate button has been hit. Errors will appear here."
//	   
//		  document.getElementById("messageTextBox").textContent = validateText;
//	 })
	  
	</script>
</body>
</html>