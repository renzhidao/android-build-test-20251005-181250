package com.example.testapp;

import android.app.Activity;
import android.os.Bundle;
import com.nonexistent.BuggyModule;  // ❌ 这是不存在的模块，会导致编译失败

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BuggyModule.doSomething();  // ❌ 这会导致构建失败
    }
}
