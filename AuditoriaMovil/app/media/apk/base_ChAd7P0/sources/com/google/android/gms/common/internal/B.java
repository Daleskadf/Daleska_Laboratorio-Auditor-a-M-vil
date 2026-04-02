package com.google.android.gms.common.internal;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.InterfaceC0739m;
/* loaded from: classes.dex */
public final class B implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9292a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f9293b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f9294c;

    public /* synthetic */ B(Intent intent, Object obj, int i7) {
        this.f9292a = i7;
        this.f9293b = intent;
        this.f9294c = obj;
    }

    public final void a() {
        switch (this.f9292a) {
            case 0:
                Intent intent = this.f9293b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f9294c).startActivityForResult(intent, 2);
                    return;
                }
                return;
            default:
                Intent intent2 = this.f9293b;
                if (intent2 != null) {
                    ((InterfaceC0739m) this.f9294c).startActivityForResult(intent2, 2);
                    return;
                }
                return;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e7) {
                String str = "Failed to start resolution intent.";
                if (true == Build.FINGERPRINT.contains("generic")) {
                    str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
                }
                Log.e("DialogRedirect", str, e7);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
