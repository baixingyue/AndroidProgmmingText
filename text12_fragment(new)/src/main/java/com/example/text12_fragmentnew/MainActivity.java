package com.example.text12_fragmentnew;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.text12_fragmentnew.Words.WordsContent;

public class MainActivity extends AppCompatActivity implements ItemFragment.OnListFragmentInteractionListener,DetailFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void onListFragmentInteraction(WordsContent.WordsItem item) {
        Bundle argument = new Bundle();
        argument.putString("id",item.id);
        DetailFragment fragment = new DetailFragment();
        fragment.setArguments(argument);
        getFragmentManager().beginTransaction().replace(R.id.layoutDetail, fragment).commit();
    }
    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
