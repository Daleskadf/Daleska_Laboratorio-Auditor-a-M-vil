package n5;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel;
/* loaded from: classes.dex */
public final class h implements zzel {

    /* renamed from: b  reason: collision with root package name */
    public static final h f14382b = new h(0);

    /* renamed from: c  reason: collision with root package name */
    public static final h f14383c = new h(1);

    /* renamed from: d  reason: collision with root package name */
    public static final h f14384d = new h(2);

    /* renamed from: e  reason: collision with root package name */
    public static final h f14385e = new h(3);
    public static final h f = new h(4);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14386a;

    public /* synthetic */ h(int i7) {
        this.f14386a = i7;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel
    public final boolean zza(int i7) {
        switch (this.f14386a) {
            case 0:
                if (i7 == 0 || i7 == 1 || i7 == 2) {
                    return true;
                }
                return false;
            case 1:
                if (i7 == 0 || i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4) {
                    return true;
                }
                return false;
            case 2:
                if (android.support.v4.media.session.a.I(i7) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (f7.a.s0(i7) != 0) {
                    return true;
                }
                return false;
            default:
                if (i7 == 0 || i7 == 1 || i7 == 2) {
                    return true;
                }
                return false;
        }
    }
}
