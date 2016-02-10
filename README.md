# ListenerSwipeRefreshLayout
This library allows you to listen to SwipeRefreshLayout start, cancel and finish events.

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-ListenerSwipeRefreshLayout-green.svg?style=true)](https://android-arsenal.com/details/1/3125)

## Usage

Add the library to your build.gradle
```gradle
    compile 'com.aloj22.listenerswiperefreshlayout:library:1.0.0'
```

Add ListenerSwipeRefreshLayout view to your xml

```xml
<com.aloj22.listenerswiperefreshlayout.ListenerSwipeRefreshLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/swipe_refresh_layout"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

</com.aloj22.listenerswiperefreshlayout.ListenerSwipeRefreshLayout>
```

Add you listener to the view
```java
ListenerSwipeRefreshLayout swipeRefreshLayout = (ListenerSwipeRefreshLayout) findViewById(R.id.swipe_refresh_layout);
swipeRefreshLayout.setOnRefreshListener(new ListenerSwipeRefreshLayout.OnRefreshListener() {

            @Override
            public void onRefresh() {
            
            }

            @Override
            public void onRefreshStarted() {
            
            }

            @Override
            public void onRefreshCanceled() {
            
            }

            @Override
            public void onRefreshFinished() {
            
            }

        });
```

## Developed By
--------

Alonso Sanchez 

<a href="https://twitter.com/aloj22">
  <img alt="Follow me on Twitter" width="30" heigth="30"
       src="http://icons.iconarchive.com/icons/danleech/simple/96/twitter-icon.png" />
</a>
<a href="https://plus.google.com/100388148261962342252">
  <img alt="Follow me on Google+"  width="30" heigth="30"
       src="http://icons.iconarchive.com/icons/danleech/simple/96/google-plus-icon.png" />
</a>
<a href="https://www.linkedin.com/in/alonsosanchezlinkedin">
  <img alt="Follow me on LinkedIn" width="30" heigth="30"
       src="http://icons.iconarchive.com/icons/danleech/simple/96/linkedin-icon.png" />
</a>

## License

    Copyright (C) 2016 Aaron He

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
 
[snap]: https://oss.sonatype.org/content/repositories/snapshots/
