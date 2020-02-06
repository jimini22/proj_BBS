<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
table
<br><br><br>

<table border="2" width="50%">
	<tr bgcolor="gray">
		<th rowspan="2"> 구분 </th>
		<th colspan="3"> 항목 </th>
	</tr>
	<tr bgcolor="gray">
		<th> 이름 </th>
		<th> 성별 </th>
		<th> 나이 </th>
	</tr>
	
	<tr>
	<td align="center"> (a+1) </td>
	<td> &nbsp; </td>
	<td> &nbsp; </td>
	<td> &nbsp; </td>
	</tr>
	
	
	<script>
    var rowhtml = "<tr><td>&nbsp;</td></tr>";
	var a=0;
		
		for(var a=0; a<10; a++){
			console.log(a+1);
			document.write( rowhtml );
		}
	</script>

	
</table>





<br><br><br>


<table border="2" width="50%">
	<tr bgcolor="gray">
		<th rowspan="2"> 구분 </th>
		<th colspan="3"> 항목 </th>
	</tr>
	<tr bgcolor="gray">
		<th> 이름 </th>
		<th> 성별 </th>
		<th> 나이 </th>
	</tr>
	
	<script>
		var a=0;
		console.log(a);
		for(var a=0; a<100; a++){
			console.log(a+1);
			document.write(
					""
+"				<tr>"
+"					<td align='center'> " + (a+1) + " </td>"
+"					<td> &nbsp; </td>"
+"					<td> &nbsp; </td>"
+"					<td> &nbsp; </td>"
+"				</tr>"
+"			"
+"			"
			
			);
		}
	</script>
	
	
</table>
<table border="0" width="50%">
	<tr>
		<td colspan="4" align="center"> 1 &nbsp;&nbsp; 2 &nbsp; 3 &nbsp; 4 &nbsp; 5 </td>
	</tr>
</table>

</body>
</html>