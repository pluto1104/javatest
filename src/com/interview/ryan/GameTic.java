package com.interview.ryan;

import java.util.Scanner;

public class GameTic {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size;
		int numOfX=0;
		int numOfY=0;
		System.out.println("Plase enter the game'sizes: ");
		size=in.nextInt();//get size
		String [][]game = new String [size][size];
		boolean getResult = false;
		System.out.println("Please enter your X or Y and the location, example X,2,2");
		for(int i=0;i<game.length;i++) {
			for(int k=0;k<game[i].length;k++) {
				String input = in.next();
				int x = Integer.parseInt(input.substring(2, 3));
				int y = Integer.parseInt(input.substring(4, 5));
				game[x][y]=input.substring(0, 1);
			}
		}
		for(int i=0;i<game.length;i++) {
			if(game[i][i].equals("X")) {
				numOfX++;
			}
			else {
				numOfY++;
			}
			if(numOfX==size || numOfY==size) {
				getResult=true;
			}
		}
		if(!getResult) {
			numOfX=0;
			numOfY=0;
			for(int i=0;i<game.length;i++) {
				if(game[i][size-1-i].equals("X")) {
					numOfX++;
				}
				else {
					numOfY++;
				}
				if(numOfX==size || numOfY==size) {
					getResult=true;
				}
			}
		}
		if(!getResult) {
			for(int i=0;i<game.length;i++) {
				numOfX=0;
				numOfY=0;
				for(int k=0;k<game[i].length;k++) {
					if(game[i][k].equals("X"))
						numOfX++;
					else
						numOfY++;
				}
				if(numOfX==size || numOfY==size) {
					getResult=true;
					break;
				}
			}
		}
		if(!getResult) {
			for(int i=0;i<size;i++) {
				numOfX=0;
				numOfY=0;
				for(int k=0;k<size;k++) {
					if(game[k][i].equals("X"))
						numOfX++;
					else
						numOfY++;
				}
				if(numOfX==size || numOfY==size) {
					getResult=true;
					break;
				}
			}
		}
		if(getResult) {
			if(numOfX==size) {
				System.out.println("X win this game!");
			}
			else {
				System.out.println("Y win this game!");
			}
		}
		else {
			System.out.println("draw!");
		}
		
	}
}
