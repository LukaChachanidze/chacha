package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.assignmentrecyclerview.imageAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        recyclerView = findViewById(R.id.Recycler)

        val list = ArrayList<davaleba2>()

        list.add(davaleba2("https://www.google.com/url?sa=i&url=http%3A%2F%2Fwww.pedigreedatabase.com%2Fgerman_shepherd_dog%2Fdog.html%3Fid%3D2792607-xabu-von-aducht&psig=AOvVaw3rSqFb7o9DwjyzCuMThcbD&ust=1611423371245000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCPCVlf-JsO4CFQAAAAAdAAAAABAD"))


        val imageadapter = imageAdapter(list, this)

        recyclerView.layoutManager = GridLayoutManager(this, 2)

        recyclerView.adapter = imageadapter
    }

}