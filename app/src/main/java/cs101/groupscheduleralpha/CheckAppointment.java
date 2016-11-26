package cs101.groupscheduleralpha;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Bahn on 11/21/2016.
 */

public class CheckAppointment extends AppCompatActivity {
Button bSetApp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_app);
        setTitle("Check Appointments");
        bSetApp =  (Button) findViewById(R.id.button3);
        bSetApp.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View view){
                        Intent intent = new Intent(getApplicationContext(), Welcome.class);
                        startActivity(intent);
                    }
                }
        );
    }
    public void goToCalendar(){
        setContentView(R.layout.calendar);
    }
//    public void goBack(){
//        setContentView(R.layout.welcome);
//    }

}
