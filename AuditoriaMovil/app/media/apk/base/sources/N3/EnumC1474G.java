package n3;
/* renamed from: n3.G  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1474G implements InterfaceC1486a {
    RS256(-257),
    RS384(-258),
    RS512(-259),
    LEGACY_RS1(-262),
    PS256(-37),
    PS384(-38),
    PS512(-39),
    RS1(-65535);
    
    private final int zzb;

    EnumC1474G(int i7) {
        this.zzb = i7;
    }

    @Override // n3.InterfaceC1486a
    public final int a() {
        return this.zzb;
    }
}
