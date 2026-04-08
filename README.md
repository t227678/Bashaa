<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="20dp">

    <Button
        android:id="@+id/pickImageButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="اختر صورة فاتورة" />

    <ImageView
        android:id="@+id/imageView"
        android:layout_width="match_parent"
        android:layout_height="300dp"
        android:scaleType="centerInside" />

    <TextView
        android:id="@+id/resultTextView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="النص المستخرج يعرض هنا"
        android:padding="12dp" />
</LinearLayout>
