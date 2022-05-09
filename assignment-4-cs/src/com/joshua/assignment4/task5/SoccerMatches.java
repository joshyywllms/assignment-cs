package com.joshua.assignment4.task5;

public class SoccerMatches {
	/**
	 *
	 * @param home
	 * @param guest
	 * @param betHome
	 * @param betGuest
	 * @return int
	 */

	public static int soccerBet(int home, int guest, int betHome, int betGuest) {
		Boolean fullMatch = false;
		Boolean partialMatch = false;

		if (home == betHome && guest == betGuest)
			fullMatch = true;
		else {
			if (home > guest)
				partialMatch = betHome > betGuest;
			else if (home < guest)
				partialMatch = betHome < betGuest;
			else
				partialMatch = betHome == betGuest;
		}

		if (fullMatch)
			return 3;
		else if (partialMatch)
			return 1;
		return 0;
	}

}
