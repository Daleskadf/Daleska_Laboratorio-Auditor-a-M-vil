package com.google.android.recaptcha.internal;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.j;
import l6.c;
import l6.g;
import m5.d;
/* loaded from: classes.dex */
public final class zzfm {
    private final c zza;

    public zzfm() {
        int i7 = zzav.zza;
        this.zza = d.m(zzfl.zza);
    }

    public final HttpURLConnection zza(String str) {
        if (((zzfk) ((g) this.zza).a()).zzb(str)) {
            URLConnection openConnection = new URL(str).openConnection();
            j.c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            return (HttpURLConnection) openConnection;
        }
        throw new zzbd(zzbb.zzc, zzba.zzQ, null);
    }
}
