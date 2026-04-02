package j3;

import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;
import i3.InterfaceC1109a;
/* loaded from: classes.dex */
public final class i extends zza {
    public final InterfaceC1109a b(i3.b bVar, String str, int i7) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(i7);
        return io.flutter.plugins.pathprovider.b.d(zzB(2, zza));
    }

    public final InterfaceC1109a c(i3.b bVar, String str, int i7, i3.b bVar2) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(i7);
        zzc.zze(zza, bVar2);
        return io.flutter.plugins.pathprovider.b.d(zzB(8, zza));
    }

    public final InterfaceC1109a e(i3.b bVar, String str, int i7) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(i7);
        return io.flutter.plugins.pathprovider.b.d(zzB(4, zza));
    }
}
