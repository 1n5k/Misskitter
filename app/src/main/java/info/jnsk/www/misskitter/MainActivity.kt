package info.jnsk.www.misskitter

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.net.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    val uri: Uri = Uri.parse("https://misskey.xyz/")
    //val intent  = Intent(Intent.ACTION_VIEW::class.java,uri)

}
