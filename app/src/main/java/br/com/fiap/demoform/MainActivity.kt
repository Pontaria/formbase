package br.com.fiap.demoform

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.demoform.model.Carro
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btCadastrar.setOnClickListener {

            val proximaTela = Intent (this, ConclusaoActivity::class.java)
            proximaTela.putExtra("MODELO", imputModelo.text.toString())
            proximaTela.putExtra("PLACA", imputePlaca.text.toString())

            val carro = Carro(imputModelo.text.toString(),imputePlaca.text.toString())
            proximaTela.putExtra("CARRO", carro)

            startActivity(proximaTela)

        }
    }
}
