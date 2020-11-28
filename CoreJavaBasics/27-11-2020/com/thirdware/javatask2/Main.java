package com.thirdware.javatask2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	static int i = 1;
	static List<TennisPlayer> list1;

	public static void main(String[] args) {
		list1 = new ArrayList<>();
		List<TennisPlayer> list2 = new ArrayList<>();
		list1.add(new TennisPlayer(1, "Pradeep", 3, 1, 4, 2, "Grass", 2));
		list1.add(new TennisPlayer(2, "Ravi", 2, 1, 5, 3, "Synthetic", 1));
		list1.add(new TennisPlayer(3, "Suresh", 5, 2, 3, 2, "Grass", 3));
		list1.add(new TennisPlayer(4, "Vivek", 1, 1, 1, 1, "Clay", 5));
		list1.add(new TennisPlayer(5, "Ram", 3, 2, 2, 1, "Others", 4));
		list1.add(new TennisPlayer(6, "Kumar", 3, 1, 4, 2, "Grass", 2));
		list1.add(new TennisPlayer(7, "Venkat", 2, 1, 5, 3, "Synthetic", 1));
		list1.add(new TennisPlayer(8, "Prabu", 5, 2, 3, 2, "Grass", 3));
		list1.add(new TennisPlayer(9, "Dhanush", 1, 1, 1, 1, "Clay", 5));
		list1.add(new TennisPlayer(10, "Bharath", 3, 2, 2, 1, "Others", 4));
		list2.addAll(list1);

		while (i != 0) {
			System.out.println("Enter the choice");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				display();
				break;
			case 2:
				System.out.println("Enter the Playercode to delete from list");
				int code = scan.nextInt();
				delete(code);
				break;
			default:
				i = 0;
				System.out.println("Bye");

			}
		}
		// player.playMatch(2);
		Collections.sort(list2, new TennisPlayer().thenComparing(new PlayerName()));
		for (TennisPlayer player1 : list2)
			System.out.println(player1.playcareer.getCurrentRanking() + "  " + player1.getPlayerName());
	}

	private static void display() {
		for (TennisPlayer t : list1)
			System.out.println(t);

	}

	private static void delete(int playercode) {
		TennisPlayer temp = null;
		int flag = 0;
		try {
			for (TennisPlayer player : list1) {
				if (player.getPlayerCode() == playercode) {
					temp = player;
					flag = 1;
				}
			}
			if (flag == 1) {
				list1.remove(temp);
			} else {
				throw new PlayerNotFound("PlayerNotFoundException");
			}

		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
