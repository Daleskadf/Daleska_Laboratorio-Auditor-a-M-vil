package com.baseflow.geolocator;

import B5.AbstractActivityC0032e;
import W.C0365h;
import android.app.Service;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import p.C1608t;
import r2.BinderC1732a;
import t2.g;
import t2.k;
/* loaded from: classes.dex */
public class GeolocatorLocationService extends Service {

    /* renamed from: f0  reason: collision with root package name */
    public static final /* synthetic */ int f9062f0 = 0;

    /* renamed from: X  reason: collision with root package name */
    public k f9063X;

    /* renamed from: a  reason: collision with root package name */
    public final BinderC1732a f9066a = new BinderC1732a(this);

    /* renamed from: b  reason: collision with root package name */
    public boolean f9067b = false;

    /* renamed from: c  reason: collision with root package name */
    public int f9068c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f9069d = 0;

    /* renamed from: e  reason: collision with root package name */
    public AbstractActivityC0032e f9070e = null;
    public g f = null;

    /* renamed from: Y  reason: collision with root package name */
    public PowerManager.WakeLock f9064Y = null;

    /* renamed from: Z  reason: collision with root package name */
    public WifiManager.WifiLock f9065Z = null;

    /* renamed from: e0  reason: collision with root package name */
    public C1608t f9071e0 = null;

    public final void a() {
        if (this.f9067b) {
            Log.d("FlutterGeolocator", "Stop service in foreground.");
            if (Build.VERSION.SDK_INT >= 24) {
                stopForeground(1);
            } else {
                stopForeground(true);
            }
            c();
            this.f9067b = false;
            this.f9071e0 = null;
        }
    }

    public final void b(C0365h c0365h) {
        WifiManager wifiManager;
        int i7;
        PowerManager powerManager;
        c();
        if (c0365h.f6031b && (powerManager = (PowerManager) getApplicationContext().getSystemService("power")) != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "GeolocatorLocationService:Wakelock");
            this.f9064Y = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            this.f9064Y.acquire();
        }
        if (c0365h.f6030a && (wifiManager = (WifiManager) getApplicationContext().getSystemService("wifi")) != null) {
            if (Build.VERSION.SDK_INT < 29) {
                i7 = 3;
            } else {
                i7 = 4;
            }
            WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(i7, "GeolocatorLocationService:WifiLock");
            this.f9065Z = createWifiLock;
            createWifiLock.setReferenceCounted(false);
            this.f9065Z.acquire();
        }
    }

    public final void c() {
        PowerManager.WakeLock wakeLock = this.f9064Y;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.f9064Y.release();
            this.f9064Y = null;
        }
        WifiManager.WifiLock wifiLock = this.f9065Z;
        if (wifiLock != null && wifiLock.isHeld()) {
            this.f9065Z.release();
            this.f9065Z = null;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Log.d("FlutterGeolocator", "Binding to location service.");
        return this.f9066a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.d("FlutterGeolocator", "Creating service.");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        g gVar;
        Log.d("FlutterGeolocator", "Destroying location service.");
        this.f9069d--;
        Log.d("FlutterGeolocator", "Stopping location service.");
        k kVar = this.f9063X;
        if (kVar != null && (gVar = this.f) != null) {
            gVar.f15733a.remove(kVar);
            kVar.e();
        }
        a();
        this.f = null;
        this.f9071e0 = null;
        Log.d("FlutterGeolocator", "Destroyed location service.");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i8) {
        return 1;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        Log.d("FlutterGeolocator", "Unbinding from location service.");
        return super.onUnbind(intent);
    }
}
