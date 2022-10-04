package com.example.activity2

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var imgId: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        popup_Menu();
        imgId = findViewById(R.id.imgId);

        registerForContextMenu(imgId)

    }


    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        var menuInflater = getMenuInflater()
        menuInflater.inflate(R.menu.optionmenu, menu)
        super.onCreateContextMenu(menu, v, menuInfo)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item?.itemId) {
            R.id.backId -> {
                Toast.makeText(this, "Back", Toast.LENGTH_SHORT).show()
            }

            R.id.dimgId -> {
                Toast.makeText(this, "Dowunloding", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.timgId -> {
                Toast.makeText(this, "Opening in new tab", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.gimgId -> {
                Toast.makeText(this, "Googling image", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.simgId -> {
                Toast.makeText(this, "Sharing", Toast.LENGTH_SHORT).show()
                return true
            }

            else -> {
                Toast.makeText(this, "Else", Toast.LENGTH_SHORT).show()
                return false
            }
        }
        return super.onContextItemSelected(item)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.popmenuitem, menu)
        return super.onCreateOptionsMenu(menu)
    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == R.id.backId){
            Toast.makeText(this, "back", Toast.LENGTH_SHORT).show()
        }

        if (item.itemId == R.id.barId){
            Toast.makeText(this, "Bar", Toast.LENGTH_SHORT).show()
        }

        if (item.itemId == R.id.blankId){
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show()
        }

        if (item.itemId == R.id.searchId){
            Toast.makeText(this, "Searching", Toast.LENGTH_SHORT).show()
        }


        if (item.itemId == R.id.silentId){
            Toast.makeText(this, "chup kr", Toast.LENGTH_SHORT).show()
        }

        if (item.itemId == R.id.threedotsId){
            Toast.makeText(this, "Showing", Toast.LENGTH_SHORT).show()
        }

        return true

        }




}
