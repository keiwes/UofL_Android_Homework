package com.keiwes.android.criminalintent;

import android.support.v4.app.Fragment;

public class CrimeActivity extends SingleFragmentActivity {
	/** Called when the activity is first created. */
	@Override
	protected Fragment createFragment() {
		return new CrimeFragment();
	}
	
}
