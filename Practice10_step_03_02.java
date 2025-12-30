// 失敗作
import java.util.Scanner;

public class Practice10_step_03 {
    public static String enzan;
    public static int[] ans = new int[5]; // 履歴を保持
    public static int index = 0;          // 記録位置を保持

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("\n---計算の種類を選択してください(0で終了)---\n");
            System.out.print("1:加算 2:減算 3:乗算 4: 除算 ->");
            int num = scan.nextInt();

            if (num == 0) {
                System.out.println("\n---計算終了---");
                break;
            }

            if (num < 1 || num > 4) {
                System.out.println("\n0～4を入力してください");
                continue;
            }

            switch (num) {
                case 1: enzan = "加算"; break;
                case 2: enzan = "減算"; break;
                case 3: enzan = "乗算"; break;
                case 4: enzan = "除算"; break;
            }

            System.out.print("\n1つ目の数値 ->");
            int num1 = scan.nextInt();
            System.out.print("2つ目の数値 ->");
            int num2 = scan.nextInt();

            int result = 0;
            switch (num) {
                case 1: result = num1 + num2; break;
                case 2: result = num1 - num2; break;
                case 3: result = num1 * num2; break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("0で割ることはできません！");
                        continue;
                    }
                    result = num1 / num2;
                    break;
            }

            System.out.println("\n--- 計算結果 ---");
            System.out.println(enzan + ":" + result);

            // 履歴に記録（リングバッファ）
            ans[index] = result;
            index = (index + 1) % 5;

            // 履歴の表示
            System.out.print("計算の記録:");
            for (int i = 0; i < 5; i++) {
                System.out.print("[" + ans[i] + "]");
            }
            System.out.println();
        }

        scan.close();
    }
}



