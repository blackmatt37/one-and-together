package org.oneandtogether.app

import org.scalatra._
import scalate.ScalateSupport

class MyScalatraServlet extends OneAndTogetherStack with GZipSupport{

  val pages = Array("home", "who", "involved", "news", "donate", "photos", "members", "contact")
  get("/") {
    contentType = "text/html"
    jade("const.jade")
  }
  get("/:id/?") {
    contentType = "text/html"
    jade("const.jade")
    // if (pages.contains(params("id"))) {
    //   contentType = "text/html"
    //   jade(params("id") + ".jade")
    // } else pass()
  }
  get("/matt/:id/?") {
    if (pages.contains(params("id"))) {
      contentType = "text/html"
      jade(params("id") + ".jade")
    } else pass()
  }
  
}
