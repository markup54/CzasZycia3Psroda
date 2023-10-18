package pl.zabrze.zs10.czaszycia3psroda;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private ImageButton buttonGora;
private ImageButton buttonDol;
private int liczbaPunktow =0;
private TextView textView;

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("CZAS_ZYCIA","Uruchomiono OnStart");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("CZAS_ZYCIA","Uruchomiono OnSaveInstanceState");
        outState.putInt("PUNKTY",liczbaPunktow);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("CZAS_ZYCIA","Uruchomiono OnDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("CZAS_ZYCIA","Uruchomiono OnPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("CZAS_ZYCIA","Uruchomiono OnRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("CZAS_ZYCIA","Uruchomiono OnResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("CZAS_ZYCIA","Uruchomiono OnStop");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("CZAS_ZYCIA","Uruchomiono OnCreate");

        buttonDol = findViewById(R.id.imageButton2);
        textView = findViewById(R.id.textView);
        if(savedInstanceState !=null){
            liczbaPunktow = savedInstanceState.getInt("PUNKTY");
            textView.setText(String.valueOf(liczbaPunktow));
        }
        buttonDol.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        liczbaPunktow--;
                        textView.setText(String.valueOf(liczbaPunktow));

                    }
                }
        );
        buttonGora = findViewById(R.id.imageButton);
        buttonGora.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        liczbaPunktow++;
                        textView.setText(String.valueOf(liczbaPunktow));

                    }
                }
        );

    }
}