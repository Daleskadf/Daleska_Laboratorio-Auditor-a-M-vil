package com.google.android.gms.internal.mlkit_vision_common;

import androidx.datastore.preferences.protobuf.Y;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h4.C1083c;
import h4.InterfaceC1084d;
import h4.InterfaceC1085e;
import h4.InterfaceC1086f;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
/* loaded from: classes.dex */
final class zzak implements InterfaceC1085e {
    private static final Charset zza = Charset.forName("UTF-8");
    private static final C1083c zzb;
    private static final C1083c zzc;
    private static final InterfaceC1084d zzd;
    private OutputStream zze;
    private final Map zzf;
    private final Map zzg;
    private final InterfaceC1084d zzh;
    private final zzao zzi = new zzao(this);

    static {
        zzai i7 = Y.i(1);
        HashMap hashMap = new HashMap();
        hashMap.put(i7.annotationType(), i7);
        zzb = new C1083c(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, Y.n(hashMap));
        zzai i8 = Y.i(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(i8.annotationType(), i8);
        zzc = new C1083c(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, Y.n(hashMap2));
        zzd = new InterfaceC1084d() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzaj
            @Override // h4.InterfaceC1081a
            public final void encode(Object obj, Object obj2) {
                zzak.zzg((Map.Entry) obj, (InterfaceC1085e) obj2);
            }
        };
    }

    public zzak(OutputStream outputStream, Map map, Map map2, InterfaceC1084d interfaceC1084d) {
        this.zze = outputStream;
        this.zzf = map;
        this.zzg = map2;
        this.zzh = interfaceC1084d;
    }

    public static /* synthetic */ void zzg(Map.Entry entry, InterfaceC1085e interfaceC1085e) {
        interfaceC1085e.add(zzb, entry.getKey());
        interfaceC1085e.add(zzc, entry.getValue());
    }

    private static int zzh(C1083c c1083c) {
        zzai zzaiVar = (zzai) c1083c.b(zzai.class);
        if (zzaiVar != null) {
            return zzaiVar.zza();
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    private final long zzi(InterfaceC1084d interfaceC1084d, Object obj) {
        zzaf zzafVar = new zzaf();
        try {
            OutputStream outputStream = this.zze;
            this.zze = zzafVar;
            interfaceC1084d.encode(obj, this);
            this.zze = outputStream;
            long zza2 = zzafVar.zza();
            zzafVar.close();
            return zza2;
        } catch (Throwable th) {
            try {
                zzafVar.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }

    private static zzai zzj(C1083c c1083c) {
        zzai zzaiVar = (zzai) c1083c.b(zzai.class);
        if (zzaiVar != null) {
            return zzaiVar;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    private final zzak zzk(InterfaceC1084d interfaceC1084d, C1083c c1083c, Object obj, boolean z7) {
        long zzi = zzi(interfaceC1084d, obj);
        if (z7 && zzi == 0) {
            return this;
        }
        zzn((zzh(c1083c) << 3) | 2);
        zzo(zzi);
        interfaceC1084d.encode(obj, this);
        return this;
    }

    private final zzak zzl(InterfaceC1086f interfaceC1086f, C1083c c1083c, Object obj, boolean z7) {
        this.zzi.zza(c1083c, z7);
        interfaceC1086f.encode(obj, this.zzi);
        return this;
    }

    private static ByteBuffer zzm(int i7) {
        return ByteBuffer.allocate(i7).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void zzn(int i7) {
        while ((i7 & (-128)) != 0) {
            this.zze.write((i7 & 127) | RecognitionOptions.ITF);
            i7 >>>= 7;
        }
        this.zze.write(i7 & 127);
    }

    private final void zzo(long j) {
        while (((-128) & j) != 0) {
            this.zze.write((((int) j) & 127) | RecognitionOptions.ITF);
            j >>>= 7;
        }
        this.zze.write(((int) j) & 127);
    }

    public final InterfaceC1085e add(C1083c c1083c, double d7) {
        zza(c1083c, d7, true);
        return this;
    }

    public final InterfaceC1085e inline(Object obj) {
        zzf(obj);
        return this;
    }

    public final InterfaceC1085e nested(C1083c c1083c) {
        throw new RuntimeException("nested() is not implemented for protobuf encoding.");
    }

    public final InterfaceC1085e zza(C1083c c1083c, double d7, boolean z7) {
        if (z7 && d7 == 0.0d) {
            return this;
        }
        zzn((zzh(c1083c) << 3) | 1);
        this.zze.write(zzm(8).putDouble(d7).array());
        return this;
    }

    public final InterfaceC1085e zzb(C1083c c1083c, float f, boolean z7) {
        if (z7 && f == 0.0f) {
            return this;
        }
        zzn((zzh(c1083c) << 3) | 5);
        this.zze.write(zzm(4).putFloat(f).array());
        return this;
    }

    public final InterfaceC1085e zzc(C1083c c1083c, Object obj, boolean z7) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z7 && charSequence.length() == 0) {
                return this;
            }
            zzn((zzh(c1083c) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(zza);
            zzn(bytes.length);
            this.zze.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                zzc(c1083c, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                zzk(zzd, c1083c, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            zza(c1083c, ((Double) obj).doubleValue(), z7);
            return this;
        } else if (obj instanceof Float) {
            zzb(c1083c, ((Float) obj).floatValue(), z7);
            return this;
        } else if (obj instanceof Number) {
            zze(c1083c, ((Number) obj).longValue(), z7);
            return this;
        } else if (obj instanceof Boolean) {
            zzd(c1083c, ((Boolean) obj).booleanValue() ? 1 : 0, z7);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z7 && bArr.length == 0) {
                return this;
            }
            zzn((zzh(c1083c) << 3) | 2);
            zzn(bArr.length);
            this.zze.write(bArr);
            return this;
        } else {
            InterfaceC1084d interfaceC1084d = (InterfaceC1084d) this.zzf.get(obj.getClass());
            if (interfaceC1084d != null) {
                zzk(interfaceC1084d, c1083c, obj, z7);
                return this;
            }
            InterfaceC1086f interfaceC1086f = (InterfaceC1086f) this.zzg.get(obj.getClass());
            if (interfaceC1086f != null) {
                zzl(interfaceC1086f, c1083c, obj, z7);
                return this;
            } else if (obj instanceof zzag) {
                zzd(c1083c, ((zzag) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                zzd(c1083c, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                zzk(this.zzh, c1083c, obj, z7);
                return this;
            }
        }
    }

    public final zzak zzd(C1083c c1083c, int i7, boolean z7) {
        if (z7 && i7 == 0) {
            return this;
        }
        zzai zzj = zzj(c1083c);
        zzah zzahVar = zzah.DEFAULT;
        int ordinal = zzj.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    zzn((zzj.zza() << 3) | 5);
                    this.zze.write(zzm(4).putInt(i7).array());
                }
            } else {
                zzn(zzj.zza() << 3);
                zzn((i7 + i7) ^ (i7 >> 31));
            }
        } else {
            zzn(zzj.zza() << 3);
            zzn(i7);
        }
        return this;
    }

    public final zzak zze(C1083c c1083c, long j, boolean z7) {
        if (z7 && j == 0) {
            return this;
        }
        zzai zzj = zzj(c1083c);
        zzah zzahVar = zzah.DEFAULT;
        int ordinal = zzj.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    zzn((zzj.zza() << 3) | 1);
                    this.zze.write(zzm(8).putLong(j).array());
                }
            } else {
                zzn(zzj.zza() << 3);
                zzo((j >> 63) ^ (j + j));
            }
        } else {
            zzn(zzj.zza() << 3);
            zzo(j);
        }
        return this;
    }

    public final zzak zzf(Object obj) {
        if (obj == null) {
            return this;
        }
        InterfaceC1084d interfaceC1084d = (InterfaceC1084d) this.zzf.get(obj.getClass());
        if (interfaceC1084d != null) {
            interfaceC1084d.encode(obj, this);
            return this;
        }
        throw new RuntimeException("No encoder for ".concat(String.valueOf(obj.getClass())));
    }

    public final InterfaceC1085e add(C1083c c1083c, float f) {
        zzb(c1083c, f, true);
        return this;
    }

    public final /* synthetic */ InterfaceC1085e add(C1083c c1083c, int i7) {
        zzd(c1083c, i7, true);
        return this;
    }

    @Override // h4.InterfaceC1085e
    public final /* synthetic */ InterfaceC1085e add(C1083c c1083c, long j) {
        zze(c1083c, j, true);
        return this;
    }

    public final InterfaceC1085e nested(String str) {
        return nested(C1083c.c(str));
    }

    @Override // h4.InterfaceC1085e
    public final InterfaceC1085e add(C1083c c1083c, Object obj) {
        zzc(c1083c, obj, true);
        return this;
    }

    public final /* synthetic */ InterfaceC1085e add(C1083c c1083c, boolean z7) {
        zzd(c1083c, z7 ? 1 : 0, true);
        return this;
    }

    public final InterfaceC1085e add(String str, double d7) {
        zza(C1083c.c(str), d7, true);
        return this;
    }

    public final InterfaceC1085e add(String str, int i7) {
        zzd(C1083c.c(str), i7, true);
        return this;
    }

    public final InterfaceC1085e add(String str, long j) {
        zze(C1083c.c(str), j, true);
        return this;
    }

    public final InterfaceC1085e add(String str, Object obj) {
        zzc(C1083c.c(str), obj, true);
        return this;
    }

    public final InterfaceC1085e add(String str, boolean z7) {
        zzd(C1083c.c(str), z7 ? 1 : 0, true);
        return this;
    }
}
