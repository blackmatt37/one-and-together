package org.oneandtogether.app

import org.scalatra._
import scalate.ScalateSupport

class MyScalatraServlet extends OneAndTogetherStack {

  val pages = Array("home", "info", "service", "bio", "forms", "faq", "contact", "links")
  get("/") {
    contentType = "text/html"
    jade("home.jade")
  }
  get("/:id/?") {
    if (pages.contains(params("id"))) {
      contentType = "text/html"
      jade(params("id") + ".jade")
    } else pass()
  }
  
}
