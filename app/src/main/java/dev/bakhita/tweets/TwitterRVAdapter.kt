package dev.bakhita.tweets

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TwitterRVAdapter(var tweetsList: List<Twitter>):
    RecyclerView.Adapter<TwitterViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TwitterViewHolder {
        var itemView= LayoutInflater.from(parent.context)
            .inflate(R.layout.twitter_item_list, parent, false)
        return TwitterViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TwitterViewHolder, position: Int) {
        var currentTweet= tweetsList.get(position)
        holder.tvName.text=currentTweet.name
        holder.tvHandle.text=currentTweet.handle
        holder.tvTweet.text=currentTweet.tweet
        holder.tvComment.text=currentTweet.comment
        holder.tvRetweet.text=currentTweet.retweet
        holder.tvLike.text=currentTweet.like
        holder.tvshare.text=currentTweet.share


    }

    override fun getItemCount(): Int {
        return tweetsList.size
    }
}
class TwitterViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var tvName= itemView.findViewById<TextView>(R.id.tvName)
    var tvHandle= itemView.findViewById<TextView>(R.id.tvHandle)
    var tvTweet= itemView.findViewById<TextView>(R.id.tvTweet)
    var tvComment= itemView.findViewById<TextView>(R.id.tvComment)
    var tvRetweet= itemView.findViewById<TextView>(R.id.tvRetweet)
    var tvLike= itemView.findViewById<TextView>(R.id.tvLike)
    var tvshare= itemView.findViewById<TextView>(R.id.tvShare)
    var imgProfile=itemView.findViewById<ImageView>(R.id.imgProfile)

}