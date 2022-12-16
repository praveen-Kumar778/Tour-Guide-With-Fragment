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
 * Use the {@link MonumentsFragment} factory method to
 * create an instance of this fragment.
 */
public class MonumentsFragment extends Fragment {
    public MonumentsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View converterView = inflater.inflate(R.layout.activity_list, container, false);

        //create a list of tour models
        final ArrayList<TourModel> models = new ArrayList<>();
        models.add(new TourModel(R.drawable.taj,"Taj Mahal Agra","Enlisted in the Seven Wonders of the World, The Taj Mahal is one of the most beautiful and famous buildings located in the city of Agra. This white marble monument was built by a Mughal Emperor called Shahajahan in memory of his beloved wife. Due to its amazing architecture and the history behind it, this world heritage site has become very popular to visit by all travellers and romantics from all over the world."));
        models.add(new TourModel(R.drawable.goldentemple,"Golden Temple (Harmandir Sahib)","The holiest shrine and pilgrimage place located in Amritsar is The Golden Temple known as the Harmandir Sahib. This is the most famous and sacred Sikh Gurdwara in Punjab, India, adorned with rich history and gold gilded exterior. If you are interested in culture and history, be sure to visit this popular attraction in India."));
        models.add(new TourModel(R.drawable.meenakshitemple,"Meenakshi Temple, Madurai","Meenakshi Temple is situated on the Southern banks of Vaigai River in the temple city Madurai. This temple is dedicated to Parvati and her consort, Shiva and is visited by most Hindu and Tamil devotees and architectural lovers throughout the world. It is believed that this shrine houses 33,000 sculptures in its 14 gopurams. It’s no doubt one place to visit if you are impressed with art and cultural history."));
        models.add(new TourModel(R.drawable.mysorepalace,"Mysore Palace, Mysore","The Mysore Palace is a famous historical monument in the city of Mysore in Karnataka. Commonly described as the City of Palaces, this is the most famous tourist attraction in India after the Taj Mahal. It is a sight not be missed with its spacious halls, lovely art paintings and Indo-Saracenic style architecture. Best time to visit is at night due to the astonishing illuminated lights covering the whole monument."));
        models.add(new TourModel(R.drawable.gatewayofindia,"Gateway of India, Mumbai","Even though Mumbai is famous for its Bollywood actors and movies, the most famous attraction in Mumbai is The Gateway of India. It is a popular gathering spot for locals, travellers, street vendors and photographers and is known as the Taj Mahal of Mumbai. The majestic monument was built to commemorate the visit of King George V and Queen Mary to Bombay. With so much fun and excitement this place is not to be missed with family or on your tour of India."));
        models.add(new TourModel(R.drawable.redfort,"Red Fort, New Delhi","Declared as the UNESCO’s World Heritage Site, Red Fort is located in the centre of beautiful Delhi. If you love learning about history and culture then this famous historic monument is a must see place to visit. Built by the Mughal Emperor, Shah Jahan in 1648, and housing a number of museums, its walls are built of red sandstone. The best time to visit is on Independence Day where the Prime Minister of India hoists the national flag at the Red Fort. End the day by heading to an Indian restaurant and enjoy the varieties of wonderful cuisines."));
        models.add(new TourModel(R.drawable.hawamahal,"Hawa Mahal, Jaipur","Explore a blend of beauty and Rajasthan culture, the Hawa Mahal also known as Palace of Winds is situated in the capital of Rajasthan, Jaipur. Built from red and pink sandstones by the Maharaja Sawi Pratap Singh in 1799, this unique five storey structure is one of the most prominent tourist attractions in the Jaipur city."));
        models.add(new TourModel(R.drawable.qutubminar,"Qutub Minar, New Delhi","Discover one of the tallest towers in the world and the second tallest Minar of India standing elegantly in the Capital city, New Delhi. Standing at 72.5 metres and consisting of around 379 stairs, this famous monument represents the rich architecture of India. As it is a UNESCO World Heritage Site made of red sandstone and decorated with Arabic and Brahmi inscriptions, travellers from around the world come to view this most famous tower in India."));
        models.add(new TourModel(R.drawable.sanchistupa,"Sanchi Stupa, Sanchi","The beautiful and massive dome, Sanchi Stupa also known as the Great Stupa is a world renowned Buddhist monument in Sanchi, India. It was constructed by Emperor Ashoka, and is one of the oldest stone structures in the heart of India. Experience the Indian culture by visiting these major attractions in Sanchi including a number of Buddhist Stupas, monasteries and temples."));
        models.add(new TourModel(R.drawable.charminar,"Charminar, Hyderabad","No visit to Hyderabad should be complete without visiting the most famous and majestic monument known as the Charminar. This magnificent and striking mosque constructed in 1591 has four minarets and is the most recognisable symbol in the city of Hyderabad."));

        // Create an {@link tourAdapter}, whose data source is a list of {@link tourModels}. The
        // adapter knows how to create list items for each item in the list
        TourAdapter adapter = new TourAdapter(getActivity(),models);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list_view.xml layout file.
        ListView listView = converterView.findViewById(R.id.list);
        // Make the {@link ListView} use the {@link tourAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link tourModel} in the list.
        listView.setAdapter(adapter);

        return converterView ;
    }
}