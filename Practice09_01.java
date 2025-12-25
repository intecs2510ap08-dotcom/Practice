import java.util.Scanner;

public class Practice09_01 {
	public static void main(String[] args) {
// 変数の宣言
		int num;
// Scannerの用意
		Scanner scan = new Scanner(System.in);
		System.out.println("0:日本語 1:英語 を入力してください->");
		num = scan.nextInt();
		profile(num);
	}
	
// 戻り値なし、引数ありメソッド
public static void profile(int num) {
	if (num == 0) {
		String name = "オーエン フロスト";
	    String hobby = "ジョギング";
	    String comment = "よろしくお願いいたします。";
	    System.out.println("わたしの名前は" +  name + "です");
	    System.out.println("趣味は" +  hobby + "です");
	    System.out.println(comment);
	    }else if (num == 1) {
    	String name = "Owen Frost";
		String hobby = "Jogging";
		String comment = "I will do my best!";
		System.out.println("my name is " +  name + ".");
		System.out.println("hobby is " +  hobby + ".");
		System.out.println(comment);	
	    }
}
}
