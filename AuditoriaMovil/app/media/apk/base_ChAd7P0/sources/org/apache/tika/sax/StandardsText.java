package org.apache.tika.sax;

import io.flutter.plugins.pathprovider.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.sax.StandardReference;
/* loaded from: classes.dex */
public class StandardsText {
    private static final String REGEX_APPLICABLE_DOCUMENTS = "(?i:.*APPLICABLE\\sDOCUMENTS|REFERENCE|STANDARD|REQUIREMENT|GUIDELINE|COMPLIANCE.*)";
    private static final String REGEX_FALLBACK = "\\(?(?<mainOrganization>[A-Z]\\w{1,64}+)\\)?((\\s?(?<separator>\\/)\\s?)(\\w{1,64}+\\s)*\\(?(?<secondOrganization>[A-Z]\\w{1,64}+)\\)?)?(\\s(?i:Publication|Standard))?(-|\\s)?(?<identifier>([0-9]{3,64}+|([A-Z]{1,64}+(-|_|\\.)?[0-9]{2,64}+))((-|_|\\.)?[A-Z0-9]{1,64}+){0,64}+)";
    private static final String REGEX_HEADER = "(\\d{1,10}+\\.(\\d{1,10}+\\.?){0,10}+)\\p{Blank}+([A-Z]{1,64}+(\\s[A-Z]{1,64}+){0,256}+){5,10}+";
    private static final String REGEX_IDENTIFIER = "(?<identifier>([0-9]{3,64}+|([A-Z]{1,64}+(-|_|\\.)?[0-9]{2,64}+))((-|_|\\.)?[A-Z0-9]{1,64}+){0,64}+)";
    private static final String REGEX_ORGANIZATION;
    private static final String REGEX_STANDARD;
    private static final String REGEX_STANDARD_TYPE = "(\\s(?i:Publication|Standard))";

    static {
        String organzationsRegex = StandardOrganizations.getOrganzationsRegex();
        REGEX_ORGANIZATION = organzationsRegex;
        REGEX_STANDARD = b.j(".*", organzationsRegex, ".+", organzationsRegex, "?.*");
    }

    public static ArrayList<StandardReference> extractStandardReferences(String str, double d7) {
        return findStandards(str, findHeaders(str), d7);
    }

    private static Map<Integer, String> findHeaders(String str) {
        TreeMap treeMap = new TreeMap();
        Matcher matcher = Pattern.compile(REGEX_HEADER).matcher(str);
        while (matcher.find()) {
            treeMap.put(Integer.valueOf(matcher.start()), matcher.group());
        }
        return treeMap;
    }

    private static ArrayList<StandardReference> findStandards(String str, Map<Integer, String> map, double d7) {
        String group;
        String group2;
        String group3;
        String group4;
        double d8;
        ArrayList<StandardReference> arrayList = new ArrayList<>();
        Matcher matcher = Pattern.compile(REGEX_FALLBACK).matcher(str);
        while (matcher.find()) {
            group = matcher.group("mainOrganization");
            group2 = matcher.group("identifier");
            StandardReference.StandardReferenceBuilder standardReferenceBuilder = new StandardReference.StandardReferenceBuilder(group, group2);
            group3 = matcher.group("separator");
            group4 = matcher.group("secondOrganization");
            StandardReference.StandardReferenceBuilder secondOrganization = standardReferenceBuilder.setSecondOrganization(group3, group4);
            if (matcher.group().matches(REGEX_STANDARD)) {
                d8 = 0.5d;
            } else {
                d8 = 0.25d;
            }
            if (matcher.group().matches(".*(\\s(?i:Publication|Standard)).*")) {
                d8 += 0.25d;
            }
            Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
            boolean z7 = false;
            int i7 = 0;
            int i8 = 0;
            while (it.hasNext() && !z7) {
                int intValue = it.next().getKey().intValue();
                if (intValue > matcher.start()) {
                    z7 = true;
                }
                int i9 = i8;
                i8 = intValue;
                i7 = i9;
            }
            if (map.get(Integer.valueOf(i7)) != null && map.get(Integer.valueOf(i7)).matches(REGEX_APPLICABLE_DOCUMENTS)) {
                d8 += 0.25d;
            }
            secondOrganization.setScore(d8);
            if (d8 >= d7) {
                arrayList.add(secondOrganization.build());
            }
        }
        return arrayList;
    }
}
