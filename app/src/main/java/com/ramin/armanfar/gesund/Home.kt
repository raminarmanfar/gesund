package com.ramin.armanfar.gesund

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation

class Home : Fragment(), View.OnClickListener {

    companion object {
        fun newInstance() = Home()
    }

    private lateinit var viewModel: HomeViewModel
	lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
        // TODO: Use the ViewModel
    }

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		navController = Navigation.findNavController(view)
		view.findViewById<Button>(R.id.btnCaloriesList).setOnClickListener(this)
		view.findViewById<Button>(R.id.btnFoodsRecipes).setOnClickListener(this)
		view.findViewById<Button>(R.id.btnMyDiets).setOnClickListener(this)
		view.findViewById<Button>(R.id.btnSettings).setOnClickListener(this)
		view.findViewById<Button>(R.id.btnAboutMe).setOnClickListener(this)
	}

	override fun onClick(v: View?) {
		when (v!!.id) {
			R.id.btnCaloriesList -> navController!!.navigate(R.id.action_home_to_caloriesList)
			R.id.btnFoodsRecipes -> navController!!.navigate(R.id.action_home_to_foodsRecipes)
			R.id.btnMyDiets -> navController!!.navigate(R.id.action_home_to_myDiets)
			R.id.btnSettings -> navController!!.navigate(R.id.action_home_to_settings)
			R.id.btnAboutMe -> navController!!.navigate(R.id.action_home_to_aboutMe)
		}
	}

}
