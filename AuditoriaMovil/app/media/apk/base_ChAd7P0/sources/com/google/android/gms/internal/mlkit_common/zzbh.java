package com.google.android.gms.internal.mlkit_common;

import h4.InterfaceC1084d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzbh {
    private final Map zza;
    private final Map zzb;
    private final InterfaceC1084d zzc;

    public zzbh(Map map, Map map2, InterfaceC1084d interfaceC1084d) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = interfaceC1084d;
    }

    public final byte[] zza(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new zzbe(byteArrayOutputStream, this.zza, this.zzb, this.zzc).zzf(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
