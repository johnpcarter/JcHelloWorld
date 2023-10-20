<META http-equiv='Content-Type' content='text/html; charset=UTF-8'>
<HTML>
  <HEAD>
	  <meta charset="utf-8">
	  <title>Hello World Documentation</title>
	  <base href="/HelloWorld">
	  <meta name="viewport" content="width=device-width, initial-scale=1">
	  <link rel="icon" type="image/x-icon" href="favicon.ico">

	  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">
	  <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
	  <link rel="stylesheet" href="/JcHelloWorld/styles.css">
	  <link rel="stylesheet" href="/JcHelloWorld/page.css">	  
  </HEAD>
  <BODY style="padding:10px">
		<div class="app-page" [class.example-is-mobile]="mobileQuery.matches">
		  <div class="mat-toolbar toolbar">
		    <div class="toolbar-content">
		    	<div class="toolbar-title-column">
		    		<img style="width: 117px" src="/JcHelloWorld/_images/wm.png"/>
		    		<h1>Documentation Center</h1>
		    	</div>
		    		<div class="toolbar-links">
		    			<a href="http://localhost:9072">Gateway</a>
		    		</div>
		    		<div class="toolbar-links">
		    			<a href="http://localhost:18101">Portal</a>
		    		</div>
		    		<div class="toolbar-links">
		    			<a href="http://localhost:5555">Services</a>
		    		</div>
		    	<div class="toolbar-right-column">
		    		<h1 style="color:white; vertical-align: top; line-height: 25px;margin-top:-5px">Software AG</h1>
		    		<div class="toolbar-links-right">
		        		
		    		</div>
		    	</div>
		    </div>
		  </div>
		  <div class="page-content">
		  	<h3>Hello World Services - Version 2.0</h3>
		  	Description of available services;
		  	<div>
		  		<h2><a href="/JcHelloWorld/4/helloWorld.html"><img src="/JcHelloWorld/_images/forward-button.png" width="14px"> jc.api.helloworld_.services.v1:helloWorld</a></h2>
		  	Silly service to trace greeting in custom mysql db service
		  </div>
		  <div>
		  		<h2><a href="/JcHelloWorld/4/getLog.html"><img src="/JcHelloWorld/_images/forward-button.png" width="14px"> jc.api.helloworld_.services.v1:getLog</a></h2>
		  	Service to retrieve all previous logged greetings from custom table
		  </div>
		  <h2 style="margin-left: 80px">Trace</h2>
		  <div>
		  	%invoke jc.api.helloworld_.services.v2:getLog%
		  		<table width="90%" class="tableView" border="0" cellspacing="3" cellpadding="3" align="center">
					<TR class="subheading2"> 
						<TD width="30px" class="oddrow-l"><b>ID</b></TD>	            
					    <TD width="50px" class="oddrow-l"><b>Owner</b></TD>
					    <TD width="150px" colspan="2"><b>messages</b></TD>
					</TR>
					%loop messages%
						<TR>
							<TD>
								%value id%
							</TD>
							<TD>
								%value owner%
							</TD>
							<TD>
								%value message%
							</TD>
						</TR>
					%endloop%
				  </table>
		  	%endinvoke%
		  </div>
		 </div>
		</div>
	</BODY>
</HTML>