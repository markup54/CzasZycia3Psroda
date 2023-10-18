package pl.zabrze.zs10.czaszycia3psroda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonDol = findViewById(R.id.imageButton2);
        textView = findViewById(R.id.textView);
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
    }
}