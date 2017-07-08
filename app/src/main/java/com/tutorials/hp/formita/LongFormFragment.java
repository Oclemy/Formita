package com.tutorials.hp.formita;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.emmasuzuki.easyform.EasyForm;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LongFormFragment extends Fragment {

    @Bind(R.id.form)
    EasyForm easyForm;

    @Bind(R.id.submit_button)
    Button submitButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.long_form, container, false);

        ButterKnife.bind(this, view);

        return view;
    }

    @OnClick(R.id.submit_button)
    public void submitButtonClicked() {
        // Make sure to call easyForm.validate() when using showErrorOn = UNFOCUS
        easyForm.validate();

        if (easyForm.isValid()) {
            Log.e(getClass().getSimpleName(), "All values are valid. Ready to submit.");
        } else {
            Log.e(getClass().getSimpleName(), "The last input was invalid");
        }
    }
}