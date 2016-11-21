package cs101.groupscheduleralpha;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Bahn on 11/21/2016.
 */

public class Calendar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_app);
        setTitle("Check Appointments");

    }
    public void goBack(){
        setContentView(R.layout.check_app);
    }
}