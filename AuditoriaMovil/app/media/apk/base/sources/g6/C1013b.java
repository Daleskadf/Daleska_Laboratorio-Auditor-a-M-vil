package g6;

import G.i;
import com.google.protobuf.I;
import com.google.protobuf.InterfaceC0872w0;
import com.google.protobuf.J;
/* renamed from: g6.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1013b {

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadLocal f11135d = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0872w0 f11136a;

    /* renamed from: b  reason: collision with root package name */
    public final J f11137b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11138c;

    public C1013b(J j) {
        i.j(j, "defaultInstance cannot be null");
        this.f11137b = j;
        this.f11136a = (InterfaceC0872w0) j.j(I.GET_PARSER);
        this.f11138c = -1;
    }
}
