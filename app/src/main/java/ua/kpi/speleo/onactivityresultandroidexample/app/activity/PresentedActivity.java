package ua.kpi.speleo.onactivityresultandroidexample.app.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import ua.kpi.speleo.onactivityresultandroidexample.app.R;

public class PresentedActivity extends Activity {
    private static final String TAG = PresentedActivity.class.getSimpleName();
    private EditText editTextName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAG,"onCreate");
        setContentView(R.layout.presented_layout);

        editTextName = (EditText) findViewById(R.id.editTextName);
    }

    public void onPresented(View v) {
        Log.v(TAG,"onPresented");
        Intent intent = new Intent();
        intent.putExtra("name", editTextName.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}
