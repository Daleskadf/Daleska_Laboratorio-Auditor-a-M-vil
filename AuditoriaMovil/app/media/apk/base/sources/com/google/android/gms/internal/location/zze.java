package com.google.android.gms.internal.location;

import E6.m;
import X2.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.j;
import m5.d;
/* loaded from: classes.dex */
public final class zze extends a {
    private final int zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final List zzf;
    private final zze zzg;
    public static final zzd zza = new zzd(null);
    public static final Parcelable.Creator<zze> CREATOR = new zzf();

    static {
        Process.myUid();
        Process.myPid();
    }

    public zze(int i7, String packageName, String str, String str2, List list, zze zzeVar) {
        j.e(packageName, "packageName");
        if (zzeVar != null && zzeVar.zza()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.zzb = i7;
        this.zzc = packageName;
        this.zzd = str;
        if (str2 == null) {
            if (zzeVar != null) {
                str2 = zzeVar.zze;
            } else {
                str2 = null;
            }
        }
        this.zze = str2;
        if (list == null) {
            list = zzeVar != null ? zzeVar.zzf : null;
            if (list == null) {
                list = zzex.zzi();
                j.d(list, "of(...)");
            }
        }
        zzex zzj = zzex.zzj(list);
        j.d(zzj, "copyOf(...)");
        this.zzf = zzj;
        this.zzg = zzeVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zze) {
            zze zzeVar = (zze) obj;
            if (this.zzb == zzeVar.zzb && j.a(this.zzc, zzeVar.zzc) && j.a(this.zzd, zzeVar.zzd) && j.a(this.zze, zzeVar.zze) && j.a(this.zzg, zzeVar.zzg) && j.a(this.zzf, zzeVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze, this.zzg});
    }

    public final String toString() {
        int i7;
        int length = this.zzc.length() + 18;
        String str = this.zzd;
        int i8 = 0;
        if (str != null) {
            i7 = str.length();
        } else {
            i7 = 0;
        }
        StringBuilder sb = new StringBuilder(length + i7);
        sb.append(this.zzb);
        sb.append("/");
        sb.append(this.zzc);
        String str2 = this.zzd;
        if (str2 != null) {
            sb.append("[");
            if (m.e0(str2, this.zzc)) {
                sb.append((CharSequence) str2, this.zzc.length(), str2.length());
            } else {
                sb.append(str2);
            }
            sb.append("]");
        }
        if (this.zze != null) {
            sb.append("/");
            String str3 = this.zze;
            if (str3 != null) {
                i8 = str3.hashCode();
            }
            sb.append(Integer.toHexString(i8));
        }
        String sb2 = sb.toString();
        j.d(sb2, "toString(...)");
        return sb2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        j.e(dest, "dest");
        int i8 = this.zzb;
        int G2 = d.G(20293, dest);
        d.K(dest, 1, 4);
        dest.writeInt(i8);
        d.B(dest, 3, this.zzc, false);
        d.B(dest, 4, this.zzd, false);
        d.B(dest, 6, this.zze, false);
        d.A(dest, 7, this.zzg, i7, false);
        d.F(dest, 8, this.zzf, false);
        d.J(G2, dest);
    }

    public final boolean zza() {
        return this.zzg != null;
    }
}
