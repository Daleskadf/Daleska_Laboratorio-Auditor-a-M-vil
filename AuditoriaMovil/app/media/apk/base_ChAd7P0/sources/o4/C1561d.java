package o4;

import com.google.android.libraries.barhopper.RecognitionOptions;
import q4.j;
/* renamed from: o4.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1561d {

    /* renamed from: a  reason: collision with root package name */
    public final C1563f f14594a;

    /* renamed from: b  reason: collision with root package name */
    public final C1560c f14595b;

    /* renamed from: c  reason: collision with root package name */
    public final C1560c f14596c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o4.f] */
    public C1561d() {
        ?? obj = new Object();
        obj.f14600b = 0;
        obj.f14599a = new byte[RecognitionOptions.UPC_E];
        this.f14594a = obj;
        this.f14595b = new C1560c(this, 0);
        this.f14596c = new C1560c(this, 1);
    }

    public final j3.f a(j jVar) {
        if (jVar.equals(j.DESCENDING)) {
            return this.f14596c;
        }
        return this.f14595b;
    }
}
