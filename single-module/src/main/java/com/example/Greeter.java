package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  //TODO: Add javadoc comment
  public String greet(String someone) {
	  System.out.println("Hello world");
	  int i=1/0;
    return String.format("Hello, %s!", someone);
  }
}
