package com.example.karhabtifinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.karhabtifinal.Accounts.ProfileFragment
import com.example.karhabtifinal.Inspections.InspectionFragment
import kotlinx.android.synthetic.main.bottom_navigation_bar.*

class MainActivity : AppCompatActivity() {

    val addfragment = AjouterAnnonceFragment()
    val annoncefragment = AnnoncesFragment()
val mecanicienfragment =  MecanicienFragment()
    val inspectionfragment = InspectionFragment()
    val homefragment = AccueilFragment()
    val profilefragment = ProfileFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        replacefragment(inspectionfragment )

        bottom_navigation.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.ic_add->replacefragment(addfragment)
                R.id.ic_home->replacefragment(homefragment)
                R.id.ic_profile->replacefragment(profilefragment)



            }
            true

        }
    }

    fun replacefragment(fragment: Fragment)
    {
        if(fragment!=null)
        {
            val transaction =supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainerView,fragment)
            transaction.commit()
        }

    }


}