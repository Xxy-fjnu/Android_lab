# 自定义WebView验证隐式Intent的使用
## 第一个应用：IntentMain
### 获取URL地址并启动隐式Intent的调用
#### 主要代码
页面总体布局
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center_horizontal"
    android:orientation="vertical"
    tools:context="cn.edu.fjnu.cl.intentmain.MainActivity">

    <EditText
        android:id="@+id/edt"
        android:layout_width="300dp"
        android:layout_height="70dp"
        android:textAlignment="center" />

    <Button
        android:id="@+id/btn"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="10dp"
        android:text="@string/btn" />
</LinearLayout>
```

为按钮绑定单击事件，使用ACTION_VIEW找到相应的activity，以获取对应的应用
```
  btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = edt.getText().toString();
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
```
## 第二个应用：MyBrowser
### 自定义WebView来加载URL
#### 主要代码
布局文件中增加WebView组件
```
    <WebView
        android:id="@+id/wbv"
        android:layout_width="match_parent"
        android:layout_height="match_parent"></WebView>
```
AndroidManifest.xml文件中增加intent过滤器
```
 <intent-filter>
                <action android:name="android.intent.action.VIEW" />
                <category android:name="android.intent.category.DEFAULT" />
                <data android:scheme="http" />
 </intent-filter>
```
重写setWebViewClient方法以防止跳转到系统自带浏览器
```
 webview.setWebViewClient(new  WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
```
## 实验注意点
1.由于是写在两个不同的应用中，所以在运行IntentMain应用时，应先安装MyBrowser应用程序，否则Intent识别不到MyBrowser，无法使用其打开网页。
2.在MyBrowser中的AndroidManifest.xml中应添加网络权限，否则无法正常访问网页。
```
    <uses-permission android:name="android.permission.INTERNET"/>
```
## 实验结果
IntentMain界面
![pic1](https://github.com/Xxy-fjnu/Android_lab/blob/master/screenshots/lab4/1.png)
Intent响应
![pic 2](https://github.com/Xxy-fjnu/Android_lab/blob/master/screenshots/lab4/2.png)
使用MyBrowser访问网页
![pic 3](https://github.com/Xxy-fjnu/Android_lab/blob/master/screenshots/lab4/3.png)
