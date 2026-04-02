package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdyh extends zzftn {
    private final Context zzb;
    @Nullable
    private SensorManager zzc;
    private Sensor zzd;
    private long zze;
    private int zzf;
    private zzdyg zzg;
    private boolean zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyh(Context context) {
        super("ShakeDetector", "ads");
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzftn
    public final void zza(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziS)).booleanValue()) {
            float f = sensorEvent.values[0];
            float f2 = f / 9.80665f;
            float f3 = sensorEvent.values[1] / 9.80665f;
            float f4 = sensorEvent.values[2] / 9.80665f;
            if (((float) Math.sqrt((f2 * f2) + (f3 * f3) + (f4 * f4))) >= ((Float) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziT)).floatValue()) {
                long currentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
                if (this.zze + ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziU)).intValue() <= currentTimeMillis) {
                    if (this.zze + ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziV)).intValue() < currentTimeMillis) {
                        this.zzf = 0;
                    }
                    com.google.android.gms.ads.internal.util.zze.zza("Shake detected.");
                    this.zze = currentTimeMillis;
                    int i = this.zzf + 1;
                    this.zzf = i;
                    zzdyg zzdygVar = this.zzg;
                    if (zzdygVar != null) {
                        if (i == ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziW)).intValue()) {
                            zzdxf zzdxfVar = (zzdxf) zzdygVar;
                            zzdxfVar.zzh(new zzdxc(zzdxfVar), zzdxe.GESTURE);
                        }
                    }
                }
            }
        }
    }

    public final void zzb() {
        synchronized (this) {
            if (this.zzh) {
                SensorManager sensorManager = this.zzc;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this, this.zzd);
                    com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for shake gestures.");
                }
                this.zzh = false;
            }
        }
    }

    public final void zzc() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziS)).booleanValue()) {
                if (this.zzc == null) {
                    SensorManager sensorManager2 = (SensorManager) this.zzb.getSystemService("sensor");
                    this.zzc = sensorManager2;
                    if (sensorManager2 != null) {
                        this.zzd = sensorManager2.getDefaultSensor(1);
                    } else {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Shake detection failed to initialize. Failed to obtain accelerometer.");
                        return;
                    }
                }
                if (!this.zzh && (sensorManager = this.zzc) != null && (sensor = this.zzd) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.zze = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziU)).intValue();
                    this.zzh = true;
                    com.google.android.gms.ads.internal.util.zze.zza("Listening for shake gestures.");
                }
            }
        }
    }

    public final void zzd(zzdyg zzdygVar) {
        this.zzg = zzdygVar;
    }
}
