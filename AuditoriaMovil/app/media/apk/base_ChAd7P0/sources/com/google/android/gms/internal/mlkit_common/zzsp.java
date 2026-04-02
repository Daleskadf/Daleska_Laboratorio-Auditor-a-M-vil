package com.google.android.gms.internal.mlkit_common;

import A2.b;
import A2.c;
import A2.d;
import A2.e;
import A2.f;
import B2.a;
import D2.h;
import D2.i;
import V2.k;
import android.content.Context;
import c4.n;
import w4.InterfaceC1956b;
/* loaded from: classes.dex */
public final class zzsp implements zzrz {
    private InterfaceC1956b zza;
    private final InterfaceC1956b zzb;
    private final zzsb zzc;

    public zzsp(Context context, zzsb zzsbVar) {
        this.zzc = zzsbVar;
        a aVar = a.f243e;
        i.b(context);
        final k c8 = i.a().c(aVar);
        if (a.f242d.contains(new b("json"))) {
            this.zza = new n(new InterfaceC1956b() { // from class: com.google.android.gms.internal.mlkit_common.zzsm
                @Override // w4.InterfaceC1956b
                public final Object get() {
                    return ((k) f.this).u(new b("json"), new e() { // from class: com.google.android.gms.internal.mlkit_common.zzso
                        @Override // A2.e
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new n(new InterfaceC1956b() { // from class: com.google.android.gms.internal.mlkit_common.zzsn
            @Override // w4.InterfaceC1956b
            public final Object get() {
                return ((k) f.this).u(new b("proto"), new e() { // from class: com.google.android.gms.internal.mlkit_common.zzsl
                    @Override // A2.e
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    public static c zzb(zzsb zzsbVar, zzry zzryVar) {
        return new A2.a(zzryVar.zze(zzsbVar.zza(), false), d.VERY_LOW);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzrz
    public final void zza(zzry zzryVar) {
        if (this.zzc.zza() == 0) {
            InterfaceC1956b interfaceC1956b = this.zza;
            if (interfaceC1956b != null) {
                ((h) interfaceC1956b.get()).a(zzb(this.zzc, zzryVar));
                return;
            }
            return;
        }
        ((h) this.zzb.get()).a(zzb(this.zzc, zzryVar));
    }
}
