public class Practice07_step_02 {
    public static void main(String[] args) {
// 2次元配列の初期化
        int[][] array = new int[9][9];
// 通常のfor文で配列にデータを代入(拡張for文への置き換えがわからない??)
        for (int i = 1; i <= 9; i++) { //iを1から9まで1づつ加算
            for (int j = 1; j <= 9; j++) { //jを1から9まで1づつ加算
// 配列にデータを代入
                array[i - 1][j - 1] = i * j; // 配列番号は"0"からなので"-1"とし、i*jの結果を格納
            }
        }
// 拡張for文で配列の内容を表示 ↓ 配列と拡張for文のイメージが出来ないので、あとで再学習する
        for (int[] row : array) { // 各行(row)を取り出す
            for (int value : row) { // 各行の中の値(value)を取り出す
                System.out.print(value + " ");
            }
            System.out.println(); // 行ごとに改行
        }
    }
}
