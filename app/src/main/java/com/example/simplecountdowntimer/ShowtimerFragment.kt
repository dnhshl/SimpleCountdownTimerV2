package com.example.simplecountdowntimer

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.simplecountdowntimer.databinding.FragmentShowtimerBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class ShowtimerFragment : Fragment() {

    val args: ShowtimerFragmentArgs by navArgs()
    private var _binding: FragmentShowtimerBinding? = null

    private val TAG = "ShowtimerFragment"

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentShowtimerBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val timerTitel = args.timerTitel
        val timerTime = args.timerTime

        Log.i(TAG, "Titel $timerTitel Time $timerTime")

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}