package n3;
/* renamed from: n3.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1504s implements InterfaceC1486a {
    ED256(-260),
    ED512(-261),
    ED25519(-8),
    ES256(-7),
    ECDH_HKDF_256(-25),
    ES384(-35),
    ES512(-36);
    
    private final int zzb;

    EnumC1504s(int i7) {
        this.zzb = i7;
    }

    @Override // n3.InterfaceC1486a
    public final int a() {
        return this.zzb;
    }
}
