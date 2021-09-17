package com.jhy.section11

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addBtnView.setOnClickListener{
            val title = addTitleView.text.toString()
            val content=addContentView.text.toString()

            val helper = DBHelper(this)
            val db = helper.writableDatabase
            db.execSQL("insert into tb_memo (title, content) values (?,?)", arrayOf<String>(title, content))
            val cursor = db.rawQuery("select title, content from tb_memo order by _id desc limit 1", null)
            while(cursor.moveToNext()){
                resultView.setText("result ${cursor.getString(0)}, ${cursor.getString(1)}")
            }
            db.close()
        }

        val list = mutableListOf<String>()
        for(i in 0..10){
            list.add("Item $i")
        }
        recyclerView.adapter=MyAdapter(list)
        recyclerView.layoutManager=LinearLayoutManager(this)
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val itemTextView=itemView.itemTextView
    }

    class MyAdapter(val list: MutableList<String>): RecyclerView.Adapter<MyViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_main, parent, false)
            return MyViewHolder(view)
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            val text = list.get(position)
            holder.itemTextView.text = text
        }

        override fun getItemCount(): Int {
            return list.size
        }
    }
}