package com.example.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fragment.FirstFragment;
import fragment.SecondFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnfragment;
    private Boolean status=true;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnfragment=findViewById(R.id.btngo);
        btnfragment.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
        if(status){
            FirstFragment firstFragment=new FirstFragment();
            fragmentTransaction.replace(R.id.fragmentcontainer,firstFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            btnfragment.setText("Calculate Area of Circle");
            status=false;
        }
        else{
            SecondFragment secondFragment =new SecondFragment();
            fragmentTransaction.replace(R.id.fragmentcontainer,secondFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            btnfragment.setText("Calculate Sum");
            status=true;
        }
    }
}
