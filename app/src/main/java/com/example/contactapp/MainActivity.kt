package com.example.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvcontacts: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayCourse()
    }
    fun displayCourse(){
        var contactslist= listOf<Contact>(
            Contact(contactname ="Mercy Wangari" ,"1332088389","kinyanjuimercywangari@gmail.com"),
            Contact(contactname = "Grace Maina","128993920039","mainagrace@gmail.com"),
            Contact(contactname = "Rebecca Wambui","777654332223","wambuirebeka@gmail.com"),
            Contact(contactname = "Nancy Kabura","18288291990090","kaburanancy@gmail.com"),
            Contact(contactname = "Wanjiru Njiru","1289293993982","njiruwanjiru@gmail.com"),
            Contact(contactname = "Allam Njatha","23993900490999","njathaallam@gmail.com"),
            Contact(contactname = "Frankilin Mwangi","3228388384892929","mwangifrankilin@gmail.com"),




        )
        rvcontacts=findViewById(R.id.rvcontacts)
        var contactsAdapter=contactsRVAdapter(contactslist)
        rvcontacts.layoutManager= LinearLayoutManager(baseContext)
        rvcontacts.adapter=contactsAdapter
    }
}
