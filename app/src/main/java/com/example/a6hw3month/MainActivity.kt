package com.example.a6hw3month

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a6hw3mon.Animal
import androidx.appcompat.app.AlertDialog.Builder as AlertDialogBuilder

class MainActivity : AppCompatActivity() {

    lateinit var animallist : ArrayList<Animal>
    private lateinit var adapter: AnimalAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        animallist = ArrayList()
        addAnimals()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler)
        recyclerView.layoutManager = LinearLayoutManager(this)

        adapter = AnimalAdapter(animallist, this) {
//            var alertDialog = AlertDialog.Builder(this)
//            alertDialog.setTitle("Удалить?")
//            alertDialog.setMessage("Вы точно хотите удалить?")
//            alertDialog.setNegativeButton("No"){alert, _ ->
//                alert.dismiss()
//            }
//            alertDialog.setPositiveButton("Yes"){alert, _ ->
//               showText("Вы удалили это животное.")
//                alert.cancel()
//            }
//            alertDialog.create().show()
            alertDialog("delete?", "are you sure?", "it was deleted!")

        }
        recyclerView.adapter = adapter

    }

    private fun addAnimals() {
        animallist.add(Animal("cat", "https://cdn4.vectorstock.com/i/thumb-large/57/33/cat-clip-art-svg-eps-zip-file-cricut-cut-vector-40415733.jpg"))
        animallist.add(Animal("dog", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/89/Dog.svg/1200px-Dog.svg.png") )
        animallist.add(Animal("frog" , "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Frog_%28example%29.svg/1024px-Frog_%28example%29.svg.png"))
        animallist.add(Animal("horse", "https://freesvg.org/img/johnny_automatic_horse_silhouette.png"))
        animallist.add(Animal("lizard", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e4/Lizards.svg/2056px-Lizards.svg.png"))
    }
}