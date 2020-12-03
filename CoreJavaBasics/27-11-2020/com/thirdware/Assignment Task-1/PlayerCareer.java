package com.thirdware.javatask2;

public class PlayerCareer {

	private int matchesPlayed;
	private int matchesWon;
	private int currentRanking;
	private int bestRanking;
	private String preferredCourt;
	private int lastFought;

	public PlayerCareer(int matchesPlayed, int matchesWon, int currentRanking, int bestRanking, String preferredCourt,
			int lastFought) {
		super();
		this.matchesPlayed = matchesPlayed;
		this.matchesWon = matchesWon;
		this.currentRanking = currentRanking;
		this.bestRanking = bestRanking;
		this.preferredCourt = preferredCourt;
		this.lastFought = lastFought;
	}

	public int setCurrentRanking(int currentRanking) {
		return this.currentRanking = currentRanking;
	}

	public int getMatchesPlayed() {
		return matchesPlayed;
	}

	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	public void setMatchesWon(int matchesWon) {
		this.matchesWon = matchesWon;
	}

	public void setBestRanking(int bestRanking) {
		this.bestRanking = bestRanking;
	}

	public void setPreferredCourt(String preferredCourt) {
		this.preferredCourt = preferredCourt;
	}

	public void setLastFought(int lastFought) {
		this.lastFought = lastFought;
	}

	public int getMatchesWon() {
		return matchesWon;
	}

	public int getCurrentRanking() {
		return currentRanking;
	}

	public int getBestRanking() {
		return bestRanking;
	}

	public String getPreferredCourt() {
		return preferredCourt;
	}

	public int getLastFought() {
		return lastFought;
	}

	@Override
	public String toString() {
		return "PlayerCareer [matchesPlayed=" + matchesPlayed + ", matchesWon=" + matchesWon + ", currentRanking="
				+ currentRanking + ", bestRanking=" + bestRanking + ", preferredCourt=" + preferredCourt
				+ ", lastFought=" + lastFought + "]";
	}

}
