package K5;
/* loaded from: classes.dex */
public enum h {
    PORTRAIT_UP("DeviceOrientation.portraitUp"),
    PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
    LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
    LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");
    
    private String encodedName;

    h(String str) {
        this.encodedName = str;
    }

    public static h a(String str) {
        h[] values;
        for (h hVar : values()) {
            if (hVar.encodedName.equals(str)) {
                return hVar;
            }
        }
        throw new NoSuchFieldException(io.flutter.plugins.pathprovider.b.h("No such DeviceOrientation: ", str));
    }
}
