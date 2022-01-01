package com.example.karhabtifinal


import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.FragmentTransaction
import kotlin.random.Random
import kotlin.random.Random.Default.nextInt

class AccueilFragment : Fragment() {
    val pickImage = 100
    var imageUri: Uri? = null
    var stringUri: String = ""
    var arrayOfColors = arrayOf(Color.GREEN)
    var size = arrayOfColors.size
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        lateinit var imageView: ImageView
        val recherche = view?.findViewById<Button>(R.id.buttonSearch)
        val view =inflater.inflate(R.layout.fragment_accueil, container, false)
        val voiture1 = view?.findViewById<ImageView>(R.id.voiture1)
        val voiture2 = view?.findViewById<ImageView>(R.id.voiture2)
        val voiture3 = view?.findViewById<ImageView>(R.id.voiture3)
        val voiture4 = view?.findViewById<ImageView>(R.id.voiture4)
        val voiture5 = view?.findViewById<ImageView>(R.id.voiture5)
        val voiture6 = view?.findViewById<ImageView>(R.id.voiture6)
        val voiture7 = view?.findViewById<ImageView>(R.id.voiture7)
        val voiture8 = view?.findViewById<ImageView>(R.id.voiture8)
        val voiture9 = view?.findViewById<ImageView>(R.id.voiture9)
        val voiture10 = view?.findViewById<ImageView>(R.id.voiture10)
        val voiture11 = view?.findViewById<ImageView>(R.id.voiture11)
        val voiture12 = view?.findViewById<ImageView>(R.id.voiture12)

        voiture1?.setOnClickListener {
            voiture1.setColorFilter(arrayOfColors[nextInt(size)])
        }

        voiture2?.setOnClickListener {
            voiture2.setColorFilter(arrayOfColors[nextInt(size)])

        }

        voiture3?.setOnClickListener {
            voiture3.setColorFilter(arrayOfColors[nextInt(size)])

        }

        voiture4?.setOnClickListener {
            voiture4.setColorFilter(arrayOfColors[nextInt(size)])

        }

        voiture5?.setOnClickListener {
            voiture5.setColorFilter(arrayOfColors[nextInt(size)])

        }

        voiture6?.setOnClickListener {
            voiture6.setColorFilter(arrayOfColors[nextInt(size)])

        }

        voiture7?.setOnClickListener {
            voiture7.setColorFilter(arrayOfColors[nextInt(size)])

        }

        voiture8?.setOnClickListener {
            voiture8.setColorFilter(arrayOfColors[nextInt(size)])

        }

        voiture9?.setOnClickListener {
            voiture9.setColorFilter(arrayOfColors[nextInt(size)])

        }

        voiture10?.setOnClickListener {
            voiture10.setColorFilter(arrayOfColors[nextInt(size)])

        }
        voiture11?.setOnClickListener {
            voiture11.setColorFilter(arrayOfColors[nextInt(size)])

        }

        voiture12?.setOnClickListener {
            voiture12.setColorFilter(arrayOfColors[nextInt(size)])

        }
        voiture12?.setOnClickListener {
            voiture12.setColorFilter(arrayOfColors[nextInt(size)])

        }
        recherche?.setOnClickListener {

        }


        return view
    }


}