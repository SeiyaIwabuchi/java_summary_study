package org.example;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 収入クラス
 */
class Kyuyo {
    private int shikyuYyyy;
    private int shikyuMm;
    private int shikyuDd;
    private String shozoku;
    private String shokuinMai;
    private String koumoku;
    private int kingkau;

    public Kyuyo(int shikyuYyyy, int shikyuMm, int shikyuDd, String shozoku, String shokuinMai, String koumoku, int kingkau) {
        this.shikyuYyyy = shikyuYyyy;
        this.shikyuMm = shikyuMm;
        this.shikyuDd = shikyuDd;
        this.shozoku = shozoku;
        this.shokuinMai = shokuinMai;
        this.koumoku = koumoku;
        this.kingkau = kingkau;
    }

    public int getShikyuYyyy() {
        return shikyuYyyy;
    }

    public void setShikyuYyyy(int shikyuYyyy) {
        this.shikyuYyyy = shikyuYyyy;
    }

    public int getShikyuMm() {
        return shikyuMm;
    }

    public void setShikyuMm(int shikyuMm) {
        this.shikyuMm = shikyuMm;
    }

    public int getShikyuDd() {
        return shikyuDd;
    }

    public void setShikyuDd(int shikyuDd) {
        this.shikyuDd = shikyuDd;
    }

    public String getShozoku() {
        return shozoku;
    }

    public void setShozoku(String shozoku) {
        this.shozoku = shozoku;
    }

    public String getShokuinMai() {
        return shokuinMai;
    }

    public void setShokuinMai(String shokuinMai) {
        this.shokuinMai = shokuinMai;
    }

    public String getKoumoku() {
        return koumoku;
    }

    public void setKoumoku(String koumoku) {
        this.koumoku = koumoku;
    }

    public int getKingkau() {
        return kingkau;
    }

    public void setKingkau(int kingkau) {
        this.kingkau = kingkau;
    }

    @Override
    public String toString() {
        return "Shunyu{" +
                "shikyuYyyy=" + shikyuYyyy +
                ", shikyuMm=" + shikyuMm +
                ", shikyuDd=" + shikyuDd +
                ", shozoku='" + shozoku + '\'' +
                ", shokuinMai='" + shokuinMai + '\'' +
                ", koumoku='" + koumoku + '\'' +
                ", kingkau=" + kingkau +
                '}';
    }

    public static List<Kyuyo> genData(){
        List<Kyuyo> shunyuses = new LinkedList<>();

        shunyuses.add(
                new Kyuyo(2022, 6, 25,
                        "運用部", "佐藤 太郎", "給与", 100000)
        );

        shunyuses.add(
                new Kyuyo(2022, 6, 25,
                        "運用部", "安倍 次郎", "給与", 100000)
        );

        shunyuses.add(
                new Kyuyo(2022, 6, 25,
                        "製造部", "葛西 三郎", "給与", 100000)
        );

        shunyuses.add(
                new Kyuyo(2022, 6, 25,
                        "総務部", "田辺 四郎", "給与", 100000)
        );

        shunyuses.add(
                new Kyuyo(2022, 6, 30,
                        "総務部", "田辺 四郎", "賞与", 200000)
        );

        return new ArrayList<>(shunyuses);
    }
}

public class Main {

    // データ生成
    static List<Kyuyo> kyuyos = Kyuyo.genData();

    public static void main(String[] args) {
        // 問題ごとにメソッド作成するように
        // 作成したメソッドをmainメソッドで呼ぶように
        // 表示する系はtoString使ってね

        // 問題１：給与一覧を表示する

        // 問題２：職員全員の給与と賞与を合わせた総額を表示する

        // 問題３：職員全員の給与総額と賞与の総額をそれぞれ表示する

        // 問題４：所属一覧を表示する 重複してもよき

        // 問題５：所属一覧を重複がないように表示する

        // 問題６：所属ごとの給与と総務を合わせた総額を表示する
    }

    // 問題１：給与一覧を表示する

    // 問題２：職員全員の給与と賞与を合わせた総額を表示する

    // 問題３：職員全員の給与総額と賞与の総額をそれぞれ表示する

    // 問題４：所属一覧を表示する 重複してもよき

    // 問題５：所属一覧を重複がないように表示する

    // 問題６：所属ごとの給与と総務を合わせた総額を表示する
}















































































































/**
 * 答え
 */
class Kotae {

    // データ生成
    static List<Kyuyo> kyuyos = Kyuyo.genData();

    public static void main(String[] args) {
        // 問題ごとにメソッド作成するように
        // 作成したメソッドをmainメソッドで呼ぶように

        // 問題１：給与一覧を表示する
        q1();

        // 問題２：職員全員の給与と賞与を合わせた総額を表示する
        q2();

        // 問題３：職員全員の給与総額と賞与の総額をそれぞれ表示する
        q3();

        // 問題４：所属一覧を表示する 重複してもよき
        q4();

        // 問題５：所属一覧を重複がないように表示する
        q5();

        // 問題６：所属ごとの給与と総務を合わせた総額を表示する
        q6();
    }

    // 問題１：給与一覧を表示する
    public static void q1(){
        for(Kyuyo k : kyuyos){
            System.out.println(k);
        }
    }

    // 問題２：職員全員の給与と賞与を合わせた総額を表示する
    public static void q2() {
        int sum = 0;
        for(Kyuyo k : kyuyos){
            sum += k.getKingkau();
        }
        System.out.println(sum);
    }

    // 問題３：職員全員の給与総額と賞与の総額をそれぞれ表示する
    public static void q3() {
        int kyuyo = 0;
        int shoyo = 0;
        for(Kyuyo k : kyuyos){
            if (k.getKoumoku().equals("給与")) {
                kyuyo += k.getKingkau();
            } else {
                shoyo += k.getKingkau();
            }
        }
        System.out.printf("給与:%d, 賞与:%d\n", kyuyo, shoyo);
    }

    // 問題４：所属一覧を表示する 重複してもよき
    public static void q4() {
        for (Kyuyo k : kyuyos) {
            System.out.println(k.getShozoku());
        }
    }

    // 問題５：所属一覧を重複がないように表示する
    public static void q5() {
        //重複を認めい -> Setを使おう
        Set<String> set = new HashSet<>();
        for(Kyuyo k : kyuyos) {
            set.add(k.getShozoku());
        }
        System.out.println(set);
    }

    // 問題６：所属ごとの給与と総務を合わせた総額を表示する
    public static void q6() {
        // なんとかごとの時はMapを使おう
        Map<String, Integer> shozokuGoto = new HashMap<>();
        for (Kyuyo k : kyuyos) {
            String shozoku = k.getShozoku(); // 使いまわす用
            int kingaku = k.getKingkau();
            if(shozokuGoto.containsKey(shozoku)) { // すでにあるとき
                int a = shozokuGoto.get(shozoku); // 一度取り出して
                int b = a + kingaku; // 足して
                shozokuGoto.put(shozoku, b); // 入れる
            } else { // ない時
                shozokuGoto.put(shozoku, kingaku); // 入れるだけ
            }
        }
        System.out.println(shozokuGoto);
    }
}