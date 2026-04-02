package r5;

import B5.AbstractActivityC0032e;
import D.AbstractC0059i;
import E6.m;
import F6.D;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import android.provider.DocumentsContract;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l6.j;
import m6.AbstractC1447h;
import o6.EnumC1565a;
import org.apache.tika.metadata.TikaCoreProperties;
import p6.i;
import w6.p;
/* loaded from: classes.dex */
public final class e extends i implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Intent f15536a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f15537b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0032e f15538c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f15539d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f15540e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Intent intent, b bVar, AbstractActivityC0032e abstractActivityC0032e, int i7, boolean z7, String str, n6.d dVar) {
        super(2, dVar);
        this.f15536a = intent;
        this.f15537b = bVar;
        this.f15538c = abstractActivityC0032e;
        this.f15539d = i7;
        this.f15540e = z7;
        this.f = str;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        String str = this.f;
        return new e(this.f15536a, this.f15537b, this.f15538c, this.f15539d, this.f15540e, str, dVar);
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        j jVar = j.f13876a;
        ((e) create((D) obj, (n6.d) obj2)).invokeSuspend(jVar);
        return jVar;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        ArrayList parcelableArrayList;
        String str;
        List list;
        String separator;
        String str2;
        List list2;
        char c8;
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        org.slf4j.helpers.i.M(obj);
        j jVar = j.f13876a;
        b bVar = this.f15537b;
        Intent intent = this.f15536a;
        if (intent == null) {
            bVar.b("unknown_activity", "Unknown activity error, please fill an issue.");
            return jVar;
        }
        ArrayList arrayList = new ArrayList();
        ClipData clipData = intent.getClipData();
        int i7 = this.f15539d;
        boolean z7 = this.f15540e;
        AbstractActivityC0032e con = this.f15538c;
        if (clipData != null) {
            ClipData clipData2 = intent.getClipData();
            kotlin.jvm.internal.j.b(clipData2);
            int itemCount = clipData2.getItemCount();
            for (int i8 = 0; i8 < itemCount; i8++) {
                ClipData clipData3 = intent.getClipData();
                kotlin.jvm.internal.j.b(clipData3);
                Uri uri = clipData3.getItemAt(i8).getUri();
                kotlin.jvm.internal.j.d(uri, "uri");
                f.a(con, f.b(con, uri, i7), z7, arrayList);
            }
            bVar.c(arrayList);
        } else if (intent.getData() != null) {
            Uri data = intent.getData();
            kotlin.jvm.internal.j.b(data);
            Uri b5 = f.b(con, data, i7);
            if (this.f.equals("dir")) {
                Uri buildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(b5, DocumentsContract.getTreeDocumentId(b5));
                kotlin.jvm.internal.j.d(buildDocumentUriUsingTree, "buildDocumentUriUsingTre…                        )");
                kotlin.jvm.internal.j.e(con, "con");
                int i9 = Build.VERSION.SDK_INT;
                Collection collection = m6.p.f14074a;
                if (i9 < 30 && kotlin.jvm.internal.j.a(buildDocumentUriUsingTree.getAuthority(), "com.android.providers.downloads.documents")) {
                    String docId = DocumentsContract.getDocumentId(buildDocumentUriUsingTree);
                    str2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
                    if (!kotlin.jvm.internal.j.a(docId, "downloads")) {
                        kotlin.jvm.internal.j.d(docId, "docId");
                        Pattern compile = Pattern.compile("^ms[df]:.*");
                        kotlin.jvm.internal.j.d(compile, "compile(...)");
                        if (compile.matcher(docId).matches()) {
                            str2 = str2 + '/' + f.f(buildDocumentUriUsingTree, con);
                        } else if (m.e0(docId, "raw:")) {
                            Pattern compile2 = Pattern.compile(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                            kotlin.jvm.internal.j.d(compile2, "compile(...)");
                            m.a0(0);
                            Matcher matcher = compile2.matcher(docId);
                            if (!matcher.find()) {
                                list2 = G.i.A(docId.toString());
                            } else {
                                ArrayList arrayList2 = new ArrayList(10);
                                int i10 = 0;
                                do {
                                    arrayList2.add(docId.subSequence(i10, matcher.start()).toString());
                                    i10 = matcher.end();
                                } while (matcher.find());
                                arrayList2.add(docId.subSequence(i10, docId.length()).toString());
                                list2 = arrayList2;
                            }
                            if (!list2.isEmpty()) {
                                ListIterator listIterator = list2.listIterator(list2.size());
                                while (listIterator.hasPrevious()) {
                                    if (((String) listIterator.previous()).length() != 0) {
                                        c8 = 1;
                                        collection = AbstractC1447h.U(listIterator.nextIndex() + 1, list2);
                                        break;
                                    }
                                }
                            }
                            c8 = 1;
                            str2 = ((String[]) collection.toArray(new String[0]))[c8];
                        } else {
                            str2 = null;
                        }
                    }
                } else {
                    String docId2 = DocumentsContract.getTreeDocumentId(buildDocumentUriUsingTree);
                    kotlin.jvm.internal.j.d(docId2, "docId");
                    List d02 = m.d0(docId2, new String[]{TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER});
                    if (d02.size() > 1) {
                        String str3 = (String) d02.get(0);
                        String str4 = (String) d02.get(1);
                        if ("primary".equalsIgnoreCase(str3)) {
                            str = Environment.getExternalStorageDirectory() + '/' + str4;
                        } else {
                            str = "/storage/" + str3 + '/' + str4;
                        }
                    } else {
                        str = Environment.getExternalStorageDirectory() + '/' + ((String) AbstractC1447h.S(d02));
                    }
                    String separator2 = File.separator;
                    kotlin.jvm.internal.j.d(separator2, "separator");
                    if (m.O(str, separator2, false)) {
                        str = str.substring(0, str.length() - 1);
                        kotlin.jvm.internal.j.d(str, "substring(...)");
                    }
                    String docId3 = DocumentsContract.getTreeDocumentId(buildDocumentUriUsingTree);
                    kotlin.jvm.internal.j.d(docId3, "docId");
                    Pattern compile3 = Pattern.compile(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                    kotlin.jvm.internal.j.d(compile3, "compile(...)");
                    m.a0(0);
                    Matcher matcher2 = compile3.matcher(docId3);
                    if (!matcher2.find()) {
                        list = G.i.A(docId3.toString());
                    } else {
                        ArrayList arrayList3 = new ArrayList(10);
                        int i11 = 0;
                        do {
                            arrayList3.add(docId3.subSequence(i11, matcher2.start()).toString());
                            i11 = matcher2.end();
                        } while (matcher2.find());
                        arrayList3.add(docId3.subSequence(i11, docId3.length()).toString());
                        list = arrayList3;
                    }
                    if (!list.isEmpty()) {
                        ListIterator listIterator2 = list.listIterator(list.size());
                        while (true) {
                            if (listIterator2.hasPrevious()) {
                                if (((String) listIterator2.previous()).length() != 0) {
                                    collection = AbstractC1447h.U(listIterator2.nextIndex() + 1, list);
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    String[] strArr = (String[]) collection.toArray(new String[0]);
                    if (strArr.length >= 2) {
                        separator = strArr[1];
                    } else {
                        separator = File.separator;
                        kotlin.jvm.internal.j.d(separator, "separator");
                    }
                    String separator3 = File.separator;
                    kotlin.jvm.internal.j.d(separator3, "separator");
                    if (m.O(separator, separator3, false)) {
                        separator = separator.substring(0, separator.length() - 1);
                        kotlin.jvm.internal.j.d(separator, "substring(...)");
                    }
                    if (separator.length() > 0 && !m.O(str, separator, false)) {
                        if (m.e0(separator, separator3)) {
                            str = str.concat(separator);
                        } else {
                            str = AbstractC0059i.A(str, separator3, separator);
                        }
                    }
                    str2 = str;
                }
                if (str2 != null) {
                    bVar.c(str2);
                } else {
                    bVar.b("unknown_path", "Failed to retrieve directory path.");
                }
            } else {
                f.a(con, b5, z7, arrayList);
                if (!arrayList.isEmpty()) {
                    bVar.c(arrayList);
                } else {
                    bVar.b("unknown_path", "Failed to retrieve path.");
                }
            }
        } else {
            Bundle extras = intent.getExtras();
            if (extras != null && extras.containsKey("selectedItems")) {
                Bundle extras2 = intent.getExtras();
                kotlin.jvm.internal.j.b(extras2);
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableArrayList = extras2.getParcelableArrayList("selectedItems", Parcelable.class);
                } else {
                    parcelableArrayList = extras2.getParcelableArrayList("selectedItems");
                }
                if (parcelableArrayList != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj2 : parcelableArrayList) {
                        if (obj2 instanceof Uri) {
                            arrayList4.add(obj2);
                        }
                    }
                    Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        f.a(con, (Uri) it.next(), z7, arrayList);
                    }
                }
                bVar.c(arrayList);
            } else {
                bVar.b("unknown_activity", "Unknown activity error, please fill an issue.");
            }
        }
        return jVar;
    }
}
