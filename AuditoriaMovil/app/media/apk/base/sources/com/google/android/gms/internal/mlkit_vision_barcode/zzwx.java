package com.google.android.gms.internal.mlkit_vision_barcode;

import A2.b;
import A2.c;
import A2.d;
import A2.e;
import A2.f;
import D2.h;
import D2.i;
import V2.k;
import android.content.Context;
import c4.n;
import w4.InterfaceC1956b;
/* loaded from: classes.dex */
public final class zzwx implements zzwf {
    private InterfaceC1956b zza;
    private final InterfaceC1956b zzb;
    private final zzwh zzc;

    public zzwx(Context context, zzwh zzwhVar) {
        this.zzc = zzwhVar;
        B2.a aVar = B2.a.f243e;
        i.b(context);
        final k c8 = i.a().c(aVar);
        if (B2.a.f242d.contains(new b("json"))) {
            this.zza = new n(new InterfaceC1956b() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwu
                @Override // w4.InterfaceC1956b
                public final Object get() {
                    return ((k) f.this).u(new b("json"), new e() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzww
                        @Override // A2.e
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new n(new InterfaceC1956b() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwv
            @Override // w4.InterfaceC1956b
            public final Object get() {
                return ((k) f.this).u(new b("proto"), new e() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwt
                    @Override // A2.e
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    public static c zzb(zzwh zzwhVar, zzwe zzweVar) {
        int zza = zzwhVar.zza();
        if (zzweVar.zza() != 0) {
            return new A2.a(zzweVar.zze(zza, false), d.DEFAULT);
        }
        return new A2.a(zzweVar.zze(zza, false), d.VERY_LOW);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwf
    public final void zza(zzwe zzweVar) {
        if (this.zzc.zza() == 0) {
            InterfaceC1956b interfaceC1956b = this.zza;
            if (interfaceC1956b != null) {
                ((h) interfaceC1956b.get()).a(zzb(this.zzc, zzweVar));
                return;
            }
            return;
        }
        ((h) this.zzb.get()).a(zzb(this.zzc, zzweVar));
    }
}
