package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
/* renamed from: com.google.crypto.tink.shaded.protobuf.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0774a implements U {
    protected int memoizedHashCode;

    public abstract int b(g0 g0Var);

    public final String c(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public abstract AbstractC0794v d();

    public final byte[] e() {
        try {
            int b5 = ((AbstractC0797y) this).b(null);
            byte[] bArr = new byte[b5];
            C0784k c0784k = new C0784k(bArr, b5);
            f(c0784k);
            if (b5 - c0784k.f9676g == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e7) {
            throw new RuntimeException(c("byte array"), e7);
        }
    }

    public abstract void f(C0784k c0784k);
}
