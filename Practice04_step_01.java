import java.util.Scanner;

public class Practice04_step_01 {
	public static void main(String[] args) {
		System.out.println("---処理開始---");
// 変数の宣言
		int i = 0;
// Scannerの用意
		Scanner scan = new Scanner(System.in);
		System.out.println("開始する数字を入力してください->");
		int start = scan.nextInt(); // 開始する数字 ex)"8"
		System.out.println("終了する数字を入力してください->");
		int end = scan.nextInt(); // 修了する数字 ex)"24"
// ループ処理 by for
		for (i = start; i <= end; i++) //開始から修了までの数字で繰り返す
		if (i % 3 == 0 && i % 5 ==0) {
			System.out.print("FizzBuzz "); // 3と5の両方で割り切れる
		} else if (i % 3 == 0) {
			System.out.print("Fizz "); // 3で割り切れる
		} else if (i % 5 == 0) {
			System.out.print("Buzz "); // 5で割り切れる
		} else {
			System.out.print("" + i + " "); // そのまま値を表示する
		}
		System.out.println("\n---処理終了---");
	}
}