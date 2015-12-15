package $package$

import _root_.android.app.Activity
import _root_.android.os.Bundle
import _root_.android.widget.TextView
import _root_.android.util.Log

class $main_activity$ extends Activity{
  override def onCreate(bundle: Bundle) {
    if(BuildConfig.DEBUG) Log.d("$name$","$main_activity$ onCreate")
    super.onCreate(bundle)
    setContentView(R.layout.main)

    findViewById(R.id.textview).asInstanceOf[TextView].setText("hello, world!")
  }
}
