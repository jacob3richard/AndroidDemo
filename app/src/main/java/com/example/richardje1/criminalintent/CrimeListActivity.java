package com.example.richardje1.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by richardje1 on 2/13/17.
 */

public class CrimeListActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }


}
