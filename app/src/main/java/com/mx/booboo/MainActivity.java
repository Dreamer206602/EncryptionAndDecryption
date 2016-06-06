package com.mx.booboo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.mx.booboo.fragment.NavigationDrawerFragment;
import com.mx.booboo.fragment.RSAFragment;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends FragmentActivity implements NavigationDrawerFragment.NavigationDrawerCallbacks{

    @Bind(R.id.container)
    FrameLayout mContainer;

    NavigationDrawerFragment mNavigationDrawerFragment;
    @Bind(R.id.drawer_layout)
    DrawerLayout mDrawerLayout;

    private CharSequence mTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mNavigationDrawerFragment= (NavigationDrawerFragment) getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);

        mTitle=getTitle();

        mNavigationDrawerFragment.setUp(R.id.navigation_drawer,(DrawerLayout)findViewById(R.id.drawer_layout));


    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        switch (position){
            case 13:
                fragmentManager.beginTransaction()
                        .replace(R.id.container, RSAFragment.newInstance(position+1))
                        .commit();
                break;
        }
    }

    public void onSectionAttached(int number) {
        switch (number){
            case 14:
                mTitle="RSA";
                break;
        }
    }
}
