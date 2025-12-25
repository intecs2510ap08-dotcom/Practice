import java.util.Scanner;

public class Practice09_01_02 {
	public static void main(String[] args) {
// 変数の宣言
		int num;
// Scannerの用意
		Scanner scan = new Scanner(System.in);
		System.out.println("日本語:0 英語:1 を入力してください");
		num = scan.nextInt();
		if (num == 0) {
			profile0(num);
		}
		else if (num == 1) {
			profile1(num);
		}
		else {
			System.out.println("0,1以外の値が入力されました");
		}
	}
		
// 戻り値なし、引数ありメソッド
    public static void profile0(int num) {
        String name = "オーエン フロスト";
        String hobby = "ジョギング";
        String comment = "よろしくお願いいたします。";
        System.out.println("わたしの名前は" +  name + "です");
        System.out.println("趣味は" +  hobby + "です");
        System.out.println(comment);
    }

	public static void profile1(int num) {
    String name = "Owen Frost";
    String hobby = "Jogging";
    String comment = "I will do my best!";
    System.out.println("my name is " +  name + ".");
    System.out.println("hobby is " +  hobby + ".");
    System.out.println(comment);
}
}