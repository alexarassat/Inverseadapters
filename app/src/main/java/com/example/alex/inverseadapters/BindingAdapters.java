package com.example.alex.inverseadapters;

import android.databinding.BindingAdapter;
import android.databinding.InverseBindingAdapter;
import android.databinding.InverseBindingListener;
import android.databinding.InverseBindingMethod;
import android.databinding.InverseBindingMethods;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;


public class BindingAdapters {

    @InverseBindingAdapter(attribute = "android:text")
    public static String getHeightFromView(EditText view) {
        Log.d("edokekei", "  " + view.getText());
        return view.getText().toString() + 78;
    }

    @BindingAdapter(value = "textAttrChanged")ccvx
    public static void setHeight(EditText view, final InverseBindingListener listener) {
        Log.d("edokekei", " 95 " + "kik");

        view.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                listener.onChange();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @BindingAdapter(value = "android:text")
    public static void setmalaka(EditText view, String kati, String makis) {
        if (kati != null && !view.getText().toString().equals(kati)) {
            Log.d("edokekei", " 4 " +kati +"  "+makis);

            view.setText(makis);
        }
    }
}


