package ua.kpi.speleo.onactivityresultandroidexample.app.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import ua.kpi.speleo.onactivityresultandroidexample.app.R;
import ua.kpi.speleo.onactivityresultandroidexample.app.util.Language;

public class LanguageActivity extends Activity {
    private static final String TAG = LanguageActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAG,"onCreate");
        setContentView(R.layout.language_layout);
    }

    public void onSelectedLanguage(View v) {
        Log.v(TAG,"onSelectedLanguage");
        Intent intent;
        switch (v.getId()) {
            case R.id.buttonUA:
                intent = new Intent();
                intent.putExtra("language", Language.UKRAINIAN.getLanguage());
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.buttonRU:
                intent = new Intent();
                intent.putExtra("language", Language.RUSSIAN.getLanguage());
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.buttonEN:
                intent = new Intent();
                intent.putExtra("language", Language.ENGLISH.getLanguage());
                setResult(RESULT_OK, intent);
                finish();
                break;
        }
    }
}
