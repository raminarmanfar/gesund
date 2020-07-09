package com.ramin.armanfar.gesund

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class CaloriesList : Fragment() {

	companion object {
		fun newInstance() = CaloriesList()
	}

	private lateinit var viewModel: CaloriesListViewModel

	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		return inflater.inflate(R.layout.calories_list_fragment, container, false)
	}

	override fun onActivityCreated(savedInstanceState: Bundle?) {
		super.onActivityCreated(savedInstanceState)
		viewModel = ViewModelProviders.of(this).get(CaloriesListViewModel::class.java)
		// TODO: Use the ViewModel
	}

}
