package com.example.myjetpack1.Viewmodel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myjetpack1.Puppyholder.PuppyyHol
import com.example.myjetpack1.R

class Viewmodel():ViewModel()
{
    val puppysList:MutableLiveData<List<PuppyyHol>> by lazy {
        MutableLiveData<List<PuppyyHol>> ()

    }
    private  var puppyList:ArrayList<PuppyyHol>
    init {
        puppyList= ArrayList();
        getpuppylist()
    }

    private fun getpuppylist() {
        fetchList()
        puppysList.value=puppyList
        TODO("Not yet implemented")
    }

    private fun fetchList() {
        puppyList.add(PuppyyHol(R.drawable.image,"Bear","Aloof,Loyal,Independent,Quiet"))
        puppyList.add(PuppyyHol(R.drawable.image2,"Cooper","Steady,Bold,Independent,Confident,Intelligent,Proud"))
        puppyList.add(PuppyyHol(R.drawable.image3,"Emerson","Spirited,Alert,Loyal,Companionable,Even,Tempered,Courageous"))
        puppyList.add(PuppyyHol(R.drawable.image4,"Puppy","Feisty,Affectionate,Cheerful,Playful,Gentle,Sensitive"))
        puppyList.add(PuppyyHol(R.drawable.image4,"Hudson","Strong willed Stubborn,Friendly,Intelligent,Courageous,Affectionate"))
        puppyList.add(PuppyyHol(R.drawable.image6,"Jack","Kind,Sweet-Tempered,Loving,Loyal,Intelligent,Independent"))
        puppyList.add(PuppyyHol(R.drawable.image,"Kai","Protective,Loyal,Gentle,Rational,Familial,Intelligent"))
        puppyList.add(PuppyyHol(R.drawable.image3,"Max","Docile,Reliable,Devoted,Alert,Reserved,Calm,Courageous,Powerful"))
        puppyList.add(PuppyyHol(R.drawable.image2,"Puppy","Feisty,Affectionate,Cheerful,Playful,Gentle,Sensitive"))
        puppyList.add(PuppyyHol(R.drawable.image4,"Sawyer","Trainable,Playful,Friendly,Faithful,Affectionate"))
        puppyList.add(PuppyyHol(R.drawable.image6,"Bear","Aloof,Loyal,Independent,Quiet"))
        puppyList.add(PuppyyHol(R.drawable.image,"Cooper","Steady,Bold,Independent,Confident,Intelligent,Proud"))
        puppyList.add(PuppyyHol(R.drawable.image3,"Finn","Playful,Loyal,Intelligent,Vocal,Happy"))
    }

}