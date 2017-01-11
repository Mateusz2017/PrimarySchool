package pl.projects.kata.mateusz.primaryschool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        ImageButton send = (ImageButton) findViewById(R.id.imageButton);
        send.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                EditText edit = (EditText)findViewById(R.id.editPole);
                edit.setText(" ", TextView.BufferType.EDITABLE);
            }
        });
    }
}
