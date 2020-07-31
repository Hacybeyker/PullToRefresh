package com.hacybeyker.pulltorefresh

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.hacybeyker.pulltorefresh.entity.Movie


/**
 * Created by Carlos Osorio Perez on 30/07/2020.
 */

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    var items = arrayListOf<Movie>()

    fun addData(data: List<Movie>) {
        items.addAll(data)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieViewHolder {
        return MovieViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.recycler_item_movie, parent, false
            )
        )
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(items[position])
    }

    class MovieViewHolder(private val viewDataBinding: ViewDataBinding) :
        RecyclerView.ViewHolder(viewDataBinding.root) {

        fun bind(item: Movie) {
            viewDataBinding.setVariable(BR.movieObject,item)
            viewDataBinding.executePendingBindings()
        }
    }

}