package com.example.heaptesting


import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.Button

class SecondActivity : AppCompatActivity() {

    lateinit var button: Button
//    private  var viewUpdate : Task = Task()
    lateinit var thread : ThreadTask

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        button = findViewById(R.id.previous)
      //  viewUpdate.execute()
        thread  = ThreadTask()
       // thread.start()
    }


//    inner class Task : AsyncTask<Void, Void, String>(){
//
//        override fun doInBackground(vararg p0: Void?): String {
//            try {
//                SystemClock.sleep(1000 * 20)
//            }catch (exception : InterruptedException){
//                exception.printStackTrace()
//            }
//            return "Task Completed"
//        }
//
//        override fun onPostExecute(result: String?) {
//          this@SecondActivity.updateButton(result)
//        }
//
//    }

        class ThreadTask : Thread(){
        override fun run() {
         // SystemClock.sleep(1000 * 20)
          //  sleep(5000)

            while (!isInterrupted){
                SystemClock.sleep(1000 * 20)
            }

        }

    }

    fun updateButton(string : String?){
        string?.let {
            button.text = it
        }
    }


    override fun onDestroy() {
        super.onDestroy()
  //      thread.interrupt()
//        viewUpdate.cancel(true)
    }


}