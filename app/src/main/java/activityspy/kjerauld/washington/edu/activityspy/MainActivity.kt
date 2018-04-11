package activityspy.kjerauld.washington.edu.activityspy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("InfoLog01", "onCreate event fired")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("ErrorLog01", "We're going down, captain!")
    }

    override fun onStart() {
        super.onStart()
        Log.i("InfoLog02", "onStart event fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i("InfoLog03", "onResume event fired")
    }
}
