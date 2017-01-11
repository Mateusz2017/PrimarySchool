package pl.projects.kata.mateusz.primaryschool;


import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * A simple {@link Fragment} subclass.
 */
public class Schedule_1 extends Fragment {


    private ListView list ;


    public Schedule_1() {
        // Required empty public constructor
    }

    String[] elementy = {"Opcja 1", "Opcja 2", "Opcja 3", "Opcja 4", "Opcja 5"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        return inflater.inflate(R.layout.fragment_schedule_1, container, false);
    }
}

