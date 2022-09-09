package com.example.a6hw3month

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.a6hw3mon.Animal

class AnimalAdapter(private val animalList: ArrayList<Animal>, val context: Context,
private val onClick: (pos: Int) -> Unit) :
    RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        return AnimalViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_animal, parent, false)
        )
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
//        holder?.tvName.text = animalList.get(position)
        holder.bind(animalList.get(position))



    }

    override fun getItemCount(): Int {
        return animalList.size
    }

    inner class AnimalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var tvName: TextView = itemView.findViewById(R.id.text_view)
        var imageView: ImageView = itemView.findViewById(R.id.image_view)


        fun bind(animal: Animal) {
            itemView.setOnClickListener{
                onClick(adapterPosition)
            }
            Glide.with(imageView).load(animal.imageView).into(imageView)
           tvName.text = animal.name

        }

    }
}
