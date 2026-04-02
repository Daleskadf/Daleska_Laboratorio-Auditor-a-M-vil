package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzawf implements zzfro {
    final /* synthetic */ zzfpi zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawf(zzawh zzawhVar, zzfpi zzfpiVar) {
        this.zza = zzfpiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfro
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
