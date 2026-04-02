package com.google.android.gms.tagmanager;

import android.util.Log;
import com.google.android.gms.internal.gtm.zzro;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
final class zzek implements Runnable {
    final /* synthetic */ zzro zza;
    final /* synthetic */ zzel zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzek(zzel zzelVar, zzro zzroVar) {
        this.zzb = zzelVar;
        this.zza = zzroVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FileOutputStream fileOutputStream;
        zzro zzroVar = this.zza;
        File zze = this.zzb.zze();
        try {
            try {
                fileOutputStream = new FileOutputStream(zze);
                try {
                    zzroVar.zzS(fileOutputStream);
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        Log.w("GoogleTagManager", "error closing stream for writing resource to disk");
                    }
                } catch (IOException unused2) {
                    Log.w("GoogleTagManager", "Error writing resource to disk. Removing resource from disk.");
                    zze.delete();
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        Log.w("GoogleTagManager", "error closing stream for writing resource to disk");
                    }
                }
            } catch (FileNotFoundException unused4) {
                Log.e("GoogleTagManager", "Error opening resource file for writing");
            }
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (IOException unused5) {
                Log.w("GoogleTagManager", "error closing stream for writing resource to disk");
            }
            throw th;
        }
    }
}
