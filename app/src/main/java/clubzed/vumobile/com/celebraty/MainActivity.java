package clubzed.vumobile.com.celebraty;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends Activity {

    EditText loginName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginName = (EditText) findViewById(R.id.loginName);
    }

    public void loginButton(View view) {

        startActivity(new Intent(MainActivity.this, LoginActivity.class));

    }
}
