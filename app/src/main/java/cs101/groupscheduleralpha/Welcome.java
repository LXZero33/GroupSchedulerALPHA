package cs101.groupscheduleralpha;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class Welcome extends AppCompatActivity {
Button setApp;
Button checkApp;
    private FirebaseAuth mFirebaseAuth;
    private FirebaseUser mFirebaseUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Initialize Firebase Auth
        mFirebaseAuth = FirebaseAuth.getInstance();
        mFirebaseUser = mFirebaseAuth.getCurrentUser();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        setTitle("Group Scheduler");
        setApp = (Button) findViewById(R.id.createapp);
        setApp.setOnClickListener(
            new Button.OnClickListener() {
                public void onClick(View view){
                    Intent intent = new Intent(getApplicationContext(), CreateAppointment.class);
                    startActivity(intent);
                }
            }
        );
        checkApp = (Button) findViewById(R.id.checkapp);
        checkApp.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View view){
                        Intent intent = new Intent(getApplicationContext(), CheckAppointment.class);
                        startActivity(intent);
                    }
                }
        );
    }


}
