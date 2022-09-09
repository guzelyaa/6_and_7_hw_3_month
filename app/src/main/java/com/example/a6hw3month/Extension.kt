package com.example.a6hw3month

import android.content.Context
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.DialogTitle

fun Context.showText (msg:String){
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}


fun Context.alertDialog (title: String, message : String, toast : String){
    var alertDialog = AlertDialog.Builder(this)
    alertDialog.setTitle(title)
    alertDialog.setMessage(message)
    alertDialog.setNegativeButton("No"){alert, _ ->
        alert.dismiss()
    }
    alertDialog.setPositiveButton("Yes"){alert, _ ->
        showText(toast)
        alert.cancel()
    }
    alertDialog.create().show()
}