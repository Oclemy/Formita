package com.tutorials.hp.formita;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.emmasuzuki.easyform.EasyFormEditText;

import butterknife.Bind;
import butterknife.ButterKnife;

public class EditTextFormFragment extends Fragment {

    @Bind(R.id.email_check_edittext)
    EasyFormEditText emailEditText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.edit_text_form, container, false);

        ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        emailEditText.setRegexPattern(Patterns.EMAIL_ADDRESS.pattern());
    }
}