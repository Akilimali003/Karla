package nisoft.nl.karla

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //call the method
        init()
    }

    /**** METHODS ***/
    private fun init(){
        button.setOnClickListener {
            val alert = AlertDialog.Builder(this)
            alert.setTitle("Quitter")
            alert.setMessage("Voulez-vous quitter ?")
            alert.setPositiveButton("Ok"){
                    dialog: DialogInterface?, which: Int ->
                finish()
            }
            alert.show()
        }
    }
}
