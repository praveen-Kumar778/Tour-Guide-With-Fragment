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
 * Use the {@link BeachesFragment} factory method to
 * create an instance of this fragment.
 */
public class BeachesFragment extends Fragment {
    public BeachesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View containerView = inflater.inflate(R.layout.activity_list, container, false);

        //create a list of tour models
        final ArrayList<TourModel> models = new ArrayList<>();
        models.add(new TourModel(R.drawable.agonda,"Agonda Beach","It’s a great spot for sunbathing, relaxing and swimming, and the number of tourists is still relatively small. In the center of Agonda Beach,there is also a turtle center that protects precious olive ridley turtle eggs."));
        models.add(new TourModel(R.drawable.baga,"Baga Beach","Sure, Baga Beach in North Goa can be commercialized and bustling, but for the action buffs, it’s one of the liveliest beaches on the coast. Water sports, paragliding, beach huts, bars, clubs and gourmet restaurants, you’ll find it all there ! Today, Baga attracts a predominantly Indian crowd, who come for authentic music and discounted drinks along Tito’s Lane."));
        models.add(new TourModel(R.drawable.cavelossim,"Cavelossim Beach","The city is the original residence of Goddess Shri Shantadurga located in Kawlem, one of the largest temples in the state . This beach has miles of golden sand and beautiful warm water."));
        models.add(new TourModel(R.drawable.dhanushkodi,"Dhanushkodi Beach","Dhanushkodi, meaning “end of the arc”, is a ghost town at the southeastern tip of the Tamil Nadu island of Pamban and of great historical and religious significance to followers of Hinduism . Also, part of Sri Lanka (Jaffna) is visible from the tip of Dhanushkodi beach."));
        models.add(new TourModel(R.drawable.mandrem_beach_goa,"Mandrem Beach","There are no restaurants or food facilities on this beautiful deserted beach , but the beach and sea are worth anything."));
        models.add(new TourModel(R.drawable.palolem,"Palolem Beach","This beach is almost untouched and is home to both local fishermen and foreign tourists. Interestingly , it was featured in the movie The Bourne Supremacy (2004) as the home of Jason Bourne (Matt Damon) in Gore."));
        models.add(new TourModel(R.drawable.pondicherry,"Paradise Beach","Paradise Beach, also known as Plage Paradiso,is situated in Chunnambar,10 k.m away from Pondicherry city,paradise beach is really a best spot for tourist attraction for its well maintained beaches and water sports"));
        models.add(new TourModel(R.drawable.radhanagar,"Radhanagar Beach","This stunning beach on Havelock Island has avoided much of the devastation caused by the 2004 Indian Ocean earthquake and the accompanying tsunami."));
        models.add(new TourModel(R.drawable.tarkarali_beach,"Tarkarali Beach","If you can’t get to the Andaman Islands, the area around Tarkarli Beach in southern Maharashtra is home to one of the best coral reefs on the Indian mainland. This area is still not on the tourist route and receives little foreign visitors, although it is attracting more and more domestic tourists. Simple homestays right on the beach are an interesting thing. People can often see locals cycling or walking carefree."));
        models.add(new TourModel(R.drawable.varkala,"Varkala Beach","It is also known as Papanatham Beach, which means “to wash away sin. It is believed that soaking in the waters of Papanatham Beach will wash away all the sins of life."));

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