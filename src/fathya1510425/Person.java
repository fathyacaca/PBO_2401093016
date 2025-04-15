/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fathya1510425;

import fathya100425.*;

/**
 *
 * @author LABP1KOMP
 */
public class Person {
    protected String name;
    protected String address;

 /**
 * Default constructor
 */
 public Person(){
 System.out.println("Inside Person:Constructor");
 name = "Ali";
 address = "Padang";
 }
 /**
 * Constructor dengan dua parameter
 */
 public Person( String name, String address ){
 this.name = name;
 this.address = address;
 }
 /**
 * Method accessor
 */
 public String getName(){
 return name;
 }
 public String getAddress(){
 return address;
 }
 public void setName( String name ){
 this.name = name;
 }
 public void setAddress( String add ){
 this.address = add;
 } 
}
