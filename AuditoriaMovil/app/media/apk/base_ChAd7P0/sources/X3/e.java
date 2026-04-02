package X3;

import android.content.Context;
import w4.InterfaceC1956b;
/* loaded from: classes.dex */
public final /* synthetic */ class e implements InterfaceC1956b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6388a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f6389b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f6390c;

    public /* synthetic */ e(int i7, Context context, String str) {
        this.f6388a = i7;
        this.f6389b = context;
        this.f6390c = str;
    }

    @Override // w4.InterfaceC1956b
    public final Object get() {
        switch (this.f6388a) {
            case 0:
                return this.f6389b.getSharedPreferences(this.f6390c, 0);
            default:
                return new v4.h(this.f6389b, this.f6390c);
        }
    }
}
