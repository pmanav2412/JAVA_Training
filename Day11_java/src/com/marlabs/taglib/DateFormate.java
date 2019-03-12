package com.marlabs.taglib;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class DateFormate extends SimpleTagSupport {
	
	
	private static JspContext jspContext;
	private static String inputDateFormate;
	
	
	public void setInputDateFormate(String inputDateFormate) {
		System.out.println("This is formate type");
		this.inputDateFormate = inputDateFormate;
	}


	public void setJspContext(JspContext jspContext) {
		this.jspContext = jspContext;
	}
	
	
	public void doTag() throws JspException{
		try {
			
		SimpleDateFormat formate = new SimpleDateFormat(inputDateFormate);
		Date date = new Date();
		String day = formate.format(date);	
		
	
			jspContext.getOut().println(day);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	

}
