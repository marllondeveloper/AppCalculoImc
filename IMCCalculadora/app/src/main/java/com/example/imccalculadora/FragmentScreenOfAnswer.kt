package com.example.imccalculadora

import android.os.Bundle
import android.text.Html
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.imccalculadora.FragmentFirtsScreen.Companion.RESULT
import com.example.imccalculadora.databinding.FragmentScreenOfAnswerBinding

class FragmentScreenOfAnswer : Fragment() {

    private lateinit var binding: FragmentScreenOfAnswerBinding
    private var result: String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        (activity as MainActivity?)
            ?.setActionBarTitle("IMC Resultado")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentScreenOfAnswerBinding.inflate(inflater, container, false) // inflater of fragment in activity
        result = arguments?.getString(RESULT) as String
        binding.resultadoImcUsuario.text = result
        setupClickLink()
        return binding.root
    }

    private fun setupClickLink(){
        val textView = TextView(context)
        textView.setText(Html.fromHtml("www.linkExample.com"))
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.getItemId()) {
            android.R.id.home ->
                findNavController().popBackStack()//code responsible for navigating for the second screen to first screen

        }
        return true
    }

}