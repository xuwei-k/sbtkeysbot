package sbtkeysbot

import scala.util.control.Exception.allCatch
import com.twitter.util.Eval
import java.io.File

object Main{

  def main(args:Array[String]){
    val file = new File(
      allCatch.opt(args.head).getOrElse("config")
    )
    val conf = Eval[Config](file)
    val client = TweetClient(conf.twitter)
    run(conf,client)
  }

  def getSource:IndexedSeq[String] = {
    scala.io.Source.fromInputStream(getClass.getResourceAsStream("/sbtkeys.scala")).getLines.toIndexedSeq
  }

  def run(conf:Config,client:Client){
    import conf._

    val src = getSource
    val size = src.size

    @annotation.tailrec
    def _run(index:Int){
      Thread.sleep(interval.inMillis)
      allCatchPrintStackTrace{
        client.tweet(src(index % size).take(140))
      }
      _run(index + 1)
    }

    _run(0)
  }

}
