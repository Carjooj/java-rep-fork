package com.cicd.jaaj;

import java.util.Scanner;

public class Greeting {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		
		String greeting = "Bem vindo, ";
		
		System.out.println("Insira seu nome");
		String nome = scan.next();
		 
		System.out.println(greeting + nome);
		
	}
}