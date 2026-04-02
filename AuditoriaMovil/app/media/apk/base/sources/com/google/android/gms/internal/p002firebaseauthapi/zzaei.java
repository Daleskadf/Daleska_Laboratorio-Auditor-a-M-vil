package com.google.android.gms.internal.p002firebaseauthapi;

import a4.AbstractC0456e;
import a4.v;
import b4.InterfaceC0607o;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import h3.AbstractC1079a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaei  reason: invalid package */
/* loaded from: classes.dex */
public final class zzaei implements zzadm {
    final /* synthetic */ zzaeg zza;

    public zzaei(zzaeg zzaegVar) {
        this.zza = zzaegVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(Status status) {
        String str = status.f9154b;
        if (str != null) {
            if (str.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081, null, null, null);
            } else if (str.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082, null, null, null);
            } else if (str.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083, null, null, null);
            } else if (str.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084, null, null, null);
            } else if (str.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085, null, null, null);
            } else if (str.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086, null, null, null);
            } else if (str.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087, null, null, null);
            } else if (str.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088, null, null, null);
            } else if (str.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089, null, null, null);
            } else if (str.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090, null, null, null);
            }
        }
        zzaeg zzaegVar = this.zza;
        if (zzaegVar.zza == 8) {
            zzaegVar.zzu = true;
            zza(new zzael(this, status));
            return;
        }
        zzaeg.zza(zzaegVar, status);
        this.zza.zza(status);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zzb(String str) {
        int i7 = this.zza.zza;
        boolean z7 = i7 == 8;
        I.k("Unexpected response type " + i7, z7);
        zza(new zzaek(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zzc(String str) {
        int i7 = this.zza.zza;
        boolean z7 = i7 == 7;
        I.k("Unexpected response type " + i7, z7);
        zzaeg.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zzb() {
        int i7 = this.zza.zza;
        boolean z7 = i7 == 6;
        I.k("Unexpected response type " + i7, z7);
        zzaeg.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zzc() {
        int i7 = this.zza.zza;
        boolean z7 = i7 == 9;
        I.k("Unexpected response type " + i7, z7);
        zzaeg.zza(this.zza);
    }

    private final void zza(zzaen zzaenVar) {
        this.zza.zzi.execute(new zzaeo(this, zzaenVar));
    }

    private final void zza(Status status, AbstractC0456e abstractC0456e, String str, String str2) {
        zzaeg.zza(this.zza, status);
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzn = abstractC0456e;
        zzaegVar.zzo = str;
        zzaegVar.zzp = str2;
        InterfaceC0607o interfaceC0607o = zzaegVar.zzf;
        if (interfaceC0607o != null) {
            interfaceC0607o.zza(status);
        }
        this.zza.zza(status);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(String str) {
        int i7 = this.zza.zza;
        boolean z7 = i7 == 8;
        I.k("Unexpected response type " + i7, z7);
        this.zza.zzu = true;
        zza(new zzaem(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(zzafw zzafwVar) {
        int i7 = this.zza.zza;
        boolean z7 = i7 == 3;
        I.k("Unexpected response type " + i7, z7);
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzl = zzafwVar;
        zzaeg.zza(zzaegVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza() {
        int i7 = this.zza.zza;
        boolean z7 = i7 == 5;
        I.k("Unexpected response type " + i7, z7);
        zzaeg.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(zzzt zzztVar) {
        zza(zzztVar.zza(), zzztVar.zzb(), zzztVar.zzc(), zzztVar.zzd());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(zzzs zzzsVar) {
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzq = zzzsVar;
        zzaegVar.zza(AbstractC1079a.y("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(Status status, v vVar) {
        int i7 = this.zza.zza;
        boolean z7 = i7 == 2;
        I.k("Unexpected response type " + i7, z7);
        zza(status, vVar, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(zzags zzagsVar) {
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzs = zzagsVar;
        zzaeg.zza(zzaegVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(zzagt zzagtVar) {
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzr = zzagtVar;
        zzaeg.zza(zzaegVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(zzagw zzagwVar, zzagl zzaglVar) {
        int i7 = this.zza.zza;
        boolean z7 = i7 == 2;
        I.k("Unexpected response type: " + i7, z7);
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzj = zzagwVar;
        zzaegVar.zzk = zzaglVar;
        zzaeg.zza(zzaegVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(zzahg zzahgVar) {
        int i7 = this.zza.zza;
        boolean z7 = i7 == 4;
        I.k("Unexpected response type " + i7, z7);
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzm = zzahgVar;
        zzaeg.zza(zzaegVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(zzahh zzahhVar) {
        zzaeg.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(zzahs zzahsVar) {
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzt = zzahsVar;
        zzaeg.zza(zzaegVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(zzagw zzagwVar) {
        int i7 = this.zza.zza;
        boolean z7 = i7 == 1;
        I.k("Unexpected response type: " + i7, z7);
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzj = zzagwVar;
        zzaeg.zza(zzaegVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(v vVar) {
        int i7 = this.zza.zza;
        boolean z7 = i7 == 8;
        I.k("Unexpected response type " + i7, z7);
        this.zza.zzu = true;
        zza(new zzaej(this, vVar));
    }
}
