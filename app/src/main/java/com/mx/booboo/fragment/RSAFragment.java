package com.mx.booboo.fragment;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mx.booboo.MainActivity;
import com.mx.booboo.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class RSAFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";
    @Bind(R.id.pager_header)
    PagerTabStrip mPagerHeader;
    @Bind(R.id.vpPager)
    ViewPager mVpPager;

    private FragmentPagerAdapter mPagerAdapter;

    public static RSAFragment newInstance(int sectionNumber) {
        RSAFragment rsaFragment = new RSAFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, sectionNumber);
        rsaFragment.setArguments(bundle);
        return rsaFragment;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(getArguments().getInt(ARG_SECTION_NUMBER));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_rsa, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();

        mPagerAdapter=new MyPagerAdapter(getChildFragmentManager());
        mVpPager.setAdapter(mPagerAdapter);

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    public static class MyPagerAdapter extends FragmentPagerAdapter {

        private static int NUM_ITEMS = 3;

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return RSAFragmentFirst.newInstance(0, "Page 1");
                case 1:
                    return RSAFragmentSecond.newInstance(1, "Page 2");
                case 2:
                    return RSAFragmentThird.newInstance(2, "Page 3");
                default:
                    return null;
            }

        }

        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "密钥";

                case 1:
                    return "私钥";

                case 2:
                    return "签名";
                default:
                    return null;
            }

        }
    }
}
