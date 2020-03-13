## 线性布局
### 主要代码
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="vertical"
    android:padding="5dp">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <LinearLayout
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:orientation="vertical">

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginRight="5dp"
                android:background="@drawable/border"
                android:padding="5dp"
                android:text="One,One"
                android:textAlignment="center" />

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginRight="5dp"
                android:layout_marginTop="5dp"
                android:background="@drawable/border"
                android:padding="5dp"
                android:text="Two,One"
                android:textAlignment="center" />
        </LinearLayout>

        <LinearLayout
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:orientation="vertical">

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginRight="5dp"
                android:layout_weight="1"
                android:background="@drawable/border"
                android:padding="5dp"
                android:text="One,Two"
                android:textAlignment="center" />

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginRight="5dp"
                android:layout_marginTop="5dp"
                android:layout_weight="1"
                android:background="@drawable/border"
                android:padding="5dp"
                android:text="Two,Two"
                android:textAlignment="center" />
        </LinearLayout>

        <LinearLayout
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:orientation="vertical">

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginRight="5dp"
                android:background="@drawable/border"
                android:padding="5dp"
                android:text="One,Three"
                android:textAlignment="center" />

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginRight="5dp"
                android:layout_marginTop="5dp"
                android:background="@drawable/border"
                android:padding="5dp"
                android:text="Two,Three"
                android:textAlignment="center" />

        </LinearLayout>

        <LinearLayout
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:orientation="vertical">

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:background="@drawable/border"
                android:padding="5dp"
                android:text="One,Four"
                android:textAlignment="center" />

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginTop="5dp"
                android:background="@drawable/border"
                android:padding="5dp"
                android:text="Two,Four"
                android:textAlignment="center" />
        </LinearLayout>

    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">
        <TextView
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:layout_marginRight="5dp"
            android:layout_marginTop="5dp"
            android:background="@drawable/border"
            android:padding="5dp"
            android:text="Three,One"
            android:textAlignment="center" />
        <TextView
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:layout_marginRight="5dp"
            android:layout_marginTop="5dp"
            android:background="@drawable/border"
            android:padding="5dp"
            android:text="Three,Two"
            android:textAlignment="center" />
        <TextView
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:layout_marginRight="5dp"
            android:layout_marginTop="5dp"
            android:background="@drawable/border"
            android:padding="5dp"
            android:text="Three,Three"
            android:textAlignment="center" />
        <TextView
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:layout_marginTop="5dp"
            android:background="@drawable/border"
            android:padding="5dp"
            android:text="Three,Four"
            android:textAlignment="center" />
    </LinearLayout>
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:layout_marginTop="5dp">
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginRight="5dp"
            android:background="@drawable/border"
            android:padding="5dp"
            android:text="Four,One"
            android:textAlignment="center" />
        <TextView
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:layout_marginRight="5dp"
            android:background="@drawable/border"
            android:padding="5dp"
            android:text="Four,Two"
            android:textAlignment="center" />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginRight="5dp"
            android:background="@drawable/border"
            android:padding="5dp"
            android:text="Four,Three"
            android:textAlignment="center" />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="@drawable/border"
            android:padding="5dp"
            android:text="Four,Four"
            android:textAlignment="center" />
    </LinearLayout>
</LinearLayout>

```
### 代码详解
前两行利用水平布局嵌套垂直布局实现，后面两行为水平布局，主要利用权重的设置实现。另外对于边框的设计如下：
```
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android" >
    <stroke
        android:width="0.1dp"
        android:color="#FFFFFF" />
</shape>
```
###实验结果
![img1](D:\AntroidStudio\screenshots\lab1/1.png)
