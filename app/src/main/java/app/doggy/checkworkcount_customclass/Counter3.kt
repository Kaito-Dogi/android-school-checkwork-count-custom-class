package app.doggy.checkworkcount_customclass

import android.util.Log

class Counter3(var count: Int) {
    // インスタンス化した時に実行する初期化処理
    init {
        // インスタンスの個数numberを1つ増やす
        number += 1

        // インスタンスの個数をLogcatに出力する
        Log.d(NUMBER, "${Counter3.number}個目のインスタンスを生成しました")
    }

    fun incr() {
        count += 1
    }

    companion object {
        // 生成したCounter3クラスのインスタンスの個数を数えるプロパティ
        private var number: Int = 0

        // 出力するログのタグ
        private const val NUMBER = "NUMBER"
    }
}