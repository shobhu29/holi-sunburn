<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center" style="border: 1px solid black">

		<h1>Gear Technical Forum</h1>
		<h2>Answer The Query</h2>

		<a href="index"> Home </a> </br>

		<form action="querydetails" method="post">
			Query Id : <input type="number" name="query_id" /> <br>
			Select technology :<input type="text" name="tech" />  <br>
			 Question :<input type="text" name="ques" />  <br>
			 Question Raised By :<input type="text" name="quesraisedby" />  <br>
			Solutions :<input style ="padding: 10px" type="text" name="sol" />  <br>
			Answered By :<select>
				<option value="select">Please Select</option>
				<option value="Uma">Uma</option>
				<option value="Rahul">Rahul</option>
				<option value="Kavita">Kavita</option>
				<option value="Hema">Hema</option>
				</select>  <br>
			<input type="submit" name="Update Query" /> 

		</form>
	</div>


</body>
</html>