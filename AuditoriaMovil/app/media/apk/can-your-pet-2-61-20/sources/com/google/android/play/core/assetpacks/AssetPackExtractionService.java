package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
public class AssetPackExtractionService extends Service {
    b a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        d.a(getApplicationContext()).b(this);
    }
}
