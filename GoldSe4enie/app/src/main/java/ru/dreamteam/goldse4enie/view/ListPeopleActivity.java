package ru.dreamteam.goldse4enie.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import ru.dreamteam.goldse4enie.R;
import ru.dreamteam.goldse4enie.adapters.NumbersAdapterPeoples;
import ru.dreamteam.goldse4enie.adapters.NumbersAdapterTimeList;

public class ListPeopleActivity extends AppCompatActivity {

    private ArrayList<String> peoples;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_people);
        init();

    }

    public void init(){
        Bundle arguments = getIntent().getExtras();
        peoples     = (ArrayList<String>) arguments.getSerializable("peoples");

        RecyclerView numbersList = findViewById(R.id.rv_list);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        numbersList.setLayoutManager(layoutManager);

        numbersList.setHasFixedSize(true);

        NumbersAdapterPeoples numbersAdapter = new NumbersAdapterPeoples(peoples.size(), peoples);
        numbersList.setAdapter(numbersAdapter);
    }
}
