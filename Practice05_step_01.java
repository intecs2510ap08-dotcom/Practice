// さっぱりわからないから、まず考えを以下のようにメモした
// fruits.lengthで配列の数が出せる。
// fruitsの配列は {"apple","banana","grape","mango","peach"}
// だから、{0,1,2,3,4}
// 配列の大きい数から小さい方に 要素を出力させたい
// 拡張for文は配列最後尾の要素から扱うのが苦手 → インデックスを指定しないから
// → 普通のfor文が吉!!
// for (int i = fruits.length - 1; i >= 0; i--) でいいかな？ 


public class Practice05_step_01 {
    public static void main(String[] args) {
//		System.out.println("---処理開始---"); // いらないと思うが。。
// 集合データ(配列)
    	String[] fruits = {"apple","banana","grape","mango","peach"};
//    	System.out.println(fruits.length); // fruitsの配列数確認
// for文を使って要素の使用
        for (int i = fruits.length - 1; i >= 0; i--) {
            System.out.println(fruits[i] + "\n");
        }
    }
}