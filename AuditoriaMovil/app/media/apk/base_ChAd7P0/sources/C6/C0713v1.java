package c6;

import a6.AbstractC0471A;
import a6.EnumC0486o;
/* renamed from: c6.v1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0713v1 {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0471A f9018a;

    /* renamed from: b  reason: collision with root package name */
    public EnumC0486o f9019b;

    /* renamed from: c  reason: collision with root package name */
    public final C0704s1 f9020c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f9021d = false;

    public C0713v1(AbstractC0471A abstractC0471A, EnumC0486o enumC0486o, C0704s1 c0704s1) {
        this.f9018a = abstractC0471A;
        this.f9019b = enumC0486o;
        this.f9020c = c0704s1;
    }

    public static void a(C0713v1 c0713v1, EnumC0486o enumC0486o) {
        c0713v1.f9019b = enumC0486o;
        if (enumC0486o != EnumC0486o.READY && enumC0486o != EnumC0486o.TRANSIENT_FAILURE) {
            if (enumC0486o == EnumC0486o.IDLE) {
                c0713v1.f9021d = false;
                return;
            }
            return;
        }
        c0713v1.f9021d = true;
    }
}
