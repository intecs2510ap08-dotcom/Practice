import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
		System.out.println("---処理開始---");
// 変数の宣言
		int num;
// Scannerの用意
		Scanner scan = new Scanner(System.in);
		System.out.println("数字を入力してください");
		num = scan.nextInt();
		if(num == 0) {
// numが0でtrueだった場合			
			System.out.println("おはようございます");			
		}else if(num == 1) {
// numが1でtrueだった場合
			System.out.println("こんにちは");
		}else if(num == 2) {
// numが2でtrueだった場合
			System.out.println("こんばんは");			
		}else if(num == 3) {
// numが3でtrueだった場合
			System.out.println("おやすみなさい");			
		}else {
// numが0-3以外でfalseだった場合
			System.out.println("0～3の数字を入力してください");
		}
		System.out.println("---処理終了---");
	}
}