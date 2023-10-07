package com.galego.restaurante_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.galego.restaurante_kotlin.adapter.FooodAdapter
import com.galego.restaurante_kotlin.databinding.ActivityMainBinding
import com.galego.restaurante_kotlin.model.Food

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var foodAdapter: FooodAdapter
    private val foodList: MutableList<Food> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerViewFood = binding.RecyclerViewFood
        recyclerViewFood.layoutManager = LinearLayoutManager(this)
        recyclerViewFood.setHasFixedSize(true)
        foodAdapter = FooodAdapter(this, foodList)
        recyclerViewFood.adapter = foodAdapter
        getFood()

    }

    private fun getFood(){
        val food1 = Food(
            imgFood = R.drawable.food1,
            foodName = "Food 10",
            foodDescription = "Batata00 frita",
            price = "R$ 50.00"
        )
        foodList.add(food1)

        val food2 = Food(
            imgFood = R.drawable.food2,
            foodName = "Food 2",
            foodDescription = "Sushi",
            price = "R$ 50.00"
        )
        foodList.add(food2)

        val food3 = Food(
            imgFood = R.drawable.food3,
            foodName = "Food 1",
            foodDescription = "Arroz com frango",
            price = "R$ 50.00"
        )
        foodList.add(food3)

        val food4 = Food(
            imgFood = R.drawable.food4,
            foodName = "Food 4",
            foodDescription = "Oovo frito",
            price = "R$ 50.00"
        )
        foodList.add(food4)

        val food5 = Food(
            imgFood = R.drawable.food5,
            foodName = "Food 5",
            foodDescription = "Azeitona",
            price = "R$ 50.00"
        )
        foodList.add(food5)

    }
}