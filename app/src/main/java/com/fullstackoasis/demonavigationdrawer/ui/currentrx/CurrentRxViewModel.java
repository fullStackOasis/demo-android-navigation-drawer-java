package com.fullstackoasis.demonavigationdrawer.ui.currentrx;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CurrentRxViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CurrentRxViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is current Rx fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}