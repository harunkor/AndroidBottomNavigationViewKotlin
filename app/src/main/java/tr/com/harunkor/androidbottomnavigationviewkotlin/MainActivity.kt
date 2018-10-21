package tr.com.harunkor.androidbottomnavigationviewkotlin

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigationbottombar.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)


        commitFragment(FragmentHome())

    }


    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {

                commitFragment(FragmentHome())

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {

                commitFragment(FragmentDashboard())

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {

                commitFragment(FragmentNotif())
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }



    private fun commitFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .setCustomAnimations(R.anim.design_bottom_sheet_slide_in, R.anim.design_bottom_sheet_slide_out)
            .replace(R.id.content, fragment, fragment.javaClass.simpleName)
            .commit()
    }


}
