package com.dexterous.flutterlocalnotifications;

import L5.j;
import V2.k;
import W.L;
import a1.C0415A;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.o;
import io.flutter.view.FlutterCallbackInformation;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes.dex */
public class ActionBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: b  reason: collision with root package name */
    public static Q5.f f9072b;

    /* renamed from: c  reason: collision with root package name */
    public static C5.c f9073c;

    /* renamed from: a  reason: collision with root package name */
    public C0415A f9074a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!"com.dexterous.flutterlocalnotifications.ActionBroadcastReceiver.ACTION_TAPPED".equalsIgnoreCase(intent.getAction())) {
            return;
        }
        C0415A c0415a = this.f9074a;
        if (c0415a == null) {
            c0415a = new C0415A(context);
        }
        this.f9074a = c0415a;
        Map<String, Object> extractNotificationResponseMap = FlutterLocalNotificationsPlugin.extractNotificationResponseMap(intent);
        if (intent.getBooleanExtra("cancelNotification", false)) {
            int intValue = ((Integer) extractNotificationResponseMap.get("notificationId")).intValue();
            Object obj = extractNotificationResponseMap.get("notificationTag");
            if (obj instanceof String) {
                new L(context).b(intValue, (String) obj);
            } else {
                new L(context).b(intValue, null);
            }
        }
        if (f9072b == null) {
            f9072b = new Q5.f(1);
        }
        Q5.f fVar = f9072b;
        L5.h hVar = (L5.h) fVar.f4434c;
        if (hVar != null) {
            hVar.c(extractNotificationResponseMap);
        } else {
            ((ArrayList) fVar.f4433b).add(extractNotificationResponseMap);
        }
        if (f9073c != null) {
            Log.e("ActionBroadcastReceiver", "Engine is already initialised");
            return;
        }
        F5.d dVar = (F5.d) k.A().f5965b;
        dVar.c(context);
        dVar.a(context, null);
        f9073c = new C5.c(context, null, new o(), true, false);
        FlutterCallbackInformation lookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(((Context) this.f9074a.f6744a).getSharedPreferences("flutter_local_notifications_plugin", 0).getLong("com.dexterous.flutterlocalnotifications.CALLBACK_DISPATCHER_HANDLE_KEY", -1L));
        if (lookupCallbackInformation == null) {
            Log.w("ActionBroadcastReceiver", "Callback information could not be retrieved");
            return;
        }
        D5.b bVar = f9073c.f555c;
        new j((A4.c) bVar.f871e, "dexterous.com/flutter/local_notifications/actions").a(f9072b);
        String str = (String) ((D5.b) dVar.f1209d).f869c;
        AssetManager assets = context.getAssets();
        A.f fVar2 = new A.f(assets, str, lookupCallbackInformation);
        if (bVar.f867a) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        Y5.a.b("DartExecutor#executeDartCallback");
        try {
            Objects.toString(fVar2);
            ((FlutterJNI) bVar.f868b).runBundleAndSnapshotFromLibrary(str, lookupCallbackInformation.callbackName, lookupCallbackInformation.callbackLibraryPath, assets, null);
            bVar.f867a = true;
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
