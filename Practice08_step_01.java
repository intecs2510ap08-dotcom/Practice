import java.util.Scanner;

public class Practice08_step_01 {

	public static void main(String[] args) {		
// 入力開始
		System.out.println("---入力開始---");
// 変数の宣言
// int i = 0;
		int j = 0;
		int n = 0;
		int num = 0;
// Scannerの用意
		Scanner scan = new Scanner(System.in);
// 回数値を入力
			System.out.print("入力の回数を数値で指定してください->");
			while(true) { // 無限Loopを作る
			num = scan.nextInt();
			scan.nextLine();
		/*上記の「scan.nextLine();」 は「1回目の入力がスキップされる」という現象の対策。
		  int num = scan.nextInt(); で数値を入力したあと、Enterキーを押すと
		  nextInt() は数値だけを読み取り、<enter>時に発生した「改行（\n）」は読み取らずに
		  残してしまう。その後、"1回目の入力"で残った改行を読み取ってしまうため、 
		  1回目の入力が空文字（""）として処理されてしまう現象。
		  対策は次の行に「scan.nextLine();」を入れてバッファに残った改行を取り除く(読み捨て)
		  で解決します */
			if (num > 0 && num < 10) { // 0より大きく10未満ならbreakでLoopから抜ける。→ 配列の初期化へ
				break;
			}
			if (num < 0 || num > 10) { // if文で 0未満、10より大きい値は回数指定のメッセージを出して continue へ。範囲外なら
			System.out.print("0 ～ 10の間で回数を指定してください->");
			continue; // continue で次の処理をさせずに繰り返し処理 → while(true)へ戻す
		}
		}
// 配列の初期化
		String[] strary = new String[num];
		for (int i = 0; i < num ; i++) {
				n++;
				System.out.print(n + "回目の入力->");
				String inputStr = scan.nextLine();	// 入力された数値分、String型として入力
				strary[j] = inputStr;
				j++;
			}
	// 入力終了
			System.out.println("---入力終了---");
	// 配列から入力されたデータを読み取り表示
			for (int k = 0; k < num; k++) {
				System.out.print(strary[k] + " " );
			}
	}
}


