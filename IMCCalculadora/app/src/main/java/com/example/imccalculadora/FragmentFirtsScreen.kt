package com.example.imccalculadora

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.imccalculadora.databinding.FragmentFirtsScreenBinding
import kotlinx.coroutines.NonDisposableHandle.parent
import java.math.BigDecimal

class FragmentFirtsScreen : Fragment() {

    private lateinit var binding: FragmentFirtsScreenBinding
    private lateinit var result: BigDecimal


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (activity as MainActivity?)
            ?.setActionBarTitle("IMC Calculadora")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirtsScreenBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonCalcular.setOnClickListener {
            calculate()
            bundleCreator()
        }

    }

    fun bundleCreator() {
        val bundle = Bundle().apply {
            putString(RESULT, "$result")
        }

        findNavController().navigate(
            R.id.action_fragmentFirtsScreen_to_fragmentScreenOfAnswer2,
            bundle
        ) //code responsible for navigating for the first screen for the second screen


    }

    private fun calculate() {
        val answerpeso = binding.editTextPeso.text.toString().toFloat().toBigDecimal()
        val answeraltura = binding.editTextAltura.text.toString().toFloat().toBigDecimal()
        val alturaxaltura = answeraltura * answeraltura
        result = answerpeso / alturaxaltura

    }


    companion object {
        const val RESULT = "result"
    }


}