package com.example.lab3b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    private ArrayList<Person> People;
    private Context context;

    public CustomAdapter(ArrayList<Person> list, Context cont){
        this.People = list;
        this.context = cont;
    }

    @Override
    public int getCount() {
        return this.People.size();
    }

    @Override
    public Object getItem(int position) {
        return this.People.get(position);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;

        if(convertView == null){
            LayoutInflater inf = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inf.inflate(R.layout.results, null);

            holder = new ViewHolder();
            holder.name = (TextView)convertView.findViewById(R.id.name);
            holder.number = (TextView)convertView.findViewById(R.id.number);

            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder)convertView.getTag();
        }

        Person instance = People.get(position);
        holder.name.setText(instance.getName());
        holder.number.setText(instance.getNumber());

        return convertView;
    }

    private static class ViewHolder{
        public TextView name;
        public TextView number;
    }
}