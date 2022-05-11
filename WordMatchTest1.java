package apcsafrq.frq2021.question1;

public class WordMatchTest1 {

	public static void main(String[] args) {
		//第一个测试 密码为 mississippi
		WordMatch game = new WordMatch("mississippi");
		//"i"    4 * 1 * 1 = 4
		System.out.println(game.scoreGuess("i"));
		//"iss"  2 * 3 * 3 = 18 
		System.out.println(game.scoreGuess("iss"));
		//"issipp"  1 * 6 * 6 = 36
		System.out.println(game.scoreGuess("issipp"));
		//"mississippi"  1 * 11 * 11 = 121
		System.out.println(game.scoreGuess("mississippi"));
		
		//第二个测试 密码为 mississippi
		WordMatch game2 = new WordMatch("aaaabb");
		//"a"  4 * 1 * 1 = 4
		System.out.println(game2.scoreGuess("a"));				
		//"aa" 3 3 * 2 * 2 = 12
		System.out.println(game2.scoreGuess("aa"));			
		//"aaa" 2 2 * 3 * 3 = 18
		System.out.println(game2.scoreGuess("aaa"));
		//"aabb"  1 * 4 * 4 = 16
		System.out.println(game2.scoreGuess("aabb"));
		//" c"  0 * 1 * 1 = 0
		System.out.println(game2.scoreGuess("c"));

	}

}
