<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset="utf-8">
		<title>Commerce Bank Validation Tool</title>
		
		
		<style media="screen">
		
		#FileContents	{
			white-space: pre; 
		}
		
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
		
		.incorrect{
			color: #FF0000;
		}
		
		#clear {
		stroke-width: "1";
		stroke: "black";
		}
		</style>
</head>
<body>

	<h1>A Team Commerce Bank Project</h1>
        <p><b>NACHA Validation Tool</b></p>
    <form action ="upload" method ="post" enctype="multipart/form-data">
    
		<input type="file" id="openFile" name="file" >
		<button type="submit" id="validate" value="upload file" >Validate</button>
		<input type="button" id="cancel" value="Cancel" />
	</form>
	<p id="FileContents" rows="35" cols="95">${displayString}</p>
	
	<!-- button for sending test parameters -->

	<div id="messageBox">					Message Box</div>
	<p id="messageTextBox">   THIS IS WHERE THE MESSAGES WILL GO.  </p>
	<div id="messageBox1">					Company Specification/File Details</div>	
	
	<!-- Chris code goes here -->
<svg width="90" height="40">
	<rect width="90" height="40" fill="white" stroke-width="2" stroke="black"/>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="24" y="15">Immediate</text>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="19" y="30">Destination</text>
</svg>
<svg width="130" height="40">
	<rect width="120" height="40" fill="white" stroke-width="1" stroke="black"/>
	<!-- TODO: get text from file and turn red if error -->
	<text fill="000000" font-size="15" font-family="Times New Roman" x="1" y="23">${immediateDestination }</text>
</svg>
<svg width="90" height="40">
	<rect width="90" height="40" fill="white" stroke-width="2" stroke="black"/>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="24" y="15">Immediate</text>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="49" y="30">Origin</text>
</svg>
<svg width="130" height="40">
	<rect width="120" height="40" fill="white" stroke-width="1" stroke="black"/>
	<!-- TODO: get text from file and turn red if error -->
	<text fill="000000" font-size="15" font-family="Times New Roman" x="1" y="23">${immediateOrigin}</text>
</svg>
<svg width="90" height="40">
	<rect width="90" height="40" fill="white" stroke-width="2" stroke="black"/>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="24" y="15">Immediate</text>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="9" y="30">Origin Name</text>
</svg>
<svg width="230" height="40">
	<rect width="230" height="40" fill="white" stroke-width="1" stroke="black"/>
	<!-- TODO: get text from file and turn red if error -->
	<text fill="000000" font-size="15" font-family="Times New Roman" x="1" y="23">${immediateOriginName }</text>
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
	<text fill="000000" font-size="15" font-family="Times New Roman" x="1" y="23">${companyName }</text>
</svg>
<svg width="90" height="40">
	<rect width="90" height="40" fill="white" stroke-width="2" stroke="black"/>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="29" y="15">Company</text>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="70" y="30">ID</text>
</svg>
<svg width="130" height="40">
	<rect width="130" height="40" fill="white" stroke-width="1" stroke="black"/>
	<!-- TODO: get text from file and turn red if error -->
	<text fill="000000" font-size="15" font-family="Times New Roman" x="1" y="23">${bhCompanyID }</text>
</svg>
<svg width="90" height="40">
	<rect width="90" height="40" fill="white" stroke-width="2" stroke="black"/>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="33" y="15">Effective</text>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="59" y="30">Date</text>
</svg>
<svg width="130" height="40">
	<rect width="130" height="40" fill="white" stroke-width="1" stroke="black"/>
	<!-- TODO: get text from file and turn red if error -->
	<text fill="000000" font-size="15" font-family="Times New Roman" x="1" y="23">${effectiveDate }</text>
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
	<text fill="000000" font-size="15" font-family="Times New Roman" x="1" y="23">${bcEntryAddendaCount }</text>
</svg>
<svg width="110" height="40">
	<rect width="110" height="40" fill="white" stroke-width="2" stroke="black"/>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="20" y="23">Entry Hash</text>
</svg>
<svg width="143" height="40">
	<rect width="143" height="40" fill="white" stroke-width="1" stroke="black"/>
	<!-- TODO: get text from file and turn red if error -->
	<text fill="000000" font-size="15" font-family="Times New Roman" x="1" y="23">${bcEntryHash }</text>
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
	<text fill="000000" font-size="15" font-family="Times New Roman" x="1" y="23">$${bcTTLDebitEntryAmount }</text>
</svg>
<svg width="110" height="40">
	<rect width="110" height="40" fill="white" stroke-width="2" stroke="black"/>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="5" y="15">TTL Credit</text>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="5" y="30">Entry $-Amount</text>
</svg>
<svg width="143" height="40">
	<rect width="143" height="40" fill="white" stroke-width="1" stroke="black"/>
	<!-- TODO: get text from file and turn red if error -->
	<text fill="000000" font-size="15" font-family="Times New Roman" x="1" y="23">$${bcTTLCreditEntryAmount }</text>
</svg>
<svg width="110" height="40">
	<rect width="110" height="40" fill="white" stroke-width="2" stroke="black"/>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="48" y="15">Company</text>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="90" y="30">ID</text>
</svg>
<svg width="143" height="40">
	<rect width="143" height="40" fill="white" stroke-width="1" stroke="black"/>
	<!-- TODO: get text from file and turn red if error -->
	<text fill="000000" font-size="15" font-family="Times New Roman" x="1" y="23">${bcCompanyID }</text>
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
	<text fill="000000" font-size="15" font-family="Times New Roman" x="1" y="23">${fcEntryAddendaCount }</text>
</svg>
<svg width="110" height="40">
	<rect width="110" height="40" fill="white" stroke-width="2" stroke="black"/>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="20" y="23">Entry Hash</text>
</svg>
<svg width="143" height="40">
	<rect width="143" height="40" fill="white" stroke-width="1" stroke="black"/>
	<!-- TODO: get text from file and turn red if error -->
	<text fill="000000" font-size="15" font-family="Times New Roman" x="1" y="23">${fcEntryHash }</text>
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
	<text fill="000000" font-size="15" font-family="Times New Roman" x="1" y="23">$${fcTTLDebitEntryAmount }</text>
</svg>
<svg width="110" height="40">
	<rect width="110" height="40" fill="white" stroke-width="2" stroke="black"/>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="5" y="15">TTL Credit</text>
	<text fill="000000" font-size="15" font-family="Times New Roman" x="5" y="30">Entry $-Amount</text>
</svg>
<svg width="143" height="40">
	<rect width="143" height="40" fill="white" stroke-width="1" stroke="black"/>
	<!-- TODO: get text from file and turn red if error -->
	<text fill="000000" font-size="15" font-family="Times New Roman" x="1" y="23">$${fcTTLCreditEntryAmount }</text>
</svg>
	<script type="text/javascript">
		/*This does not currently work
		var boxErrors = [];
		<c:forEach var="error" items="${boxErrors}">
			errorObj = '${error}';
			boxErrors.push(errorObj);                                  
		</c:forEach>
		document.getElementById("testing array").innerHTML = boxErrors[0];
		*/
		document.getElementById("openFile").addEventListener('change', function(){
			var fr = new FileReader();
				fr.onload = function(){
				document.getElementById("FileContents").textContent = this.result;
				}
			fr.readAsText(this.files[0]);
	})
		document.addEventListener("DOMContentLoaded", function(){
   			console.log(${errors[0]});
		});
	</script>
	<br>
	
</body>
</html>