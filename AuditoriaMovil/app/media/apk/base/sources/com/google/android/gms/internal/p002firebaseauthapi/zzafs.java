package com.google.android.gms.internal.p002firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafs  reason: invalid package */
/* loaded from: classes.dex */
final class zzafs extends zzahi {
    private String zza;
    private String zzb;
    private String zzc;
    private zzagh zzd;
    private String zze;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi
    public final zzahi zza(String str) {
        if (str != null) {
            this.zze = str;
            return this;
        }
        throw new NullPointerException("Null idToken");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi
    public final zzahi zzb(String str) {
        if (str != null) {
            this.zza = str;
            return this;
        }
        throw new NullPointerException("Null providerId");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi
    public final zzahi zzc(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi
    public final zzahi zzd(String str) {
        if (str != null) {
            this.zzc = str;
            return this;
        }
        throw new NullPointerException("Null token");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi
    public final zzahi zza(zzagh zzaghVar) {
        if (zzaghVar != null) {
            this.zzd = zzaghVar;
            return this;
        }
        throw new NullPointerException("Null tokenType");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi
    public final zzahf zza() {
        String str;
        zzagh zzaghVar;
        String str2;
        String str3 = this.zza;
        if (str3 != null && (str = this.zzc) != null && (zzaghVar = this.zzd) != null && (str2 = this.zze) != null) {
            return new zzafp(str3, this.zzb, str, zzaghVar, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" providerId");
        }
        if (this.zzc == null) {
            sb.append(" token");
        }
        if (this.zzd == null) {
            sb.append(" tokenType");
        }
        if (this.zze == null) {
            sb.append(" idToken");
        }
        throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
    }
}
