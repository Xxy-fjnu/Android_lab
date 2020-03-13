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
### 实验结果
![add image](https://github.com/Xxy-fjnu/Android_lab/blob/master/Lab2_layout/screenshots/1.png)
## 约束布局
### 主要代码
```
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:id="@+id/red"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="#F00"
        android:padding="23dp"
        android:text="RED"
        android:textColor="#050500" />

    <TextView
        android:id="@+id/org"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="#FFA600"
        android:padding="23dp"
        android:text="ORANGE"
        android:textColor="#050500"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

    <TextView
        android:id="@+id/yellow"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="#FFFF00"
        android:padding="23dp"
        android:text="YELLOW"
        android:textColor="#050500"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="1"
        app:layout_constraintStart_toStartOf="@id/org" />

    <TextView
        android:id="@+id/blue"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="30dp"
        android:background="#0000FF"
        android:padding="23dp"
        android:text="BLUE"
        android:textColor="#FFFFFF"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/green"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginRight="10dp"
        android:layout_marginTop="30dp"
        android:background="#00FF00"
        android:padding="23dp"
        android:text="GREEN"
        android:textColor="#050500"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toStartOf="@id/blue"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginLeft="10dp"
        android:layout_marginTop="30dp"
        android:background="#4A0084"
        android:padding="23dp"
        android:text="INDIGO"
        android:textColor="#FFFFFF"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toEndOf="@id/blue"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:layout_width="fill_parent"
        android:layout_height="wrap_content"
        android:layout_marginLeft="10dp"
        android:layout_marginTop="30dp"
        android:background="#EE82EE"
        android:padding="23dp"
        android:text="VIOLET"
        android:textAlignment="center"
        android:textColor="#050500"
        app:layout_constraintBottom_toBottomOf="parent" />
</android.support.constraint.ConstraintLayout>
```
### 代码详解
利用layout_constraintBottom_toBottomOf，layout_constraintEnd_toEndOf等约束位置的属性，将每个组件的位置固定，并用margin和padding准确定位组件的位置。
### 实验结果
![add image](https://github.com/Xxy-fjnu/Android_lab/blob/master/Lab2_layout/screenshots/3.png)
## 表格布局
### 主要代码
```
<?xml version="1.0" encoding="utf-8"?>
<TableLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:layout_marginLeft="10dp"
    android:stretchColumns="1">

    <TableRow>

        <TextView
            android:layout_column="1"
            android:padding="5dp"
            android:text="Open..." />

        <TextView
            android:gravity="right"
            android:padding="5dp"
            android:text="Ctrl-O" />
    </TableRow>

    <TableRow>

        <TextView
            android:layout_column="1"
            android:padding="5dp"
            android:text="Save..." />

        <TextView
            android:gravity="right"
            android:padding="5dp"
            android:text="Ctrl-S" />
    </TableRow>

    <TableRow>

        <TextView
            android:layout_column="1"
            android:padding="5dp"
            android:text="Save As..." />

        <TextView
            android:gravity="right"
            android:padding="5dp"
            android:text="Ctrl-Shift-S" />
    </TableRow>

    <View
        android:layout_height="1dp"
        android:background="#FFFFFF" />

    <TableRow>

        <TextView
            android:padding="5dp"
            android:text="x" />

        <TextView
            android:layout_column="1"
            android:padding="5dp"
            android:text="Import..." />

    </TableRow>

    <TableRow>

        <TextView
            android:padding="5dp"
            android:text="x" />


        <TextView
            android:layout_column="1"
            android:padding="5dp"
            android:text="Export..." />

        <TextView
            android:gravity="right"
            android:padding="5dp"
            android:text="Ctrl-E" />

    </TableRow>

    <View
        android:layout_height="1dp"
        android:background="#FFFFFF" />

    <TableRow>

        <TextView
            android:layout_column="1"
            android:padding="5dp"
            android:text="Quit" />
    </TableRow>
</TableLayout>

```
### 代码详解
利用多个tablerow列出总体布局，在每个tablerow中嵌套两个textview实现主要框架，此题要点是利用stretchColumns属性，实现第一列的拉伸。
### 实验结果
![add image](https://github.com/Xxy-fjnu/Android_lab/blob/master/Lab2_layout/screenshots/2.png)
