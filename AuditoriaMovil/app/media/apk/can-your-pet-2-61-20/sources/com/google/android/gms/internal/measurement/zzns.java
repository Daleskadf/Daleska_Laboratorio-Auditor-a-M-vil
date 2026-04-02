package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
public enum zzns {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(false),
    STRING(""),
    BYTE_STRING(zzii.zza),
    ENUM(null),
    MESSAGE(null);
    
    private final Object zzk;

    zzns(Object obj) {
        this.zzk = obj;
    }
}
