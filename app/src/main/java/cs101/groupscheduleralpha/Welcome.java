package cs101.groupscheduleralpha;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;



public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        setTitle("Group Scheduler");

    }

    public void setAppointment(){
        setContentView(R.layout.create_app);
    }
    public void checkAppointment(){
        setContentView(R.layout.check_app);
    }

}
