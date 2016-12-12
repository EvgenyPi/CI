package com.evgeny.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.UUID;

public class CrimeListActivity extends SingleFragmentActivity {
//
//    private static final String EXTRA_CRIME_ID = "com.evgeny.criminalintent.crime_id";
//
//    public static Intent newIntent (Context packageContext, UUID crimeId) {
//        Intent intent = new Intent(packageContext, CrimeActivity.class);
//        intent.putExtra(EXTRA_CRIME_ID,crimeId);
//        return intent;
//    }

    @Override
    protected Fragment createFragment() {

        return new CrimeListFragment();
//        UUID crimeId = (UUID) getIntent()
//                .getSerializableExtra(EXTRA_CRIME_ID);
//        return CrimeFragment.newInstance(crimeId);

    }
}

