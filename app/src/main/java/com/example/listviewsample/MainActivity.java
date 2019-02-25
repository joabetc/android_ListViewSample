package com.example.listviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lstViewLanguages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstViewLanguages = findViewById(R.id.lstViewLanguages);
        List<Language> languageList = loadLanguages();

        LanguageAdapter adpter = new LanguageAdapter(languageList, this);
        lstViewLanguages.setAdapter(adpter);
    }

    public List<Language> loadLanguages() {
        List<Language> list = new ArrayList<>();

        Language language = new Language("C++", R.drawable.c_plus_plus);
        list.add(language);
        language = new Language("MySQL", R.drawable.mysql);
        list.add(language);
        language = new Language("jQuery", R.drawable.jquery);
        list.add(language);

        return list;
    }
}
