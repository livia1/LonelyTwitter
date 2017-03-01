package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    private TextView printSomethingHere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
        printSomethingHere = (TextView) findViewById(R.id.printHere);

        Bundle bundle = getIntent().getExtras();
        String printSomething = bundle.get("passOver").toString();

        printSomethingHere.setText(printSomething);


    }




}
