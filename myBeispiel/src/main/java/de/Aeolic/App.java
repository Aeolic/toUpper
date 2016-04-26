package de.Aeolic;

/**
 * Hello world!
 *
 */

import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
	Scanner sc = new Scanner(System.in);
	System.out.println("Gib etwas ein: ");
	String eingabe = sc.next();
	eingabe = eingabe.toUpperCase();
	System.out.println("Alles Groﬂ: " + eingabe);
	
    }
}
