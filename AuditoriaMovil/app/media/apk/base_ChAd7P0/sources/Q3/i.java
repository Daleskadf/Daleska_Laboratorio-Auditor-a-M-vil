package q3;

import X5.E;
import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zzac;
import com.google.android.gms.internal.maps.zzad;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;
import i3.InterfaceC1109a;
import s3.C1786n;
/* loaded from: classes.dex */
public final class i extends zzb {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15325a = 4;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f15326b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(U4.b bVar) {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        this.f15326b = bVar;
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (this.f15325a) {
            case 0:
                if (i7 == 1) {
                    zzad zzb = zzac.zzb(parcel.readStrongBinder());
                    zzc.zzc(parcel);
                    boolean e7 = ((d) this.f15326b).e(new C1786n(zzb));
                    parcel2.writeNoException();
                    parcel2.writeInt(e7 ? 1 : 0);
                    return true;
                }
                return false;
            case 1:
                e eVar = (e) this.f15326b;
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            return false;
                        }
                        zzad zzb2 = zzac.zzb(parcel.readStrongBinder());
                        zzc.zzc(parcel);
                        eVar.f(new C1786n(zzb2));
                    } else {
                        zzad zzb3 = zzac.zzb(parcel.readStrongBinder());
                        zzc.zzc(parcel);
                        eVar.p(new C1786n(zzb3));
                    }
                } else {
                    zzad zzb4 = zzac.zzb(parcel.readStrongBinder());
                    zzc.zzc(parcel);
                    eVar.y(new C1786n(zzb4));
                }
                parcel2.writeNoException();
                return true;
            case 2:
                if (i7 == 1) {
                    zzad zzb5 = zzac.zzb(parcel.readStrongBinder());
                    zzc.zzc(parcel);
                    ((b) this.f15326b).W(new C1786n(zzb5));
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 3:
                if (i7 == 1) {
                    zzad zzb6 = zzac.zzb(parcel.readStrongBinder());
                    zzc.zzc(parcel);
                    ((c) this.f15326b).a(new C1786n(zzb6));
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 4:
                U4.b bVar = (U4.b) this.f15326b;
                if (i7 != 1) {
                    if (i7 != 2) {
                        return false;
                    }
                    zzad zzb7 = zzac.zzb(parcel.readStrongBinder());
                    zzc.zzc(parcel);
                    U4.a aVar = (U4.a) bVar.f5773a.get(new C1786n(zzb7));
                    i3.b bVar2 = new i3.b(null);
                    parcel2.writeNoException();
                    zzc.zze(parcel2, bVar2);
                    return true;
                }
                zzad zzb8 = zzac.zzb(parcel.readStrongBinder());
                zzc.zzc(parcel);
                U4.a aVar2 = (U4.a) bVar.f5773a.get(new C1786n(zzb8));
                i3.b bVar3 = new i3.b(null);
                parcel2.writeNoException();
                zzc.zze(parcel2, bVar3);
                return true;
            default:
                E e8 = (E) this.f15326b;
                if (i7 != 1) {
                    if (i7 != 2) {
                        return false;
                    }
                    InterfaceC1109a b5 = i3.b.b(parcel.readStrongBinder());
                    zzc.zzc(parcel);
                    e8.g((Bitmap) i3.b.c(b5));
                } else {
                    zzc.zzc(parcel);
                    e8.g((Bitmap) zzc.zza(parcel, Bitmap.CREATOR));
                }
                parcel2.writeNoException();
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(E e7) {
        super("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
        this.f15326b = e7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(b bVar) {
        super("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
        this.f15326b = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c cVar) {
        super("com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener");
        this.f15326b = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d dVar) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
        this.f15326b = dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e eVar) {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
        this.f15326b = eVar;
    }
}
