package com.marlabs.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Dispatch;

/**
 * Servlet implementation class ProductService
 */
@WebServlet("/ProductService")
public class ProductService extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RegisterProduct registerProduct = null;

    /**
     * Default constructor. 
     */
    public ProductService() {
    	registerProduct = new RegisterProduct();
        System.out.println("This is constructor");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("THis is init method from servlet");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("This is destoy method ");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("DOGET MEthode");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("DO post method");
		String name = request.getParameter("name");
		double price = Double.parseDouble(request.getParameter("price"));
		String seller = request.getParameter("seller");
		
		ProductModel pm = new ProductModel();
		pm.setProductname(name);
        pm.setProductprice(price);
        pm.setProductseller(seller);
		boolean SuccessFlag = false;
		System.out.println("i am before tery ");
		RequestDispatcher dispatcher = null;
        try {
        	System.out.println("I am in try");
        
        	SuccessFlag = registerProduct.preparedStatement(pm);
        	System.out.println(SuccessFlag+"njbhfg");
        	if(SuccessFlag) {
        	System.out.println(SuccessFlag);
        	dispatcher = request.getRequestDispatcher("./Product.jsp");
        	dispatcher.forward(request, response);
        	}
        	
        }catch(SQLException e){
        	dispatcher = request.getRequestDispatcher("./ProductFail.jsp");
         	request.setAttribute("message",e.getMessage());
        	dispatcher.forward(request, response);
        }
		
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.println("<html>");
//		out.println("<body>");
//		out.println("product name = "+ "\t" + name );
//		out.println("Product price = "+ "\t" + price);
//		out.println("seller name = " + "\t" + seller);
//		out.println("</body>");
//		out.println("</html>");
//		
	
		//doGet(request, response);
	}

}
