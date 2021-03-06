package com.example.richardje1.criminalintent;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import java.util.UUID;

/**
 * Created by richardje1 on 2/13/17.
 */

public class CrimeFragment extends Fragment {
    public static final String EXTRA_CRIME_ID =
            "com.example.richardje1.criminalintent";
    private Crime mCrime;
    private EditText mTitleField;
    private Button mDateButton;
    private CheckBox mSolvedCheckBox;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        UUID crimId = (UUID)getActivity().getIntent()
                .getSerializableExtra(EXTRA_CRIME_ID);
        mCrime = CrimeLab.get(getActivity()).getCrime(crimId);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
                             Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_crime,parent, false);

        mTitleField = (EditText)v.findViewById(R.id.crime_title);
        mTitleField.addTextChangedListener(new TextWatcher(){
            public void onTextChanged( CharSequence c, int start, int before,
                                       int count){
                //intentionally blank
            }
            public void beforeTextChanged(CharSequence c, int start, int count, int after){
                //intentionally blank
            }

            public void afterTextChanged(Editable c){
                //This one too
            }
        });

        mDateButton = (Button)v.findViewById(R.id.crime_date);
        mDateButton.setText(mCrime.getDate().toString());
        mDateButton.setEnabled(false);

        mSolvedCheckBox = (CheckBox)v.findViewById(R.id.crime_solved);
        mSolvedCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // set the crime's solved property
                mCrime.setSolved(isChecked);

            }
        });
        return v;
    }

}
