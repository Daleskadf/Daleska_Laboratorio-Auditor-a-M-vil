package a1;

import A3.K;
import D.RunnableC0053c;
import android.os.Handler;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public final class w implements i1.k {

    /* renamed from: a  reason: collision with root package name */
    public final DataInputStream f6911a;

    /* renamed from: b  reason: collision with root package name */
    public final B2.c f6912b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f6913c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ y f6914d;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, B2.c] */
    public w(y yVar, InputStream inputStream) {
        this.f6914d = yVar;
        this.f6911a = new DataInputStream(inputStream);
        ?? obj = new Object();
        obj.f251c = new ArrayList();
        obj.f249a = 1;
        this.f6912b = obj;
    }

    @Override // i1.k
    public final void b() {
        boolean z7;
        boolean z8;
        String str;
        while (!this.f6913c) {
            byte readByte = this.f6911a.readByte();
            if (readByte == 36) {
                int readUnsignedByte = this.f6911a.readUnsignedByte();
                int readUnsignedShort = this.f6911a.readUnsignedShort();
                byte[] bArr = new byte[readUnsignedShort];
                this.f6911a.readFully(bArr, 0, readUnsignedShort);
                C0422H c0422h = (C0422H) this.f6914d.f6922c.get(Integer.valueOf(readUnsignedByte));
                if (c0422h != null && !this.f6914d.f) {
                    c0422h.f6782e.add(bArr);
                }
            } else if (this.f6914d.f) {
                continue;
            } else {
                M0.x xVar = this.f6914d.f6920a;
                B2.c cVar = this.f6912b;
                DataInputStream dataInputStream = this.f6911a;
                cVar.getClass();
                K a7 = cVar.a(B2.c.b(readByte, dataInputStream));
                while (a7 == null) {
                    if (cVar.f249a == 3) {
                        long j = cVar.f250b;
                        if (j > 0) {
                            int g3 = AbstractC1740d.g(j);
                            if (g3 != -1) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            K0.a.j(z7);
                            byte[] bArr2 = new byte[g3];
                            dataInputStream.readFully(bArr2, 0, g3);
                            if (cVar.f249a == 3) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            K0.a.j(z8);
                            if (g3 > 0) {
                                int i7 = g3 - 1;
                                if (bArr2[i7] == 10) {
                                    if (g3 > 1) {
                                        int i8 = g3 - 2;
                                        if (bArr2[i8] == 13) {
                                            str = new String(bArr2, 0, i8, y.f6919X);
                                            ArrayList arrayList = (ArrayList) cVar.f251c;
                                            arrayList.add(str);
                                            a7 = K.p(arrayList);
                                            ((ArrayList) cVar.f251c).clear();
                                            cVar.f249a = 1;
                                            cVar.f250b = 0L;
                                        }
                                    }
                                    str = new String(bArr2, 0, i7, y.f6919X);
                                    ArrayList arrayList2 = (ArrayList) cVar.f251c;
                                    arrayList2.add(str);
                                    a7 = K.p(arrayList2);
                                    ((ArrayList) cVar.f251c).clear();
                                    cVar.f249a = 1;
                                    cVar.f250b = 0L;
                                }
                            }
                            throw new IllegalArgumentException("Message body is empty or does not end with a LF.");
                        }
                        throw new IllegalStateException("Expects a greater than zero Content-Length.");
                    }
                    a7 = cVar.a(B2.c.b(dataInputStream.readByte(), dataInputStream));
                }
                ((Handler) xVar.f3210b).post(new RunnableC0053c(24, xVar, a7));
            }
        }
    }

    @Override // i1.k
    public final void k() {
        this.f6913c = true;
    }
}
