package id.co.imastudio.luassegitigamvpkotlin

import android.widget.EditText

/**
 * Created by nandoseptianhusni on 2/17/18.
 */
class HitungPresenterImp : HitungPresenter {

    var modelview : MainView? = null

    constructor(modelview: MainView?) {
        this.modelview = modelview
    }


    override fun hitungluas(nilai1: EditText, nilai2: EditText) {
        //ambil inputan user
        var a = nilai1.text.toString()
        var t = nilai2.text.toString()

        //check inputan user
        if(a.isNotEmpty() || t.isNotEmpty()) {

            //convert double
            var alas = a.toDouble()
            var tinggi = t.toDouble()

            //masukin ke rumus
            var hasil = 0.5 * alas * tinggi


            //masukin ke mainView
            modelview?.hasil(hasil.toString())

        }
        else{
            //
            modelview?.kosong()
        }

    }
}