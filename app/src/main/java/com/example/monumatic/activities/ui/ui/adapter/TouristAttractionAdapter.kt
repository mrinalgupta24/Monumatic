package com.example.monumatic.activities.ui.ui.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.monumatic.R
import com.example.monumatic.activities.ui.ui.activities.StartExploring.ArjunChariotVisitActivity
import com.example.monumatic.activities.ui.ui.activities.StartExploring.*
import com.example.monumatic.activities.ui.ui.models.TouristAttractionModel
import kotlinx.android.synthetic.main.tourist_attraction_list_layout.view.*

class TouristAttractionAdapter(
    val arrayList: ArrayList<TouristAttractionModel>,
    val context: Context
) :
    RecyclerView.Adapter<TouristAttractionAdapter.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(model: TouristAttractionModel) {
            itemView.tourattr_name.text = model.attractionName
            itemView.tourattr_city.text = model.attractionCity
            itemView.tourattr_image.setImageResource(model.attractionImage)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.tourist_attraction_list_layout, parent, false)

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])
        val model = arrayList.get(position)
        holder.itemView.setOnClickListener {

            val intent: Intent
            when (model.attractionName) {

                "India Gate" -> {
                    intent = Intent(context, IndiaGateVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)

                }
                "Qutab Minar" -> {
                    intent = Intent(context, QutabMinarVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }
                "Akshardham Temple" -> {
                    intent = Intent(context, AkshardhamTempleActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }
                "Humayun Tomb" -> {
                    intent = Intent(context, HumayunTombActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }

                "Golden Temple" -> {
                    intent = Intent(context, GoldenTempleVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }
                "Jallianwala Bagh" -> {
                    intent = Intent(context, JallianwalaBaghVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }
                "Quila Mubarak" -> {
                    intent = Intent(context, QuilaMubarakVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }
                "Fateh Burj" -> {
                    intent = Intent(context, FatehBurjVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }

                "Taj Mahal" -> {
                    intent = Intent(context, TajMahlVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }
                "Agra Fort" -> {
                    intent = Intent(context, AgraFortVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }

                "Fatehpur Sikri" -> {
                    intent = Intent(context, FatehpurSikriVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }

                "Akbar Tomb" -> {
                    intent = Intent(context, AkbarTombVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }

                "Tipu Sultan Fort" -> {
                    intent = Intent(context, TipuSultanFortVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }
                "Bangalore Fort" -> {
                    intent = Intent(context, BengaluruFortVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }
                "Bangalore Palace" -> {
                    intent = Intent(context, BangalorePalaceVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }
                "Lalbagh Garden" -> {
                    intent = Intent(context, LalbaghGardenVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }

                "Gateway Of India" -> {
                    intent = Intent(context, GatewayOfIndiaVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }
                "Ajanta Caves" -> {
                    intent = Intent(context, AjantaCavesVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }
                "Shivaji Vastu" -> {
                    intent = Intent(context, ShivajiVastuVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }
                "Ellora Caves" -> {
                    intent = Intent(context, ElloraCavesVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }

                "Buddhist Caves" -> {
                    intent = Intent(context, BuddhistCavesVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }
                "Ashokan Rocks" -> {
                    intent = Intent(context, AshokanRocksVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }
                "Rani-Ki-Vav" -> {
                    intent = Intent(context, RaniKiVavVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }
                "Sun Temple" -> {
                    intent = Intent(context, SunTempleVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }

                "Victoria Memorial" -> {
                    intent = Intent(context, VictoriaMemorialVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }
                "Marble Palace" -> {
                    intent = Intent(context, MarblePalaceVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }
                "Indian Museum" -> {
                    intent = Intent(context, IndianMuseumVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }
                "Hazarduari Palace" -> {
                    intent = Intent(context, HazarduariPalaceActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }

                "Chittorgarh Fort" -> {
                    intent = Intent(context, ChittorgarhFortVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }
                "Hawa Mahal" -> {
                    intent = Intent(context, HawaMahalVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }
                "Mehrangarh Fort" -> {
                    intent = Intent(context, MehrangarhFortVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }
                "Jaisalmer Fort" -> {
                    intent = Intent(context, JaisalmerFortVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }

                "Yudhishthra's Chariot" -> {
                    intent = Intent(context, YudhishthraChariotVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }
                "Valluvar Kottam" -> {
                    intent = Intent(context, ValluvarKottamVisitActivty::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }
                "Arjun Chariot" -> {
                    intent = Intent(context, ArjunChariotVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }
                "Muktesvara Temple" -> {
                    intent = Intent(context, MuktesvaraTempleVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }

                "Surajkund" -> {
                    intent = Intent(context, SurajKundVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }
                "Lakarpur Tomb" -> {
                    intent = Intent(context, LakarpurTombVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }
                "Star Monument" -> {
                    intent = Intent(context,StarMonument::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }
                "Qutub Khan Tomb" -> {
                    intent = Intent(context, QutabKhanTombVisitActivity::class.java)
                    intent.putExtra("mName", model.attractionName)
                    context.startActivity(intent)
                }






            }
        }
    }


    override fun getItemCount(): Int {
        return arrayList.size
    }
}

