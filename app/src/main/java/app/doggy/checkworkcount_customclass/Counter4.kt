package app.doggy.checkworkcount_customclass

import android.util.Log

// 手順4
class Counter4(count: Int) {
    var count: Int = count
        // countプロパティの値をクラス外で変更できないようにする
        private set

    // インスタンス化した時に実行する初期化処理
    init {
        // インスタンスの個数numberの値を1増やす
        number += 1

        // インスタンスの個数をLogcatに出力する
        Log.d(NUMBER, "${number}個目のCounter4インスタンスを生成しました")
    }

    fun incr() {
        count += 1
    }

    companion object {
        // 生成したCounter4クラスのインスタンスの個数を数えるプロパティ
        private var number: Int = 0

        // 出力するログのタグ
        private const val NUMBER = "NUMBER"
    }
}