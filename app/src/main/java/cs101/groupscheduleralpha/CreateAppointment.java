package cs101.groupscheduleralpha;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CreateAppointment extends AppCompatActivity {
    EditText eventName;
    EditText date;
    EditText desc;
    EditText timemins,timehours;
    String timeday;
    private DatabaseReference mFirebaseDatabaseReference;
    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_app);
        setTitle("Create an Appointment");
        mFirebaseDatabaseReference = FirebaseDatabase.getInstance().getReference();
        eventName = (EditText) findViewById(R.id.editText6);
        eventName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus)
                    eventName.setHint("");
                else
                    eventName.setHint("Event Name");
            }
        });
        date = (EditText) findViewById(R.id.editText5);
        date.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus)
                    date.setHint("");
                else
                    date.setHint("mm/dd/yy");
            }
        });
        desc = (EditText) findViewById(R.id.editText8);
        desc.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus)
                    desc.setHint("");
                else
                    desc.setHint("Description");
            }
        });
        timemins = (EditText) findViewById(R.id.TimeMinutes);
        timemins.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus)
                    timemins.setHint("");
                else
                    timemins.setHint("00");
            }
        });
        timehours = (EditText) findViewById(R.id.TimeHours);
        timehours.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus)
                    timehours.setHint("");
                else
                    timehours.setHint("12");
            }
        });
    }

    public void onSetTime(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.sAM:
                if (checked)
                    timeday = "AM";
                break;
            case R.id.sPM:
                if (checked)
                    timeday = "PM";
                break;
        }

    }

    public String textString(EditText e){
        return e.getText().toString();
    }

    public void sendToCloud(View view) {
        AppointmentData c;
        //(String d, String t, String td,  String de, String e)
        c = new AppointmentData(textString(date),textString(timehours) + " : "+ textString(timemins),timeday,textString(desc),textString(eventName));
        mFirebaseDatabaseReference.child("event").setValue(c);
        Intent intent = new Intent(getApplicationContext(), Welcome.class);
        startActivity(intent);
    }
}

