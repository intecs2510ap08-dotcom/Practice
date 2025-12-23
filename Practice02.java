import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		System.out.println("---処理開始---");
// 変数の宣言
		int num;
// Scannerの用意
		Scanner scan = new Scanner(System.in);
		System.out.println("数字を入力してください");
		num = scan.nextInt();
		if( num >= 6 && num <= 11) {
// numが6以上で11以下だった場合			
			System.out.println(num + "時 おはようございます");
		}else if( num >= 12 && num <= 17) {
// numが12以上で17以下だった場合
			System.out.println(num + "時 こんにちは");
		}else if( num >= 18 && num <= 23) {
// numが18以上で23以下だった場合
			System.out.println(num + "時 こんばんは");			
		}else if( num == 24 || num >= 00 && num <= 05) {
// numが24かnumが00以上で05以下だった場合
			System.out.println(num + "時 おやすみなさい");			
		}else {
// numが0-24以外でfalseだった場合
			System.out.println("0～24の数字を入力してください");
		}
		System.out.println("---処理終了---");
	}
}