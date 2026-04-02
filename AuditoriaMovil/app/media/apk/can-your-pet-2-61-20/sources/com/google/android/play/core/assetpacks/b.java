package com.google.android.play.core.assetpacks;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.activity.ComponentDialog$$ExternalSyntheticApiModelOutline0;
import com.adobe.air.AIRFileUtils$$ExternalSyntheticApiModelOutline2;
import kotlin.io.path.PathTreeWalk$$ExternalSyntheticApiModelOutline0;
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
final class b extends com.google.android.play.core.assetpacks.internal.i {
    final NotificationManager a;
    private final com.google.android.play.core.assetpacks.internal.o b = new com.google.android.play.core.assetpacks.internal.o("AssetPackExtractionService");
    private final Context c;
    private final bh d;
    private final l e;
    private final ci f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, bh bhVar, l lVar, ci ciVar) {
        this.c = context;
        this.d = bhVar;
        this.e = lVar;
        this.f = ciVar;
        this.a = (NotificationManager) context.getSystemService("notification");
    }

    private final synchronized void d(String str) {
        if (str == null) {
            str = "File downloads by Play";
        }
        AIRFileUtils$$ExternalSyntheticApiModelOutline2.m203m();
        this.a.createNotificationChannel(ComponentDialog$$ExternalSyntheticApiModelOutline0.m("playcore-assetpacks-service-notification-channel", str, 2));
    }

    private final synchronized void e(Bundle bundle, com.google.android.play.core.assetpacks.internal.k kVar) throws RemoteException {
        Notification.Builder priority;
        this.b.a("updateServiceState AIDL call", new Object[0]);
        if (com.google.android.play.core.assetpacks.internal.ai.b(this.c) && com.google.android.play.core.assetpacks.internal.ai.a(this.c)) {
            int i = bundle.getInt("action_type");
            this.f.c(kVar);
            if (i != 1) {
                if (i == 2) {
                    this.e.g(false);
                    this.f.b();
                    return;
                }
                this.b.b("Unknown action type received: %d", Integer.valueOf(i));
                kVar.d(new Bundle());
                return;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                d(bundle.getString("notification_channel_name"));
            }
            this.e.g(true);
            ci ciVar = this.f;
            String string = bundle.getString("notification_title");
            String string2 = bundle.getString("notification_subtext");
            long j = bundle.getLong("notification_timeout", 600000L);
            Parcelable parcelable = bundle.getParcelable("notification_on_click_intent");
            if (Build.VERSION.SDK_INT >= 26) {
                Context context = this.c;
                PathTreeWalk$$ExternalSyntheticApiModelOutline0.m1670m$1();
                priority = PathTreeWalk$$ExternalSyntheticApiModelOutline0.m(context, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j);
            } else {
                priority = new Notification.Builder(this.c).setPriority(-2);
            }
            if (parcelable instanceof PendingIntent) {
                priority.setContentIntent((PendingIntent) parcelable);
            }
            Notification.Builder ongoing = priority.setSmallIcon(17301633).setOngoing(false);
            if (string == null) {
                string = "Downloading additional file";
            }
            Notification.Builder contentTitle = ongoing.setContentTitle(string);
            if (string2 == null) {
                string2 = "Transferring";
            }
            contentTitle.setSubText(string2);
            int i2 = bundle.getInt("notification_color");
            if (i2 != 0) {
                priority.setColor(i2).setVisibility(-1);
            }
            ciVar.a(priority.build());
            this.c.bindService(new Intent(this.c, ExtractionForegroundService.class), this.f, 1);
            return;
        }
        kVar.d(new Bundle());
    }

    @Override // com.google.android.play.core.assetpacks.internal.j
    public final void b(Bundle bundle, com.google.android.play.core.assetpacks.internal.k kVar) throws RemoteException {
        this.b.a("clearAssetPackStorage AIDL call", new Object[0]);
        if (!com.google.android.play.core.assetpacks.internal.ai.b(this.c) || !com.google.android.play.core.assetpacks.internal.ai.a(this.c)) {
            kVar.d(new Bundle());
            return;
        }
        this.d.z();
        kVar.c(new Bundle());
    }

    @Override // com.google.android.play.core.assetpacks.internal.j
    public final void c(Bundle bundle, com.google.android.play.core.assetpacks.internal.k kVar) throws RemoteException {
        e(bundle, kVar);
    }
}
