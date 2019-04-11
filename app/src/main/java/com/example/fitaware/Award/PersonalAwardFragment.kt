package com.example.fitaware.Award


import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.widget.SwipeRefreshLayout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fitaware.R
import android.widget.AdapterView
import android.widget.GridView
import android.widget.ListView
import com.example.fitaware.Team.Member
import com.example.fitaware.Team.MemberAdapter
import java.util.ArrayList


class PersonalAwardFragment : Fragment() {

    private var awards = ArrayList<Award>(1)
    private lateinit var awardsAdapter: AwardAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(
            R.layout.fragment_personal_award, container,
            false)
        setHasOptionsMenu(true)

        val gridViewPersonalAwards = view.findViewById<GridView>(R.id.gridViewPersonalAwards)

        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.ic_first)
        awards.add(Award(bitmap, "Best of Day", "4/10/2019"))


        awardsAdapter = AwardAdapter(
            activity,
            R.layout.awards,
            awards
        )
        gridViewPersonalAwards.adapter = awardsAdapter

        gridViewPersonalAwards.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

        }

        return view
    }


}
