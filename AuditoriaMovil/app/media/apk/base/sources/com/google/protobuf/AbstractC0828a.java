package com.google.protobuf;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
/* renamed from: com.google.protobuf.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0828a {
    protected int memoizedHashCode;

    public static void b(List list, List list2) {
        Charset charset = V.f10033a;
        list.getClass();
        if (list instanceof InterfaceC0831b0) {
            List d7 = ((InterfaceC0831b0) list).d();
            InterfaceC0831b0 interfaceC0831b0 = (InterfaceC0831b0) list2;
            int size = list2.size();
            for (Object obj : d7) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC0831b0.size() - size) + " is null.";
                    for (int size2 = interfaceC0831b0.size() - 1; size2 >= size; size2--) {
                        interfaceC0831b0.remove(size2);
                    }
                    throw new NullPointerException(str);
                } else if (obj instanceof AbstractC0852m) {
                    interfaceC0831b0.g((AbstractC0852m) obj);
                } else {
                    interfaceC0831b0.add((String) obj);
                }
            }
        } else if (list instanceof InterfaceC0874x0) {
            list2.addAll(list);
        } else {
            if (list2 instanceof ArrayList) {
                ((ArrayList) list2).ensureCapacity(list.size() + list2.size());
            }
            int size3 = list2.size();
            for (Object obj2 : list) {
                if (obj2 == null) {
                    String str2 = "Element at index " + (list2.size() - size3) + " is null.";
                    for (int size4 = list2.size() - 1; size4 >= size3; size4--) {
                        list2.remove(size4);
                    }
                    throw new NullPointerException(str2);
                }
                list2.add(obj2);
            }
        }
    }

    public abstract int c(E0 e02);

    public final byte[] d() {
        try {
            int c8 = ((J) this).c(null);
            byte[] bArr = new byte[c8];
            Logger logger = AbstractC0865t.f10136d;
            r rVar = new r(bArr, 0, c8);
            e(rVar);
            if (rVar.P0() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e7) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e7);
        }
    }

    public abstract void e(AbstractC0865t abstractC0865t);
}
