﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/styles.css'  type="text/css" />
<meta charset="UTF-8">
<title>MVC</title>
</head>
<body>
<div class='center'>
<H1>加入會員</H1>
<H3>經由JdbcDaoSupport類別間接使用JdbcTemplate類別來簡化DAO類別的設計</H3>

<HR>
<Form class='center' Action="register0503.do" method="POST">
    <Table>
         <TR>
             <TD align="RIGHT">帳號：</TD>
             <TD align="LEFT">
                <input	type="text" name="userId" value="${param.userId}" size="20">
                <font color='red' size='-3'>${error.userId}</font>
             </TD>
         </TR>
         <TR>
             <TD align="RIGHT">密碼：</TD>
             <TD align="LEFT" >
                <input	type="password" name="pswd" value="${param.pswd}" size="20">
                <font color='red' size='-3'>${error.pswd}</font>
             </TD>
         </TR>             
         <TR>
             <TD align="RIGHT">姓名：</TD>
             <TD align="LEFT" >
                <input	type="text" name="userName" value="${param.userName}"  size="30">
                <font color='red' size='-3'>${error.userName}</font>
             </TD>
         </TR>             
         <TR>
             <TD align="RIGHT">eMail：</TD>
             <TD align="LEFT" >
                 <input type="text" name="eMail" value="${param.eMail}" size="40">
                 <font color='red' size='-3'>${error.eMail}</font>
             </TD>
         </TR>             
         <TR>
             <TD align="RIGHT">生日：</TD>
             <TD align="LEFT" > 
               <input type="text" name="birthday" value="${param.birthday}">
               <font color='red' size='-3'>${error.birthday}</font>
             </TD>
         </TR>             
         <TR>
             <TD align="RIGHT">使用Java經驗：</TD>
             <TD align="LEFT" > 
                <input type="text" name="experience" value="${param.experience}" size="3"> 年
                <font color='red' size='-3'>${error.experience}</font>
              </TD>
         </TR>    
        <TR>
            <TD colspan="2" align="center">      <input type="submit" value="提交"> </TD>
            </TR>
         </Table>
</Form>
</div>
<div class='center'>
<br>
<small>&lt;&lt;<a href="../">回第五章首頁</a>&gt;&gt;</small>
</div>
</body>
</html>
