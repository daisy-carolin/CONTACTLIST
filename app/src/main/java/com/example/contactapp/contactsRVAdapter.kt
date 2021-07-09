package com.example.contactapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class contactsRVAdapter(var contactslist:List<Contact>): RecyclerView.Adapter<contactsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): contactsViewHolder {
        var itemView= LayoutInflater.from(parent.context)
            .inflate(R.layout.contact_list_item,parent,false)
        return contactsViewHolder(itemView)
        
    }

    override fun onBindViewHolder(holder: contactsViewHolder, position: Int) {
        var currentContact=contactslist.get(position)
        holder.tvcontactname.text=currentContact.contactname
        holder.tvphonenumber.text=currentContact.phonenumber
        holder.tvemail.text=currentContact.email

        
    }

    override fun getItemCount(): Int {
        return contactslist.size
        
    }
}
class contactsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvcontactname=itemView.findViewById<TextView>(R.id.tvcontactname)
    var tvphonenumber=itemView.findViewById<TextView>(R.id.tvphonenumber)
    var tvemail=itemView.findViewById<TextView>(R.id.tvemail)
    }
