package com.epam.app.servlets;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private final String userID = "admin";
    private final String password = "password";



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = null;

        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");

        if(userID.equals(user) && password.equals(pwd)){
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
            out = response.getWriter();
            out.println("<font color=green>You logged successfully</font>");
            rd.include(request, response);


        }else{
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
            out = response.getWriter();
            out.println("<font color=red>Either user name or password is wrong.</font>");
            rd.include(request, response);
        }

    }

}


