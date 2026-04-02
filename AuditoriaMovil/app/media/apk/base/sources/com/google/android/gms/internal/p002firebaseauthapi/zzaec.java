package com.google.android.gms.internal.p002firebaseauthapi;

import D.AbstractC0059i;
import U3.h;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.I;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaec  reason: invalid package */
/* loaded from: classes.dex */
final class zzaec extends zzaeu implements zzafo {
    private zzadw zza;
    private zzadz zzb;
    private zzaez zzc;
    private final zzaed zzd;
    private final h zze;
    private String zzf;
    private zzaef zzg;

    public zzaec(h hVar, zzaed zzaedVar) {
        this(hVar, zzaedVar, null, null, null);
    }

    private final zzaef zzb() {
        if (this.zzg == null) {
            this.zzg = new zzaef(this.zze, this.zzd.zzb());
        }
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeu
    public final void zza(zzaft zzaftVar, zzaew<zzafw> zzaewVar) {
        I.i(zzaftVar);
        I.i(zzaewVar);
        zzadw zzadwVar = this.zza;
        zzaev.zza(zzadwVar.zza("/createAuthUri", this.zzf), zzaftVar, zzaewVar, zzafw.class, zzadwVar.zza);
    }

    private zzaec(h hVar, zzaed zzaedVar, zzaez zzaezVar, zzadw zzadwVar, zzadz zzadzVar) {
        this.zze = hVar;
        hVar.a();
        this.zzf = hVar.f5751c.f5757a;
        I.i(zzaedVar);
        this.zzd = zzaedVar;
        zza(null, null, null);
        zzafm.zza(this.zzf, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeu
    public final void zza(zzafv zzafvVar, zzaew<Void> zzaewVar) {
        I.i(zzafvVar);
        I.i(zzaewVar);
        zzadw zzadwVar = this.zza;
        zzaev.zza(zzadwVar.zza("/deleteAccount", this.zzf), zzafvVar, zzaewVar, Void.class, zzadwVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeu
    public final void zza(zzafy zzafyVar, zzaew<zzafx> zzaewVar) {
        I.i(zzafyVar);
        I.i(zzaewVar);
        zzadw zzadwVar = this.zza;
        zzaev.zza(zzadwVar.zza("/emailLinkSignin", this.zzf), zzafyVar, zzaewVar, zzafx.class, zzadwVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeu
    public final void zza(zzaga zzagaVar, zzaew<zzafz> zzaewVar) {
        I.i(zzagaVar);
        I.i(zzaewVar);
        zzadz zzadzVar = this.zzb;
        zzadz.zza(zzadzVar.zza("/accounts/mfaEnrollment:finalize", this.zzf), zzagaVar, zzaewVar, zzafz.class, zzadzVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeu
    public final void zza(zzagc zzagcVar, zzaew<zzagb> zzaewVar) {
        I.i(zzagcVar);
        I.i(zzaewVar);
        zzadz zzadzVar = this.zzb;
        zzadz.zza(zzadzVar.zza("/accounts/mfaSignIn:finalize", this.zzf), zzagcVar, zzaewVar, zzagb.class, zzadzVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeu
    public final void zza(zzagk zzagkVar, zzaew<zzagw> zzaewVar) {
        I.i(zzagkVar);
        I.i(zzaewVar);
        zzaez zzaezVar = this.zzc;
        zzaev.zza(zzaezVar.zza("/token", this.zzf), zzagkVar, zzaewVar, zzagw.class, zzaezVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeu
    public final void zza(zzagj zzagjVar, zzaew<zzagm> zzaewVar) {
        I.i(zzagjVar);
        I.i(zzaewVar);
        zzadw zzadwVar = this.zza;
        zzaev.zza(zzadwVar.zza("/getAccountInfo", this.zzf), zzagjVar, zzaewVar, zzagm.class, zzadwVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeu
    public final void zza(zzagn zzagnVar, zzaew<zzagq> zzaewVar) {
        I.i(zzagnVar);
        I.i(zzaewVar);
        if (zzagnVar.zzb() != null) {
            zzb().zzb(zzagnVar.zzb().f7016Y);
        }
        zzadw zzadwVar = this.zza;
        zzaev.zza(zzadwVar.zza("/getOobConfirmationCode", this.zzf), zzagnVar, zzaewVar, zzagq.class, zzadwVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeu
    public final void zza(zzagp zzagpVar, zzaew<zzags> zzaewVar) {
        I.i(zzagpVar);
        I.i(zzaewVar);
        zzadw zzadwVar = this.zza;
        zzaev.zza(zzadwVar.zza("/getRecaptchaParam", this.zzf), zzaewVar, zzags.class, zzadwVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeu
    public final void zza(zzagu zzaguVar, zzaew<zzagt> zzaewVar) {
        I.i(zzaguVar);
        I.i(zzaewVar);
        zzadz zzadzVar = this.zzb;
        String str = zzadzVar.zza("/recaptchaConfig", this.zzf) + "&clientType=" + zzaguVar.zzb() + "&version=" + zzaguVar.zzc();
        if (!zzae.zzc(zzaguVar.zzd())) {
            str = AbstractC0059i.A(str, "&tenantId=", zzaguVar.zzd());
        }
        zzaev.zza(str, zzaewVar, zzagt.class, zzadzVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafo
    public final void zza() {
        zza(null, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeu
    public final void zza(zzahd zzahdVar, zzaew<zzahg> zzaewVar) {
        I.i(zzahdVar);
        I.i(zzaewVar);
        zzadw zzadwVar = this.zza;
        zzaev.zza(zzadwVar.zza("/resetPassword", this.zzf), zzahdVar, zzaewVar, zzahg.class, zzadwVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeu
    public final void zza(zzahf zzahfVar, zzaew<zzahh> zzaewVar) {
        I.i(zzahfVar);
        I.i(zzaewVar);
        zzadz zzadzVar = this.zzb;
        zzadz.zza(zzadzVar.zza("/accounts:revokeToken", this.zzf), zzahfVar, zzaewVar, zzahh.class, zzadzVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeu
    public final void zza(zzahk zzahkVar, zzaew<zzahj> zzaewVar) {
        I.i(zzahkVar);
        I.i(zzaewVar);
        if (!TextUtils.isEmpty(zzahkVar.zzc())) {
            zzb().zzb(zzahkVar.zzc());
        }
        zzadw zzadwVar = this.zza;
        zzaev.zza(zzadwVar.zza("/sendVerificationCode", this.zzf), zzahkVar, zzaewVar, zzahj.class, zzadwVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeu
    public final void zza(zzahm zzahmVar, zzaew<zzahl> zzaewVar) {
        I.i(zzahmVar);
        I.i(zzaewVar);
        zzadw zzadwVar = this.zza;
        zzaev.zza(zzadwVar.zza("/setAccountInfo", this.zzf), zzahmVar, zzaewVar, zzahl.class, zzadwVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeu
    public final void zza(String str, zzaew<Void> zzaewVar) {
        I.i(zzaewVar);
        zzb().zza(str);
        zzaewVar.zza((zzaew<Void>) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeu
    public final void zza(zzahn zzahnVar, zzaew<zzahq> zzaewVar) {
        I.i(zzahnVar);
        I.i(zzaewVar);
        zzadw zzadwVar = this.zza;
        zzaev.zza(zzadwVar.zza("/signupNewUser", this.zzf), zzahnVar, zzaewVar, zzahq.class, zzadwVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeu
    public final void zza(zzahp zzahpVar, zzaew<zzahs> zzaewVar) {
        I.i(zzahpVar);
        I.i(zzaewVar);
        if (zzahpVar instanceof zzaht) {
            zzaht zzahtVar = (zzaht) zzahpVar;
            if (!TextUtils.isEmpty(zzahtVar.zzb())) {
                zzb().zzb(zzahtVar.zzb());
            }
        }
        zzadz zzadzVar = this.zzb;
        zzadz.zza(zzadzVar.zza("/accounts/mfaEnrollment:start", this.zzf), zzahpVar, zzaewVar, zzahs.class, zzadzVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeu
    public final void zza(zzahr zzahrVar, zzaew<zzahu> zzaewVar) {
        I.i(zzahrVar);
        I.i(zzaewVar);
        if (!TextUtils.isEmpty(zzahrVar.zzb())) {
            zzb().zzb(zzahrVar.zzb());
        }
        zzadz zzadzVar = this.zzb;
        zzadz.zza(zzadzVar.zza("/accounts/mfaSignIn:start", this.zzf), zzahrVar, zzaewVar, zzahu.class, zzadzVar.zza);
    }

    private final void zza(zzaez zzaezVar, zzadw zzadwVar, zzadz zzadzVar) {
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        String zza = zzafj.zza("firebear.secureToken");
        if (TextUtils.isEmpty(zza)) {
            zza = zzafm.zzd(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for secureToken URL: " + zza);
        }
        if (this.zzc == null) {
            this.zzc = new zzaez(zza, zzb());
        }
        String zza2 = zzafj.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(zza2)) {
            zza2 = zzafm.zzb(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkit URL: " + zza2);
        }
        if (this.zza == null) {
            this.zza = new zzadw(zza2, zzb());
        }
        String zza3 = zzafj.zza("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(zza3)) {
            zza3 = zzafm.zzc(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkitV2 URL: " + zza3);
        }
        if (this.zzb == null) {
            this.zzb = new zzadz(zza3, zzb());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeu
    public final void zza(zzaic zzaicVar, zzaew<zzaie> zzaewVar) {
        I.i(zzaicVar);
        I.i(zzaewVar);
        zzadw zzadwVar = this.zza;
        zzaev.zza(zzadwVar.zza("/verifyAssertion", this.zzf), zzaicVar, zzaewVar, zzaie.class, zzadwVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeu
    public final void zza(zzaid zzaidVar, zzaew<zzaig> zzaewVar) {
        I.i(zzaidVar);
        I.i(zzaewVar);
        zzadw zzadwVar = this.zza;
        zzaev.zza(zzadwVar.zza("/verifyCustomToken", this.zzf), zzaidVar, zzaewVar, zzaig.class, zzadwVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeu
    public final void zza(zzaif zzaifVar, zzaew<zzaii> zzaewVar) {
        I.i(zzaifVar);
        I.i(zzaewVar);
        zzadw zzadwVar = this.zza;
        zzaev.zza(zzadwVar.zza("/verifyPassword", this.zzf), zzaifVar, zzaewVar, zzaii.class, zzadwVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeu
    public final void zza(zzaih zzaihVar, zzaew<zzaik> zzaewVar) {
        I.i(zzaihVar);
        I.i(zzaewVar);
        zzadw zzadwVar = this.zza;
        zzaev.zza(zzadwVar.zza("/verifyPhoneNumber", this.zzf), zzaihVar, zzaewVar, zzaik.class, zzadwVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeu
    public final void zza(zzaij zzaijVar, zzaew<zzaim> zzaewVar) {
        I.i(zzaijVar);
        I.i(zzaewVar);
        zzadz zzadzVar = this.zzb;
        zzadz.zza(zzadzVar.zza("/accounts/mfaEnrollment:withdraw", this.zzf), zzaijVar, zzaewVar, zzaim.class, zzadzVar.zza);
    }
}
