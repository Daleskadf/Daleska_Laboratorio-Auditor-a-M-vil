package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzbl;
import com.google.android.gms.internal.play_billing.zzbm;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
public abstract class zzbm<MessageType extends zzbm<MessageType, BuilderType>, BuilderType extends zzbl<MessageType, BuilderType>> implements zzek {
    protected int zza = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public static void zzc(Iterable iterable, List list) {
        byte[] bArr = zzdl.zzd;
        iterable.getClass();
        if (iterable instanceof zzds) {
            List zzh = ((zzds) iterable).zzh();
            zzds zzdsVar = (zzds) list;
            int size = list.size();
            for (Object obj : zzh) {
                if (obj == null) {
                    String str = "Element at index " + (zzdsVar.size() - size) + " is null.";
                    int size2 = zzdsVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        }
                        zzdsVar.remove(size2);
                    }
                    throw new NullPointerException(str);
                } else if (obj instanceof zzcc) {
                    zzdsVar.zzi((zzcc) obj);
                } else {
                    zzdsVar.add((String) obj);
                }
            }
        } else if (!(iterable instanceof zzer)) {
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
            }
            int size3 = list.size();
            for (Object obj2 : iterable) {
                if (obj2 != null) {
                    list.add(obj2);
                } else {
                    String str2 = "Element at index " + (list.size() - size3) + " is null.";
                    int size4 = list.size();
                    while (true) {
                        size4--;
                        if (size4 < size3) {
                            break;
                        }
                        list.remove(size4);
                    }
                    throw new NullPointerException(str2);
                }
            }
        } else {
            list.addAll(iterable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zza(zzev zzevVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzek
    public final zzcc zzb() {
        try {
            int zzg = zzg();
            zzcc zzccVar = zzcc.zzb;
            byte[] bArr = new byte[zzg];
            zzck zzy = zzck.zzy(bArr, 0, zzg);
            zzv(zzy);
            zzy.zzz();
            return new zzbz(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    public final byte[] zzd() {
        try {
            int zzg = zzg();
            byte[] bArr = new byte[zzg];
            zzck zzy = zzck.zzy(bArr, 0, zzg);
            zzv(zzy);
            zzy.zzz();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
