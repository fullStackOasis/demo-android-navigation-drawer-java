package com.fullstackoasis.demonavigationdrawer.ui.patientdetails;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PatientDetailsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PatientDetailsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is patient details fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}