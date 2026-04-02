package K5;
/* loaded from: classes.dex */
public enum f {
    LIGHT("Brightness.light"),
    DARK("Brightness.dark");
    
    private String encodedName;

    f(String str) {
        this.encodedName = str;
    }

    public static f a(String str) {
        f[] values;
        for (f fVar : values()) {
            if (fVar.encodedName.equals(str)) {
                return fVar;
            }
        }
        throw new NoSuchFieldException(io.flutter.plugins.pathprovider.b.h("No such Brightness: ", str));
    }
}
