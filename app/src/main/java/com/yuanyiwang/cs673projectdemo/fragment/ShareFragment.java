package com.yuanyiwang.cs673projectdemo.fragment;


import static com.yuanyiwang.cs673projectdemo.MainActivity.shareItemsList;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yuanyiwang.cs673projectdemo.R;
import com.yuanyiwang.cs673projectdemo.adapter.ShareAdapter;

public class ShareFragment extends Fragment {
    RecyclerView recyclerView;
    ShareAdapter shareAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_share, container, false);
        recyclerView = view.findViewById(R.id.shareRecyclerView);
        recyclerView.setHasFixedSize(false);

        shareAdapter = new ShareAdapter(getContext(), shareItemsList);
        recyclerView.setAdapter(shareAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));

        return view;
    }
}