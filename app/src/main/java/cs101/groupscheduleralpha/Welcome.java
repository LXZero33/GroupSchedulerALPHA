package cs101.groupscheduleralpha;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class Welcome extends AppCompatActivity {
Button setApp;
Button checkApp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        setTitle("Group Scheduler");
        setApp = (Button) findViewById(R.id.createapp);
        bSetApp.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View view){
                        Intent intent = new Intent(getApplicationContext(), Welcome.class);
                        startActivity(intent);
                    }
                }
        );
    }

    public void setAppointment(){
        setContentView(R.layout.create_app);
    }
    public void checkAppointment(){
        setContentView(R.layout.check_app);
    }


}
