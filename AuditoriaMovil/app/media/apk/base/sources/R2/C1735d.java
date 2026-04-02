package r2;

import G.i;
import K5.r;
import android.location.Location;
import java.util.HashMap;
import p.Y0;
import s2.InterfaceC1765a;
import t2.g;
import t2.k;
import t2.s;
/* renamed from: r2.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1735d implements s, InterfaceC1765a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Y0 f15470a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean[] f15471b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f15472c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f15473d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ r f15474e;

    public /* synthetic */ C1735d(Y0 y02, boolean[] zArr, k kVar, String str, r rVar) {
        this.f15470a = y02;
        this.f15471b = zArr;
        this.f15472c = kVar;
        this.f15473d = str;
        this.f15474e = rVar;
    }

    @Override // s2.InterfaceC1765a
    public void a(s2.b bVar) {
        Y0 y02 = this.f15470a;
        y02.getClass();
        boolean[] zArr = this.f15471b;
        if (!zArr[0]) {
            zArr[0] = true;
            k kVar = this.f15472c;
            ((g) y02.f14761c).f15733a.remove(kVar);
            kVar.e();
            ((HashMap) y02.f14763e).remove(this.f15473d);
            this.f15474e.b(null, bVar.toString(), bVar.a());
        }
    }

    @Override // t2.s
    public void b(Location location) {
        Y0 y02 = this.f15470a;
        y02.getClass();
        boolean[] zArr = this.f15471b;
        if (!zArr[0]) {
            zArr[0] = true;
            k kVar = this.f15472c;
            ((g) y02.f14761c).f15733a.remove(kVar);
            kVar.e();
            ((HashMap) y02.f14763e).remove(this.f15473d);
            this.f15474e.a(i.J(location));
        }
    }
}
