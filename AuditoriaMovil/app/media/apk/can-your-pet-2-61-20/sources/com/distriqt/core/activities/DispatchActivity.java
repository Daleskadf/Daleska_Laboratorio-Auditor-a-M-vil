package com.distriqt.core.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.distriqt.core.utils.IActivityResultHandler;
/* loaded from: classes.dex */
public class DispatchActivity extends Activity {
    public static final String EXTRA_REQUESTCODE = "extraRequestCode";
    public static final String TAG = "DispatchActivity";
    public static IActivityResultHandler resultHandler;

    public static void startActivityForResult(Context context, Intent intent, int i, IActivityResultHandler iActivityResultHandler) {
        try {
            resultHandler = iActivityResultHandler;
            Intent intent2 = new Intent(context, DispatchActivity.class);
            intent2.putExtra("android.intent.extra.INTENT", intent);
            intent2.putExtra(EXTRA_REQUESTCODE, i);
            context.startActivity(intent2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            startActivityForResult((Intent) getIntent().getParcelableExtra("android.intent.extra.INTENT"), getIntent().getIntExtra(EXTRA_REQUESTCODE, 0));
        } catch (Exception unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        IActivityResultHandler iActivityResultHandler = resultHandler;
        if (iActivityResultHandler != null) {
            iActivityResultHandler.onActivityResult(i, i2, intent);
        }
        finish();
    }
}
