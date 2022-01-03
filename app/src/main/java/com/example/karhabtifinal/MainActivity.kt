package com.example.karhabtifinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.example.karhabtifinal.Accounts.ProfileFragment
import kotlinx.android.synthetic.main.bottom_navigation_bar.*
import android.view.View
import android.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.onNavDestinationSelected
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.toolbar.*
import androidx.navigation.ui.setupActionBarWithNavController as setupActionBarWithNavController1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navView: NavigationView = findViewById(R.id.include2)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
       // navController = navHostFragment.findNavController()

        val bottomNavigationView=findViewById<BottomNavigationView>(R.id.bottom_navigation)
        val navController = findNavController(R.id.fragmentContainerView)
        bottomNavigationView.setupWithNavController(navController)
        setupActionBarWithNavController1(navController)
        navView.setupWithNavController(navController)

    }
}















//        /* val navHostFragment =
//         val addfragment = AjouterAnnonceFragment()
//
//    val annoncefragment = AnnoncesFragment()
//val mecanicienfragment =  MecanicienFragment()
//    val homefragment = AccueilFragment()
//    val profilefragment = ProfileFragment()
//            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
//        setupActionBarWithNavController(navController)
//        setSupportActionBar(toolbar2)
//        bottom_navigation.setupWithNavController(navController)
//
//    }
//
//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.menu, menu)
//        return true
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return if (item.itemId == R.id.termsAndConditions) {
//            val action = NavGraphDirections.actionGlobalTermsFragment()
//            navController.navigate(action)
//            true
//        } else {
//            item.onNavDestinationSelected(navController) || super.onOptionsItemSelected(item)
//        }
//    }
//
//    override fun onSupportNavigateUp(): Boolean {
//        return navController.navigateUp() || super.onSupportNavigateUp()
//    }
//}
//      //  replacefragment(mecanicienfragment )
//       /* bottom_navigation.setOnNavigationItemSelectedListener{
//            when(it.itemId){
//                R.id.ic_add->replacefragment(addfragment)
//                R.id.ic_home->replacefragment(homefragment)
//                R.id.ic_profile->replacefragment(profilefragment)
//
//            }
//            true
//
//        }
//    }
//
//    fun replacefragment(fragment: Fragment)
//    {
//        if(fragment!=null)
//        {
//            val transaction =supportFragmentManager.beginTransaction()
//            transaction.replace(R.id.fragmentContainerView,fragment)
//            transaction.commit()
//        }
//*/
////    }
////
////
////}*/
//
