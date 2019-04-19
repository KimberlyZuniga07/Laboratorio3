package com.example.laboratorio3;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private static final String TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void clickDisplayCorrectToast(View view){
        Toast.makeText(this,R.string.correct_toast, Toast.LENGTH_SHORT).show();

    }

    public void clickDisplayIncorrectToast(View view) {
        Toast.makeText(this,R.string.incorrect_toast, Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart() called");

        // La actividad está a punto de hacerse visible.
        Toast.makeText(this, "OnStart llamado", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume called");
        Toast.makeText(this, "OnResume llamado", Toast.LENGTH_SHORT).show();
        // La actividad se ha vuelto visible (ahora se "reanuda").
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause() called");
        Toast.makeText(this, "OnPause llamado", Toast.LENGTH_SHORT).show();
        // Enfocarse en otra actividad  (esta actividad está a punto de ser "detenida").
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop() called");
        Toast.makeText(this, "OnStop llamado", Toast.LENGTH_SHORT).show();
        // La actividad ya no es visible (ahora está "detenida")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy() called");
        Toast.makeText(this, "OnDestroy llamado", Toast.LENGTH_SHORT).show();
        // La actividad está a punto de ser destruida.
    }




}
