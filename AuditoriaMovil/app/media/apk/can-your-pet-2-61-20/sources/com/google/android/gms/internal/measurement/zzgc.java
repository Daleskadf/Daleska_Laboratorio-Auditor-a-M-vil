package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjv;
import java.util.List;
import kotlin.text.Typography;
/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzgc {

    /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
    /* loaded from: classes3.dex */
    public static final class zza extends zzjv<zza, C0025zza> implements zzlk {
        private static final zza zzc;
        private static volatile zzlr<zza> zzd;
        private zzke<zzb> zze = zzce();

        public final int zza() {
            return this.zze.size();
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
        /* renamed from: com.google.android.gms.internal.measurement.zzgc$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0025zza extends zzjv.zza<zza, C0025zza> implements zzlk {
            private C0025zza() {
                super(zza.zzc);
            }

            /* synthetic */ C0025zza(zzgd zzgdVar) {
                this();
            }
        }

        public static zza zzc() {
            return zzc;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzjv
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzgd.zza[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0025zza(null);
                case 3:
                    return zza(zzc, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzb.class});
                case 4:
                    return zzc;
                case 5:
                    zzlr<zza> zzlrVar = zzd;
                    if (zzlrVar == null) {
                        synchronized (zza.class) {
                            zzlrVar = zzd;
                            if (zzlrVar == null) {
                                zzlrVar = new zzjv.zzc<>(zzc);
                                zzd = zzlrVar;
                            }
                        }
                    }
                    return zzlrVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final List<zzb> zzd() {
            return this.zze;
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzjv.zza(zza.class, zzaVar);
        }

        private zza() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
    /* loaded from: classes3.dex */
    public static final class zzb extends zzjv<zzb, zza> implements zzlk {
        private static final zzb zzc;
        private static volatile zzlr<zzb> zzd;
        private int zze;
        private String zzf = "";
        private zzke<zzd> zzg = zzce();

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
        /* loaded from: classes3.dex */
        public static final class zza extends zzjv.zza<zzb, zza> implements zzlk {
            private zza() {
                super(zzb.zzc);
            }

            /* synthetic */ zza(zzgd zzgdVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzjv
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzgd.zza[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", zzd.class});
                case 4:
                    return zzc;
                case 5:
                    zzlr<zzb> zzlrVar = zzd;
                    if (zzlrVar == null) {
                        synchronized (zzb.class) {
                            zzlrVar = zzd;
                            if (zzlrVar == null) {
                                zzlrVar = new zzjv.zzc<>(zzc);
                                zzd = zzlrVar;
                            }
                        }
                    }
                    return zzlrVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final String zzb() {
            return this.zzf;
        }

        public final List<zzd> zzc() {
            return this.zzg;
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzjv.zza(zzb.class, zzbVar);
        }

        private zzb() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
    /* loaded from: classes3.dex */
    public static final class zzc extends zzjv<zzc, zza> implements zzlk {
        private static final zzc zzc;
        private static volatile zzlr<zzc> zzd;
        private int zze;
        private zzke<zzd> zzf = zzce();
        private zza zzg;

        public final zza zza() {
            zza zzaVar = this.zzg;
            return zzaVar == null ? zza.zzc() : zzaVar;
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
        /* loaded from: classes3.dex */
        public static final class zza extends zzjv.zza<zzc, zza> implements zzlk {
            private zza() {
                super(zzc.zzc);
            }

            /* synthetic */ zza(zzgd zzgdVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzjv
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzgd.zza[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", zzd.class, "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzlr<zzc> zzlrVar = zzd;
                    if (zzlrVar == null) {
                        synchronized (zzc.class) {
                            zzlrVar = zzd;
                            if (zzlrVar == null) {
                                zzlrVar = new zzjv.zzc<>(zzc);
                                zzd = zzlrVar;
                            }
                        }
                    }
                    return zzlrVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final List<zzd> zzc() {
            return this.zzf;
        }

        static {
            zzc zzcVar = new zzc();
            zzc = zzcVar;
            zzjv.zza(zzc.class, zzcVar);
        }

        private zzc() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
    /* loaded from: classes3.dex */
    public static final class zzd extends zzjv<zzd, zzb> implements zzlk {
        private static final zzd zzc;
        private static volatile zzlr<zzd> zzd;
        private int zze;
        private int zzf;
        private zzke<zzd> zzg = zzce();
        private String zzh = "";
        private String zzi = "";
        private boolean zzj;
        private double zzk;

        public final double zza() {
            return this.zzk;
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
        /* loaded from: classes3.dex */
        public static final class zzb extends zzjv.zza<zzd, zzb> implements zzlk {
            private zzb() {
                super(zzd.zzc);
            }

            /* synthetic */ zzb(zzgd zzgdVar) {
                this();
            }
        }

        public final zza zzb() {
            zza zza2 = zza.zza(this.zzf);
            return zza2 == null ? zza.UNKNOWN : zza2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzjv
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzgd.zza[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zzb(null);
                case 3:
                    return zza(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", zza.zzb(), "zzg", zzd.class, "zzh", "zzi", "zzj", "zzk"});
                case 4:
                    return zzc;
                case 5:
                    zzlr<zzd> zzlrVar = zzd;
                    if (zzlrVar == null) {
                        synchronized (zzd.class) {
                            zzlrVar = zzd;
                            if (zzlrVar == null) {
                                zzlrVar = new zzjv.zzc<>(zzc);
                                zzd = zzlrVar;
                            }
                        }
                    }
                    return zzlrVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
        /* loaded from: classes3.dex */
        public enum zza implements zzjx {
            UNKNOWN(0),
            STRING(1),
            NUMBER(2),
            BOOLEAN(3),
            STATEMENT(4);
            
            private static final zzka<zza> zzf = new zzgf();
            private final int zzh;

            @Override // com.google.android.gms.internal.measurement.zzjx
            public final int zza() {
                return this.zzh;
            }

            public static zza zza(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    return null;
                                }
                                return STATEMENT;
                            }
                            return BOOLEAN;
                        }
                        return NUMBER;
                    }
                    return STRING;
                }
                return UNKNOWN;
            }

            public static zzjz zzb() {
                return zzge.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzh + " name=" + name() + Typography.greater;
            }

            zza(int i) {
                this.zzh = i;
            }
        }

        public final String zzd() {
            return this.zzh;
        }

        public final String zze() {
            return this.zzi;
        }

        public final List<zzd> zzf() {
            return this.zzg;
        }

        static {
            zzd zzdVar = new zzd();
            zzc = zzdVar;
            zzjv.zza(zzd.class, zzdVar);
        }

        private zzd() {
        }

        public final boolean zzg() {
            return this.zzj;
        }

        public final boolean zzh() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzi() {
            return (this.zze & 16) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 4) != 0;
        }
    }
}
