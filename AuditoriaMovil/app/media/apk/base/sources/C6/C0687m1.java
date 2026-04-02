package c6;

import java.io.OutputStream;
import java.util.ArrayList;
/* renamed from: c6.m1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0687m1 extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f8911a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public d6.x f8912b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0690n1 f8913c;

    public C0687m1(C0690n1 c0690n1) {
        this.f8913c = c0690n1;
    }

    @Override // java.io.OutputStream
    public final void write(int i7) {
        d6.x xVar = this.f8912b;
        if (xVar != null && xVar.f10495b > 0) {
            xVar.f10494a.x((byte) i7);
            xVar.f10495b--;
            xVar.f10496c++;
            return;
        }
        write(new byte[]{(byte) i7}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i7, int i8) {
        d6.x xVar = this.f8912b;
        ArrayList arrayList = this.f8911a;
        C0690n1 c0690n1 = this.f8913c;
        if (xVar == null) {
            c0690n1.f8920X.getClass();
            d6.x l8 = e5.b.l(i8);
            this.f8912b = l8;
            arrayList.add(l8);
        }
        while (i8 > 0) {
            int min = Math.min(i8, this.f8912b.f10495b);
            if (min == 0) {
                int max = Math.max(i8, this.f8912b.f10496c * 2);
                c0690n1.f8920X.getClass();
                d6.x l9 = e5.b.l(max);
                this.f8912b = l9;
                arrayList.add(l9);
            } else {
                this.f8912b.a(bArr, i7, min);
                i7 += min;
                i8 -= min;
            }
        }
    }
}
