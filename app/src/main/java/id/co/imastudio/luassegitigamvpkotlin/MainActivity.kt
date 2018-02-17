package id.co.imastudio.luassegitigamvpkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {


    lateinit var presenter : HitungPresenterImp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initPresenter()
        initView()
    }
    override fun kosong() {
        Toast.makeText(this,"tidak boleh kosonh",
                Toast.LENGTH_SHORT).show()
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hasil(nilai: String) {
        texthasil.text = nilai
       // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    private fun initView() {

        btnHitung.setOnClickListener {
            presenter.hitungluas(inputAlas,inputTinggi)

        }
       // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun initPresenter() {

        presenter = HitungPresenterImp(this)

      //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
