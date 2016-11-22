package cs101.groupscheduleralpha;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CreateAppointment extends AppCompatActivity{
Button bSetApp;
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

    }

//    public void sendToCloud(){
//
//    }
}
