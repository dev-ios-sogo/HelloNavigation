package aamsco.android.hellonavigation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

/**
 * Presents how multiple steps flow could be implemented.
 */
class FlowStepFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        setHasOptionsMenu(true)

        val step = arguments?.getInt("step")
        // TODO STEP 9 - Use type-safe arguments - remove previous line!
//        val step = arguments?.let {
//            val safeArgs = FlowStepFragmentArgs.fromBundle(it)
//            safeArgs.step
//        }
        // TODO ENDSTEP 9

        return when (step) {
            1 -> inflater.inflate(R.layout.fragment_second_screen, container, false)
            else -> inflater.inflate(R.layout.fragment_main, container, false)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        view.findViewById<View>(R.id.next_button).setOnClickListener(
//                Navigation.createNavigateOnClickListener(R.id.next_action)
//        )
    }
}