import java.util.Scanner;

public class Practice10_01 {
    public static void main(String[] args) {
// Scannerの用意
        Scanner scan = new Scanner(System.in);
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
        	System.out.println("\n" + "---終了します---");
        	return; // これでmainメソッドをここで終わらせられるとあったのでつけた(breakだと31行目を処理してしまう)
        default:
        	System.out.println("\n" + "---選択外の数値が入力されました---");
        	return; // これでmainメソッドをここで終わらせられるとあったのでつけた(breakだと31行目を処理してしまう)
        }
        System.out.print("\n" + "1つ目の数値 ->");
        int num1 = scan.nextInt();
        System.out.print("\n" + "2つ目の数値 ->");
        int num2 = scan.nextInt();

// 計算機能メソッドを呼び出す
        calculate(num1, num2, num); // calculateメソッド、引数あり
        
}

 // 四則演算メソッド
	    public static void calculate(int a, int b, int c) { // 戻り値を何にすればよいかわからなかったので、とりあえずvoidで設定
	    	switch (c) {
	    	case 1:
	        	System.out.println("\n" + "---加算結果---\n");
	        	System.out.println("加算：" + (a + b) + "\n");
	        	break;
	        case 2:
	        	System.out.println("\n" + "---減算結果---\n");
	            System.out.println("減算：" + (a - b) + "\n");
	        	break;
	        case 3:
	        	System.out.println("\n" + "---乗算結果---\n");
	            System.out.println("乗算：" + (a * b) + "\n");
	        	break;
	        case 4:
	        	System.out.println("\n" + "---除算結果---\n");
	            System.out.println("除算：" + (a / b) + "\n"); // 0除算は考慮せず
	        	break;
	    	}
	        System.out.println("--- 計算終了 ---");
	    }
	}


