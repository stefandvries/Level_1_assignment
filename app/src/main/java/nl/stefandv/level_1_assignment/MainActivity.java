package nl.stefandv.level_1_assignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText input1;
    EditText input2;
    EditText input3;
    EditText input4;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = (EditText) findViewById(R.id.text_input1);
        input2 = (EditText) findViewById(R.id.text_input2);
        input3 = (EditText) findViewById(R.id.text_input3);
        input4 = (EditText) findViewById(R.id.text_input4);

        button= (Button) findViewById(R.id.button);

     String input1Text;

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String input1Text = input1.getText().toString();
                String input2Text = input2.getText().toString();
                String input3Text = input3.getText().toString();
                String input4Text = input4.getText().toString();

                if(TextUtils.isEmpty(input1Text) || TextUtils.isEmpty(input2Text) || TextUtils.isEmpty(input3Text) || TextUtils.isEmpty(input4Text)){
                    Toast.makeText(getApplicationContext(), "Not all answers are filled in...",
                            Toast.LENGTH_LONG).show();
                }else if (input1Text.equals("T") && input2Text.equals("F") && input3Text.equals("F") && input4Text.equals("T")){

                    Toast.makeText(getApplicationContext(), "Congratulations!",
                            Toast.LENGTH_LONG).show();


                }else { Toast.makeText(getApplicationContext(), "You failed", Toast.LENGTH_LONG).show();
                }


            }
        });




    }


}
