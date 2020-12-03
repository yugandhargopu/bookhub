package com.example.bookhub.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bookhub.R
import com.example.bookhub.adapter.DashboardRecyclerAdapter
import com.example.bookhub.model.Book

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DashboardFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DashboardFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    lateinit var recycleDashboard : RecyclerView
    lateinit var layoutManager : RecyclerView.LayoutManager

    val booklist = arrayListOf(
        "P.S I LOVE YOU",
        "The greatest Gatsby",
        "Anna Karenina",
        "Madame Bovary",
        "War and Peace",
        "Lolita",
        "Middlemarch",
        "The Advantages of Huckleberry Pain",
        "Moby_dick",
        "The Loard of Rings"
    )

    lateinit var recyclerAdapter: DashboardRecyclerAdapter

    val bookInfoList = arrayListOf<Book>(
        Book("P.S I Love You","Cecilia Ahren","Rs.200","4.6",R.drawable.ilu),
                Book("The Greatest Gatsby","F.S.Fitzgerald","Rs.300","4.2",R.drawable.ggb),
        Book("Anna Karenina","Leo Tolstoy","Rs.269","4.5",R.drawable.ak),
        Book("Madame Bovary","Gustave Flaubert","Rs.320","4.3",R.drawable.mb),
        Book( "War and Peace","Vladimir Nobokov","Rs.412","4.7",R.drawable.wap),
        Book( "Lolita","LeoTolstoy","Rs.230","4.6",R.drawable.lol),
        Book("Middlemarch","Cecilia Ahren","Rs.200","4.6",R.drawable.ilu),
        Book("The Advantages of Huckleberry Pain","Cecilia Ahren","Rs.200","4.6",R.drawable.ilu),
        Book("Moby_dick","Cecilia Ahren","Rs.200","4.6",R.drawable.ilu),
        Book("The Loard of Rings","Cecilia Ahren","Rs.200","4.6",R.drawable.ilu),



    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_dashboard, container, false)
        recycleDashboard = view.findViewById(R.id.recycleDashboard)

        layoutManager = LinearLayoutManager(activity)

        recyclerAdapter = DashboardRecyclerAdapter(activity as Context,bookInfoList)
        recycleDashboard.adapter= recyclerAdapter
        recycleDashboard.layoutManager=layoutManager

        recycleDashboard.addItemDecoration(DividerItemDecoration(recycleDashboard.context,
            (layoutManager as LinearLayoutManager).orientation))

        return view;

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DashboardFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DashboardFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}