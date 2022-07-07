package dev.bakhita.tweets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import dev.bakhita.tweets.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun displayContacts() {
        var tweet1 = Twitter("Bakhita","@bakkyismail","Hello world! ","1,200","10,000","150,000","2,900","")
        var tweet2 = Twitter("Rashford","@marcusrashford","I am the greatest of all times","20,000","50,989","13.2M","40,000","")
        var tweet3 = Twitter("Alinda","@laura_alinda","Everything works better if you believe it will","2","1","10","2","")
        var tweet4 = Twitter("Man U","@manchester.united","The best football club ever","200,000","500,000","15M","400,000","")
        var tweet5 = Twitter("Ismail","@ismail_aa","Be healthy always! Keep fit.","400","4,000","60,000","5,000","")


        var twitterList = listOf(tweet1, tweet2, tweet3, tweet4, tweet5)
        var contactsAdapter = TwitterRVAdapter(twitterList)
        binding.rvTwitter.layoutManager = LinearLayoutManager(this)
        binding.rvTwitter.adapter = contactsAdapter
    }
}
