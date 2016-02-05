# ListenerSwipeRefreshLayout
This library allows you to listen to SwipeRefreshLayout start, cancel and finish events.

## Usage

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
