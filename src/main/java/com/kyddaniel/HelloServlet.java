package com.kyddaniel;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// Default URL is localhost:8080
public class HelloServlet extends HttpServlet {

    // define a service() method for a servlet
    // doGet() for a "GET" request
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("In service!");

        PrintWriter writer = response.getWriter();

        // response content (a HTML page)
        //writer.println("Hello World");

        // content can be in HTML
        response.setContentType("text/html");
        writer.println("<h1>Hello World</h1>");
    }

}
