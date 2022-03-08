package com.example.simplecountdowntimer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.simplecountdowntimer.databinding.FragmentSettimerBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class SettimerFragment : Fragment() {

    private var _binding: FragmentSettimerBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSettimerBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnShowtimer.setOnClickListener {
            val action = SettimerFragmentDirections.actionSettimerFragmentToShowtimerFragment(
                timerTitel = binding.editTitle.text.toString(),
                timerTime = binding.editTime.text.toString())
            findNavController().navigate(action)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}