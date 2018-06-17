package info.jnsk.www.misskitter.view

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import info.jnsk.www.misskitter.R
import info.jnsk.www.misskitter.model.Note

class NotesView: FrameLayout {
    constructor(context: Context?): super(context)

    constructor(context: Context?,
                attrs: AttributeSet?): super(context,attrs)

    constructor(context: Context?,
                attrs: AttributeSet?,
                defStyleAttr: Int): super(context,attrs,defStyleAttr)

    constructor(context: Context?,
                attrs: AttributeSet?,
                defStyleAttr: Int,
                deStyleRes: Int): super(context,attrs,defStyleAttr,deStyleRes)

    var profileImageView: ImageView? = null

    var noteTextView: TextView? = null

    var userNameTextView: TextView? = null

    init {
        LayoutInflater.from(context).inflate(R.layout.activity_main, this)
        profileImageView = findViewById(R.id.user_icon) as ImageView
        noteTextView = findViewById(R.id.noteText) as TextView
        userNameTextView = findViewById(R.id.username) as TextView
    }

    fun setNote(note: Note){
        noteTextView?.text = note.text
        userNameTextView?.text = note.user.username

        profileImageView?.setBackgroundColor(Color.BLUE)
    }
}