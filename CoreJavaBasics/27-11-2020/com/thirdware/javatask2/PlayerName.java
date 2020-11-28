package com.thirdware.javatask2;

import java.util.Comparator;

public class PlayerName implements Comparator<TennisPlayer> {

	@Override
	public int compare(TennisPlayer o1, TennisPlayer o2) {
		
		return o1.getPlayerName().compareTo(o2.getPlayerName());
	}

}
