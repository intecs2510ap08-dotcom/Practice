public class Practice05_step_02 {
    public static void main(String[] args) {
// 集合データ(配列)
        String[] fruits = {"apple", "banana", "grape", "mango", "peach"};
// 偶数インデックスの要素
        System.out.println("■偶数インデックスの要素:");
        for (int i = 0; i < fruits.length; i++) {
            if (i % 2 == 0) {
                System.out.print(fruits[i] + " ");
            }
        }
        System.out.println(); // 改行します
// 奇数インデックスの要素
        System.out.println("■奇数インデックスの要素:");
        for (int j = 0; j < fruits.length; j++) {
            if (j % 2 != 0) {
                System.out.print(fruits[j] + " ");
            }
        }
    }
}