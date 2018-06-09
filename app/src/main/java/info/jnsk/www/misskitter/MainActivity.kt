package info.jnsk.www.misskitter

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.net.*
import android.widget.Button
import android.widget.Toast

const val MY_REQUEST_CODE = 0

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configuration behavior button
        val button: Button = findViewById(R.id.button3)
        button.setOnClickListener {

            // Configuration value to SubActivity
            val intent: Intent = Intent(this,SubActivity::class.java)
            intent.putExtra("number",120)
            intent.putExtra("string","The message from MainActivity")

            // Open SubActivity
            startActivityForResult(intent, MY_REQUEST_CODE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == MY_REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            val received = data!!
            Toast.makeText(this,"${received.extras.get("number")}, ${received.extras.get("string")}", Toast.LENGTH_LONG).show()
        }
    }
    val uri: Uri = Uri.parse("https://misskey.xyz/")


}


