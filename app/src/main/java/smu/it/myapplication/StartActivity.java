package smu.it.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity {
    EditText editText;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
        btn = (Button)findViewById(R.id.enterButton);
        editText = (EditText)findViewById(R.id.editText);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                String username = editText.getText().toString();
                intent.putExtra("username",username);
                Toast.makeText(getApplicationContext(),username + "님이 입장하셨습니다.", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

    }
}