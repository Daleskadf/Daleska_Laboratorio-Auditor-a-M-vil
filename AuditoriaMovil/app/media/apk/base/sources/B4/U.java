package b4;

import a4.AbstractC0452a;
import com.google.android.gms.internal.p002firebaseauthapi.zzahg;
/* loaded from: classes.dex */
public final class U {

    /* renamed from: a  reason: collision with root package name */
    public final int f8221a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC0452a f8222b;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, a4.a] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, a4.a] */
    public U(zzahg zzahgVar) {
        int i7 = 5;
        if (zzahgVar.zzg()) {
            zzahgVar.zzc();
        } else {
            zzahgVar.zzb();
        }
        zzahgVar.zzb();
        T t7 = null;
        if (!zzahgVar.zzh()) {
            this.f8221a = 3;
            this.f8222b = null;
            return;
        }
        String zzd = zzahgVar.zzd();
        zzd.getClass();
        char c8 = 65535;
        switch (zzd.hashCode()) {
            case -1874510116:
                if (zzd.equals("REVERT_SECOND_FACTOR_ADDITION")) {
                    c8 = 0;
                    break;
                }
                break;
            case -1452371317:
                if (zzd.equals("PASSWORD_RESET")) {
                    c8 = 1;
                    break;
                }
                break;
            case -1341836234:
                if (zzd.equals("VERIFY_EMAIL")) {
                    c8 = 2;
                    break;
                }
                break;
            case -1099157829:
                if (zzd.equals("VERIFY_AND_CHANGE_EMAIL")) {
                    c8 = 3;
                    break;
                }
                break;
            case 870738373:
                if (zzd.equals("EMAIL_SIGNIN")) {
                    c8 = 4;
                    break;
                }
                break;
            case 970484929:
                if (zzd.equals("RECOVER_EMAIL")) {
                    c8 = 5;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                i7 = 6;
                break;
            case 1:
                i7 = 0;
                break;
            case 2:
                i7 = 1;
                break;
            case 3:
                break;
            case 4:
                i7 = 4;
                break;
            case 5:
                i7 = 2;
                break;
            default:
                i7 = 3;
                break;
        }
        this.f8221a = i7;
        if (i7 != 4 && i7 != 3) {
            if (zzahgVar.zzf()) {
                String zzb = zzahgVar.zzb();
                a4.u d02 = j3.f.d0(zzahgVar.zza());
                ?? obj = new Object();
                com.google.android.gms.common.internal.I.e(zzb);
                obj.f7007a = zzb;
                com.google.android.gms.common.internal.I.i(d02);
                t7 = obj;
            } else if (zzahgVar.zzg()) {
                t7 = new T(zzahgVar.zzc(), zzahgVar.zzb());
            } else if (zzahgVar.zze()) {
                String zzb2 = zzahgVar.zzb();
                ?? obj2 = new Object();
                com.google.android.gms.common.internal.I.e(zzb2);
                obj2.f7007a = zzb2;
                t7 = obj2;
            }
            this.f8222b = t7;
            return;
        }
        this.f8222b = null;
    }
}
