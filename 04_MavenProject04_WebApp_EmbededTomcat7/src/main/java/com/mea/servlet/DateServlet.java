package com.mea.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dateurl")
public class DateServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//get print writer
		PrintWriter pw = resp.getWriter();
		//set response content type
		resp.setContentType("text/html");
		//write the b.logic
		Date date=new Date();
		//write the output to the resp obj using printwriter
		pw.println("<h1> Date and Time is ::: "+date+"</h1>");
		//add home hyperlik
		pw.println("<br><a href='index.html'>Home</a>");
		//close the stream
		pw.close();
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
