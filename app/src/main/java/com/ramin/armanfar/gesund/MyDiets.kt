package com.ramin.armanfar.gesund

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MyDiets : Fragment() {

	companion object {
		fun newInstance() = MyDiets()
	}

	private lateinit var viewModel: MyDietsViewModel

	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		return inflater.inflate(R.layout.my_diets_fragment, container, false)
	}

	override fun onActivityCreated(savedInstanceState: Bundle?) {
		super.onActivityCreated(savedInstanceState)
		viewModel = ViewModelProviders.of(this).get(MyDietsViewModel::class.java)
		// TODO: Use the ViewModel
	}

}
