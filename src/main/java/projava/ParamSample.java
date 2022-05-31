package projava;

import java.util.Arrays;

/**
 * コマンドライン引数のサンプル
 */
public class ParamSample {
    /**
     * プログラム開始時に呼び出される
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        // 引数の内容を表示（配列は直接表示できないのでArraysのメソッドを使う）
        System.out.println(Arrays.toString(args));
    }

    /*
    publicではないアウタークラス
    複数のアウタークラスを一つのファイルに定義できることを示すため
     */
    class Dummy {

    }
}
