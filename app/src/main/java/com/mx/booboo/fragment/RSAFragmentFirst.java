package com.mx.booboo.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mx.booboo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RSAFragmentFirst extends Fragment {
    private static final String ARG_TITLE = "pager_title";
    private static final String ARG_PAGE = "pager_number";
    private String title;
    private int page;

    public static RSAFragmentFirst newInstance(int page, String title){
        RSAFragmentFirst fragment = new RSAFragmentFirst();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        args.putString(ARG_TITLE, title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt(ARG_PAGE);
        title = getArguments().getString(ARG_TITLE);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rsafragment_first, container, false);
    }

}
