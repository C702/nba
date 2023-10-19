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

class PlayerRecyclerview(
) :
    ListAdapter<PlayerItem, PlayerRecyclerview.MatchViewHolder>(
        diffCallback
    ) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MatchViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.players,
            parent,
            false
        )
        return MatchViewHolder(itemView)
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onBindViewHolder(holder: MatchViewHolder, position: Int) {
        with(getItem(position)) {
            holder.name.text = this.name
            holder.surname.text = this.surname
            holder.shoeSize.text = this.shoeSize
            holder.height.text = this.height
            holder.position.text = this.position
            holder.team.text = this.team
            holder.itemView.setOnClickListener {
                Toast.makeText(holder.itemView.context, name, Toast.LENGTH_LONG).show()
            }
        }



    }

    inner class MatchViewHolder(iv: View) : RecyclerView.ViewHolder(iv) {
        val name: TextView = iv.findViewById(R.id.name)
        val surname: TextView = iv.findViewById(R.id.surName)
        val shoeSize: TextView = iv.findViewById(R.id.shoeSize)
        val height: TextView = iv.findViewById(R.id.height)
        val position: TextView = iv.findViewById(R.id.position)
        val team: TextView = iv.findViewById(R.id.team)
    }
}
    private val diffCallback = object : DiffUtil.ItemCallback<PlayerItem>() {
        override fun areItemsTheSame(oldItem: PlayerItem, newItem: PlayerItem): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(
            oldItem: PlayerItem,
            newItem: PlayerItem
        ): Boolean {
            return oldItem.name == newItem.name &&
                    oldItem.surname == newItem.surname &&
                    oldItem.shoeSize == newItem.shoeSize &&
                    oldItem.height == newItem.height &&
                    oldItem.position == newItem.position &&
                    oldItem.team == newItem.team
        }
    }
