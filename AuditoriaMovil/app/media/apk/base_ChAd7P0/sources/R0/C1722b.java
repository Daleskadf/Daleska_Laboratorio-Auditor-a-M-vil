package r0;

import Q6.l;
import Q6.o;
import a1.C0415A;
import java.util.concurrent.atomic.AtomicBoolean;
import p0.InterfaceC1633a;
/* renamed from: r0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1722b implements InterfaceC1633a {

    /* renamed from: a  reason: collision with root package name */
    public final l f15415a;

    /* renamed from: b  reason: collision with root package name */
    public final o f15416b;

    /* renamed from: c  reason: collision with root package name */
    public final C0415A f15417c;

    public C1722b(l fileSystem, o path) {
        kotlin.jvm.internal.j.e(fileSystem, "fileSystem");
        kotlin.jvm.internal.j.e(path, "path");
        this.f15415a = fileSystem;
        this.f15416b = path;
        this.f15417c = new C0415A(21);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:(4:11|12|(2:20|21)|(2:15|16)(1:18))(2:24|25))(3:26|27|28))(2:46|(5:50|51|52|53|(1:55)(1:56))(2:48|49))|(2:35|36)|30|(2:32|33)(1:34)))|78|6|7|(0)(0)|(0)|30|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c5, code lost:
        if (r8 != 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c7, code lost:
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cb, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cc, code lost:
        j3.f.a(r9, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00cf, code lost:
        r6 = r9;
        r9 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097 A[Catch: FileNotFoundException -> 0x0091, TryCatch #9 {FileNotFoundException -> 0x0091, blocks: (B:48:0x0097, B:49:0x009b, B:41:0x0088), top: B:89:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b A[Catch: FileNotFoundException -> 0x0091, TRY_LEAVE, TryCatch #9 {FileNotFoundException -> 0x0091, blocks: (B:48:0x0097, B:49:0x009b, B:41:0x0088), top: B:89:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v0, types: [r0.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(r0.C1722b r8, p6.AbstractC1700c r9) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.C1722b.a(r0.b, p6.c):java.lang.Object");
    }

    @Override // p0.InterfaceC1633a
    public final void close() {
        ((AtomicBoolean) this.f15417c.f6744a).set(true);
    }
}
