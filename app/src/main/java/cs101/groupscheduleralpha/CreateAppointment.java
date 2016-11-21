package cs101.groupscheduleralpha;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class CreateAppointment extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_app);
        setTitle("Create an Appointment");
    }

    public void sendToCloud(){
        setContentView(R.layout.welcome);
    }
}
