package u0;

import h0.AbstractC1057q;
import java.nio.ByteBuffer;
import org.apache.tika.utils.StringUtils;
import v0.C1879a;
import v0.C1880b;
/* renamed from: u0.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1856l {

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadLocal f15932d = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    public final int f15933a;

    /* renamed from: b  reason: collision with root package name */
    public final E.e f15934b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f15935c = 0;

    public C1856l(E.e eVar, int i7) {
        this.f15934b = eVar;
        this.f15933a = i7;
    }

    public final int a(int i7) {
        C1879a c8 = c();
        int a7 = c8.a(16);
        if (a7 != 0) {
            ByteBuffer byteBuffer = (ByteBuffer) c8.f11209d;
            int i8 = a7 + c8.f11206a;
            return byteBuffer.getInt((i7 * 4) + byteBuffer.getInt(i8) + i8 + 4);
        }
        return 0;
    }

    public final int b() {
        C1879a c8 = c();
        int a7 = c8.a(16);
        if (a7 != 0) {
            int i7 = a7 + c8.f11206a;
            return ((ByteBuffer) c8.f11209d).getInt(((ByteBuffer) c8.f11209d).getInt(i7) + i7);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, h0.q] */
    public final C1879a c() {
        ThreadLocal threadLocal = f15932d;
        C1879a c1879a = (C1879a) threadLocal.get();
        C1879a c1879a2 = c1879a;
        if (c1879a == null) {
            ?? abstractC1057q = new AbstractC1057q();
            threadLocal.set(abstractC1057q);
            c1879a2 = abstractC1057q;
        }
        C1880b c1880b = (C1880b) this.f15934b.f920b;
        int a7 = c1880b.a(6);
        if (a7 != 0) {
            int i7 = a7 + c1880b.f11206a;
            int i8 = (this.f15933a * 4) + ((ByteBuffer) c1880b.f11209d).getInt(i7) + i7 + 4;
            int i9 = ((ByteBuffer) c1880b.f11209d).getInt(i8) + i8;
            ByteBuffer byteBuffer = (ByteBuffer) c1880b.f11209d;
            c1879a2.f11209d = byteBuffer;
            if (byteBuffer != null) {
                c1879a2.f11206a = i9;
                int i10 = i9 - byteBuffer.getInt(i9);
                c1879a2.f11207b = i10;
                c1879a2.f11208c = ((ByteBuffer) c1879a2.f11209d).getShort(i10);
            } else {
                c1879a2.f11206a = 0;
                c1879a2.f11207b = 0;
                c1879a2.f11208c = 0;
            }
        }
        return c1879a2;
    }

    public final String toString() {
        int i7;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C1879a c8 = c();
        int a7 = c8.a(4);
        if (a7 != 0) {
            i7 = ((ByteBuffer) c8.f11209d).getInt(a7 + c8.f11206a);
        } else {
            i7 = 0;
        }
        sb.append(Integer.toHexString(i7));
        sb.append(", codepoints:");
        int b5 = b();
        for (int i8 = 0; i8 < b5; i8++) {
            sb.append(Integer.toHexString(a(i8)));
            sb.append(StringUtils.SPACE);
        }
        return sb.toString();
    }
}
