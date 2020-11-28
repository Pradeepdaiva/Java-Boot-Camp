package com.thirdware.javatask2;

import java.util.Comparator;
import java.util.Random;

public class TennisPlayer implements Comparator<TennisPlayer> {
	private int playerCode;
	private String playerName;
	PlayerCareer playcareer;

	public TennisPlayer(int playerCode, String playerName, int matchesPlayed, int matchesWon, int currentRanking,
			int bestRanking, String preferredCourt, int lastFought) {
		super();
		this.playerCode = playerCode;
		this.playerName = playerName;
		this.playcareer = new PlayerCareer(matchesPlayed, matchesWon, currentRanking, bestRanking, preferredCourt,
				lastFought);
	}

	public TennisPlayer() {
		// TODO Auto-generated constructor stub
	}

	public int getPlayerCode() {
		return playerCode;
	}

	public void setPlayerCode(int playerCode) {
		this.playerCode = playerCode;
	}

	public String getPlayerName() {
		return playerName;
	}

	@Override
	public String toString() {
		return "TennisPlayer [playerCode=" + playerCode + ", playerName=" + playerName + ", playcareer=" + playcareer
				+ "]";
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int playMatch(int playerCode) {
		Random random = new Random();
		boolean val = random.nextBoolean();
		if (val) {
			int a = 100, b = 0;
			if(playerCode==this.playerCode) {
			b = this.playcareer.getCurrentRanking() + a;
			}
			return this.playcareer.setCurrentRanking(b);
		} else {
			int a = 20, b = 0;
			if(playerCode==this.playerCode) {
				b = this.playcareer.getCurrentRanking() + a;
				}
			return this.playcareer.setCurrentRanking(b);
		}

	}


	@Override
	public int compare(TennisPlayer t1, TennisPlayer t2) {
		// TODO Auto-generated method stub
		return t1.playcareer.getCurrentRanking() - t2.playcareer.getCurrentRanking();
	}

}
