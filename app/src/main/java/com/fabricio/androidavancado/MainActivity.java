package com.fabricio.androidavancado;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fabricio.androidavancado.Fragment.ListaLivrosFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction	transaction	=	getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_principal,	new	ListaLivrosFragment());
        transaction.commit();
    }
}
