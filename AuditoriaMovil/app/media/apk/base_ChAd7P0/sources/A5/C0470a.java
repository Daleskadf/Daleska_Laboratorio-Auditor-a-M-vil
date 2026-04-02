package a5;

import com.google.android.gms.common.internal.I;
/* renamed from: a5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0470a extends Exception {

    /* renamed from: a  reason: collision with root package name */
    public final int f7063a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0470a(String str, int i7) {
        super(str);
        I.f(str, "Provided message must not be empty.");
        this.f7063a = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0470a(String str, Exception exc) {
        super(str, exc);
        I.f(str, "Provided message must not be empty.");
        this.f7063a = 13;
    }
}
