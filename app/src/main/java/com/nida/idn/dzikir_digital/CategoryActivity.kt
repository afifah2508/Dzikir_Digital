package com.nida.idn.dzikir_digital

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_category.*
import kotlinx.android.synthetic.main.itempagi.*

class CategoryActivity : AppCompatActivity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        btn_pagi.setOnClickListener(this)
        btn_petang.setOnClickListener(this)
        btn_doa_pilihan.setOnClickListener(this)
        btn_bada_shalat.setOnClickListener(this)
    }
    override fun onClick(p0: View){
       when (p0.id){
           R.id.btn_pagi->{
               val intentMove = Intent(this, PagiActivity::class.java)
               startActivity(intentMove)
           }
           R.id.btn_petang ->{
               val intenMove2 = Intent(this,PetangActivity::class.java)
           }
           R.id.btn_doa_pilihan ->{
               val intenMove3 = Intent(this,DoaPilihanActivity::class.java)
           }
           R.id.btn_bada_shalat ->{
               val intenView4 = Intent(this,DzikirShalatActivity::class.java)
           }
       }
    }
}



