package K5;
/* loaded from: classes.dex */
public enum j {
    CLICK("SystemSoundType.click"),
    ALERT("SystemSoundType.alert");
    
    private final String encodedName;

    j(String str) {
        this.encodedName = str;
    }

    public static j a(String str) {
        j[] values;
        for (j jVar : values()) {
            if (jVar.encodedName.equals(str)) {
                return jVar;
            }
        }
        throw new NoSuchFieldException(io.flutter.plugins.pathprovider.b.h("No such SoundType: ", str));
    }
}
