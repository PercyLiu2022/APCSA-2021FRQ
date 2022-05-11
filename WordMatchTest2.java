package apcsafrq.frq2021.question1;

public class WordMatchTest2 {

	public static void main(String[] args) {
		//第一个测试 密码为 concatenation
		WordMatch game = new WordMatch("concatenation");
		
		System.out.println(game.scoreGuess("ten"));
		System.out.println(game.scoreGuess("nation"));
		//"nation"
		System.out.println(game.findBetterGuess("ten" , "nation"));
		
		System.out.println(game.scoreGuess("con"));
		System.out.println(game.scoreGuess("cat"));
		//"con"
		System.out.println(game.findBetterGuess("con" , "cat"));
		
		
		

	}

}
