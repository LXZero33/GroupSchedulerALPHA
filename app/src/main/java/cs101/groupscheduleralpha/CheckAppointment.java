package cs101.groupscheduleralpha;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by Bahn on 11/21/2016.
 */

public class CheckAppointment extends AppCompatActivity {
    Button bSetApp, calander;
    String updates;
    TextView updateview;
    private DatabaseReference mDatabase;
    private AppointmentData app;
    private String event,date,time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        app = new AppointmentData();
        setContentView(R.layout.check_app);
        setTitle("Check Appointments");
        mDatabase = FirebaseDatabase.getInstance().getReference();
        bSetApp = (Button) findViewById(R.id.back);
        bSetApp.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), Welcome.class);
                        startActivity(intent);
                    }
                }
        );
        calander = (Button) findViewById(R.id.calbutton);
        calander.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), Calendar.class);
                        startActivity(intent);
                    }
                }
        );
        // mDatabase.limitToLast(1)
        ValueEventListener postListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                app = dataSnapshot.getValue(AppointmentData.class);
                //System.out.println(app.getEvent());
                event = app.getEvent();
                date = app.getDate();
                time = app.getTime();
                updates = event + '\n' + date + "   " + time + '\n' + app.getDescription();
                updateview = (TextView) findViewById(R.id.updates);
                updateview.setText(updates, TextView.BufferType.NORMAL);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        };

        mDatabase.child("event").addValueEventListener(postListener);
        //System.out.println(event);
        /*
        updates = event + '\n' + date + "   " + time;
        updateview = (TextView) findViewById(R.id.updates);
        updateview.setText(updates, TextView.BufferType.NORMAL);
        */

}

    public void checkusers() {

      //  mDatabase
    }
//    public void goBack(){
//        setContentView(R.layout.welcome);
//    }

}
