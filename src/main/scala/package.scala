package object sbtkeysbot{

  @inline def allCatchPrintStackTrace(body: => Any){
    try{
      val r = body
    }catch{
      case e => e.printStackTrace
    }
  }

}
