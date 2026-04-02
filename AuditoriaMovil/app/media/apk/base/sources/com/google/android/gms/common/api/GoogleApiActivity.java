package com.google.android.gms.common.api;

import D.AbstractC0059i;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.C0735i;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.base.zau;
@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f9145b = 0;

    /* renamed from: a  reason: collision with root package name */
    public int f9146a = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i7, int i8, Intent intent) {
        super.onActivityResult(i7, i8, intent);
        if (i7 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f9146a = 0;
            setResult(i8, intent);
            if (booleanExtra) {
                C0735i h8 = C0735i.h(this);
                if (i8 != -1) {
                    if (i8 == 0) {
                        h8.j(new W2.b(13, null), getIntent().getIntExtra("failing_client_id", -1));
                    }
                } else {
                    zau zauVar = h8.f9264i0;
                    zauVar.sendMessage(zauVar.obtainMessage(3));
                }
            }
        } else if (i7 == 2) {
            this.f9146a = 0;
            setResult(i8, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f9146a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f9146a = bundle.getInt("resolution");
        }
        if (this.f9146a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
            } else if (pendingIntent != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                    this.f9146a = 1;
                } catch (ActivityNotFoundException e7) {
                    if (extras.getBoolean("notify_manager", true)) {
                        C0735i.h(this).j(new W2.b(22, null), getIntent().getIntExtra("failing_client_id", -1));
                    } else {
                        String M7 = AbstractC0059i.M("Activity not found while launching ", pendingIntent.toString(), ".");
                        if (Build.FINGERPRINT.contains("generic")) {
                            M7 = M7.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                        }
                        Log.e("GoogleApiActivity", M7, e7);
                    }
                    this.f9146a = 1;
                    finish();
                } catch (IntentSender.SendIntentException e8) {
                    Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e8);
                    finish();
                }
            } else {
                I.i(num);
                W2.e.f6170d.e(this, num.intValue(), this);
                this.f9146a = 1;
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f9146a);
        super.onSaveInstanceState(bundle);
    }
}
