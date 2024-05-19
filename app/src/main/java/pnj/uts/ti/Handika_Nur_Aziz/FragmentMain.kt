package pnj.uts.ti.Handika_Nur_Aziz

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class FragmentMain : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fragment_main)

        bottomNavigationView = findViewById(R.id.bottomNav)

        bottomNavigationView.setOnItemReselectedListener { menuItem ->
            when(menuItem.itemId) {
                R.id.fraghome -> {
                    replaceFragment(FragmentHome())
                    true
                }
            }
        }

        bottomNavigationView.setOnItemReselectedListener { menuItem ->
            when(menuItem.itemId) {
                R.id.fragnews -> {
                    replaceFragment(FragmentNews())
                    true
                }
            }
        }

        bottomNavigationView.setOnItemReselectedListener { menuItem ->
            when(menuItem.itemId) {
                R.id.fragprofile -> {
                    replaceFragment(FragmentProfile())
                    true
                }
            }
        }

        replaceFragment(FragmentHome())

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.frame_container, fragment).commit()

    }

}