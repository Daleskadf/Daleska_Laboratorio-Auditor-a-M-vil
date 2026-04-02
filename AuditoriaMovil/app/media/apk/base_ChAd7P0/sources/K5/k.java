package K5;
/* loaded from: classes.dex */
public enum k {
    LEAN_BACK("SystemUiMode.leanBack"),
    IMMERSIVE("SystemUiMode.immersive"),
    IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
    EDGE_TO_EDGE("SystemUiMode.edgeToEdge");
    
    private String encodedName;

    k(String str) {
        this.encodedName = str;
    }

    public static k a(String str) {
        k[] values;
        for (k kVar : values()) {
            if (kVar.encodedName.equals(str)) {
                return kVar;
            }
        }
        throw new NoSuchFieldException(io.flutter.plugins.pathprovider.b.h("No such SystemUiMode: ", str));
    }
}
