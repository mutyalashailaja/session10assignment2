package com.example.admin.cardview;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Admin on 18-11-2016.
 */
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.PersonViewHolder> {

    List<Person> persons;

    CustomAdapter(List<Person> persons){
        this.persons = persons;
    }

    // Below 3 methods must be overridden for view holder to work.
    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //this method is called when the custom ViewHolder needs to be initialized.
        // We specify the layout that each item of the RecyclerView should use.
        // This is done by inflating the layout using LayoutInflater,
        // passing the output to the constructor of the custom ViewHolder.
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        //Override the onBindViewHolder to specify the contents of each item of the RecyclerView.
        // This method is very similar to the getView method of a ListView's adapter.
        // Here's where you have to set the values of the name, age, and photo fields of the CardView.

        holder.personName.setText(persons.get(position).VersionName);

        holder.personPhoto.setImageResource(persons.get(position).photoId);
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }

    // class name must match what is given in declaration.

    public class PersonViewHolder extends RecyclerView.ViewHolder{

        CardView cv;
        TextView personName;

        ImageView personPhoto;

        public PersonViewHolder(View itemView) {
            super(itemView);

            cv = (CardView)itemView.findViewById(R.id.cv);
            personName = (TextView)itemView.findViewById(R.id.person_name);

            personPhoto = (ImageView)itemView.findViewById(R.id.person_photo);
        }
    }
}

