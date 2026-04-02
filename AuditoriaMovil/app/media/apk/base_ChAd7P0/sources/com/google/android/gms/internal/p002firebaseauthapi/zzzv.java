package com.google.android.gms.internal.p002firebaseauthapi;

import a4.C0457f;
import a4.G;
import a4.K;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import h3.AbstractC1079a;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzv  reason: invalid package */
/* loaded from: classes.dex */
public final class zzzv {
    private final zzaeu zza;

    public zzzv(zzaeu zzaeuVar) {
        I.i(zzaeuVar);
        this.zza = zzaeuVar;
    }

    public final void zzb(String str, String str2, zzadp zzadpVar) {
        I.e(str);
        I.e(str2);
        I.i(zzadpVar);
        zza(str, new zzabn(this, str2, zzadpVar));
    }

    public final void zzc(String str, String str2, zzadp zzadpVar) {
        I.e(str);
        I.e(str2);
        I.i(zzadpVar);
        zza(str, new zzabm(this, str2, zzadpVar));
    }

    public final void zzd(String str, String str2, zzadp zzadpVar) {
        I.e(str);
        I.i(zzadpVar);
        this.zza.zza(new zzahd(str, null, str2), new zzaae(this, zzadpVar));
    }

    public final void zze(String str, String str2, zzadp zzadpVar) {
        I.e(str);
        I.i(zzadpVar);
        this.zza.zza(new zzaft(str, str2), new zzaac(this, zzadpVar));
    }

    public final void zzf(String str, zzadp zzadpVar) {
        I.e(str);
        I.i(zzadpVar);
        zza(str, new zzaar(this, zzadpVar));
    }

    public static void zza(zzzv zzzvVar, zzaie zzaieVar, zzadp zzadpVar, zzaet zzaetVar) {
        Status y2;
        if (zzaieVar.zzo()) {
            K zzb = zzaieVar.zzb();
            String zzc = zzaieVar.zzc();
            String zzj = zzaieVar.zzj();
            if (zzaieVar.zzm()) {
                y2 = new Status(17012, null, null, null);
            } else {
                y2 = AbstractC1079a.y(zzaieVar.zzd());
            }
            zzadpVar.zza(new zzzt(y2, zzb, zzc, zzj));
            return;
        }
        zzzvVar.zza(new zzagw(zzaieVar.zzi(), zzaieVar.zze(), Long.valueOf(zzaieVar.zza()), "Bearer"), zzaieVar.zzh(), zzaieVar.zzg(), Boolean.valueOf(zzaieVar.zzn()), zzaieVar.zzb(), zzadpVar, zzaetVar);
    }

    public final void zzf(String str, String str2, zzadp zzadpVar) {
        I.e(str);
        I.e(str2);
        I.i(zzadpVar);
        zza(str2, new zzaaq(this, str, zzadpVar));
    }

    private final void zzd(zzagn zzagnVar, zzadp zzadpVar) {
        I.i(zzagnVar);
        I.i(zzadpVar);
        this.zza.zza(zzagnVar, new zzabj(this, zzadpVar));
    }

    public final void zzb(String str, zzadp zzadpVar) {
        I.e(str);
        I.i(zzadpVar);
        this.zza.zza(new zzagk(str), new zzzu(this, zzadpVar));
    }

    public final void zzc(String str, zzadp zzadpVar) {
        I.e(str);
        I.i(zzadpVar);
        zza(str, new zzabc(this, zzadpVar));
    }

    public final void zze(String str, zzadp zzadpVar) {
        I.i(zzadpVar);
        this.zza.zza(new zzahn(str), new zzabi(this, zzadpVar));
    }

    public final void zzc(zzagn zzagnVar, zzadp zzadpVar) {
        zzd(zzagnVar, zzadpVar);
    }

    public final void zzd(String str, zzadp zzadpVar) {
        I.i(zzadpVar);
        this.zza.zza(str, new zzabg(this, zzadpVar));
    }

    public final void zzb(zzagn zzagnVar, zzadp zzadpVar) {
        I.e(zzagnVar.zzc());
        I.i(zzadpVar);
        this.zza.zza(zzagnVar, new zzaaf(this, zzadpVar));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzadp zzadpVar) {
        I.e(str);
        I.e(str2);
        I.i(zzadpVar);
        this.zza.zza(new zzaif(str, str2, str3, str4), new zzzw(this, zzadpVar));
    }

    public static /* synthetic */ void zza(zzzv zzzvVar, zzadp zzadpVar, zzahn zzahnVar, zzaet zzaetVar) {
        I.i(zzadpVar);
        I.i(zzahnVar);
        I.i(zzaetVar);
        zzzvVar.zza.zza(zzahnVar, new zzaak(zzzvVar, zzadpVar, zzaetVar));
    }

    public static /* synthetic */ void zza(zzzv zzzvVar, zzadp zzadpVar, zzagw zzagwVar, zzahm zzahmVar, zzaet zzaetVar) {
        I.i(zzadpVar);
        I.i(zzagwVar);
        I.i(zzahmVar);
        I.i(zzaetVar);
        zzzvVar.zza.zza(new zzagj(zzagwVar.zzc()), new zzaab(zzzvVar, zzaetVar, zzadpVar, zzagwVar, zzahmVar));
    }

    public static /* synthetic */ void zza(zzzv zzzvVar, zzadp zzadpVar, zzagw zzagwVar, zzagl zzaglVar, zzahm zzahmVar, zzaet zzaetVar) {
        I.i(zzadpVar);
        I.i(zzagwVar);
        I.i(zzaglVar);
        I.i(zzahmVar);
        I.i(zzaetVar);
        zzzvVar.zza.zza(zzahmVar, new zzaaa(zzzvVar, zzahmVar, zzaglVar, zzadpVar, zzagwVar, zzaetVar));
    }

    public final void zza(String str, String str2, zzadp zzadpVar) {
        I.e(str);
        I.i(zzadpVar);
        zzahm zzahmVar = new zzahm();
        zzahmVar.zze(str);
        zzahmVar.zzh(str2);
        this.zza.zza(zzahmVar, new zzabp(this, zzadpVar));
    }

    public final void zza(zzahd zzahdVar, zzadp zzadpVar) {
        I.e(zzahdVar.zzb());
        I.i(zzadpVar);
        this.zza.zza(zzahdVar, new zzaag(this, zzadpVar));
    }

    public final void zza(String str, String str2, String str3, String str4, zzadp zzadpVar) {
        I.e(str);
        I.e(str2);
        I.i(zzadpVar);
        this.zza.zza(new zzahn(str, str2, null, str3, str4, null), new zzzx(this, zzadpVar));
    }

    public final void zza(String str, zzadp zzadpVar) {
        I.e(str);
        I.i(zzadpVar);
        zza(str, new zzabe(this, zzadpVar));
    }

    private final void zza(String str, zzaew<zzagw> zzaewVar) {
        I.i(zzaewVar);
        I.e(str);
        zzagw zzb = zzagw.zzb(str);
        if (zzb.zzg()) {
            zzaewVar.zza((zzaew<zzagw>) zzb);
            return;
        }
        this.zza.zza(new zzagk(zzb.zzd()), new zzabo(this, zzaewVar));
    }

    public final void zza(zzaga zzagaVar, String str, zzadp zzadpVar) {
        I.i(zzagaVar);
        I.i(zzadpVar);
        zza(str, new zzaaw(this, zzagaVar, zzadpVar));
    }

    public final void zza(zzagc zzagcVar, zzadp zzadpVar) {
        I.i(zzagcVar);
        I.i(zzadpVar);
        this.zza.zza(zzagcVar, new zzaay(this, zzadpVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzafy zzafyVar, zzadp zzadpVar) {
        I.i(zzafyVar);
        I.i(zzadpVar);
        this.zza.zza(zzafyVar, new zzzy(this, zzadpVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzagw zzagwVar, String str, String str2, Boolean bool, K k2, zzadp zzadpVar, zzaet zzaetVar) {
        I.i(zzagwVar);
        I.i(zzaetVar);
        I.i(zzadpVar);
        this.zza.zza(new zzagj(zzagwVar.zzc()), new zzaad(this, zzaetVar, str2, str, bool, k2, zzadpVar, zzagwVar));
    }

    public final void zza(zzagp zzagpVar, zzadp zzadpVar) {
        I.i(zzagpVar);
        I.i(zzadpVar);
        this.zza.zza(zzagpVar, new zzabd(this, zzadpVar));
    }

    public final void zza(zzagu zzaguVar, zzadp zzadpVar) {
        I.i(zzaguVar);
        I.i(zzadpVar);
        this.zza.zza(zzaguVar, new zzaba(this, zzadpVar));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzadp zzadpVar) {
        I.e(str);
        I.e(str2);
        I.e(str3);
        I.i(zzadpVar);
        zza(str3, new zzaal(this, str, str2, str4, str5, zzadpVar));
    }

    public final void zza(String str, zzaic zzaicVar, zzadp zzadpVar) {
        I.e(str);
        I.i(zzaicVar);
        I.i(zzadpVar);
        zza(str, new zzaap(this, zzaicVar, zzadpVar));
    }

    public final void zza(String str, zzaih zzaihVar, zzadp zzadpVar) {
        I.e(str);
        I.i(zzaihVar);
        I.i(zzadpVar);
        zza(str, new zzaan(this, zzaihVar, zzadpVar));
    }

    public final void zza(zzahf zzahfVar, zzadp zzadpVar) {
        this.zza.zza(zzahfVar, new zzabl(this, zzadpVar));
    }

    public final void zza(zzagn zzagnVar, zzadp zzadpVar) {
        I.e(zzagnVar.zzd());
        I.i(zzadpVar);
        zzd(zzagnVar, zzadpVar);
    }

    public final void zza(zzahk zzahkVar, zzadp zzadpVar) {
        I.e(zzahkVar.zzd());
        I.i(zzadpVar);
        this.zza.zza(zzahkVar, new zzaaj(this, zzadpVar));
    }

    public final void zza(zzaic zzaicVar, zzadp zzadpVar) {
        I.i(zzaicVar);
        I.i(zzadpVar);
        zzaicVar.zzb(true);
        this.zza.zza(zzaicVar, new zzaau(this, zzadpVar));
    }

    public final void zza(zzaid zzaidVar, zzadp zzadpVar) {
        I.i(zzaidVar);
        I.i(zzadpVar);
        this.zza.zza(zzaidVar, new zzaah(this, zzadpVar));
    }

    public final void zza(C0457f c0457f, String str, zzadp zzadpVar) {
        I.i(c0457f);
        I.i(zzadpVar);
        if (c0457f.f7033e) {
            zza(c0457f.f7032d, new zzzz(this, c0457f, str, zzadpVar));
        } else {
            zza(new zzafy(c0457f, null, str), zzadpVar);
        }
    }

    public final void zza(zzaih zzaihVar, zzadp zzadpVar) {
        I.i(zzaihVar);
        I.i(zzadpVar);
        this.zza.zza(zzaihVar, new zzaai(this, zzadpVar));
    }

    public final void zza(zzahp zzahpVar, zzadp zzadpVar) {
        I.i(zzahpVar);
        I.i(zzadpVar);
        this.zza.zza(zzahpVar, new zzaax(this, zzahpVar, zzadpVar));
    }

    public final void zza(zzahr zzahrVar, zzadp zzadpVar) {
        I.i(zzahrVar);
        I.i(zzadpVar);
        this.zza.zza(zzahrVar, new zzabb(this, zzadpVar));
    }

    public final void zza(String str, String str2, String str3, zzadp zzadpVar) {
        I.e(str);
        I.e(str2);
        I.i(zzadpVar);
        zza(str, new zzaas(this, str2, str3, zzadpVar));
    }

    public final void zza(String str, G g3, zzadp zzadpVar) {
        I.e(str);
        I.i(g3);
        I.i(zzadpVar);
        zza(str, new zzabk(this, g3, zzadpVar));
    }
}
