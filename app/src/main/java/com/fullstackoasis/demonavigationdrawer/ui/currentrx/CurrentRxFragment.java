package com.fullstackoasis.demonavigationdrawer.ui.currentrx;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.fullstackoasis.demonavigationdrawer.R;

public class CurrentRxFragment extends Fragment {

    private CurrentRxViewModel currentRxViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        currentRxViewModel =
                ViewModelProviders.of(this).get(CurrentRxViewModel.class);
        View root = inflater.inflate(R.layout.fragment_currentrx, container, false);
        final TextView textView = root.findViewById(R.id.text_currentrx);
        currentRxViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
