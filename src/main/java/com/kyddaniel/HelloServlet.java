package com.kyddaniel;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Default URL is localhost:8080
public class HelloServlet extends HttpServlet {

    // define a service() method for a servlet
    public void service(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("In service!");
    }

}
