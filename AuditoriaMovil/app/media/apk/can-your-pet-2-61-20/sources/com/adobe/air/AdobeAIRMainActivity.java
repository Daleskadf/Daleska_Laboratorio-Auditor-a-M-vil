package com.adobe.air;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.Map;
/* loaded from: classes.dex */
public class AdobeAIRMainActivity extends Activity {
    public static final String ENABLE_MY_GAMES = "EnableMyGames";
    public static final String PROPERTY_DEFAULT_ACTIVITY = "AIRDefaultActivity";
    public static long RATE_LIMIT = 86400000;
    public static final String RESULT_RECEIVER = "resultReceiver";
    private static final String TAG = "AdobeAIRMainActivity";
    private Context mCtx = null;

    private void updateSharedPrefForDefaultActivity() {
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mCtx = this;
        copyActivityLevelPrefsToApplicationLevel();
        startService(new Intent(this, ShakeListenerService.class));
        startActivity(new Intent(this, StaticPageActivity.class));
    }

    private void copyActivityLevelPrefsToApplicationLevel() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this.mCtx).edit();
        SharedPreferences sharedPreferences = getSharedPreferences("AdobeAIR", 0);
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            Object value = entry.getValue();
            if (value instanceof String) {
                edit.putString(entry.getKey(), value.toString());
            } else if (value instanceof Long) {
                edit.putLong(entry.getKey(), ((Long) value).longValue());
            } else if (value instanceof Integer) {
                edit.putInt(entry.getKey(), ((Integer) value).intValue());
            } else if (value instanceof Boolean) {
                edit.putBoolean(entry.getKey(), ((Boolean) value).booleanValue());
            }
        }
        edit.commit();
        SharedPreferences.Editor edit2 = sharedPreferences.edit();
        edit2.clear();
        edit2.commit();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
    }
}
