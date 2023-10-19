package com.cy.nba2.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.cy.nba2.PlayerItem
import com.cy.nba2.TeamItem
import com.cy.nba2.databinding.FragmentHomeBinding

class PlayerFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(PlayerViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun getMockList() {
        val list = arrayListOf<TeamItem>()
        list.add(TeamItem(fullName = "adsiuhchaw", division = "aewqd8oiuyda8io",conference = "AEWUYHDAiuy", abbreviation = "iuYWSEDGDYGc", city = "oe8awydgo"))
        list.add(TeamItem(fullName = "awdrsihjfao", division = "aewqd8oiuyda8io",conference = "AEWUYHDAiuy", abbreviation = "iuYWSEDGDYGc", city = "oe8awydgo"))
        list.add(TeamItem(fullName = "raweuohf", division = "aewqd8oiuyda8io",conference = "AEWUYHDAiuy", abbreviation = "iuYWSEDGDYGc", city = "oe8awydgo"))
        list.add(TeamItem(fullName = "ap[ood", division = "aewqd8oiuyda8io",conference = "AEWUYHDAiuy", abbreviation = "iuYWSEDGDYGc", city = "oe8awydgo"))
        list.add(TeamItem(fullName = "9u0safy", division = "aewqd8oiuyda8io",conference = "AEWUYHDAiuy", abbreviation = "iuYWSEDGDYGc", city = "oe8awydgo"))
        list.add(TeamItem(fullName = "w43jnkkj", division = "aewqd8oiuyda8io",conference = "AEWUYHDAiuy", abbreviation = "iuYWSEDGDYGc", city = "oe8awydgo"))
        list.add(TeamItem(fullName = "a089dRECPEP07a", division = "aewqd8oiuyda8io",conference = "AEWUYHDAiuy", abbreviation = "iuYWSEDGDYGc", city = "oe8awydgo"))
        list.add(TeamItem(fullName = "EFAIUHFRED", division = "aewqd8oiuyda8io",conference = "AEWUYHDAiuy", abbreviation = "iuYWSEDGDYGc", city = "oe8awydgo"))
        list.add(TeamItem(fullName = "TURIFOKQP9", division = "aewqd8oiuyda8io",conference = "AEWUYHDAiuy", abbreviation = "iuYWSEDGDYGc", city = "oe8awydgo"))
        list.add(TeamItem(fullName = "GALEWEFER", division = "aewqd8oiuyda8io",conference = "AEWUYHDAiuy", abbreviation = "iuYWSEDGDYGc", city = "oe8awydgo"))
    }

    private fun getPlayerList() {
        val list = arrayListOf<PlayerItem>()
        list.add(PlayerItem(name = "uysdzhifyu", surname = "uyarhfifuyaew", shoeSize = "awiue9ui", height = "zfosuryfae", position = "i78zyfhiuye", team = "ZUIYHfhi"))
        list.add(PlayerItem(name = "shtsths", surname = "uyarhfifuyaew", shoeSize = "awiue9ui", height = "zfosuryfae", position = "i78zyfhiuye", team = "ZUIYHfhi"))
        list.add(PlayerItem(name = "ohilhp", surname = "uyarhfifuyaew", shoeSize = "awiue9ui", height = "zfosuryfae", position = "i78zyfhiuye", team = "ZUIYHfhi"))
        list.add(PlayerItem(name = "dcyhjcn", surname = "uyarhfifuyaew", shoeSize = "awiue9ui", height = "zfosuryfae", position = "i78zyfhiuye", team = "ZUIYHfhi"))
        list.add(PlayerItem(name = "e756id7c", surname = "uyarhfifuyaew", shoeSize = "awiue9ui", height = "zfosuryfae", position = "i78zyfhiuye", team = "ZUIYHfhi"))
        list.add(PlayerItem(name = "ckxykkyrt", surname = "uyarhfifuyaew", shoeSize = "awiue9ui", height = "zfosuryfae", position = "i78zyfhiuye", team = "ZUIYHfhi"))
        list.add(PlayerItem(name = "illfhzjyr", surname = "uyarhfifuyaew", shoeSize = "awiue9ui", height = "zfosuryfae", position = "i78zyfhiuye", team = "ZUIYHfhi"))
        list.add(PlayerItem(name = "szu6t6su", surname = "uyarhfifuyaew", shoeSize = "awiue9ui", height = "zfosuryfae", position = "i78zyfhiuye", team = "ZUIYHfhi"))
        list.add(PlayerItem(name = "cghmdyutkuys6x7i6", surname = "uyarhfifuyaew", shoeSize = "awiue9ui", height = "zfosuryfae", position = "i78zyfhiuye", team = "ZUIYHfhi"))
        list.add(PlayerItem(name = "ao8yuwf878YHRTD", surname = "uyarhfifuyaew", shoeSize = "awiue9ui", height = "zfosuryfae", position = "i78zyfhiuye", team = "ZUIYHfhi"))
    }
}