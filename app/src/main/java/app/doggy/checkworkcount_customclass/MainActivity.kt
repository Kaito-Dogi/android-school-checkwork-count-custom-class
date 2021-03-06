package app.doggy.checkworkcount_customclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.doggy.checkworkcount_customclass.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // バインディングクラスの変数
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(this.root) }

//        // 手順1
//        // Counter1クラスをインスタンス化
//        val counter = Counter1()
//
//        // plus_buttonをクリックした時の処理
//        binding.plusButton.setOnClickListener {
//            // countプロパティの値を1増やす
//            counter.count += 1
//
//            // countプロパティの値をcount_textに表示する
//            binding.countText.text = counter.count.toString()
//        }

//        // 手順2
//        // countプロパティの初期値に0を渡し、Counter2クラスをインスタンス化
//        val counter2 = Counter2(0)
//
//        // plus_buttonをクリックした時の処理
//        binding.plusButton.setOnClickListener {
//            // countプロパティの値を1増やす
//            counter2.incr()
//
//            // countプロパティの値をcount_textに表示する
//            binding.countText.text = counter2.count.toString()
//        }

//        // 手順3
//        // countプロパティの初期値に0を渡し、Counter3クラスをインスタンス化
//        val counter3 = Counter3(0)
//
//        // plus_buttonをクリックした時の処理
//        binding.plusButton.setOnClickListener {
//            // countプロパティの値を1増やす
//            counter3.incr()
//
//            // countプロパティの値をcount_textに表示する
//            binding.countText.text = counter3.count.toString()
//        }

        // 手順4
        // countプロパティの初期値に0を渡し、Counter4クラスをインスタンス化
        val counter4 = Counter4(0)

        // plus_buttonをクリックした時の処理
        binding.plusButton.setOnClickListener {
            // countプロパティの値を1増やす
            counter4.incr()
            // counter4.count += 1

            // countプロパティの値をcount_textに表示する
            binding.countText.text = counter4.count.toString()
        }
    }
}