package com.thirdware.javatask2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CodeRunner {
	static Scanner scan = new Scanner(System.in);
	static int i = 1;
	static List<TennisPlayer> list1;

	public static void main(String[] args) {
		list1 = new ArrayList<>();
		List<TennisPlayer> list2 = new ArrayList<>();
		list1.add(new TennisPlayer(1, "Pradeep", 0, 0, 0, 1, "Grass",     0));
		list1.add(new TennisPlayer(2, "Ravi",    0, 0, 0, 1, "Synthetic", 0));
		list1.add(new TennisPlayer(3, "Suresh",  0, 0, 0, 1, "Grass",     0));
		list1.add(new TennisPlayer(4, "Vivek",   0, 0, 0, 1, "Clay",      0));
		list1.add(new TennisPlayer(5, "Ram",     0, 0, 0, 1, "Others",    0));
		list1.add(new TennisPlayer(6, "Kumar",   0, 0, 0, 1, "Grass",     0));
		list1.add(new TennisPlayer(7, "Venkat",  0, 0, 0, 1, "Synthetic", 0));
		list1.add(new TennisPlayer(8, "Prabu",   0, 0, 0, 1, "Grass",     0));
		list1.add(new TennisPlayer(9, "Dhanush", 0, 0, 0, 1, "Clay",      0));
		list1.add(new TennisPlayer(10, "Bharath",0, 0, 0, 1, "Others",    0));
		list2.addAll(list1);

		while (i != 0) {
			System.out.println("<------Assignment Task------->");
			System.out.println("1.Display the palyer attributes");
			System.out.println("2.Making match between two players(playMatch)");
			System.out.println("3.Delete player from player list");
			System.out.println("4.Sort the list based on updated currentRanking");
			System.out.println("5.Exit");
			System.out.println("Enter the choice[1-5]");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				displayPlayersAttribute();
				break;

			case 2:
				int n = 1;
				while (n != 0) {
					System.out.println("Choose the Option:[1-3]");
					System.out.println("1.Set the Match");
					System.out.println("2.Display the ScoreBoard");
					System.out.println("3.Exit");
					System.out.println("Enter the option[1-3]:");
					int select = scan.nextInt();
					switch (select) {
					case 1:
						System.out.println("Enter the player Code");
						System.out.println("Enter First playerCode[1-10]");
						int playerCode1 = scan.nextInt();
						System.out.println("Enter second playerCode[1-10]");
						int playerCode2 = scan.nextInt();
						for (TennisPlayer pl : list1) {
							if (playerCode1 == pl.getPlayerCode()) {
								pl.playMatch(playerCode2);
								break;
							}
						}
						break;
					case 2:
						DisplayscoreBoard(list1);
						break;
					case 3:
						n = 0;
						break;

					default:
						System.out.println("Enter the correct option:");
					}
				}
				break;
			case 3:
				System.out.println("Enter the Playercode to delete from list[1-10]");
				int code = scan.nextInt();
				delete(code);
				break;
			case 4:
				sortedList(list2);
				break;
			case 5:
				i = 0;
				System.out.println("<-----Thank You----->");
				break;
			default:
				System.out.println("Enter the number [1-5]");

			}
		}

	}
       /* Display ScoreBoard */
	private static void DisplayscoreBoard(List<TennisPlayer> list12) {
		for (TennisPlayer pl : list1) {
			System.out.println(pl);
		}

	}
      /* Display SortedList by Current_Ranking and Players_name */
	private static void sortedList(List<TennisPlayer> list2) {
		Collections.sort(list2, new SortPlayerCurrentRanking().thenComparing(new SortPlayerName()));
		for (TennisPlayer players : list2) {
			System.out.println(players);
		}

	}
     
	public List<TennisPlayer> getList() {
		return list1;
	}
      
	private static void displayPlayersAttribute() {
		for (TennisPlayer t : list1)
			System.out.println(t);

	}
        /* Delete player list by passing playerCode */
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
				throw new PlayerNotFoundException("PlayerNotFoundException");
			}

		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
