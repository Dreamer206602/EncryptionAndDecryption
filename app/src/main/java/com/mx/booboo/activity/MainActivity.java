package com.mx.booboo.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.mx.booboo.R;
import com.mx.booboo.fragment.NavigationDrawerFragment;
import com.mx.booboo.fragment.RSAFragment;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);




    }




}
