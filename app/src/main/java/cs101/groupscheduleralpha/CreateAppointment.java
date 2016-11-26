package cs101.groupscheduleralpha;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateAppointment extends AppCompatActivity{
    Button bSetApp;
    EditText eventName;
    EditText date;
    EditText desc;
    EditText time;
    EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_app);
        setTitle("Create an Appointment");
        bSetApp = (Button) findViewById(R.id.button3);
        bSetApp.setOnClickListener(
            new Button.OnClickListener() {
                public void onClick(View view){
                    Intent intent = new Intent(getApplicationContext(), Welcome.class);
                    startActivity(intent);
                }
            }
        );
        eventName = (EditText) findViewById(R.id.editText6);
        eventName.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            public void onFocusChange(View v, boolean hasFocus){
                if(hasFocus)
                    eventName.setHint("");
                else
                    eventName.setHint("Event Name");
            }
        });
        date = (EditText) findViewById(R.id.editText5);
        date.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            public void onFocusChange(View v, boolean hasFocus){
                if(hasFocus)
                    date.setHint("");
                else
                    date.setHint("mm/dd/yy");
            }
        });
        desc = (EditText) findViewById(R.id.editText8);
        desc.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            public void onFocusChange(View v, boolean hasFocus){
                if(hasFocus)
                    desc.setHint("");
                else
                    desc.setHint("Description");
            }
        });
        time = (EditText) findViewById(R.id.editText7);
        time.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            public void onFocusChange(View v, boolean hasFocus){
                if(hasFocus)
                    time.setHint("");
                else
                    time.setHint("12:00");
            }
        });
        name = (EditText) findViewById(R.id.editText10);
        name.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            public void onFocusChange(View v, boolean hasFocus){
                if(hasFocus)
                    name.setHint("");
                else
                    name.setHint("Name");
            }
        });
    }

//    public void sendToCloud(){
//
//    }
}
