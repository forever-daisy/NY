﻿<%@ page language="java" contentType="text/html; utf-8" pageEncoding="utf-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<!-- saved from url=(0050)http://localhost:8080/HouseRent/manage!list.action -->
<HTML xmlns="http://www.w3.org/1999/xhtml"><HEAD>
<TITLE>青鸟租房 - 用户管理</TITLE>
<META content="text/html; charset=utf-8" http-equiv=Content-Type><LINK 
rel=stylesheet type=text/css href="../css/style.css">

<META name=GENERATOR ></HEAD>
<BODY>
<DIV id=header class=wrap>
<DIV id=logo><IMG src="../images/logo.gif"></DIV>
<DIV class=search><LABEL class="ui-green searchs"><a href="fabu.htm" title="">发布房屋信息</a></LABEL> 
<LABEL class=ui-green><INPUT onclick='document.location="index.jsp"' value="退       出" type=button name=search></LABEL> 
 欢迎:${sessionScope["loginInfo"].name}
</DIV></DIV>
<DIV class="main wrap">
<DIV id=houseArea>
<TABLE class=house-list>
  <TBODY>
  <TR>
    <TD class=house-thumb><SPAN><A href="details.htm" target="_blank"><img src="../images/thumb_house.gif" width="100" height="75" alt=""></A></SPAN></TD>
    <TD>
      <DL>
        <DT><A href="details.htm" target="_blank">123</A></DT>
        <DD>海淀区中关村大街,123平米<BR>联系方式：123 </DD></DL></TD>
    <TD class=house-type><LABEL class=ui-green><INPUT onclick=update(46) value="修    改" type=button name=search></LABEL></TD>
    <TD class=house-price><LABEL class=ui-green><INPUT value="删    除" type=button name=search></LABEL></TD></TR>
  <TR class=odd>
    <TD class=house-thumb><SPAN><A href="details.htm" target="_blank"><img src="../images/thumb_house.gif" width="100" height="75" alt=""></A></SPAN></TD>
    <TD>
      <DL>
        <DT><A href="details.htm" target="_blank">jjjj</A></DT>
        <DD>海淀区中关村大街,123平米<BR>联系方式：ff </DD></DL></TD>
    <TD class=house-type><LABEL class=ui-green><INPUT onclick=update(47) value="修    改" type=button name=search></LABEL></TD>
    <TD class=house-price><LABEL class=ui-green><INPUT value="删    除" type=button name=search></LABEL></TD></TR>
  <TR>
    <TD class=house-thumb><SPAN><A href="details.htm" target="_blank"><img src="../images/thumb_house.gif" width="100" height="75" alt=""></A></SPAN></TD>
    <TD>
      <DL>
        <DT><A href="details.htm" target="_blank">大房子</A></DT>
        <DD>海淀区中关村大街,100平米<BR>联系方式：123456789 </DD></DL></TD>
    <TD class=house-type><LABEL class=ui-green><INPUT onclick=update(6) value="修    改" type=button name=search></LABEL></TD>
    <TD class=house-price><LABEL class=ui-green><INPUT value="删    除" type=button name=search></LABEL></TD></TR></TBODY></TABLE></DIV>
<DIV class=pager>
<UL>
  <LI class=current><A id=widget_338868862 
  href="http://localhost:8080/HouseRent/manage!ajaxList.action?number=1" 
  parseContent="true" showError="true" targets="houseArea" 
  ajaxAfterValidation="false" validate="false" 
dojoType="struts:BindAnchor">1</A>
   </LI>
  <LI class=current><A id=widget_1160989910 
  href="http://localhost:8080/HouseRent/manage!ajaxList.action?number=2" 
  parseContent="true" showError="true" targets="houseArea" 
  ajaxAfterValidation="false" validate="false" 
dojoType="struts:BindAnchor">2</A>
   </LI></UL><SPAN class=total>1/2页</SPAN> </DIV></DIV>
<DIV id=footer class=wrap>
<DL>
  <DT>青鸟租房 © 2018 北大青鸟 京ICP证1000001号</DT>
  <DD>关于我们 · 联系方式 · 意见反馈 · 帮助中心</DD></DL></DIV></BODY></HTML>
