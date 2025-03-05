package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    private Button page1Bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.page1Main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        page1Bt1 = findViewById(R.id.page1Bt1);
        page1Bt1.setOnClickListener(new page1BtOnClickListener());
    }

    private class page1BtOnClickListener implements View.OnClickListener {
//        Intent intent = new Intent();
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
//            if (v.getId() == R.id.page1Bt1) {
                intent.setClass(MainActivity2.this, MainActivity.class);
                startActivity(intent);
//            }
        }
    }
}