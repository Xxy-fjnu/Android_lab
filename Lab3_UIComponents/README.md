# UI组件
## Android ListView的用法
### 主要代码
#### simpleitems.xml
```
<?xml version="1.0" encoding="utf-8"?>
<TableLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="wrap_content"
    android:layout_height="match_parent"
    android:paddingRight="15dp"
    android:paddingLeft="15dp"
    android:stretchColumns="1">
    <TableRow
        android:paddingBottom="5dp"
        android:paddingTop="5dp"
        android:layout_column="1">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="match_parent"
            android:id="@+id/animaltypes"
            android:textSize="20sp"
            android:text="test"
            android:gravity="center"/>

        <ImageView
            android:id="@+id/imags"
            android:maxHeight="50dp"
            android:maxWidth="50dp"
            android:adjustViewBounds="true"
            android:src="@drawable/cat"
            android:layout_gravity="right"
            />
    </TableRow>
</TableLayout>
```
#### SimpleAdapter_Activity.java
```
package cn.edu.fjnu.cl.lab2_uicomponents;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleAdapter_Activity extends Activity {
    private String[] animals = new String[]{"Lion", "Tiger", "Monkey", "Dog", "Cat", "Elephant"};
    private int[] imageIds = new int[]{R.drawable.lion,
            R.drawable.tiger,
            R.drawable.monkey,
            R.drawable.dog,
            R.drawable.cat,
            R.drawable.elephant
    };

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simpleadapter_layout);
        List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();

        for (int i = 0; i < animals.length; i++) {
            Map<String, Object> listItem = new HashMap<String, Object>();
            listItem.put("imags", imageIds[i]);
            listItem.put("animaltype", animals[i]);
            listItems.add(listItem);
        }
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, listItems, R.layout.simpleitems,
                new String[]{"animaltype", "imags"},
                new int[]{R.id.animaltypes,R.id.imags});
        ListView list=(ListView)findViewById(R.id.simpleListView);
        list.setAdapter(simpleAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub
                Toast.makeText(getApplicationContext(),animals[position], Toast.LENGTH_LONG).show();
            }});
    }

}

```
### 代码详解
由于item的对齐方式较为整齐，于是采用了表格布局实现，在SimpleAdapter_Activity.java中实现了SimpleAdapter对ListView的装配。
### 实验结果
![add image](https://github.com/Xxy-fjnu/Android_lab/blob/master/screenshots/lab3/1.1.png)
![add image](https://github.com/Xxy-fjnu/Android_lab/blob/master/screenshots/lab3/1.2.png)
## 创建自定义布局的AlertDialog
### 主要代码
#### dialoglayout.xml(对话框样式)
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="#FEBA32"
        android:paddingBottom="10dp"
        android:paddingTop="10dp"
        android:text="@string/title"
        android:textAlignment="center"
        android:textColor="@android:color/white"
        android:textSize="20dp"
        android:textStyle="bold" />

    <EditText
        android:id="@+id/usn"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginLeft="5dp"
        android:layout_marginRight="5dp"
        android:hint="@string/user"
        android:textSize="20dp" />

    <EditText
        android:id="@+id/pwd"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginLeft="5dp"
        android:layout_marginRight="5dp"
        android:hint="@string/pwd"
        android:inputType="textPassword" />

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <Button
            android:id="@+id/cl"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="@string/cl" />

        <Button
            android:id="@+id/si"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="@string/Si" />

    </LinearLayout>
</LinearLayout>

```
### 代码详解
使用线性布局实现对话框的总体布局，在对话框的实现中使用LayoutInflater的inflate()方法从自定义布局文件中加载对话框的布局。
### 实验结果
#### 主界面
![add image](https://github.com/Xxy-fjnu/Android_lab/blob/master/screenshots/lab3/2.1.png)
#### 输入账号密码
![add image](https://github.com/Xxy-fjnu/Android_lab/blob/master/screenshots/lab3/2.2.png)
#### 提示信息
![add image](https://github.com/Xxy-fjnu/Android_lab/blob/master/screenshots/lab3/2.3.png)
![add image](https://github.com/Xxy-fjnu/Android_lab/blob/master/screenshots/lab3/2.4.png)
## 使用XML定义菜单
### 主要代码
#### menu.xml
```
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:title="@string/font">
        <menu>
            <group android:checkableBehavior="single">
                <item android:title="@string/font_10" android:id="@+id/font_10"></item>
                <item android:title="@string/font_16" android:id="@+id/font_16"></item>
                <item android:title="@string/font_20" android:id="@+id/font_20"></item>
            </group>
        </menu>

    </item>
    <item android:title="@string/menu" android:id="@+id/menu">

    </item>
    <item android:title="@string/color">
        <menu>
            <item android:title="@string/color_red" android:id="@+id/color_red"></item>
            <item android:title="@string/color_black" android:id="@+id/color_black"></item>
        </menu>
    </item>
</menu>
```
### 代码详解
菜单样式的设计使用多个group嵌套item的形式，实现主菜单与子菜单的嵌套，并在java文件中用getItemId()得到点击的菜单项目，并编写相关的操作。
### 实验结果
#### 主菜单
![add image](https://github.com/Xxy-fjnu/Android_lab/blob/master/screenshots/lab3/3.1.png)
#### 字体大小子菜单
![add image](https://github.com/Xxy-fjnu/Android_lab/blob/master/screenshots/lab3/3.2.png)
![add image](https://github.com/Xxy-fjnu/Android_lab/blob/master/screenshots/lab3/3.3.png)
#### 普通菜单提示信息
![add image](https://github.com/Xxy-fjnu/Android_lab/blob/master/screenshots/lab3/3.4.png)
#### 字体颜色子菜单
![add image](https://github.com/Xxy-fjnu/Android_lab/blob/master/screenshots/lab3/3.5.png)
![add image](https://github.com/Xxy-fjnu/Android_lab/blob/master/screenshots/lab3/3.6.png)
## 创建ActionMode的上下文菜单
### 主要代码
```
package cn.edu.fjnu.cl.lab2_uicomponents;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.AbsListView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ActionMode_Activity extends AppCompatActivity {
    private ListView listView;
    private List<chooseItems> list;
    private Base adapter;
    private String[] texts = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actionmode_layout);
        listView = (ListView) findViewById(R.id.Amview);
        list = new ArrayList<chooseItems>();
        for (int i = 0; i < texts.length; i++) {
            list.add(new chooseItems(texts[i], false));
        }
        adapter = new Base(list, ActionMode_Activity.this);
        listView.setAdapter(adapter);

        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE_MODAL);
        listView.setMultiChoiceModeListener(new AbsListView.MultiChoiceModeListener() {
            public void refresh(){
                for(int i = 0; i < texts.length; i++){
                    list.get(i).setChoose(false);
                }
            }
            public void selectall(){
                for(int i = 0; i < texts.length; i++){
                    list.get(i).setChoose(true);
                }
            }

            @Override
            public boolean onCreateActionMode(ActionMode mode, Menu menu) {
                MenuInflater inflater = mode.getMenuInflater();
                inflater.inflate(R.menu.actionmode_menu, menu);
                num = 0;
                adapter.notifyDataSetChanged();
                return true;
            }

            @Override
            public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
                adapter.notifyDataSetChanged();
                return false;
            }

            @Override
            public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.all:
                        num = texts.length;
                        selectall();
                        adapter.notifyDataSetChanged();
                        return true;
                    case R.id.rubbish:
                        adapter.notifyDataSetChanged();
                        num = 0;
                        refresh();
                        mode.finish();
                        return true;
                    default:
                        refresh();
                        adapter.notifyDataSetChanged();
                        num = 0;
                        return false;
                }
            }

            @Override
            public void onDestroyActionMode(ActionMode mode) {
                refresh();
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onItemCheckedStateChanged(ActionMode mode, int position, long id, boolean checked) {

                if (checked == true) {
                    list.get(position).setChoose(true);
                    adapter.notifyDataSetChanged();
                    num++;
                } else {
                    list.get(position).setChoose(false);
                    adapter.notifyDataSetChanged();
                    num--;
                }
                mode.setTitle("  " + num + " Selected");
            }

            int num = 0;
        });
    }
}

```
### 代码详解
基于BaseAdapter适配器实现，将items注入，同时通过重写onCreateActionMode等方法实现目标结果。
### 实验结果
#### 主界面
![add image](https://github.com/Xxy-fjnu/Android_lab/blob/master/screenshots/lab3/4.1.png)
#### 多选的实现
![add image](https://github.com/Xxy-fjnu/Android_lab/blob/master/screenshots/lab3/4.2.png)
#### 全选的实现
![add image](https://github.com/Xxy-fjnu/Android_lab/blob/master/screenshots/lab3/4.3.png)
#### 删除所有选择
![add image](https://github.com/Xxy-fjnu/Android_lab/blob/master/screenshots/lab3/4.1.png)
