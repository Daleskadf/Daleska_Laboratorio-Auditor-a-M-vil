package B5;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class K implements N {

    /* renamed from: a  reason: collision with root package name */
    public final L5.f f323a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f324b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f325c;

    /* renamed from: d  reason: collision with root package name */
    public final L f326d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [B5.T, java.lang.Object] */
    public K(L5.f fVar) {
        HashMap hashMap = new HashMap();
        this.f325c = hashMap;
        this.f326d = new L();
        this.f323a = fVar;
        P p7 = U.f338a;
        ?? obj = new Object();
        obj.f337a = false;
        Object[] objArr = new T[]{obj}[0];
        objArr.getClass();
        hashMap.put(4294967556L, objArr);
    }

    public final void a(G g3, final A.l lVar) {
        L5.e eVar;
        int length;
        long j;
        byte[] bArr = null;
        if (lVar == null) {
            eVar = null;
        } else {
            eVar = new L5.e() { // from class: B5.H
                @Override // L5.e
                public final void a(ByteBuffer byteBuffer) {
                    boolean z7;
                    Boolean bool = Boolean.FALSE;
                    if (byteBuffer != null) {
                        byteBuffer.rewind();
                        if (byteBuffer.capacity() != 0) {
                            if (byteBuffer.get() != 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            bool = Boolean.valueOf(z7);
                        }
                    } else {
                        Log.w("KeyEmbedderResponder", "A null reply was received when sending a key event to the framework.");
                    }
                    A.l.this.i(bool.booleanValue());
                }
            };
        }
        try {
            String str = g3.f316g;
            if (str != null) {
                bArr = str.getBytes("UTF-8");
            }
            if (bArr == null) {
                length = 0;
            } else {
                length = bArr.length;
            }
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(g3.f311a);
            allocateDirect.putLong(g3.f312b.a());
            allocateDirect.putLong(g3.f313c);
            allocateDirect.putLong(g3.f314d);
            if (g3.f315e) {
                j = 1;
            } else {
                j = 0;
            }
            allocateDirect.putLong(j);
            allocateDirect.putLong(g3.f.a());
            if (bArr != null) {
                allocateDirect.put(bArr);
            }
            this.f323a.h("flutter/keydata", allocateDirect, eVar);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0352 A[LOOP:6: B:165:0x034c->B:167:0x0352, LOOP_END] */
    /* JADX WARN: Type inference failed for: r2v6, types: [B5.G, java.lang.Object] */
    @Override // B5.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(final android.view.KeyEvent r28, A.l r29) {
        /*
            Method dump skipped, instructions count: 861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B5.K.b(android.view.KeyEvent, A.l):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [B5.G, java.lang.Object] */
    public final void c(boolean z7, Long l8, Long l9, long j) {
        F f;
        ?? obj = new Object();
        obj.f311a = j;
        if (z7) {
            f = F.kDown;
        } else {
            f = F.kUp;
        }
        obj.f312b = f;
        obj.f314d = l8.longValue();
        obj.f313c = l9.longValue();
        obj.f316g = null;
        obj.f315e = true;
        obj.f = E.kKeyboard;
        if (l9.longValue() != 0 && l8.longValue() != 0) {
            if (!z7) {
                l8 = null;
            }
            d(l9, l8);
        }
        a(obj, null);
    }

    public final void d(Long l8, Long l9) {
        HashMap hashMap = this.f324b;
        if (l9 != null) {
            if (((Long) hashMap.put(l8, l9)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) hashMap.remove(l8)) != null) {
        } else {
            throw new AssertionError("The key was empty");
        }
    }
}
