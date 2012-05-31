package sbtkeysbot

import org.specs2.Specification
import com.twitter.conversions.time._
import com.twitter.util.Duration
import java.util.concurrent.TimeUnit

class Spec extends Specification{ def is =
  "spec" ! {
    val conf = new Config{
      override val interval:Duration = Duration(1, TimeUnit.MILLISECONDS)
      val twitter = null
    }
    val dummyClient = new Client{
      def tweet(str:String) = println(str)
    }
    val size = Main.getSource.size
    val t = new Thread{
      override def run = Main.run(conf,dummyClient)
    }
    t.start
    Thread.sleep(size * 1.5 toInt)
    t.interrupt
    success
  } ^ end
}

