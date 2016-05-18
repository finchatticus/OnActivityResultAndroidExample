package ua.kpi.speleo.onactivityresultandroidexample.app.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import ua.kpi.speleo.onactivityresultandroidexample.app.R;
import ua.kpi.speleo.onactivityresultandroidexample.app.util.RequestCode;

public class MainActivity extends Activity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private TextView textViewName;
    private TextView textViewLanguage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAG,"onCreate");
        setContentView(R.layout.main_layout);

        textViewName = (TextView) findViewById(R.id.textViewName);
        textViewLanguage = (TextView) findViewById(R.id.textViewLanguage);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Log.v(TAG,"onActivityResult");
        if(resultCode == RESULT_OK) {
            switch (requestCode) {
                case RequestCode.REQUEST_CODE_PRESENTED:
                    String name = data.getStringExtra("name");
                    textViewName.setText("Hello! " + name);
                    break;
                case RequestCode.REQUEST_CODE_LANGUAGE:
                    String language = data.getStringExtra("language");
                    textViewLanguage.setText("Your language" + language);
                    break;

            }
        } else {
            Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show();
        }
    }

    public void onShow(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.buttonName:
                intent = new Intent(this, PresentedActivity.class);
                startActivityForResult(intent, RequestCode.REQUEST_CODE_PRESENTED);
                break;
            case R.id.buttonLanguage:
                intent = new Intent(this, LanguageActivity.class);
                startActivityForResult(intent, RequestCode.REQUEST_CODE_LANGUAGE);
                break;
        }
    }
}
