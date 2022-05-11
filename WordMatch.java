package apcsafrq.frq2021.question1;

public class WordMatch {
	/** The secret string. */
	private String secret;

	/**
	 * Constructs a WordMatch object with the given secret string of lowercase
	 * letters.
	 */
	public WordMatch(String word) {
		/* implementation not shown */
		this.secret = word;
	}

	/**
	 * Returns a score for guess, as described in part (a). Precondition: 0 <
	 * guess.length() <= secret.length()
	 */

	// "aaaabb" 找 "aabb"
	// pos++;
	// count = 3
	// pos = str.indexOf(guess, pos) + 1;
	// count==1:
	// pos 到了size
	// 退出for循环
	public int scoreGuess1(String guess) {
		/* to be implemented in part (a) */
		int count = 0;
		int pos = 0;

		while (this.secret.indexOf(guess, pos) >= 0 && pos <= this.secret.length()) {
			count++;
			pos = this.secret.indexOf(guess, pos) + 1; // 得到新的start值。
		}

		int score = count * guess.length() * guess.length();
		return score;

	}

	public int scoreGuess(String guess) {
		/* to be implemented in part (a) */
		int count = 0;

		for (int i = 0; i < this.secret.length() - guess.length() + 1; i ++) {
			String temp = this.secret.substring(i, i + guess.length());
			if (guess.equals(temp)) {
				count++;
			}
		}

		return count * guess.length() * guess.length();

	}

	/**
	 * @Returns the better of two guesses, as determined by scoreGuess and the rules
	 *          for a tie-breaker that are described in part (b).
	 * @Precondition: guess1 and guess2 contain all lowercase letters. guess1 is not
	 *                the same as guess2.
	 */

	// str1.compareTo(str2);
	// str1 - str2
	// "a" - "b" = -1
	//
	public String findBetterGuess(String guess1, String guess2) {
		if (scoreGuess(guess1) > scoreGuess(guess2)) {
			return guess1;
		}

		if (scoreGuess(guess1) < scoreGuess(guess2)) {
			return guess2;
		}

		if (guess1.compareTo(guess2) > 0) {
			return guess1;
		} else {
			return guess2;
		}

	}
}