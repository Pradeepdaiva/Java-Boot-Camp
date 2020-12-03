package com.thirdware.javatask2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TennisPlayer {
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

	public int playMatch(int playerCode2) {
		Random random = new Random();
		boolean val = random.nextBoolean();
		/* Getting List from main function */
		CodeRunner main = new CodeRunner();
		List<TennisPlayer> list = new ArrayList<>();
		list = main.getList();
		TennisPlayer player2 = null;
		/* Getting Instance of Player 2 */
		for (TennisPlayer pl : list) {
			if (pl.getPlayerCode() == playerCode2) {
				player2 = pl;
				break;
			}
		}
		int a = 1;
		/* Update the match played */
		if ((this.playcareer.getMatchesPlayed()) != 9) {
			this.playcareer.setMatchesPlayed((this.playcareer.getMatchesPlayed()) + a);
		}

		if ((player2.playcareer.getMatchesPlayed()) != 9) {
			player2.playcareer.setMatchesPlayed((player2.playcareer.getMatchesPlayed()) + a);
		}

		/* Set LastFought for players */
		this.playcareer.setLastFought(player2.playerCode);
		player2.playcareer.setLastFought(this.playerCode);
		int b = 0, b1 = 0;
		/*
		 * Increasing Match_Won, Current_Ranking, Best_Ranking and Decreasing Opponent
		 * Current_Ranking
		 */
		if (val) {
			/* Update not happen if player won more than 9 match */
			if ((this.playcareer.getMatchesWon()) != 9) {
				this.playcareer.setMatchesWon((this.playcareer.getMatchesWon()) + a);
				this.playcareer.setBestRanking((this.playcareer.getBestRanking()) + a);
				b = (this.playcareer.getCurrentRanking()) + a;
				this.playcareer.setCurrentRanking(b);
			}
			if ((player2.playcareer.getCurrentRanking()) != 0) {
				b1 = (player2.playcareer.getCurrentRanking()) - a;
				player2.playcareer.setCurrentRanking(b1);
			}

		} else {
			/* Update not happen if player won more than 9 match */
			if ((this.playcareer.getMatchesWon()) != 9) {
				player2.playcareer.setMatchesWon((player2.playcareer.getMatchesWon()) + a);
				player2.playcareer.setBestRanking((player2.playcareer.getBestRanking()) + a);
				b = (player2.playcareer.getCurrentRanking()) + a;
				player2.playcareer.setCurrentRanking(b);
			}
			if ((this.playcareer.getCurrentRanking()) != 0) {
				b1 = (this.playcareer.getCurrentRanking()) - a;
				this.playcareer.setCurrentRanking(b1);
			}
		}
		return 0;

	}

}
