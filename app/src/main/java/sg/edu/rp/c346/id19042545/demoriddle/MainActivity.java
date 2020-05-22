package sg.edu.rp.c346.id19042545.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvQ1;
    Button btnRevealQ1;
    Button btnRevealQ2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvQ1 = findViewById(R.id.textViewQ1);
        btnRevealQ1 = findViewById(R.id.buttonRevealQ1);
        btnRevealQ2 = findViewById(R.id.buttonRevealQ2);

        btnRevealQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q1 = new Intent(MainActivity.this,AnswerActivity1.class);
                q1.putExtra("Question","Q1");
                startActivity(q1);
            }
        });
        btnRevealQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q2 = new Intent(MainActivity.this,AnswerActivity2.class);
                q2.putExtra("Question","Q2");
                startActivity(q2);
            }
        });

    }
}
