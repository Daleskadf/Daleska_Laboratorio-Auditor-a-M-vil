package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbd  reason: invalid package */
/* loaded from: classes.dex */
public final class zzbd implements zzca {
    private final InputStream zza;

    private zzbd(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzca zza(byte[] bArr) {
        return new zzbd(new ByteArrayInputStream(bArr));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzca
    public final zzwl zzb() {
        try {
            return zzwl.zza(this.zza, zzajv.zza());
        } finally {
            this.zza.close();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzca
    public final zzuz zza() {
        try {
            return zzuz.zza(this.zza, zzajv.zza());
        } finally {
            this.zza.close();
        }
    }
}
