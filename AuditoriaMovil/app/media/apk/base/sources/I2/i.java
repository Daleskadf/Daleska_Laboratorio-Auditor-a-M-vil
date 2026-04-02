package i2;

import E6.m;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public abstract class i {
    public static String b(Object value, String str) {
        kotlin.jvm.internal.j.e(value, "value");
        return str + " value: " + value;
    }

    public static l c(String str) {
        String group;
        String description;
        if (str != null && !m.U(str)) {
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
            if (matcher.matches() && (group = matcher.group(1)) != null) {
                int parseInt = Integer.parseInt(group);
                String group2 = matcher.group(2);
                if (group2 != null) {
                    int parseInt2 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    if (group3 != null) {
                        int parseInt3 = Integer.parseInt(group3);
                        if (matcher.group(4) != null) {
                            description = matcher.group(4);
                        } else {
                            description = StringUtils.EMPTY;
                        }
                        kotlin.jvm.internal.j.d(description, "description");
                        return new l(parseInt, parseInt2, parseInt3, description);
                    }
                }
            }
        }
        return null;
    }

    public abstract Object a();

    public abstract i d(String str, w6.l lVar);
}
