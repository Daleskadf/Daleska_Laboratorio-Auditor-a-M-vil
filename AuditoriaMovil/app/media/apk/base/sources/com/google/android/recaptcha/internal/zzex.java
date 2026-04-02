package com.google.android.recaptcha.internal;

import java.net.HttpURLConnection;
import kotlin.jvm.internal.f;
import org.apache.tika.metadata.HttpHeaders;
/* loaded from: classes.dex */
public final class zzex {
    private final zzfm zza;

    public zzex() {
        this(null, 1, null);
    }

    public final zzew zza(String str) {
        try {
            HttpURLConnection zza = this.zza.zza(str);
            zza.setRequestMethod("POST");
            zza.setDoOutput(true);
            zza.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-protobuffer");
            return new zzew(zza);
        } catch (zzbd e7) {
            throw e7;
        } catch (Exception e8) {
            throw new zzbd(zzbb.zzc, zzba.zzai, e8.getMessage());
        }
    }

    public /* synthetic */ zzex(zzfm zzfmVar, int i7, f fVar) {
        this.zza = new zzfm();
    }
}
