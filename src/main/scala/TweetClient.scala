package sbtkeysbot

import twitter4j._
import twitter4j.conf._

trait Client{
  def tweet(str:String)
}

case class TweetClient(conf:TwitterSettings) extends Client{

  val t = {
    val c = new ConfigurationBuilder
      c.setDebugEnabled(true)
      .setOAuthConsumerKey(conf.consumerKey)
      .setOAuthConsumerSecret(conf.consumerSecret)
      .setOAuthAccessToken(conf.accessToken)
      .setOAuthAccessTokenSecret(conf.accessTokenSecret);

    new TwitterFactory(c.build()).getInstance()
  }

  def tweet(str:String){
    allCatchPrintStackTrace{
      t.updateStatus(str)
    }
  }

}


