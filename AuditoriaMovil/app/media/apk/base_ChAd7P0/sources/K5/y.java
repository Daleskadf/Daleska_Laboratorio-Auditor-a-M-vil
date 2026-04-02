package K5;
/* loaded from: classes.dex */
public enum y {
    CHARACTERS("TextCapitalization.characters"),
    WORDS("TextCapitalization.words"),
    SENTENCES("TextCapitalization.sentences"),
    NONE("TextCapitalization.none");
    
    private final String encodedName;

    y(String str) {
        this.encodedName = str;
    }

    public static y a(String str) {
        y[] values;
        for (y yVar : values()) {
            if (yVar.encodedName.equals(str)) {
                return yVar;
            }
        }
        throw new NoSuchFieldException(io.flutter.plugins.pathprovider.b.h("No such TextCapitalization: ", str));
    }
}
