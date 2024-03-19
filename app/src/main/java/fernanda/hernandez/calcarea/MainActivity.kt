package fernanda.hernandez.calcarea

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val txtbase =  findViewById<EditText>(R.id.txtbase)
        val txtaltura =  findViewById<EditText>(R.id.txtaltura)
        val btncalc =  findViewById<Button>(R.id.btncalc)


        //creo objeto para mandar a llamar el objeto de la calcu

        val objCalculadora = Area()


        //programar
        btncalc.setOnClickListener {
            val result =  objCalculadora.sumar(txtbase.text.toString().toInt(), txtaltura.text.toString().toInt())
            Toast.makeText( this, "Este es el resultado del area $result", Toast.LENGTH_SHORT).show()


    }
}
}