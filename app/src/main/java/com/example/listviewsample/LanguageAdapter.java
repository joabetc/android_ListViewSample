package com.example.listviewsample;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class LanguageAdapter extends BaseAdapter {

    private List<Language> languages;
    private final Activity act;

    public LanguageAdapter(List<Language> languages, Activity act) {
        this.languages = languages;
        this.act = act;
    }

    @Override
    public int getCount() {
        return languages.size();
    }

    @Override
    public Object getItem(int position) {
        return languages.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = act.getLayoutInflater().inflate(R.layout.item, parent, false);

        Language language = languages.get(position);
        TextView name = view.findViewById(R.id.txtViewName);
        ImageView logo = view.findViewById(R.id.imgViewLogo);

        name.setText(language.getName());
        logo.setImageResource(language.getLogo());

        return view;
    }
}
