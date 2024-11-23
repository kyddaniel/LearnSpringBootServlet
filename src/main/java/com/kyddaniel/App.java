package com.kyddaniel;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args) throws LifecycleException {

        System.out.println("Hello");

        Tomcat tomcat = new Tomcat();
        tomcat.start();

        // keep service running
        tomcat.getServer().await();
    }
}
