package com.ktyoung.chickenstock

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import com.ktyoung.chickenstock.extensions.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),
    PreferenceFragmentCompat.OnPreferenceStartFragmentCallback {
    private var currentNavController: LiveData<NavController>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(savedInstanceState == null){
            setUpBottomNavigationBar()
            supportActionBar!!.elevation = 0f
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        setUpBottomNavigationBar()
    }

    @SuppressLint("RestrictedApi")
    private fun setUpBottomNavigationBar(){
        val navGraphIds = listOf(
            R.navigation.navigation_home,
            R.navigation.navigation_add,
            R.navigation.navigation_compare,
            R.navigation.navigation_setting
        )

        val controller = bottomNavigation.setupWithNavController(
            navGraphIds, supportFragmentManager, R.id.nav_host_container, intent
        )

        controller.observe(this, Observer { navController ->
            setupActionBarWithNavController(navController)

            navController.addOnDestinationChangedListener { controller, destination, arguments ->
                if (destination.id == R.id.homeFragment) {
//                if (destination.id == R.id.homeFragment || destination.id == R.id.addFragment || destination.id == R.id.compareFragment || destination.id == R.id.settingFragment) {
                    bottomNavigation.visibility = View.VISIBLE
                    supportActionBar?.setShowHideAnimationEnabled(false)
                    supportActionBar?.hide()
                } else if (destination.id == R.id.addFragment || destination.id == R.id.compareFragment || destination.id == R.id.settingFragment) {
                    bottomNavigation.visibility = View.VISIBLE
                    supportActionBar?.setShowHideAnimationEnabled(false)
                    supportActionBar?.show()
                } else {
                    bottomNavigation.visibility = View.GONE
                    supportActionBar?.setShowHideAnimationEnabled(false)
                    supportActionBar?.show()
                }
            }
        })

        currentNavController = controller

    }

    override fun onSupportNavigateUp(): Boolean {
        return currentNavController?.value?.navigateUp() ?: false
    }

    override fun onPreferenceStartFragment(
        caller: PreferenceFragmentCompat?,
        pref: Preference?
    ): Boolean {
        // Instantiate the new Fragment
        val args = pref?.extras
        val fragment = supportFragmentManager.fragmentFactory.instantiate(
            classLoader,
            pref!!.fragment
        )
        fragment.arguments = args
        fragment.setTargetFragment(caller, 0)
        // Replace the existing Fragment with the new Fragment
        supportFragmentManager.beginTransaction()
            .replace(R.id.nav_host_container, fragment)
            .addToBackStack(null)
            .commit()
        return true
    }

}