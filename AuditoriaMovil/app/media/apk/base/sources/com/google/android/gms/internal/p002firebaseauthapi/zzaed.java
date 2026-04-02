package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C0769s;
import io.flutter.plugins.pathprovider.b;
import java.util.List;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaed  reason: invalid package */
/* loaded from: classes.dex */
public final class zzaed {
    private final int zza;

    private zzaed(String str) {
        this.zza = zza(str);
    }

    private static int zza(String str) {
        try {
            List<String> zza = zzv.zza("[.-]").zza((CharSequence) str);
            if (zza.size() == 1) {
                return Integer.parseInt(str);
            }
            if (zza.size() >= 3) {
                return (Integer.parseInt(zza.get(1)) * PipesIterator.DEFAULT_QUEUE_SIZE) + (Integer.parseInt(zza.get(0)) * 1000000) + Integer.parseInt(zza.get(2));
            }
            return -1;
        } catch (IllegalArgumentException e7) {
            if (Log.isLoggable("LibraryVersionContainer", 3)) {
                Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", str, e7));
                return -1;
            }
            return -1;
        }
    }

    public final String zzb() {
        return b.h("X", Integer.toString(this.zza));
    }

    public static zzaed zza() {
        String a7 = C0769s.f9387c.a("firebase-auth");
        return new zzaed((TextUtils.isEmpty(a7) || a7.equals("UNKNOWN")) ? "-1" : "-1");
    }
}
