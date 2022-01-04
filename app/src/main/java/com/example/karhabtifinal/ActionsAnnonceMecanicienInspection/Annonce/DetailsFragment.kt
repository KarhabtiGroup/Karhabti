package com.example.karhabtifinal.ActionsAnnonceMecanicienInspection.Annonce

import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class DetailsFragment : Fragment() {
    lateinit var pic: ImageView
    lateinit var titre: TextView
    lateinit var marque: TextView
    lateinit var description: TextView
    lateinit var gouvernorat: TextView

    lateinit var delegation: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //   setContentView(R.layout.activity_detail)

        fun loadImageToMovie(
            context: Context,
            source: ByteArray,
            target: ImageView,
            placeholder: Drawable?
        ) {
            if (source == null) {
                Glide.with(context).load(placeholder).into(target)
            } else {
                Glide.with(context).load(source).placeholder(placeholder).error(placeholder)
                    .into(target)
            }
        }

        /*     @RequiresApi(Build.VERSION_CODES.O)
        fun onBindViewHolder(holder: AnnonceViewHolder, position: Int) {

                 val edc = annonce
            holder.titre.text=edc.titre
            holder.description.text = edc.description
            holder.marque.text = edc.marque
            //loadImageToMovie(context,edc.image.toByteArray(),holder.pic,null)
            val myByteArray = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                Base64.getDecoder().decode(edc.image)
            } else {
                TODO("VERSION.SDK_INT < O")
            }
            loadImageToMovie(context, myByteArray, holder.pic, null)

        }*/
    }

}