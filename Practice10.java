import java.util.Scanner;

public class Practice10 {
    public static void main(String[] args) {
// Scannerの用意
        Scanner scan = new Scanner(System.in);
// 数値の入力
        System.out.print("1つ目の数値 ->");
        int num1 = scan.nextInt();

        System.out.print("2つ目の数値 ->");
        int num2 = scan.nextInt();

// 計算機能メソッドを呼び出す
        calculate(num1, num2); // calculateメソッド、引数あり
    }

// 四則演算メソッド
    public static void calculate(int a, int b) { // 戻り値を何にすればよいかわからなかったので、とりあえずvoidで設定
        System.out.println("--- 計算結果 ---" + "\n");
        System.out.println("加算：" + (a + b) + "\n");
        System.out.println("減算：" + (a - b) + "\n");
        System.out.println("乗算：" + (a * b) + "\n");
        System.out.println("除算：" + (a / b) + "\n"); // 0除算は考慮せず
        System.out.println("--- 計算終了 ---");
    }
}
