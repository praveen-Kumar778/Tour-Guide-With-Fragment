package com.example.tourguidewithnavigation.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.tourguidewithnavigation.R;
import com.example.tourguidewithnavigation.adaptor.TourAdapter;
import com.example.tourguidewithnavigation.model.TourModel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PlacesFragment} factory method to
 * create an instance of this fragment.
 */
public class PlacesFragment extends Fragment {
    public PlacesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View containerView = inflater.inflate(R.layout.activity_list, container, false);
        //create a list of tour models
        final ArrayList<TourModel> models = new ArrayList<>();
        models.add(new TourModel(R.drawable.goaplace,"Goa,India","Famous for its pristine beaches, hippie vibes, laidback lifestyle and vibrant parties, Goa is counted among the best holiday destinations in India. The union territory is frequented by tourists year-round, especially in the winter season when the climate is pleasant, and the entire place comes alive with Christmas and New Year celebrations. However, seasoned tourists do not shun Goa during summer either. If you are looking for a peaceful and economical holiday, try to visit Goa during the offseason when the sun-kissed beaches, flea markets and other attractions are less crowded.\n" +
                "\n" +
                "Best Time to Visit: November to February\n" +
                "Ideal Duration: 4-5 days\n" +
                "Places to Visit in Goa: Palolem Beach, Dudhsagar Falls, Basilica of Bom Jesus, Aguada Fort, Baga Beach, Anjuna Beach, Calangute Beach, Shree Mangesha Temple, Immaculate Conception Church\n" +
                "Things to Do in Goa: Beach hopping, water sports, shopping at flea markets, visiting Portuguese-style churches, enjoying the nightlife, tasting authentic Goan cuisine\n" +
                "How to Reach\n" +
                "Nearest Airport: Dabolim International Airport\n" +
                "Nearest Train Station: Vasco-Da-Gama Railway Station (North Goa); Madgaon Junction (South Goa)"));
        models.add(new TourModel(R.drawable.agraplace,"Agra,India","Say Agra and the first thing that comes to mind is the magnificent Taj Mahal, one of the Seven Wonders of the World. This beautiful city with its rich historical background is situated in Uttar Pradesh, on the banks of River Yamuna. It is counted among the top holiday destinations for architecture lovers and history buffs, thanks to many amazing Mughal architectural masterpieces that adorn the cityscape. No matter how many times you visit Agra, the charm of the Taj Mahal and other monuments will never fail to impress. The city is a treat for shopaholics and foodies as well.\n" +
                "\n" +
                "Best Time to Visit: October to March\n" +
                "Ideal Duration: 2 days\n" +
                "Places to Visit in Agra: Agra Fort, Jama Masjid, Abkar’s Tomb, Itimad-ud-Daulah’s Tomb, Mehtab Bagh, Gurudwara Guru Ka Taal, Dolphin Water Park, Wildlife Conservation and Care Centre\n" +
                "Things to Do in Agra: Boat ride on Yamuna River, exploring popular monuments, watching the Light and Sound Show at Agra Fort, visiting Fatehpur Sikri, shopping at Kinari Bazaar, Subhash Bazaar and TDI Mall, relishing authentic Mughlai dishes and street foods\n" +
                "How to Reach\n" +
                "Nearest Airport: Agra Airport; New Delhi’s Indira Gandhi International Airport\n" +
                "Nearest Train Station: Agra Cantonment Railway Station"));
        models.add(new TourModel(R.drawable.rajasthanplace,"Rajasthan,India","The land of kings, Rajasthan is a vibrant state that attracts history buffs, architecture lovers, wildlife enthusiasts and foodies alike. It lies in the north-western part of India and boasts an impressive amalgamation of natural beauty and manmade structures. From beautiful lakes, vast deserts and rich wildlife to magnificent palaces, forts and temples, the city has so many things for a wonderful vacation. What’s more, a road trip here takes you through several small and beautiful villages showcasing rich Rajasthani culture and traditions. Rajasthan is one of those best tourist places in India that you can visit again and again.\n" +
                "\n" +
                "Best Time to Visit: November to February\n" +
                "Ideal Duration: 6-7 days\n" +
                "Places to Visit in Rajasthan: Jaipur, Udaipur, Jaisalmer, Jodhpur, Bikaner, Mount Abu, Chittorgarh, Ranthambore National Park, Sariska Tiger Reserve, Keoladeo National Park\n" +
                "Things to Do in Rajasthan: Exploring forts and palaces, paying respect at temples, enjoying folk dance and music festivals like Bikaner Camel Festival, Pushkar Fair, Gangaur Festival, Elephant Festival and Teej, visiting wildlife parks, gorging on delectable Rajasthani dishes, shopping\n" +
                "How to Reach\n" +
                "Nearest Airport:  Jaipur International Airport\n" +
                "                                                          Maharana Pratap Airport \n" +
                "\n" +
                "                                                          Jodhpur Airport\n" +
                "\n" +
                "                                                          Jaisalmer Airport\n" +
                "\n" +
                "          New Delhi’s Indira Gandhi International Airport\n" +
                "\n" +
                "Nearest Train Station: Railway stations at Jaipur, Udaipur, Ajmer, Alwar, Bharatpur, Jaisalmer, Jodhpur, Kota, Nagaur, Sikar, Bikaner, etc"));
        models.add(new TourModel(R.drawable.delhiplace,"Delhi,India","New Delhi, the national capital of India, is one of the most cliched yet popular tourist destinations in the country. The state has so much to offer that visiting it once or twice is not enough. Delhi is dotted with iconic Mughal monuments, temples, heritage sites, performing arts venues, colourful bazaars, shopping malls, planetariums, museums, and restaurants, so there is something for everyone here. Chandni Chowk, the oldest and busiest market in the country, is in Delhi. The city also houses many places of political importance, like Rashtrapati Bhawan, Parliament of India, and India Gate.\n" +
                "\n" +
                "Best Time to Visit: October to March\n" +
                "Ideal Duration: 3-4 days\n" +
                "Places to Visit in Delhi: Red Fort, Humayun’s Tomb, Qutub Minar, Lotus Temple, Akshardham Temple, Purana Qila, Jantar Mantar, Gurudwara Bangla Sahib Ji, Nehru Park, Janpath Market\n" +
                "Things to Do in Delhi: Explore Connaught Place, Sarojini Nagar Market and Hauz Khas Village, enjoy delicacies at Parathe Wali Gali, shop for handicrafts, souvenirs, antiques and more at Dilli Haat, experience Delhi’s nightlife, take a HoHo bus tour\n" +
                "How to Reach\n" +
                "Nearest Airport: Indira Gandhi International Airport\n" +
                "Nearest Train Station: New Delhi Railway Station"));
        models.add(new TourModel(R.drawable.munnarplace,"Munnar Kerala,India","Nestled in the Western Ghats in the state of Kerala, Munnar is counted among the most serene and beautiful tourist places in India. The hill station boasts impeccable natural beauty in the form of rolling hills, scenic valleys, virgin forests, waterfalls, streams, national parks, tea and spice plantations and winding walkways. However, it is the unmissable colonial charm of Munnar that attracts many tourists time and again. The hill station was a popular holiday destination for the British and you can see many churches, English colonial bungalows and cottages and other structures here.\n" +
                "\n" +
                "Best Time to Visit: September to March\n" +
                "Ideal Duration: 3-4 days\n" +
                "Places to Visit in Munnar: Echo Point, Top Station, Atukkad Waterfalls, Eravikulam National Park, Tata Tea Museum, Pallivasal Falls, Chinnar Wildlife Sanctuary, Rose Garden, Kolukkumalai Tea Estate\n" +
                "Things to Do in Munnar: Speed boating and horse riding at Mattupetty Dam, enjoying boat rides at Kundala Dam and Lake, visiting tea plantations, enjoying fun rides at Wonder Valley Adventure and Amusement Park, rock climbing, trekking and rappelling\n" +
                "How to Reach\n" +
                "Nearest Airport: Cochin International Airport\n" +
                "Nearest Train Station: Aluva Railway Station"));
        models.add(new TourModel(R.drawable.coorgplace,"Coorg Karnataka,India","Surrounded by majestic mountain ranges and boasting a lush green landscape, Coorg or Kodagu is yet another cliched holiday destination that is worth the hype. This hill station is in the state of Karnataka and a popular weekend getaway for nature lovers and solace seekers. From lush green hills and sparkling streams to quaint villages and vast expanses of coffee and spice plantations, the charm of Coorg is unmatchable. Since Coorg enjoys pleasant weather year-round, it is a popular destination for people in Bangalore who are looking to escape the city chaos.\n" +
                "\n" +
                "Best Time to Visit: October to June\n" +
                "Ideal Duration: 3-4 days\n" +
                "Places to Visit in Coorg: Abbey Falls, Raja’s Seat, Shri Omkareshwara Temple, Government Museum Madikeri, Raja’s Tomb, Talakaveri, Madikeri Fort, Honnamana Kere Lake, Namdroling Monastery\n" +
                "Things to Do in Coorg: Spending quiet time near waterfalls, taking a walk-through coffee and spice plantations, enjoying river rafting, going on a wildlife safari at Nagarhole National Park, trekking to Tadiandamol Peak\n" +
                "How to Reach\n" +
                "Nearest Airport: Mangalore International Airport\n" +
                "Nearest Train Station: Mysuru Junction"));
        models.add(new TourModel(R.drawable.manaliplace,"Manali HimachalPradesh,India","Situated in the Kullu Valley of Himachal Pradesh, Manali draws tourists with its natural beauty and tranquillity. The hill station is frequented by travellers from across the country, especially during the summer season when cities reel under the scorching heat. Snow-capped mountains, dense forests, riverine valleys and sparkling streams add to the beauty of the hill station and make it one of the most popular holiday destinations in India. Another charming thing about Manali is that it showcases a beautiful blend of rich cultural heritage and modernisation. Besides spending time in serenity and soaking in the beauty of the surroundings, you can engage in thrilling adventure activities here for a memorable vacation.\n" +
                "\n" +
                "Best Time to Visit: October to June\n" +
                "Ideal Duration: 3-4 days\n" +
                "Places to Visit in Manali: Manu Temple, Hidimba Devi Temple, Museum of Himachal Culture and Folk Art, Jogini Falls, Himalayan Nyinmapa Tibetan Buddhist Temple, Nehru Kund, Mall Road\n" +
                "Things to Do in Manali: Paragliding, parachuting and horse riding at Solang Valley, mountain biking, skiing and sledge riding at Rohtang Pass, trekking, river rafting, ziplining, zorbing\n" +
                "How to Reach\n" +
                "Nearest Airport: Bhuntar Airport\n" +
                "Nearest Train Station: Joginder Nagar Railway Station"));
        models.add(new TourModel(R.drawable.ootyplace,"Ooty Tamil Nadu,India","Ooty is one of the most frequented holiday destinations for tourists from Tamil Nadu, Kerala and Karnataka. Given the fact that the southern part of India gets too hot during the summer season, a trip to Ooty offers the much-needed respite from the heat. This picturesque and serene hill station is also a popular honeymoon destination among couples. Ooty offers stunning views of the Nilgiri Hills and lush green landscapes dotted with alpine woods, clear lakes, emerald green tea estates and colourful blossoms. The hill station also houses the popular Nilgiri Mountain Railway which was declared a UNESCO World Heritage Site in 2005.\n" +
                "\n" +
                "Best Time to Visit: October to June\n" +
                "Ideal Duration: 2-3 days\n" +
                "Places to Visit in Ooty: Ooty Botanical Gardens, Dolphin’s Nose, Rose Garden, Avalanche Lake, Doddabetta Peak, St Stephan’s Church, Thread Garden, Kalhatti Falls, Annamalai Temple, Kamraj Sagar Lake, Catherine Falls\n" +
                "Things to Do in Ooty: Boating, birdwatching, enjoying picnic and nature photography at Ooty Lake and Emerald Lake, going on a toy train ride, visiting tea gardens at Kotagiri, trekking\n" +
                "How to Reach\n" +
                "Nearest Airport: Coimbatore International Airport\n" +
                "Nearest Train Station: Udagamandalam Railway Station"));
        models.add(new TourModel(R.drawable.lonavalaplace,"Lonavala Maharashtra,India","Perched at a height of 622 metres above sea level, Lonavala and Khandala are twin hill stations in the state of Maharashtra. Thanks to their pleasant weather conditions and proximity to Mumbai and Pune, the hill stations are frequented by Mumbaikars and Punekars year-round. Both Lonavala and Khandala come to life during the monsoon season when lush greenery, sparkling lakes and milky-white waterfalls add to the beauty of the landscape. Besides being a nature lover’s delight, the hill stations are quite popular among adventure enthusiasts.\n" +
                "\n" +
                "Best Time to Visit: December to February; July to September\n" +
                "Ideal Duration: 2-3 days\n" +
                "Places to Visit in Lonavala and Khandala: Tiger’s Leap, Rajmachi Fort, Aamby Valley, Lohagad Fort, Bhushi Dam, Sunil’s Celebrity Wax Museum, Visapur Fort, Tikona Fort, Narayani Dham Temple\n" +
                "Things to Do in Lonavala and Khandala: Exploring the popular rock-cut Bhaja and Karla Caves, enjoying a fun-filled day at Imagicaa Entertainment Park, planning a picnic at Lonavala Lake, exploring local shops\n" +
                "How to Reach\n" +
                "Nearest Airport: Pune International Airport; Mumbai’s Chhatrapati Shivaji Maharaj International Airport\n" +
                "Nearest Train Station: Lonavala Railway Station; Khandala Railway Station"));
        models.add(new TourModel(R.drawable.shillongplace,"Shillong Meghalaya","Known for pleasant weather conditions and picturesque locations, Shillong in Meghalaya is one of the most cliched yet highly frequented tourist destinations in India. The hill station is popularly known as Scotland of the East, thanks to the rolling hills, gushing waterfalls and lovely landscape that reminded European colonists of stunning Scotland. Shillong also boasts crystal-clear lakes, high mountain peaks and amazing golf courses, museums and cafes. What’s more, the distinct culture, delectable local cuisines and amazing shopping hubs promise a fun-filled vacation every time.\n" +
                "\n" +
                "Best Time to Visit: September to May\n" +
                "Ideal Duration: 4-5 days\n" +
                "Places to Visit in Shillong: Umiam Lake, Elephant Waterfalls, Shillong Peak, Cathedral of Mary Help of Christians, Police Bazaar, Don Bosco Museum, Sweet Falls, Phan Nonglait Park, Spread Eagle Falls, Lady Hydari Park, Sohpetbneng\n" +
                "Things to Do in Shillong: Picnicking, shopping, trekking, cliff jumping, zip-lining, river rafting\n" +
                "How to Reach\n" +
                "Nearest Airport: Shillong Airport; Guwahati International Airport\n" +
                "Nearest Train Station: Guwahati Railway Station"));
        // Create an {@link tourAdapter}, whose data source is a list of {@link tourModels}. The
        // adapter knows how to create list items for each item in the list.
        TourAdapter tourAdapter = new TourAdapter(getActivity(),models);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list_view.xml layout file.
        ListView listView = (ListView) containerView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link tourAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link tourModel} in the list.
        listView.setAdapter(tourAdapter);

        return containerView ;
    }
}