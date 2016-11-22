package cs101.groupscheduleralpha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class Login extends AppCompatActivity {
    private String username = "[pp";
    private String password;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button loginButton = (Button)findViewById(R.id.button);
        loginButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                username = ((EditText)findViewById(R.id.editText)).getText().toString();
                password = ((EditText)findViewById(R.id.editText4)).getText().toString();
                Intent intent = new Intent(getApplicationContext(), Welcome.class);
                intent.putExtra("Username", username);
                intent.putExtra("Password", password);
                startActivity(intent);
            }

        });
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}