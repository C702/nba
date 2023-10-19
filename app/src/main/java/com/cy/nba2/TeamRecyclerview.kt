package com.cy.nba2
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class TeamRecyclerview(
) :
    ListAdapter<TeamItem, TeamRecyclerview.MatchViewHolder>(
        diffCallback
    ) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MatchViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.teams,
            parent,
            false
        )
        return MatchViewHolder(itemView)
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onBindViewHolder(holder: MatchViewHolder, position: Int) {
        with(getItem(position)) {
            holder.fullName.text = this.fullName
            holder.division.text = this.division
            holder.city.text = this.city
            holder.conference.text = this.conference
            holder.abbreviation.text = this.abbreviation
            holder.itemView.setOnClickListener {
                Toast.makeText(holder.itemView.context, fullName, Toast.LENGTH_LONG).show()
            }
        }



    }

    inner class MatchViewHolder(iv: View) : RecyclerView.ViewHolder(iv) {
        val fullName: TextView = iv.findViewById(R.id.fullName)
        val division: TextView = iv.findViewById(R.id.division)
        val city: TextView = iv.findViewById(R.id.city)
        val conference: TextView = iv.findViewById(R.id.conference)
        val abbreviation: TextView = iv.findViewById(R.id.abbreviation)
    }
}
    private val diffCallback = object : DiffUtil.ItemCallback<TeamItem>() {
        override fun areItemsTheSame(oldItem: TeamItem, newItem: TeamItem): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(
            oldItem: TeamItem,
            newItem: TeamItem
        ): Boolean {
            return oldItem.fullName == newItem.fullName &&
                    oldItem.division == newItem.division &&
                    oldItem.conference == newItem.conference &&
                    oldItem.abbreviation == newItem.abbreviation &&
                    oldItem.city == newItem.city
        }
    }
