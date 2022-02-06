package com.yuanyiwang.cs673projectdemo.fragment;

import static com.yuanyiwang.cs673projectdemo.MainActivity.tutorialItemsList;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yuanyiwang.cs673projectdemo.R;
import com.yuanyiwang.cs673projectdemo.adapter.TutorialAdapter;

public class TutorialFragment extends Fragment {
    RecyclerView recyclerView;
    TutorialAdapter tutorialAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tutorial, container, false);
        recyclerView = view.findViewById(R.id.tutorialRecyclerView);
        recyclerView.setHasFixedSize(false);

        tutorialAdapter = new TutorialAdapter(getContext(), tutorialItemsList);
        recyclerView.setAdapter(tutorialAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));

        return view;
    }
}