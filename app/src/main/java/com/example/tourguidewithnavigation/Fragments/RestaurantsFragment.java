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
 * Use the {@link RestaurantsFragment} factory method to
 * create an instance of this fragment.
 */
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View convertView = inflater.inflate(R.layout.activity_list, container, false);

        //create a list of tour models
        final ArrayList<TourModel> models = new ArrayList<>();
        models.add(new TourModel(R.drawable.bombaycanteen,"The Bombay Canteen, Mumbai","Simplicity takes the cake! This maxim is absolutely true for the beauty and the old-world ‘Bombay-feeling’ that lies in the simple interiors of The Bombay Canteen. The behind-the-scene reality or to the secret ingredients that goes into each and every dish are the local indigenously grown vegetables. Chef Floyd Cardoz along with Chef Thomas Zacharias bring to the table bright, delicious and unselfconsciously inventive cooking that has the ability to save your soul."));
        models.add(new TourModel(R.drawable.thetable,"The Table, Mumbai","‘Farm-to-table’ and ‘ingredients-driven’ is how you can describe one of India’s celebrated restaurants, The Table. This chic quaint bistro flaunts a casual yet chic setting; its easy-going and friendly vibe is unmistakable. The market-fresh, globally-inspired fusion menu, most of which was designed by former San Francisco Chef Alex Sanchez, changes daily and does everything in its power to satisfy your cravings for a curry-free evening out."));
        models.add(new TourModel(R.drawable.hakkasan,"Hakkasan, Mumbai","Serving modern Cantonese cuisine with seamless service, Hakkasan has been identified as one of the finest restaurants by connoisseurs worldwide. With hints of Chinoiserie decadence, hushed lighting and soul tingling menu, Hakkasan transports guests to an exotic, faraway place. It offers exquisite dining experiences with its chefs, cuisine, design and ingredients selected and sourced from around the world. Yet, China remains at the heart of it all. This combination of high-end design, modern techniques, Chinese influences and Michelin-starred cuisine is a revelation."));
        models.add(new TourModel(R.drawable.indianaccent,"Indian Accent, New Delhi","Indian Accent showcases inventive Indian cuisine by complementing the flavours and traditions of the country with global ingredients and techniques. Indian Accent, showcasing old-world hospitality, is one of the few restaurants to have iteration in New York and has been featured in the World’s 50 Best Restaurants 2019. Chef Manish Mehrotra has designed Indian Accent’s path-breaking contemporary Indian menu by combining fresh seasonal produce and unusual ingredients from across the world."));
        models.add(new TourModel(R.drawable.olivequtub,"Olive Qutub, New Delhi","Olive Qutub is a hideaway where good food, laughter, culture and conversation come together in a delightful melting pot. Worlds collide and time stops in this Mogul mansion-turned-alfresco Mediterranean restaurant with a stunning, star-lit, and a tree-top terrace bar, under the shadow of the Qutub Minar. This classic by restaurateur AD Singh is headlined by Chef Dhruv Oberoi, who has been trained by the culinary God Chef Ferran Adria himself. The restaurant has dishes drawn from some of the best world culinary cultures."));
        models.add(new TourModel(R.drawable.artusiristorante,"Artusi Ristorante, New Delhi","If you have a taste for authentic Italian cuisine, then head to a fine dining restaurant and e-bar that serves a menu that will take you on an inspiring culinary journey. The single-minded objective of the owners and the chef, who hail from Emilia Romagna region of Northeastern Italy, is is to serve the very best of Italian food. The food is entirely authentic and offers guests a feel of home-made Italian cuisine. Artusi Ristorante sports a rustic look, in keeping with restaurants back in Italy."));
        models.add(new TourModel(R.drawable.toasttonic,"Toast & Tonic, Bengaluru","Toast & Tonic blends French, Asian, Italian, American and even Latin American influences. While both the food and drinks served at the restaurant draws from the world cuisine, they are also influenced by India. It is in a way an expression of what made the East Village the quintessentially bohemian neighbourhood of the world. A meal here is comforting and yet gastronomically curious, the food — artisan inspired to modern. Adding spark to Bengaluru’s nightlife scenario, Toast and Tonic showcases brilliantly done wooden interiors created by lovely colorful lights, giving the place a stunning modern look."));
        models.add(new TourModel(R.drawable.slygranny,"Sly Granny, Bengaluru","Sly Granny is a fresh breath of flavours, serving up European-meets-Asian cuisine. The fine dine community house will satiate both your stomach and your eyes with its eclectic but enchanting design. The Granny outlet has a tapas dining room, a lounge room and the original granny terrace; there are so many aspects to Sly Granny that it will take you a few visits to discover it all. Chef Varun Pereira has carefully crafted European and tapas menus and the bar holds every barmy beverage you could possibly imagine."));
        models.add(new TourModel(R.drawable.olivebeach,"Olive Beach, Bengaluru","The elegant old villa transforms itself into a stunning venue with an incredible alfresco lounge bar and a spacious yet intimate dining space. Olive Beach retains its heritage and charm, yet presents a fabulous offering. The menu is curated by Manu Chandra, one of India’s best-known chefs with a delicious selection of cocktails and a robust wine list. For a leisurely alfresco lunch in the sun-dappled courtyard, a romantic dinner for two under the stars, or a raucous evening with friends at the striking alfresco bar, Olive Beach has it all."));
        models.add(new TourModel(R.drawable.amethystcafe,"Amethyst, Chennai","Set in an exquisitely converted warehouse with a wraparound veranda from which tables spill out into lush gardens, Amethyst recreates the old-world charm of Madras in a beautiful colonial mansion. It is outrageously popular with expats and well-off Chennaiites. Well-executed European-flavoured dishes include a range of quiches, pastas, sandwiches, crepes, creative salads, all-day breakfasts and afternoon teas."));

        // Create an {@link tourAdapter}, whose data source is a list of {@link tourModels}. The
        // adapter knows how to create list items for each item in the list.
        TourAdapter tourAdapter = new TourAdapter(getActivity(),models);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list_view.xml layout file.
        ListView listView = (ListView) convertView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link tourAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link tourModel} in the list.
        listView.setAdapter(tourAdapter);
        return convertView;
    }
}