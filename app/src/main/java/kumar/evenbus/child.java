package kumar.evenbus;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.greenrobot.eventbus.EventBus;

public class child extends Activity {


    EditText e2;
    Button b2;
    private Object setchild;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        e2=(EditText)findViewById(R.id.editText2) ;
        b2=(Button)findViewById(R.id.button2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userinput=e2.getText().toString();

              message event =new message();
                event.setCustomMessage(userinput);
                EventBus.getDefault().post(event);

                finish();

            }
        });
    }

}
