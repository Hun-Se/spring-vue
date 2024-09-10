<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" errorPage="addrbook_error.jsp"%>
<!DOCTYPE HTML>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/addrbook.css" type="text/css" media="screen" />

<script type="text/javascript">
	function delcheck() {
		result = confirm("정말로 삭제하시겠습니까 ?");
	
		if(result == true){
			var abId = document.getElementById("abId").value;
			document.form1.action="delete.do?id=" + abId;
			document.form1.submit();
		}
		else
			return;
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>주소록:수정화면</title>
</head>

<body>
	<div align="center">
	<H2>주소록:수정화면 </H2>
	
	<a href="list.do">주소록 목록으로</a> <p>
		<form name=form1 method=post action="edit.do?abId=${editAb.abId}">
			<input type=hidden id="abId" name="abId" value="${editAb.abId}">
			<input type=hidden name="action" value="update">
			
			<table border="1">
				 <tr>
				    <th>이 름</th>
				    <td><input type="text" name="abName" value="${editAb.abName}"></td>
				</tr>
				<tr>
				    <th>email</th>
				    <td><input type="text" name="abEmail" value="${editAb.abEmail}"></td>
				</tr>
				<tr>
				    <th>전화번호</th>
				    <td><input type="text" name="abTel" value="${editAb.abTel}"></td>
				</tr>
				      <tr>
				    <th>생 일</th>
				    <td><input type="date" name="abBirth" value="${editAb.abBirth}"></td>
				</tr>
				<tr>
				    <th>회 사</th>
				    <td><input type="text" name="abComdept" value="${editAb.abComdept}"></td>
				</tr>
				<tr>
				    <th>메 모</th>
				    <td><input type="text" name="abMemo" value="${editAb.abMemo}"></td>
				</tr>
				<tr>
				    <td colspan=2 align=center><input type=submit value="저장"><input type=reset value="취소"><input type="button" value="삭제" onClick="delcheck()"></td>
				</tr>
			</table>
		</form>
	
	</div>

</body>

</html>