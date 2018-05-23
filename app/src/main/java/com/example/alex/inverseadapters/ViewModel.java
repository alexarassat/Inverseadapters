package com.example.alex.inverseadapters;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;
import android.view.View;

public class ViewModel extends BaseObservable {

    private String amount;
    private String makis;

    public void setAmount(String amount) {
        this.amount = amount;
        notifyPropertyChanged(BR.amount);
        Log.d("edo eimai mages", "1  " + amount);
    }

    @Bindable
    public String getMakis() {
        return makis;
    }

    public void setMakis(String makis) {
        this.makis = makis;
        notifyPropertyChanged(BR.makis);
    }

    @Bindable
    public String getAmount() {

        Log.d("edo eimai mages", "2  " + amount);
        return this.amount;
    }

    public void onClick(View view) {

        Log.d("edo eimai mages", "kati" + "3  " + amount);
    }

    public String getKeimeno() {
        return "oti thelete mages mou";
    }
}
