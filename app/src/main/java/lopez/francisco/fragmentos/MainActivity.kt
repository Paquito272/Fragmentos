package lopez.francisco.fragmentos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener (this)
        btn2.setOnClickListener (this)
        btn3.setOnClickListener (this)
    }

    override fun onClick(v: View?) {

        var f:Fragment? = null

        when(v!!.id){
            R.id.btn1-> {
                f = PrimeFragment.newInstance("", "")
            }
            R.id.btn2-> {
                f = segundoFragment.newInstance("", "")
            }
            R.id.btn3-> {
                f = tercerFragment.newInstance("", "")
            }

        }

        supportFragmentManager.beginTransaction().replace(R.id.idConteiner, f!!).commitNow()

    }
}
