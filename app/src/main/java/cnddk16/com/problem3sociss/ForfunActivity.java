package cnddk16.com.problem3sociss;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForfunActivity extends AppCompatActivity {
    private Button btnBack;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forfun);
        btnBack = findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_back = new Intent(ForfunActivity.this, MainActivity.class);
                startActivity(intent_back);
            }
        });
    }
}