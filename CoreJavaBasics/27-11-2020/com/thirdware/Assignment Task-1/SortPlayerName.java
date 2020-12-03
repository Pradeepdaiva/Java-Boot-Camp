package com.thirdware.javatask2;

import java.util.Comparator;

public class SortPlayerName implements Comparator<TennisPlayer> {

	@Override
	public int compare(TennisPlayer o1, TennisPlayer o2) {
		
		return o1.getPlayerName().compareTo(o2.getPlayerName());
	}

}
class SortPlayerCurrentRanking implements Comparator<TennisPlayer>{

	@Override
	public int compare(TennisPlayer o1, TennisPlayer o2) {
		// TODO Auto-generated method stub
		return o1.playcareer.getCurrentRanking()-o2.playcareer.getCurrentRanking();
	}
	
}
