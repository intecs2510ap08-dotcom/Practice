// Practice10_step_03 完成
import java.util.Scanner;

public class Practice10_step_03 { 
	public static int num;	        // 静的フィールド内に変数の実体をクラスに準備(これで何故か do while文で変数numが使用可能となる)
	public static String enzan;	// 静的フィールド内に変数の実体をクラスに準備

	public static void main(String[] args) {

// Scannerの用意
    Scanner scan = new Scanner(System.in);
    int[] ans = new int[5]; // 配列初期化 ← ここで1回だけ作る(do whileの外で定義)
    int n = 0;  // nを配列番号として扱う
// do whileでの繰り返し
        do {
// 数値の入力
        System.out.println("---計算の種類を選択してください(0で終了)---" + "\n");
        System.out.print("1:加算 2:減算 3:乗算 4: 除算 ->");
        int num = scan.nextInt();
        switch (num){
        case 1:
        	System.out.println("\n" + "---加算を選択しています---");
        	break;
        case 2:
        	System.out.println("\n" + "---減算を選択しています---");
        	break;
        case 3:
        	System.out.println("\n" + "---乗算を選択しています---");
        	break;
        case 4:
        	System.out.println("\n" + "---除算を選択しています---");
        	break;
        case 0:
        	System.out.println("\n" + "---計算終了---"); // ←計算終了に修正
        	return; // これでmainメソッドをここで終わらせられるとあったのでつけた(breakだと39行目を処理してしまう)
        default:
        	System.out.println("\n" + "0～4を入力してください");
        	continue; // continue忘れてたわ(笑)
        }
        System.out.print("\n" + "1つ目の数値 ->");
        int num1 = scan.nextInt();
        System.out.print("\n" + "2つ目の数値 ->");
        int num2 = scan.nextInt();

// 計算機能メソッドを呼び出す
        int result = calculate(num1, num2, num);
        System.out.println("\n--- 計算結果 ---");
        System.out.println(enzan + ":" + result);
       	ans[n] = result; // 配列番号:n に計算結果:resultを入れる
       	n = (n + 1) % 5; // 配列番号変更(なんと余りの計算で、0→1→2→3→4→0→…を繰り返してくれる！)
       	System.out.println("計算の記録:");
       	for (int cnt = 0 ; cnt < ans.length; cnt++) { // cnt:カウント数として。ans.lengthは配列の個数。ans配列[]表示してcntを1増やして回す
       		System.out.print( "[" + ans[cnt] + "]" ); // 改行無しのプリントで配列5個分を横並びに出す
       	}
       	System.out.println();
       }while(num >= 0); // 無限Loopを作る → 但し"0"が入ると32行目を実行してreturnで抜ける。    
}
    

//四則演算メソッド(戻り値あり)
public static int calculate(int a, int b, int c) { // 45行目と関連。num1→a,mun2→b,num→c
    int result = 0;
    switch (c) {
        case 1:
            result = a + b;
            enzan = "加算";
            break;
        case 2:
            result = a - b;
            enzan = "減算";
            break;
        case 3:
            result = a * b;
            enzan = "乗算";
            break;
        case 4:
            result = a / b; // 0除算は考慮しない前提(演習問題の説明より)
            enzan = "除算";
            break;
        default:
            System.out.println("無効な演算です。"); // これ要らないような気がしています。
            break;
    }
    return result;
}
}
