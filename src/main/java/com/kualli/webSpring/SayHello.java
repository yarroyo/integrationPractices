/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kualli.webSpring;

/**
 *
 * @author Becario
 */
public class SayHello {
    
    private String name;
 
  public void setName(String name)
  {
    this.name = name;
  }
 
  public String getName()
  {
    return name;
  }
 
  public void greet()
  {
    System.out.println("Hello " + getName());
  }
}
