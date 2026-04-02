package K4;
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final int f2662a;

    static {
        int i7;
        String property = System.getProperty("java.version");
        try {
            String[] split = property.split("[._]", 3);
            i7 = Integer.parseInt(split[0]);
            if (i7 == 1 && split.length > 1) {
                i7 = Integer.parseInt(split[1]);
            }
        } catch (NumberFormatException unused) {
            i7 = -1;
        }
        if (i7 == -1) {
            try {
                StringBuilder sb = new StringBuilder();
                for (int i8 = 0; i8 < property.length(); i8++) {
                    char charAt = property.charAt(i8);
                    if (!Character.isDigit(charAt)) {
                        break;
                    }
                    sb.append(charAt);
                }
                i7 = Integer.parseInt(sb.toString());
            } catch (NumberFormatException unused2) {
                i7 = -1;
            }
        }
        if (i7 == -1) {
            i7 = 6;
        }
        f2662a = i7;
    }
}
