package com.joshua.assignment4.task5;

public class SoccerMatchesExtended {
	/**
	 * @param bets
	 * @return result
	 */
	public static int soccerBets(int[][] bets) {
		return SoccerMatches.soccerBet(bets[0][0], bets[0][1], bets[1][0], bets[1][1]);
	}
}
