package info.jnsk.www.misskitter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.net.*
import android.app.Activity
import android.content.Intent
import android.widget.Button
import android.widget.Toast

class SubActivity:  AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        // Display passed value from MainActivity
        Toast.makeText(this,"${intent.extras.get("number")},${intent.extras.get("string")}",Toast.LENGTH_LONG).show()

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener() {
            // Configuration pass value
            val intent: Intent = Intent()
            intent.putExtra("number", 300)
            intent.putExtra("string", "The message from SubActivity")

            // Call onActivityResult of MainActivity with SubActivity information
            setResult(Activity.RESULT_OK,intent)

            // Close SubActivity
            finish()
        }
    }
}