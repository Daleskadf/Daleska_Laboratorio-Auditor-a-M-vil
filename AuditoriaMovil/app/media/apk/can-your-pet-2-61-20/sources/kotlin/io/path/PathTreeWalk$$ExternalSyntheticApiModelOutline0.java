package kotlin.io.path;

import android.app.Notification;
import android.content.Context;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystemLoopException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Comparator;
import java.util.PriorityQueue;
/* compiled from: D8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class PathTreeWalk$$ExternalSyntheticApiModelOutline0 {
    public static /* synthetic */ Notification.Builder m(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Class m1638m() {
        return BasicFileAttributes.class;
    }

    public static /* bridge */ /* synthetic */ DirectoryStream m(Object obj) {
        return (DirectoryStream) obj;
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ FileSystemException m1642m(Object obj) {
        return (FileSystemException) obj;
    }

    public static /* synthetic */ FileSystemException m(String str) {
        return new FileSystemException(str);
    }

    public static /* synthetic */ FileSystemException m(String str, String str2, String str3) {
        return new FileSystemException(str, str2, str3);
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* synthetic */ FileSystemLoopException m1643m(String str) {
        return new FileSystemLoopException(str);
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ FileVisitResult m1646m(Object obj) {
        return (FileVisitResult) obj;
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ FileVisitor m1647m(Object obj) {
        return (FileVisitor) obj;
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* synthetic */ NoSuchFileException m1649m(String str, String str2, String str3) {
        return new NoSuchFileException(str, str2, str3);
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Path m1650m(Object obj) {
        return (Path) obj;
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ SecureDirectoryStream m1653m(Object obj) {
        return (SecureDirectoryStream) obj;
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ BasicFileAttributeView m1656m(Object obj) {
        return (BasicFileAttributeView) obj;
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ BasicFileAttributes m1657m(Object obj) {
        return (BasicFileAttributes) obj;
    }

    public static /* synthetic */ PriorityQueue m(Comparator comparator) {
        return new PriorityQueue(comparator);
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* synthetic */ void m1661m() {
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ boolean m1662m(Object obj) {
        return obj instanceof SecureDirectoryStream;
    }

    public static /* bridge */ /* synthetic */ Class m$1() {
        return BasicFileAttributeView.class;
    }

    /* renamed from: m$1  reason: collision with other method in class */
    public static /* synthetic */ void m1670m$1() {
    }

    /* renamed from: m$2  reason: collision with other method in class */
    public static /* synthetic */ void m1673m$2() {
    }

    public static /* synthetic */ void m$3() {
    }

    public static /* synthetic */ void m$4() {
    }
}
