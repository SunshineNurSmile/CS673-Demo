package com.yuanyiwang.cs673projectdemo.fragment;

import static com.yuanyiwang.cs673projectdemo.MainActivity.coachItemsList;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yuanyiwang.cs673projectdemo.R;
import com.yuanyiwang.cs673projectdemo.adapter.CoachAdapter;

public class CoachFragment extends Fragment {
    RecyclerView recyclerView;
    CoachAdapter coachAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_coach, container, false);
        recyclerView = view.findViewById(R.id.coachRecyclerView);
        recyclerView.setHasFixedSize(false);

        coachAdapter = new CoachAdapter(getContext(), coachItemsList);
        recyclerView.setAdapter(coachAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));

        return view;
    }
}