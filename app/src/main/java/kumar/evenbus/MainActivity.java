package kumar.evenbus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EventBus.getDefault().register(this);
        e1=(EditText)findViewById(R.id.editText) ;
        b1=(Button)findViewById(R.id.button);
b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent I = new Intent(MainActivity.this,child.class);
        startActivity(I);
    }
});

    }


@Subscribe

public void onEvent(message event){

    Log.d("whats up","Event fired");
    e1.setText(event.getCustomMessage());
}


}