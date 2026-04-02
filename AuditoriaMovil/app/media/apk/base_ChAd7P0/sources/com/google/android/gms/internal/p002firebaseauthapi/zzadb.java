package com.google.android.gms.internal.p002firebaseauthapi;

import b4.C0603k;
import b4.M;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadb  reason: invalid package */
/* loaded from: classes.dex */
public final class zzadb extends zzaeg<Void, M> {
    private final String zzaa;
    private final String zzab;
    private final String zzac;
    private final boolean zzad;
    private final String zzu;
    private final String zzv;
    private final String zzw;
    private final long zzx;
    private final boolean zzy;
    private final boolean zzz;

    public zzadb(C0603k c0603k, String str, String str2, long j, boolean z7, boolean z8, String str3, String str4, String str5, boolean z9) {
        super(8);
        I.i(c0603k);
        I.e(str);
        String str6 = c0603k.f8270a;
        I.e(str6);
        this.zzu = str6;
        this.zzv = str;
        this.zzw = str2;
        this.zzx = j;
        this.zzy = z7;
        this.zzz = z8;
        this.zzaa = str3;
        this.zzab = str4;
        this.zzac = str5;
        this.zzad = z9;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "startMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzu, this.zzv, this.zzw, this.zzx, this.zzy, this.zzz, this.zzaa, this.zzab, this.zzac, this.zzad, this.zzb);
    }
}
