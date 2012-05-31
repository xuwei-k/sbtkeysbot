package sbtkeysbot

import com.twitter.util.Duration
import com.twitter.conversions.time._

abstract class Config{
  val interval:Duration
  val twitter:TwitterSettings
}

abstract class TwitterSettings{
  val consumerKey:String
  val consumerSecret:String
  val accessToken:String
  val accessTokenSecret:String
}

