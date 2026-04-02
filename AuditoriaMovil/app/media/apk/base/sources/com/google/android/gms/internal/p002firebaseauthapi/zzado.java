package com.google.android.gms.internal.p002firebaseauthapi;

import U3.h;
import Z2.a;
import a4.C0450C;
import a4.t;
import a4.v;
import a4.z;
import android.content.Context;
import b4.G;
import com.google.android.gms.common.internal.I;
import java.util.concurrent.ScheduledExecutorService;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzado  reason: invalid package */
/* loaded from: classes.dex */
public final class zzado {
    private static final a zza = new a("FirebaseAuth", "FirebaseAuthFallback:");
    private final zzzv zzb;
    private final zzafd zzc;

    public zzado(h hVar, ScheduledExecutorService scheduledExecutorService) {
        I.i(hVar);
        hVar.a();
        Context context = hVar.f5749a;
        I.i(context);
        this.zzb = new zzzv(new zzaec(hVar, zzaed.zza()));
        this.zzc = new zzafd(context, scheduledExecutorService);
    }

    public final void zza(String str, String str2, zzadm zzadmVar) {
        I.e(str);
        I.i(zzadmVar);
        this.zzb.zza(str, str2, new zzadp(zzadmVar, zza));
    }

    public final void zzb(String str, String str2, zzadm zzadmVar) {
        I.e(str);
        I.e(str2);
        I.i(zzadmVar);
        this.zzb.zzb(str, str2, new zzadp(zzadmVar, zza));
    }

    public final void zzc(String str, String str2, zzadm zzadmVar) {
        I.e(str);
        I.e(str2);
        I.i(zzadmVar);
        this.zzb.zzc(str, str2, new zzadp(zzadmVar, zza));
    }

    public final void zzd(String str, String str2, zzadm zzadmVar) {
        I.e(str);
        I.i(zzadmVar);
        this.zzb.zzd(str, str2, new zzadp(zzadmVar, zza));
    }

    public final void zze(String str, String str2, zzadm zzadmVar) {
        I.e(str);
        this.zzb.zze(str, str2, new zzadp(zzadmVar, zza));
    }

    public final void zzf(String str, String str2, zzadm zzadmVar) {
        I.e(str);
        I.e(str2);
        I.i(zzadmVar);
        this.zzb.zzf(str, str2, new zzadp(zzadmVar, zza));
    }

    public final void zze(String str, zzadm zzadmVar) {
        I.e(str);
        I.i(zzadmVar);
        this.zzb.zzf(str, new zzadp(zzadmVar, zza));
    }

    public final void zza(zzahd zzahdVar, zzadm zzadmVar) {
        I.i(zzahdVar);
        I.e(zzahdVar.zzb());
        I.i(zzadmVar);
        this.zzb.zza(zzahdVar, new zzadp(zzadmVar, zza));
    }

    public final void zzd(String str, zzadm zzadmVar) {
        I.i(zzadmVar);
        this.zzb.zze(str, new zzadp(zzadmVar, zza));
    }

    public final void zzb(String str, zzadm zzadmVar) {
        I.e(str);
        I.i(zzadmVar);
        this.zzb.zzb(str, new zzadp(zzadmVar, zza));
    }

    public final void zzc(String str, zzadm zzadmVar) {
        I.e(str);
        I.i(zzadmVar);
        this.zzb.zzc(str, new zzadp(zzadmVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, zzadm zzadmVar) {
        I.e(str);
        I.e(str2);
        I.i(zzadmVar);
        this.zzb.zza(str, str2, str3, str4, new zzadp(zzadmVar, zza));
    }

    public final void zzb(zzagn zzagnVar, zzadm zzadmVar) {
        I.i(zzagnVar);
        I.e(zzagnVar.zzc());
        I.i(zzadmVar);
        this.zzb.zzb(zzagnVar, new zzadp(zzadmVar, zza));
    }

    public final void zzc(zzagn zzagnVar, zzadm zzadmVar) {
        I.i(zzagnVar);
        this.zzb.zzc(zzagnVar, new zzadp(zzadmVar, zza));
    }

    public final void zza(String str, zzadm zzadmVar) {
        I.e(str);
        I.i(zzadmVar);
        this.zzb.zza(str, new zzadp(zzadmVar, zza));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzadm zzadmVar) {
        I.e(str);
        I.e(str2);
        I.i(zzadmVar);
        this.zzb.zzb(str, str2, str3, str4, new zzadp(zzadmVar, zza));
    }

    public final void zza(t tVar, String str, String str2, String str3, zzadm zzadmVar) {
        zzaga zza2;
        I.i(tVar);
        I.f(str, "cachedTokenState should not be empty.");
        I.i(zzadmVar);
        if (tVar instanceof z) {
            v vVar = ((z) tVar).f7062a;
            String str4 = vVar.f7048a;
            I.i(str4);
            String str5 = vVar.f7049b;
            I.i(str5);
            zza2 = zzage.zza(str, str4, str5, str2, str3);
        } else if (tVar instanceof C0450C) {
            C0450C c0450c = (C0450C) tVar;
            G g3 = c0450c.f6954b;
            I.i(g3);
            I.e(str2);
            String str6 = g3.f;
            I.e(str6);
            String str7 = c0450c.f6953a;
            I.e(str7);
            zza2 = zzagg.zza(str, str2, str6, str7, str3);
        } else {
            throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
        }
        this.zzb.zza(zza2, str, new zzadp(zzadmVar, zza));
    }

    public final void zza(String str, t tVar, String str2, zzadm zzadmVar) {
        I.e(str);
        I.i(tVar);
        I.i(zzadmVar);
        if (tVar instanceof z) {
            zzzv zzzvVar = this.zzb;
            v vVar = ((z) tVar).f7062a;
            String str3 = vVar.f7048a;
            I.i(str3);
            String str4 = vVar.f7049b;
            I.i(str4);
            zzzvVar.zza(zzagd.zza(str, str3, str4, str2), new zzadp(zzadmVar, zza));
        } else if (tVar instanceof C0450C) {
            C0450C c0450c = (C0450C) tVar;
            zzzv zzzvVar2 = this.zzb;
            String str5 = c0450c.f6953a;
            I.e(str5);
            String str6 = c0450c.f6955c;
            I.e(str6);
            zzzvVar2.zza(zzagf.zza(str, str5, str2, str6), new zzadp(zzadmVar, zza));
        } else {
            throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
        }
    }

    public final void zza(zzagp zzagpVar, zzadm zzadmVar) {
        I.i(zzagpVar);
        this.zzb.zza(zzagpVar, new zzadp(zzadmVar, zza));
    }

    public final void zza(zzagu zzaguVar, zzadm zzadmVar) {
        I.i(zzaguVar);
        this.zzb.zza(zzaguVar, new zzadp(zzadmVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzadm zzadmVar) {
        I.e(str);
        I.e(str2);
        I.e(str3);
        I.i(zzadmVar);
        this.zzb.zza(str, str2, str3, str4, str5, new zzadp(zzadmVar, zza));
    }

    public final void zza(String str, zzaic zzaicVar, zzadm zzadmVar) {
        I.e(str);
        I.i(zzaicVar);
        I.i(zzadmVar);
        this.zzb.zza(str, zzaicVar, new zzadp(zzadmVar, zza));
    }

    public final void zza(zzaha zzahaVar, zzadm zzadmVar) {
        I.i(zzadmVar);
        I.i(zzahaVar);
        String zzb = zzahaVar.zzb();
        I.e(zzb);
        this.zzb.zza(zzb, zzahaVar.zza(), new zzadp(zzadmVar, zza));
    }

    public final void zza(zzahf zzahfVar, zzadm zzadmVar) {
        I.i(zzahfVar);
        this.zzb.zza(zzahfVar, new zzadp(zzadmVar, zza));
    }

    public final void zza(zzagn zzagnVar, zzadm zzadmVar) {
        I.i(zzagnVar);
        I.e(zzagnVar.zzd());
        I.i(zzadmVar);
        this.zzb.zza(zzagnVar, new zzadp(zzadmVar, zza));
    }

    public final void zza(zzahk zzahkVar, zzadm zzadmVar) {
        I.i(zzadmVar);
        I.i(zzahkVar);
        String zzd = zzahkVar.zzd();
        zzadp zzadpVar = new zzadp(zzadmVar, zza);
        if (this.zzc.zzc(zzd)) {
            if (zzahkVar.zze()) {
                this.zzc.zzb(zzd);
            } else {
                this.zzc.zzb(zzadpVar, zzd);
                return;
            }
        }
        long zzb = zzahkVar.zzb();
        boolean zzf = zzahkVar.zzf();
        if (zza(zzb, zzf)) {
            zzahkVar.zza(new zzafn(this.zzc.zzb()));
        }
        this.zzc.zza(zzd, zzadpVar, zzb, zzf);
        this.zzb.zza(zzahkVar, this.zzc.zza(zzadpVar, zzd));
    }

    public final void zza(zzaho zzahoVar, zzadm zzadmVar) {
        I.i(zzahoVar);
        I.i(zzadmVar);
        this.zzb.zzd(zzahoVar.zza(), new zzadp(zzadmVar, zza));
    }

    public final void zza(zzaic zzaicVar, zzadm zzadmVar) {
        I.i(zzaicVar);
        I.i(zzadmVar);
        this.zzb.zza(zzaicVar, new zzadp(zzadmVar, zza));
    }

    public final void zza(zzaid zzaidVar, zzadm zzadmVar) {
        I.i(zzaidVar);
        I.i(zzadmVar);
        this.zzb.zza(zzaidVar, new zzadp(zzadmVar, zza));
    }

    public final void zza(zzafy zzafyVar, zzadm zzadmVar) {
        I.i(zzadmVar);
        I.i(zzafyVar.zzb());
        this.zzb.zza(zzafyVar.zzb(), zzafyVar.zzc(), new zzadp(zzadmVar, zza));
    }

    public final void zza(zzzr zzzrVar, zzadm zzadmVar) {
        I.i(zzadmVar);
        I.i(zzzrVar);
        v zza2 = zzzrVar.zza();
        I.i(zza2);
        this.zzb.zza(zzaex.zza(zza2), new zzadp(zzadmVar, zza));
    }

    public final void zza(String str, String str2, String str3, long j, boolean z7, boolean z8, String str4, String str5, String str6, boolean z9, zzadm zzadmVar) {
        I.f(str, "idToken should not be empty.");
        I.i(zzadmVar);
        zzadp zzadpVar = new zzadp(zzadmVar, zza);
        if (this.zzc.zzc(str2)) {
            if (z7) {
                this.zzc.zzb(str2);
            } else {
                this.zzc.zzb(zzadpVar, str2);
                return;
            }
        }
        zzaht zza2 = zzaht.zza(str, str2, str3, str4, str5, str6, null);
        if (zza(j, z9)) {
            zza2.zza(new zzafn(this.zzc.zzb()));
        }
        this.zzc.zza(str2, zzadpVar, j, z9);
        this.zzb.zza(zza2, this.zzc.zza(zzadpVar, str2));
    }

    public final void zza(zzzq zzzqVar, zzadm zzadmVar) {
        I.i(zzzqVar);
        I.i(zzadmVar);
        String str = zzzqVar.zzb().f6951d;
        zzadp zzadpVar = new zzadp(zzadmVar, zza);
        if (this.zzc.zzc(str)) {
            if (zzzqVar.zzh()) {
                this.zzc.zzb(str);
            } else {
                this.zzc.zzb(zzadpVar, str);
                return;
            }
        }
        long zza2 = zzzqVar.zza();
        boolean zzi = zzzqVar.zzi();
        zzahr zza3 = zzahr.zza(zzzqVar.zze(), zzzqVar.zzb().f6948a, zzzqVar.zzb().f6951d, zzzqVar.zzd(), zzzqVar.zzg(), zzzqVar.zzf(), zzzqVar.zzc());
        if (zza(zza2, zzi)) {
            zza3.zza(new zzafn(this.zzc.zzb()));
        }
        this.zzc.zza(str, zzadpVar, zza2, zzi);
        this.zzb.zza(zza3, this.zzc.zza(zzadpVar, str));
    }

    public final void zza(zzahv zzahvVar, zzadm zzadmVar) {
        I.i(zzadmVar);
        this.zzb.zza(zzahvVar, new zzadp(zzadmVar, zza));
    }

    public final void zza(String str, String str2, String str3, zzadm zzadmVar) {
        I.f(str, "cachedTokenState should not be empty.");
        I.f(str2, "uid should not be empty.");
        I.i(zzadmVar);
        this.zzb.zza(str, str2, str3, new zzadp(zzadmVar, zza));
    }

    public final void zza(String str, a4.G g3, zzadm zzadmVar) {
        I.e(str);
        I.i(g3);
        I.i(zzadmVar);
        this.zzb.zza(str, g3, new zzadp(zzadmVar, zza));
    }

    private static boolean zza(long j, boolean z7) {
        if (j <= 0 || !z7) {
            zza.f("App hash will not be appended to the request.", new Object[0]);
            return false;
        }
        return true;
    }
}
