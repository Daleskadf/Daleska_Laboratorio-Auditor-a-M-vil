package com.google.android.gms.internal.p002firebaseauthapi;

import io.flutter.plugins.pathprovider.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafq  reason: invalid package */
/* loaded from: classes.dex */
public final class zzafq extends zzahe {
    private final String zza;
    private final String zzb;

    public zzafq(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzahe) {
            zzahe zzaheVar = (zzahe) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzaheVar.zzb()) : zzaheVar.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzaheVar.zza()) : zzaheVar.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.zza;
        int i7 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i8 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.zzb;
        if (str2 != null) {
            i7 = str2.hashCode();
        }
        return i8 ^ i7;
    }

    public final String toString() {
        return b.j("RecaptchaEnforcementState{provider=", this.zza, ", enforcementState=", this.zzb, "}");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahe
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahe
    public final String zzb() {
        return this.zza;
    }
}
