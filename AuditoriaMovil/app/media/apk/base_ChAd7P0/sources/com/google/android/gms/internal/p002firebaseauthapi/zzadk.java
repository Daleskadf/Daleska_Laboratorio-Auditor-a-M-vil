package com.google.android.gms.internal.p002firebaseauthapi;

import a4.u;
import b4.M;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import j3.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadk  reason: invalid package */
/* loaded from: classes.dex */
public final class zzadk extends zzaeg<String, M> {
    private final String zzu;
    private final String zzv;

    public zzadk(String str, String str2) {
        super(4);
        I.f(str, "code cannot be null or empty");
        this.zzu = str;
        this.zzv = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "verifyPasswordResetCode";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        char c8 = 5;
        char c9 = 3;
        zzahg zzahgVar = this.zzm;
        if (zzahgVar.zzg()) {
            zzahgVar.zzc();
        } else {
            zzahgVar.zzb();
        }
        zzahgVar.zzb();
        if (zzahgVar.zzh()) {
            String zzd = zzahgVar.zzd();
            zzd.getClass();
            char c10 = 65535;
            switch (zzd.hashCode()) {
                case -1874510116:
                    if (zzd.equals("REVERT_SECOND_FACTOR_ADDITION")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1452371317:
                    if (zzd.equals("PASSWORD_RESET")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1341836234:
                    if (zzd.equals("VERIFY_EMAIL")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1099157829:
                    if (zzd.equals("VERIFY_AND_CHANGE_EMAIL")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 870738373:
                    if (zzd.equals("EMAIL_SIGNIN")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 970484929:
                    if (zzd.equals("RECOVER_EMAIL")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    c8 = 6;
                    break;
                case 1:
                    c8 = 0;
                    break;
                case 2:
                    c8 = 1;
                    break;
                case 3:
                    break;
                case 4:
                    c8 = 4;
                    break;
                case 5:
                    c8 = 2;
                    break;
                default:
                    c8 = 3;
                    break;
            }
            if (c8 != 4 && c8 != 3) {
                if (zzahgVar.zzf()) {
                    String zzb = zzahgVar.zzb();
                    u d02 = f.d0(zzahgVar.zza());
                    I.e(zzb);
                    I.i(d02);
                } else if (zzahgVar.zzg()) {
                    String zzc = zzahgVar.zzc();
                    String zzb2 = zzahgVar.zzb();
                    I.e(zzc);
                    I.e(zzb2);
                } else if (zzahgVar.zze()) {
                    I.e(zzahgVar.zzb());
                }
            }
            c9 = c8;
        }
        if (c9 != 0) {
            zza(new Status(17499, null, null, null));
        } else {
            zzb(this.zzm.zzb());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zzd(this.zzu, this.zzv, this.zzb);
    }
}
