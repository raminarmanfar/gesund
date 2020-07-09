package com.ramin.armanfar.gesund

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FoodsRecipes : Fragment() {

    companion object {
        fun newInstance() = FoodsRecipes()
    }

    private lateinit var viewModel: FoodsRecipesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.foods_recipes_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FoodsRecipesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
