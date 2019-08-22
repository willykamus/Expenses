package com.ching.expenses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.ching.expenses.fragment.CreateTransactionFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class WalletActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private ArrayList<String> categoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet);

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        CreateTransactionFragment fragment = new CreateTransactionFragment();
        fragmentTransaction.replace(R.id.wallet_fragment_container,fragment);
        fragmentTransaction.commit();

        initializeBottomBar();
    }

    private void initializeBottomBar() {


    }


}
