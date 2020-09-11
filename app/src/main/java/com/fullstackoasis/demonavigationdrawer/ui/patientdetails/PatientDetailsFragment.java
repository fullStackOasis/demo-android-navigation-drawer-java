package com.fullstackoasis.demonavigationdrawer.ui.patientdetails;

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

public class PatientDetailsFragment extends Fragment {

    private PatientDetailsViewModel patientDetailsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        patientDetailsViewModel =
                ViewModelProviders.of(this).get(PatientDetailsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_patientdetails, container, false);
        final TextView textView = root.findViewById(R.id.text_patientdetails);
        patientDetailsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
