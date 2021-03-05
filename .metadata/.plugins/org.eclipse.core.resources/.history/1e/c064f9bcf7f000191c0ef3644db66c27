package com.javasm.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("正在执行Servelet1");
		PrintWriter pw = resp.getWriter();
		String name=req.getParameter("uname");
		String age=req.getParameter("uage");
		String pro=req.getParameter("upro");
		String city=req.getParameter("ucity");
		String des=req.getParameter("udes");
		String place=req.getParameter("uplace");
		String gender=req.getParameter("ugender").equals("m")?"男":"女";
		String intro=req.getParameter("uintro");
		String ps=req.getParameter("ups");
		resp.setContentType("text/html;charset=utf-8");
		pw.print("<h1>个人资料</h1>");
		pw.print("姓名："+name+"<br/>"+"年龄："+age+"<br/>"+"籍贯"+pro+"省"+city+"市"+des+"区/县"+"性别："+gender);
		pw.print("个人介绍："+intro);
		pw.print("备注："+ps);
		pw.flush();
		pw.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	
	
}
