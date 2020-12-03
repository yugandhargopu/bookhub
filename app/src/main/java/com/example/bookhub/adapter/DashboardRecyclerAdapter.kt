package com.example.bookhub.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.bookhub.R
import com.example.bookhub.model.Book

class DashboardRecyclerAdapter(val context: Context, val itemList: ArrayList<Book>) :
    RecyclerView.Adapter<DashboardRecyclerAdapter.DashboardViewHolder>()
{
    class DashboardViewHolder(view: View) :RecyclerView.ViewHolder(view){
        val txtBookName:TextView = view.findViewById(R.id.txtRecyclerRowItem)
        val txtBookAuthor : TextView = view.findViewById(R.id.txtauthorRecycle)
        val txtBookPrice : TextView = view.findViewById(R.id.txtpriceRecycle)
        val txtBookRating:TextView = view.findViewById(R.id.txtRateRecycle)
        val imageBook:ImageView = view.findViewById(R.id.imgRecyclerRowItem)
        val llcontent:LinearLayout= view.findViewById(R.id.llcontent)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DashboardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_dashboard_singlerow,parent,false)
    return DashboardViewHolder(view)
    }

    override fun onBindViewHolder(holder: DashboardViewHolder, position: Int) {
        val book = itemList[position]
        holder.txtBookName.text=book.bookname
        holder.txtBookAuthor.text=book.bookAuthor
        holder.txtBookPrice.text=book.bookCost
        holder.txtBookRating.text=book.bookRating
        holder.imageBook.setImageResource(book.bookImage)

        holder.llcontent.setOnClickListener {
            Toast.makeText(context, "clicked on ${holder.txtBookName.text}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }


}