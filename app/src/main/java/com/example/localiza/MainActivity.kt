package com.example.localiza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(ehUmBomFilme("Vingadores: Endgame"))
        criarNumeros()

    }

    fun ehUmBomFilme(filme: String?): String{
       return when{
           filme.isNullOrEmpty() -> "Erro, preciso de um nome para avaliar"
           filme.length < 5 -> "um nome tão curto não pode ser bom"
           else -> "é, talvez seja bom!"
       }
    }
    fun criarNumeros(){
        val list = List(10){it+1}
        var mutableList = mutableListOf<String>()
        list.forEach {
            mutableList.add(if (it%2 == 0 ) it.toString() else "-")
        }
        println(mutableList)
    }


}
