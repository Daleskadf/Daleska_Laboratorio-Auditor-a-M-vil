package com.distriqt.core.utils;

import java.lang.reflect.Field;
/* loaded from: classes.dex */
public class Resources {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a4, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
        return r6.getInt(java.lang.Class.forName(r5 + ".R").getClasses()[r2]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0063, code lost:
        if (java.lang.Class.forName(r5 + ".R").getClasses()[r2] == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0065, code lost:
        r6 = java.lang.Class.forName(r5 + ".R").getClasses()[r2].getField(r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getResourceIdByName(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String r0 = ".R"
            r1 = 0
            r2 = 0
        L4:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La4
            r3.<init>()     // Catch: java.lang.Exception -> La4
            r3.append(r5)     // Catch: java.lang.Exception -> La4
            r3.append(r0)     // Catch: java.lang.Exception -> La4
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> La4
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Exception -> La4
            java.lang.Class[] r3 = r3.getClasses()     // Catch: java.lang.Exception -> La4
            int r3 = r3.length     // Catch: java.lang.Exception -> La4
            if (r2 >= r3) goto La4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La4
            r3.<init>()     // Catch: java.lang.Exception -> La4
            r3.append(r5)     // Catch: java.lang.Exception -> La4
            r3.append(r0)     // Catch: java.lang.Exception -> La4
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> La4
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Exception -> La4
            java.lang.Class[] r3 = r3.getClasses()     // Catch: java.lang.Exception -> La4
            r3 = r3[r2]     // Catch: java.lang.Exception -> La4
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> La4
            java.lang.String r4 = "\\$"
            java.lang.String[] r3 = r3.split(r4)     // Catch: java.lang.Exception -> La4
            r4 = 1
            r3 = r3[r4]     // Catch: java.lang.Exception -> La4
            boolean r3 = r3.equals(r6)     // Catch: java.lang.Exception -> La4
            if (r3 == 0) goto La0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La4
            r6.<init>()     // Catch: java.lang.Exception -> La4
            r6.append(r5)     // Catch: java.lang.Exception -> La4
            r6.append(r0)     // Catch: java.lang.Exception -> La4
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> La4
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Exception -> La4
            java.lang.Class[] r6 = r6.getClasses()     // Catch: java.lang.Exception -> La4
            r6 = r6[r2]     // Catch: java.lang.Exception -> La4
            if (r6 == 0) goto La4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La4
            r6.<init>()     // Catch: java.lang.Exception -> La4
            r6.append(r5)     // Catch: java.lang.Exception -> La4
            r6.append(r0)     // Catch: java.lang.Exception -> La4
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> La4
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Exception -> La4
            java.lang.Class[] r6 = r6.getClasses()     // Catch: java.lang.Exception -> La4
            r6 = r6[r2]     // Catch: java.lang.Exception -> La4
            java.lang.reflect.Field r6 = r6.getField(r7)     // Catch: java.lang.Exception -> La4
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La4
            r7.<init>()     // Catch: java.lang.Exception -> La4
            r7.append(r5)     // Catch: java.lang.Exception -> La4
            r7.append(r0)     // Catch: java.lang.Exception -> La4
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Exception -> La4
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Exception -> La4
            java.lang.Class[] r5 = r5.getClasses()     // Catch: java.lang.Exception -> La4
            r5 = r5[r2]     // Catch: java.lang.Exception -> La4
            int r1 = r6.getInt(r5)     // Catch: java.lang.Exception -> La4
            goto La4
        La0:
            int r2 = r2 + 1
            goto L4
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.distriqt.core.utils.Resources.getResourceIdByName(java.lang.String, java.lang.String, java.lang.String):int");
    }

    public static boolean hasResource(String str, String str2, String str3) {
        return getResourceIdByName(str, str2, str3) != 0;
    }

    public static void listResources(String str) {
        int i = 0;
        while (true) {
            try {
                if (i >= Class.forName(str + ".R").getClasses().length) {
                    return;
                }
                for (Field field : Class.forName(str + ".R").getClasses()[i].getFields()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Class.forName(str + ".R").getClasses()[i].getName());
                    sb.append("::");
                    sb.append(field.getName());
                    FREUtils.log("Resources", sb.toString(), new Object[0]);
                }
                i++;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
    }
}
