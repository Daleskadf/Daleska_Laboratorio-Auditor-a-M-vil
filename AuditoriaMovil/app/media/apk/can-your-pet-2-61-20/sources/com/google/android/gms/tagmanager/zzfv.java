package com.google.android.gms.tagmanager;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
public final class zzfv extends zzfs {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzaJ.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.zzm.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.zzaU.toString();
    private static final String zzd = com.google.android.gms.internal.gtm.zzb.zzaN.toString();
    private static final String zze = com.google.android.gms.internal.gtm.zzb.zzaM.toString();
    private static final String zzf = com.google.android.gms.internal.gtm.zzb.zzl.toString();
    private static final String zzg = com.google.android.gms.internal.gtm.zzb.zzdI.toString();
    private static final String zzh = com.google.android.gms.internal.gtm.zzb.zzdL.toString();
    private static final String zzi = com.google.android.gms.internal.gtm.zzb.zzdN.toString();
    private static final List zzj = Arrays.asList("detail", "checkout", "checkout_option", "click", "add", "remove", FirebaseAnalytics.Event.PURCHASE, FirebaseAnalytics.Event.REFUND);
    private static final Pattern zzk = Pattern.compile("dimension(\\d+)");
    private static final Pattern zzl = Pattern.compile("metric(\\d+)");
    private static Map zzm;
    private static Map zzn;
    private final Set zzo;
    private final zzfr zzp;
    private final DataLayer zzq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfv(Context context, DataLayer dataLayer) {
        super(zza, new String[0]);
        zzfr zzfrVar = new zzfr(context);
        this.zzq = dataLayer;
        this.zzp = zzfrVar;
        HashSet hashSet = new HashSet();
        this.zzo = hashSet;
        hashSet.add("");
        hashSet.add("0");
        hashSet.add("false");
    }

    private final String zzd(String str) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    private final Map zzh(com.google.android.gms.internal.gtm.zzam zzamVar) {
        if (zzamVar == null) {
            return new HashMap();
        }
        Map zzm2 = zzm(zzamVar);
        if (zzm2 == null) {
            return new HashMap();
        }
        String str = (String) zzm2.get("&aip");
        if (str != null && this.zzo.contains(str.toLowerCase())) {
            zzm2.remove("&aip");
        }
        return zzm2;
    }

    private static final void zzi(Map map, String str, String str2) {
        if (str2 != null) {
            map.put(str, str2);
        }
    }

    private static final boolean zzj(Map map, String str) {
        com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) map.get(str);
        if (zzamVar == null) {
            return false;
        }
        return zzfu.zzf(zzfu.zzk(zzamVar)).booleanValue();
    }

    private static final Double zzk(Object obj) {
        if (obj instanceof String) {
            try {
                return Double.valueOf((String) obj);
            } catch (NumberFormatException e) {
                throw new RuntimeException("Cannot convert the object to Double: ".concat(String.valueOf(e.getMessage())));
            }
        } else if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        } else {
            if (!(obj instanceof Double)) {
                throw new RuntimeException("Cannot convert the object to Double: ".concat(String.valueOf(obj.toString())));
            }
            return (Double) obj;
        }
    }

    private static final Integer zzl(Object obj) {
        if (obj instanceof String) {
            try {
                return Integer.valueOf((String) obj);
            } catch (NumberFormatException e) {
                throw new RuntimeException("Cannot convert the object to Integer: ".concat(String.valueOf(e.getMessage())));
            }
        } else if (obj instanceof Double) {
            return Integer.valueOf(((Double) obj).intValue());
        } else {
            if (!(obj instanceof Integer)) {
                throw new RuntimeException("Cannot convert the object to Integer: ".concat(String.valueOf(obj.toString())));
            }
            return (Integer) obj;
        }
    }

    private static final Map zzm(com.google.android.gms.internal.gtm.zzam zzamVar) {
        Object zzk2 = zzfu.zzk(zzamVar);
        if (zzk2 instanceof Map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) zzk2).entrySet()) {
                linkedHashMap.put(entry.getKey().toString(), entry.getValue().toString());
            }
            return linkedHashMap;
        }
        return null;
    }

    private static final Product zzn(Map map) {
        Product product = new Product();
        Object obj = map.get("id");
        if (obj != null) {
            product.setId(obj.toString());
        }
        Object obj2 = map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (obj2 != null) {
            product.setName(obj2.toString());
        }
        Object obj3 = map.get("brand");
        if (obj3 != null) {
            product.setBrand(obj3.toString());
        }
        Object obj4 = map.get("category");
        if (obj4 != null) {
            product.setCategory(obj4.toString());
        }
        Object obj5 = map.get("variant");
        if (obj5 != null) {
            product.setVariant(obj5.toString());
        }
        Object obj6 = map.get(FirebaseAnalytics.Param.COUPON);
        if (obj6 != null) {
            product.setCouponCode(obj6.toString());
        }
        Object obj7 = map.get("position");
        if (obj7 != null) {
            product.setPosition(zzl(obj7).intValue());
        }
        Object obj8 = map.get(FirebaseAnalytics.Param.PRICE);
        if (obj8 != null) {
            product.setPrice(zzk(obj8).doubleValue());
        }
        Object obj9 = map.get(FirebaseAnalytics.Param.QUANTITY);
        if (obj9 != null) {
            product.setQuantity(zzl(obj9).intValue());
        }
        for (String str : map.keySet()) {
            Matcher matcher = zzk.matcher(str);
            if (matcher.matches()) {
                try {
                    product.setCustomDimension(Integer.parseInt(matcher.group(1)), String.valueOf(map.get(str)));
                } catch (NumberFormatException unused) {
                    Log.w("GoogleTagManager", "illegal number in custom dimension value: ".concat(String.valueOf(str)));
                }
            } else {
                Matcher matcher2 = zzl.matcher(str);
                if (matcher2.matches()) {
                    try {
                        product.setCustomMetric(Integer.parseInt(matcher2.group(1)), zzl(map.get(str)).intValue());
                    } catch (NumberFormatException unused2) {
                        Log.w("GoogleTagManager", "illegal number in custom metric value: ".concat(String.valueOf(str)));
                    }
                }
            }
        }
        return product;
    }

    @Override // com.google.android.gms.tagmanager.zzfs, com.google.android.gms.tagmanager.zzbt
    public final /* bridge */ /* synthetic */ boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.tagmanager.zzfs
    public final void zzc(Map map) {
        Map map2;
        Map map3;
        Map map4;
        ProductAction productAction;
        Tracker zza2 = this.zzp.zza("_GTM_DEFAULT_TRACKER_");
        zza2.enableAdvertisingIdCollection(zzj(map, "collect_adid"));
        List<Map> list = null;
        if (zzj(map, zzc)) {
            HitBuilders.ScreenViewBuilder screenViewBuilder = new HitBuilders.ScreenViewBuilder();
            Map zzh2 = zzh((com.google.android.gms.internal.gtm.zzam) map.get(zzf));
            screenViewBuilder.setAll(zzh2);
            if (zzj(map, zzd)) {
                Object obj = this.zzq.get("ecommerce");
                if (obj instanceof Map) {
                    map4 = (Map) obj;
                }
                map4 = null;
            } else {
                Object zzk2 = zzfu.zzk((com.google.android.gms.internal.gtm.zzam) map.get(zze));
                if (zzk2 instanceof Map) {
                    map4 = (Map) zzk2;
                }
                map4 = null;
            }
            if (map4 != null) {
                String str = (String) zzh2.get("&cu");
                if (str == null) {
                    str = (String) map4.get("currencyCode");
                }
                if (str != null) {
                    screenViewBuilder.set("&cu", str);
                }
                Object obj2 = map4.get("impressions");
                if (obj2 instanceof List) {
                    for (Map map5 : (List) obj2) {
                        try {
                            screenViewBuilder.addImpression(zzn(map5), (String) map5.get("list"));
                        } catch (RuntimeException e) {
                            Log.e("GoogleTagManager", "Failed to extract a product from DataLayer. ".concat(String.valueOf(e.getMessage())));
                        }
                    }
                }
                if (map4.containsKey("promoClick")) {
                    list = (List) ((Map) map4.get("promoClick")).get("promotions");
                } else if (map4.containsKey("promoView")) {
                    list = (List) ((Map) map4.get("promoView")).get("promotions");
                }
                if (list != null) {
                    for (Map map6 : list) {
                        try {
                            Promotion promotion = new Promotion();
                            String str2 = (String) map6.get("id");
                            if (str2 != null) {
                                promotion.setId(str2);
                            }
                            String str3 = (String) map6.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
                            if (str3 != null) {
                                promotion.setName(str3);
                            }
                            String str4 = (String) map6.get("creative");
                            if (str4 != null) {
                                promotion.setCreative(str4);
                            }
                            String str5 = (String) map6.get("position");
                            if (str5 != null) {
                                promotion.setPosition(str5);
                            }
                            screenViewBuilder.addPromotion(promotion);
                        } catch (RuntimeException e2) {
                            Log.e("GoogleTagManager", "Failed to extract a promotion from DataLayer. ".concat(String.valueOf(e2.getMessage())));
                        }
                    }
                    if (map4.containsKey("promoClick")) {
                        screenViewBuilder.set("&promoa", "click");
                    } else {
                        screenViewBuilder.set("&promoa", "view");
                    }
                }
                Iterator it = zzj.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str6 = (String) it.next();
                    if (map4.containsKey(str6)) {
                        Map map7 = (Map) map4.get(str6);
                        List<Map> list2 = (List) map7.get("products");
                        if (list2 != null) {
                            for (Map map8 : list2) {
                                try {
                                    screenViewBuilder.addProduct(zzn(map8));
                                } catch (RuntimeException e3) {
                                    Log.e("GoogleTagManager", "Failed to extract a product from DataLayer. ".concat(String.valueOf(e3.getMessage())));
                                }
                            }
                        }
                        try {
                            if (map7.containsKey("actionField")) {
                                Map map9 = (Map) map7.get("actionField");
                                productAction = new ProductAction(str6);
                                Object obj3 = map9.get("id");
                                if (obj3 != null) {
                                    productAction.setTransactionId(obj3.toString());
                                }
                                Object obj4 = map9.get(FirebaseAnalytics.Param.AFFILIATION);
                                if (obj4 != null) {
                                    productAction.setTransactionAffiliation(obj4.toString());
                                }
                                Object obj5 = map9.get(FirebaseAnalytics.Param.COUPON);
                                if (obj5 != null) {
                                    productAction.setTransactionCouponCode(obj5.toString());
                                }
                                Object obj6 = map9.get("list");
                                if (obj6 != null) {
                                    productAction.setProductActionList(obj6.toString());
                                }
                                Object obj7 = map9.get("option");
                                if (obj7 != null) {
                                    productAction.setCheckoutOptions(obj7.toString());
                                }
                                Object obj8 = map9.get("revenue");
                                if (obj8 != null) {
                                    productAction.setTransactionRevenue(zzk(obj8).doubleValue());
                                }
                                Object obj9 = map9.get(FirebaseAnalytics.Param.TAX);
                                if (obj9 != null) {
                                    productAction.setTransactionTax(zzk(obj9).doubleValue());
                                }
                                Object obj10 = map9.get(FirebaseAnalytics.Param.SHIPPING);
                                if (obj10 != null) {
                                    productAction.setTransactionShipping(zzk(obj10).doubleValue());
                                }
                                Object obj11 = map9.get("step");
                                if (obj11 != null) {
                                    productAction.setCheckoutStep(zzl(obj11).intValue());
                                }
                            } else {
                                productAction = new ProductAction(str6);
                            }
                            screenViewBuilder.setProductAction(productAction);
                        } catch (RuntimeException e4) {
                            Log.e("GoogleTagManager", "Failed to extract a product action from DataLayer. ".concat(String.valueOf(e4.getMessage())));
                        }
                    }
                }
            }
            zza2.send(screenViewBuilder.build());
        } else if (zzj(map, zzb)) {
            zza2.send(zzh((com.google.android.gms.internal.gtm.zzam) map.get(zzf)));
        } else if (zzj(map, zzg)) {
            String zzd2 = zzd("transactionId");
            if (zzd2 == null) {
                Log.e("GoogleTagManager", "Cannot find transactionId in data layer.");
                return;
            }
            ArrayList<Map> arrayList = new ArrayList();
            try {
                Map zzh3 = zzh((com.google.android.gms.internal.gtm.zzam) map.get(zzf));
                zzh3.put("&t", "transaction");
                com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) map.get(zzh);
                if (zzamVar != null) {
                    map2 = zzm(zzamVar);
                } else {
                    if (zzm == null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("transactionId", "&ti");
                        hashMap.put("transactionAffiliation", "&ta");
                        hashMap.put("transactionTax", "&tt");
                        hashMap.put("transactionShipping", "&ts");
                        hashMap.put("transactionTotal", "&tr");
                        hashMap.put("transactionCurrency", "&cu");
                        zzm = hashMap;
                    }
                    map2 = zzm;
                }
                for (Map.Entry entry : map2.entrySet()) {
                    zzi(zzh3, (String) entry.getValue(), zzd((String) entry.getKey()));
                }
                arrayList.add(zzh3);
                Object obj12 = this.zzq.get("transactionProducts");
                if (obj12 != null) {
                    if (!(obj12 instanceof List)) {
                        throw new IllegalArgumentException("transactionProducts should be of type List.");
                    }
                    for (Object obj13 : (List) obj12) {
                        if (!(obj13 instanceof Map)) {
                            throw new IllegalArgumentException("Each element of transactionProducts should be of type Map.");
                        }
                    }
                    list = (List) obj12;
                }
                if (list != null) {
                    for (Map map10 : list) {
                        if (map10.get(AppMeasurementSdk.ConditionalUserProperty.NAME) != null) {
                            Map zzh4 = zzh((com.google.android.gms.internal.gtm.zzam) map.get(zzf));
                            zzh4.put("&t", "item");
                            zzh4.put("&ti", zzd2);
                            com.google.android.gms.internal.gtm.zzam zzamVar2 = (com.google.android.gms.internal.gtm.zzam) map.get(zzi);
                            if (zzamVar2 != null) {
                                map3 = zzm(zzamVar2);
                            } else {
                                if (zzn == null) {
                                    HashMap hashMap2 = new HashMap();
                                    hashMap2.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "&in");
                                    hashMap2.put("sku", "&ic");
                                    hashMap2.put("category", "&iv");
                                    hashMap2.put(FirebaseAnalytics.Param.PRICE, "&ip");
                                    hashMap2.put(FirebaseAnalytics.Param.QUANTITY, "&iq");
                                    hashMap2.put(FirebaseAnalytics.Param.CURRENCY, "&cu");
                                    zzn = hashMap2;
                                }
                                map3 = zzn;
                            }
                            for (Map.Entry entry2 : map3.entrySet()) {
                                zzi(zzh4, (String) entry2.getValue(), (String) map10.get(entry2.getKey()));
                            }
                            arrayList.add(zzh4);
                        } else {
                            Log.e("GoogleTagManager", "Unable to send transaction item hit due to missing 'name' field.");
                            return;
                        }
                    }
                }
                for (Map map11 : arrayList) {
                    zza2.send(map11);
                }
            } catch (IllegalArgumentException e5) {
                Log.e("GoogleTagManager", "Unable to send transaction", e5);
            }
        } else {
            Log.w("GoogleTagManager", "Ignoring unknown tag.");
        }
    }
}
