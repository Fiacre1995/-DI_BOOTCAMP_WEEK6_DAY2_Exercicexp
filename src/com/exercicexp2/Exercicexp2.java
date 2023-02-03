package com.exercicexp2;

import java.util.Scanner;

public class Exercicexp2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Veuillez entrez un nombre ");
		int Nbre = scanner.nextInt();

		if (Nbre >= 93 && Nbre <= 100) {
			System.out.println("UN");
		} else if (Nbre >= 90 && Nbre <= 92) {
			System.out.println("A-");
		} else if (Nbre >= 87 && Nbre <= 89) {
			System.out.println("B+");
		} else if (Nbre >= 83 && Nbre <= 86) {
			System.out.println("B");
		} else if (Nbre >= 80 && Nbre <= 82) {
			System.out.println("B-");
		} else if (Nbre >= 77 && Nbre <= 79) {
			System.out.println("C+");
		} else if (Nbre >= 70 && Nbre <= 76) {
			System.out.println("C");
		} else if (Nbre >= 60 && Nbre <= 69) {
			System.out.println("ré");
		} else {
			System.out.println("F");
		}
		

	}

}
