package com.cognizant.truyum.dao;

public class CartEmptyException extends Exception {
     public CartEmptyException(String s) {
         super(s);// we pass the String s to the Exception class.
     }
}
