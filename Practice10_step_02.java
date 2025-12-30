import java.util.Scanner;

public class Practice10_step_02 { 
	public static int num;	 // 静的フィールド内に変数の実体をクラスに準備(これで何故か do while文で変数numが使用可能となる)
    public static void main(String[] args) {

// Scannerの用意
        Scanner scan = new Scanner(System.in);
// do whileでの繰り返し
        do {
// 数値の入力
        System.out.println("---演算の種類を選択してください(0で終了)---" + "\n");
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
        	return; // これでmainメソッドをここで終わらせられるとあったのでつけた(breakだと35行目を処理してしまう)
        default:
        	System.out.println("\n" + "---選択外の数値が入力されました---");
        	return; // これでmainメソッドをここで終わらせられるとあったのでつけた(breakだと35行目を処理してしまう)
        }
        System.out.print("\n" + "1つ目の数値 ->");
        int num1 = scan.nextInt();
        System.out.print("\n" + "2つ目の数値 ->");
        int num2 = scan.nextInt();

// 計算機能メソッドを呼び出す
        int result = calculate(num1, num2, num);
        System.out.println("\n--- 計算結果 ---");
        System.out.println("結果：" + result);

       }while(num >= 0); //無限Loopを作る → 但し"0"が入ると28行目を実行してreturnで抜ける。    
}


//四則演算メソッド(戻り値あり)
public static int calculate(int a, int b, int c) {
    int result = 0;

    switch (c) {
        case 1:
            result = a + b;
            break;
        case 2:
            result = a - b;
            break;
        case 3:
            result = a * b;
            break;
        case 4:
            result = a / b; // 0除算は考慮しない前提
            break;
        default:
            System.out.println("無効な演算です。");
            break;
    }

    return result;
}
}